package com.codingChallenge.LRUCache;

import java.util.*;

public class LRUCache {

    class Node {
        int val;
        Node prev;
        Node next;
        int key;

        Node(int key, int val){
            this.val = val;
            this.key = key;
        }
    }

    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap<>();
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap(capacity);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if(node == null) return -1;

        delete(node);
        insert(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            delete(map.get(key));
        } else if (map.size() == cap){
            delete(tail.prev);
        }

        insert(new Node(key, value));
    }

    public void insert(Node node){
        map.put(node.key, node);
        node.next=head.next;
        head.next.prev=node;
        node.prev=head;
        head.next=node;
    }

    public void delete(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public static void main(String[] args) {

    }
}
