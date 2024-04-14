package com.assignment14;

import java.util.ArrayList;

public class CircularListPro {
	 private final int capacity;
	    private final ArrayList<String> buffer;
	    private int head; 
	    private int tail; 

	    public CircularListPro(int capacity) {
	        this.capacity = capacity;
	        this.buffer = new ArrayList<>(capacity);
	        this.head = 0;
	        this.tail = 0;
	    }

	    public void add(String message) {
	        if (buffer.size() == capacity) {
	            
	            head = (head + 1) % capacity;
	        }
	        buffer.add(tail, message);
	        tail = (tail + 1) % capacity;
	    }

	    public String getOldest() {
	        if (buffer.isEmpty()) {
	            throw new IllegalStateException("Buffer is empty");
	        }
	        return buffer.get(head);
	    }

	    public static void main(String[] args) {
	        int bufferSize = 5;
	        CircularListPro messageBuffer = new CircularListPro(bufferSize);


	        messageBuffer.add("Hello");
	        messageBuffer.add("How are you?");
	        messageBuffer.add("Good morning!");
	        messageBuffer.add("Have a nice day");
	        messageBuffer.add("See you later");


	        System.out.println("Oldest message: " + messageBuffer.getOldest());
	    }
	}

