class RecentCounter {
    Queue<Integer> pings;

    public RecentCounter() {
       pings = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        //Add to the queue each time a ping occurs
        pings.add(t);

        /* Each new ping will be added to end of list, so the oldest is at the front.
         * With queue.peek() we just remove from the front until its less than 3000 ms ago
         * Once the front is less than 3000 ms ago, everything that follows will be too
         * t equals the current time.
         */
        while (pings.peek() < t - 3000) {
            pings.poll();
        }
        
        return pings.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */