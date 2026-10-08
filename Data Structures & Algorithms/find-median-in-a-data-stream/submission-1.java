class MedianFinder {
    Queue<Integer> left;
    Queue<Integer> right;
    public MedianFinder() {
        
        left=new PriorityQueue<>((n1,n2)->n2-n1);
        right=new PriorityQueue<>((n1,n2)->n1-n2);
    }
    
    public void addNum(int num) {
        
        left.add(num);
        right.add(left.poll());

        if(left.size()<right.size())
        {
            left.add(right.poll());
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size())
        {
            return left.peek();
        }

        return (left.peek()+right.peek())/2.0;
    }
}
