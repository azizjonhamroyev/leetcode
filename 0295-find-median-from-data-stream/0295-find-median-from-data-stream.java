class MedianFinder {

    PriorityQueue<Integer> heapMin = new PriorityQueue<>(Comparator.comparingInt(a -> a));
    PriorityQueue<Integer> heapMax = new PriorityQueue<>(Comparator.comparingInt(a -> -a));
    boolean even = true;

    public void addNum(int num) {
        if (even) {
            heapMin.add(num);
            heapMax.add(heapMin.poll());
        } else {
            heapMax.add(num);
            heapMin.add(heapMax.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (even) return (double) (heapMin.peek() + heapMax.peek()) / 2.0;
        else return heapMax.peek();
    }
}