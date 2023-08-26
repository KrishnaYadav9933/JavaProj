package HashMap;

import java.util.LinkedList;

public class HashMapImplementation {
    static class MyHashMap<k, v> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;//number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {//N- capacity or size of buckrt
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

        }

        private int HashFunc(k key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, k key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        private void reHash(){
            LinkedList<Node> [] oldBuckets = buckets;
            initBuckets(2* oldBuckets.length);
            n=0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }

        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }
        public int size(){
            return n;
        }
        public int capacity(){
            return buckets.length;
        }
        public float loadFactor(){
            return (n*1.0f)/buckets.length;
        }
        public void put(k key, v value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei == -1){
              Node node = new Node(key, value);
              currBucket.add(node);
              n++;
            }
            else {
                Node currNode = currBucket.get(ei);
                currNode.value=value;
            }
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
                reHash();
            }
        }
        public v get(k key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){//key exist
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            else{//key doesn't exist
                return null;
            }
        }
        public v remove(k key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1) {//key exist
                Node currNode = currBucket.get(ei);
                v val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            else{//key doesn't exist
            return null;

            }

        }
        public boolean contain( k key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei == -1) return false;
            return true;
        }
        public void putIfAbsent(k key, v value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei == -1){
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }
        }


    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        System.out.println(mp.capacity());
        System.out.println(mp.loadFactor());
        mp.put("c", 3);
        mp.put("d", 19);
        mp.put("p", 18);
        mp.put("q", 17);
        mp.put("r", 16);
        mp.put("s", 15);
        System.out.println("Testing size "+mp.size());
        mp.put("c", 30);
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("f"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.size());
        System.out.println(mp.contain("a"));
        mp.putIfAbsent("a", 20);
        mp.putIfAbsent("l", 30);
        System.out.println(mp.get("a"));
        System.out.println(mp.get("l"));
        System.out.println(mp.capacity());
        System.out.println(mp.loadFactor());

    }

}
