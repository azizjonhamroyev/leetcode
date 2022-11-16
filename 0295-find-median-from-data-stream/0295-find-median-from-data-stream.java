class MedianFinder {

    PriorityQueue<Integer> heapMin = new PriorityQueue<>(Comparator.comparingInt(a -> a));
    PriorityQueue<Integer> heapMax = new PriorityQueue<>(Comparator.comparingInt(a -> -a));


    public void addNum(int num) {
        heapMax.offer(num);
        heapMin.offer(heapMax.poll());
        if (heapMin.size() > heapMax.size())
            heapMax.offer(heapMin.poll());

    }

    public double findMedian() {
        if (heapMax.size() == heapMin.size()) return (double) (heapMin.peek() + heapMax.peek()) / 2.0;
        else return heapMax.peek();
    }
}