public class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'a' -> {
                    stack.push('a');
                    queue.add(i);
                }
                case 'A' -> {
                    stack.push('A');
                    queue.add(i);
                }
                case 'e' -> {
                    stack.push('e');
                    queue.add(i);
                }
                case 'E' -> {
                    stack.push('E');
                    queue.add(i);
                }
                case 'i' -> {
                    stack.push('i');
                    queue.add(i);
                }
                case 'I' -> {
                    stack.push('I');
                    queue.add(i);
                }
                case 'o' -> {
                    stack.push('o');
                    queue.add(i);
                }
                case 'O' -> {
                    stack.push('O');
                    queue.add(i);
                }
                case 'U' -> {
                    stack.push('U');
                    queue.add(i);
                }
                case 'u' -> {
                    stack.push('u');
                    queue.add(i);
                }
            }
        }
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < n) {
            if (!queue.isEmpty() && queue.peek() == i) {
                res.append(stack.pop());
                queue.remove();
            } else res.append(s.charAt(i));
            i++;
        }
        return res.toString();
    }
}