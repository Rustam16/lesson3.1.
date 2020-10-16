package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println("end");
        action(1, 23, 5, "HI ", "black");

    }

    public static void action(int num1, int num2, int num3, String text, String color) {
        System.out.println(num1 + num2 + num3);
        System.out.println(text + color);
        System.out.println(method(21, 24));
    }

    public static String method(int ageOfPerson, int temperature) {
        if (ageOfPerson < 20 && temperature < 33) {
            return "можно идти гулять";
        }
        if (ageOfPerson < 20 && temperature > 33) {
            return "можно идти гулять";
        } else if (ageOfPerson > 44 && temperature > -6) {
            return "можно идти гулять";
        } else
            return "оставайтесь дома";
    }
}





