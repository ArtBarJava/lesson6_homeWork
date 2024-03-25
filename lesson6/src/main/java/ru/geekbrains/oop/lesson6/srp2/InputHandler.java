package ru.geekbrains.oop.lesson6.srp2;

import java.util.Scanner;

public class InputHandler extends Order{

    private Scanner scanner = new Scanner(System.in);

    public void inputFromConsole(){
        setClientName(prompt("Имя клиента: "));
        setProduct(prompt("Продукт: "));
        setQnt(Integer.parseInt(prompt("Кол-во: ")));
        setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
