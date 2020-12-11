package ru.javaSchool.toyBank;

public class Bank {
    public static final int CLIENT_AMOUNT = 4;
    public static final int REQUEST_HANDLER_AMOUNT = 2;
    public static void main(String[] args) {
        BackSystem backSystem = new BackSystem(1000);
        FrontSystem frontSystem = new FrontSystem();

        for(int i=1; i <= CLIENT_AMOUNT ; i++)
            new Client("Клиент №" + i, frontSystem).start();

        for (int j = 1;j  <= REQUEST_HANDLER_AMOUNT; j++) {
            new RequestHandler(frontSystem, backSystem,"Обработчик заявок №" + j).start();
        }

    }

}
