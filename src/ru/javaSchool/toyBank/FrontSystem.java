package ru.javaSchool.toyBank;

import java.util.LinkedList;

public class FrontSystem {
    LinkedList<Request> requestQueue = new LinkedList<>();
    public static final int MAX_SIZE = 2;

    public synchronized void addRequest(Request newRequest) throws InterruptedException {
        while (requestQueue.size() >= MAX_SIZE)
            wait();
        requestQueue.add(newRequest);
        notifyAll();
    }

    public synchronized Request takeRequest() throws InterruptedException {
        while (requestQueue.size() < 1)
            wait();
        Request returnRequest = requestQueue.poll();
        notifyAll();
        return returnRequest;

    }
}
