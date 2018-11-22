package com.kumarsoumya.collections;

public class LinkedList<T extends Comparable<T>> {

    protected Node<T> head;
    protected Node<T> tail;

    private int size;

    protected class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean add(T data) {
        if (data == null) {
            return false;
        }
        addToHead(data);
        return true;
    }

    protected void addToHead(T data) {
        Node<T> node = new Node<T>(data);
        if (this.isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        ++size;
    }

    public boolean contains(T data) {
        if (this.isEmpty()) {
            return false;
        }
        return contains(head, data);
    }

    private boolean contains(Node<T> head, T data) {
        if (head == null) {
            return false;
        }

        T value = head.data;
        if (value.compareTo(data) == 0) {
            return true;
        }

        return contains(head.next, data);
    }

    public boolean remove(T data) {
        return remove(head, null, data);
    }

    private boolean remove(Node<T> next, Node<T> prev, T data) {
        if (next == null) {
            return false;
        }

        T value = next.data;
        if (!(value.compareTo(data) == 0)) {
            return remove(next.next, next, data);
        }

        if (prev == null) {
            head = next.next;
        } else if (next == tail) {
            prev.next = tail.next;
            tail = prev;
        } else {
            prev.next = next.next;
        }
        next.next = null;
        --size;
        return true;
    }

    protected Node<T> popFromHead() {
        Node<T> node = head;
        if (!this.isEmpty()) {
            if (head == tail) {
                head = tail = node.next;
            } else {
                head = node.next;
                node.next = null;
            }
            --size;
        }
        return node;
    }

    protected Node<T> popFromTail() {
        Node<T> node = head;
        if (!this.isEmpty()) {
            if (head == tail) {
                head = tail = node.next;
            } else {
                while (node.next != tail) {
                    node = node.next;
                }
                Node<T> temp = node;
                node = tail;
                tail = temp;
                tail.next = null;
            }
            --size;
        }
        return node;
    }

    public String toString() {
        StringBuilder valueOf = new StringBuilder();
        valueOf.append('[');
        toString(head, valueOf);
        valueOf.append(']');
        return valueOf.toString();
    }

    private void toString(Node<T> head, StringBuilder valueOf) {
        if (head == null) {
            return;
        }
        valueOf.append(String.valueOf(head.data));
        if (head != tail) {
            valueOf.append(",");
        }
        toString(head.next, valueOf);
    }

}
