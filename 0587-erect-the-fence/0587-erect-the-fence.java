class Solution {
    static int orien(int[] p,int[] q,int[] r){
        return (r[1]-q[1])*(q[0]-p[0])-(q[1]-p[1])*(r[0]-q[0]);
    }
    public int[][] outerTrees(int[][] trees) {
        Stack<int[]> top=new Stack<>();
        Stack<int[]> bot=new Stack<>();
        Arrays.sort(trees,(p,q)->q[0]==p[0]?q[1]-p[1]:q[0]-p[0]);
        for(int i=0;i<trees.length;i++)
        {
            while(top.size()>=2 && orien(top.get(top.size()-2),top.peek(),trees[i])>0)
                top.pop();
            while(bot.size()>=2 && orien(bot.get(bot.size()-2),bot.peek(),trees[i])<0)
                bot.pop();
            top.push(trees[i]);
            bot.push(trees[i]);
        }
        Set<int[]> res=new HashSet<>(top);
        res.addAll(bot);
        return res.toArray(new int[res.size()][]);
    }
}