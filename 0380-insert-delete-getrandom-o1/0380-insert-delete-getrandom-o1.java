class RandomizedSet {

    HashMap<Integer, Integer> values = new HashMap<>();
    HashMap<Integer, Integer> indexes = new HashMap<>();
    int count = 0;

    public boolean insert(int val) {
        if (values.containsKey(val)) return false;
        values.put(val, count);
        indexes.put(count++, val);
        return true;
    }

    public boolean remove(int val) {
        if (!values.containsKey(val)) return false;
        int index = values.get(val);
        count--;
        int last = indexes.get(count);
        indexes.put(index, last);
        values.put(last, index);
        values.remove(val);
        indexes.remove(count);
        return true;
    }

    public int getRandom() {
        int index = new Random().nextInt(0, count);
        return indexes.get(index);
    }
}
