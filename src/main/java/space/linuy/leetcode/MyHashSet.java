package space.linuy.leetcode;

class MyHashSet {

//    private int[] data;
//
//    private int size = 1024;
//
//    private int length = 0;
//
//    public MyHashSet() {
//        data = new int[1024];
//    }
//
//    public void add(int key) {
//        if (this.contains(key)) {
//            return;
//        }
//        if (length >= size) {
//            size *= 2;
//            int[] newData = new int[size];
//            System.arraycopy(data, 0, newData, 0, length);
//            data = newData;
//        }
//        data[getIndex(key)] = key;
//        length++;
//    }
//
//    public void remove(int key) {
//
//    }
//
//    public boolean contains(int key) {
//
//    }
//
//    public int getIndex(int key) {
//        int result = key % size;
//        while (data[result] != 0 && data[result] != key) {
//            result = (result + 1) % size;
//        }
//        return result;
//    }
}