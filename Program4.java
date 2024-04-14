package com.assignment14;

import java.util.ArrayList;
import java.util.Random;

public class Program4 {
    public static void main(String[] args) {
        int dataSize = 1000000; 
        int capacity = 1000000; 
        ArrayList<Integer> arrayList = new ArrayList<>(capacity);
        Random random = new Random();

        
        for (int i = 0; i < dataSize; i++) {
            arrayList.add(random.nextInt());
        }

       
        long startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            int value = arrayList.get(random.nextInt(dataSize));
        }
        long endTime = System.nanoTime();
        long randomAccessTime = endTime - startTime;

       
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            int value = arrayList.get(i);
        }
        endTime = System.nanoTime();
        long sequentialAccessTime = endTime - startTime;

        
        System.out.println("Random Access Time: " + randomAccessTime + " nanoseconds");
        System.out.println("Sequential Access Time: " + sequentialAccessTime + " nanoseconds");
    }

}
