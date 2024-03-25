package ru.geekbrains.oop.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        JsonHandler jsonHandler = new JsonHandler();
        System.out.println("Укажите параметры заказа:");

        inputHandler.inputFromConsole();
        jsonHandler.saveToJson(inputHandler.getClientName(), inputHandler.getProduct(), inputHandler.getQnt(), inputHandler.getPrice());

    }

}
