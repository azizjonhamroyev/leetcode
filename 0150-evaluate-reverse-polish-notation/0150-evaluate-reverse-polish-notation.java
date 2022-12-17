public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();

        for (String token : tokens) {
            char c = token.charAt(token.length() - 1);

            if (Character.isDigit(c)) {
                numbers.push(Integer.valueOf(token));
            } else {
                switch (c) {
                    case '*' -> {
                        numbers.push(numbers.pop() * numbers.pop());
                    }
                    case '/' -> {
                        int pop = numbers.pop();
                        numbers.push(numbers.pop() / pop);
                    }
                    case '+' -> {
                        numbers.push(numbers.pop() + numbers.pop());
                    }
                    default -> {
                        Integer pop = numbers.pop();
                        numbers.push(numbers.pop() - pop);
                    }
                }
            }
        }

        return numbers.pop();
    }
    
}