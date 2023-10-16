class MyHashSet {
    // HashSet set;
    List<Integer> list;
    public MyHashSet() {
        // set = new HashSet();
        list = new ArrayList<>();
    }
    
    public void add(int key) {
        // set.add(key);
        if(!list.contains(key))list.add(key); 
    }
    
    public void remove(int key) {
        // set.remove(key);
        boolean b = list.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        // return set.contains(key);
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */