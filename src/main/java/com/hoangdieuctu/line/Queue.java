package com.hoangdieuctu.line;

public class Queue {

    private String[] items;
    private Integer size;
    private Integer first;
    private Integer last;

    public Queue(int size) {
        this.items = new String[size];
        this.size = 0;
        this.first = 0;
        this.last = 0;
    }

    public boolean offer(String s) {
        if (size == items.length) {
            return false;
        }

        size++;
        items[last] = s;
        last = (last == items.length - 1 ? 0 : last + 1);

        return true;
    }

    public String take() {
        if (size == 0) {
            return null;
        }
        size--;
        String value = items[first];
        first = (first == items.length - 1 ? 0 : first + 1);
        return value;
    }

    public int size() {
        return size;
    }
}
