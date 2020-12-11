package ru.javaSchool.toyBank;

public class Request {
    OperationType operationType;
    int amount;
    String clientName;


    public Request(OperationType operationType, int amount, String name) {
        this.operationType = operationType;
        this.amount = amount;
        this.clientName = name;
    }
}
