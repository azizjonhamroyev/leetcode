class Move {
	int x;
	int y;
	public Move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

class TrieSW {
	Map<Character,TrieSW> children;
	boolean isWord;
	
	public TrieSW() {
		this.children = new HashMap<Character, TrieSW>();
		this.isWord = false;
	}
	
	public void addWord(String word) {
		char[] chars = word.toCharArray();
		TrieSW current = this;
		for(char c:chars) {
			if(!current.children.containsKey(c)) current.children.put(c, new TrieSW());
			current = current.children.get(c);
		}
		current.isWord = true;
	}
	
	public void addWords(String[] words) {
		for(String w:words) this.addWord(w);
	}
}

public class Solution {
	
	int[] dx = {0,1,0,-1};
	int[] dy = {1,0,-1,0};
	
	public List<String> findWords(char[][] board, String[] words) {
        Set<String> foundWords = new HashSet<String>();
        if(board==null || words==null || board.length==0 || words.length==0) return new ArrayList<String>(foundWords);
        TrieSW trie = new TrieSW();
        trie.addWords(words);
        StringBuilder currentWord = new StringBuilder();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[i].length;j++) {
        		if(trie.children.containsKey(board[i][j]))
        			search(board,i,j,visited,trie,currentWord,foundWords);
        	}
        }
        return new ArrayList<String>(foundWords);
    }
	
	public void search(char[][] board, int y, int x, boolean[][] visited, TrieSW trie, StringBuilder currentWord, Set<String> foundWords) {
		char c = board[y][x];
		currentWord.append(c);
		TrieSW current = trie.children.get(c);
		if(current.isWord) foundWords.add(currentWord.toString());
		visited[y][x] = true;
		for(Move m: possMoves(board,y,x,visited,current)) {
			search(board,m.y,m.x,visited,current,currentWord,foundWords);
		}
		visited[y][x] = false;
		currentWord.deleteCharAt(currentWord.length()-1);
	}
	
	public List<Move> possMoves(char[][] board, int y, int x, boolean[][] visited, TrieSW trie) {
		List<Move> moves = new ArrayList<Move>();
		for(int d=0; d<dx.length; d++) {
			int newX = x+dx[d];
			int newY = y+dy[d];
			if(isInBound(newY,newX,board) && trie.children.containsKey(board[newY][newX]) && !visited[newY][newX])
				moves.add(new Move(newX,newY));
		}
		return moves;
	}

	private boolean isInBound(int y, int x, char[][] board) {
		return x>=0 && y>=0 && y<board.length && x<board[y].length;
	}
	
}