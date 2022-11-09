class StockSpanner {
    Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();

    public int next(int price) {
        int res = 1;
        while (!stack.isEmpty() && stack.peek().getKey() <= price) res += stack.pop().getValue();
        stack.push(Map.entry(price, res));
        return res;
    }
}