package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String systemEncoding = "UTF-8";
//        System.out.println("Lesson #1");
//        System.out.println("Запросите у пользователя его имя и выведите в ответ: «Привет, его имя!»." );
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello, wot is your name? ");
//        String name = scanner.next();
//        System.out.println("Hello " + name + "!\n");
//
//        String systemEncoding = "UTF-8";
//        System.out.println("Lesson #2");
//        System.out.println("Запросите у пользователя год его рождения, посчитайте, сколько ему лет и выведите результат. ");
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("What is the year now?");
//        int yearNow = scanner1.nextInt();
//        System.out.println("What year were you born?");
//        int yearUser = scanner1.nextInt();
//        int age = yearNow - yearUser;
//        System.out.println("So you " + age + " year.");
//
        System.out.println("Lesson #3");
        System.out.println("Запросите у пользователя длину стороны квадрата и выведите периметр такого квадрата. ");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square");
        double length = scanner2.nextDouble();
        double P = 4 * length;
        System.out.println("The perimeter of the square is " + P);
//
//        System.out.println("Lesson #4");
//        System.out.println("Запросите у пользователя радиус окружности и выведите площадь такой окружности. ");
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("What is the radius of the circle?");
//        double radius = scanner3.nextDouble();
//        double area = Math.PI * (radius * radius);
//        System.out.println("The area of the circle is " + Math.ceil(area));
//        System.out.println("Or " + area);
//
//        System.out.println("Lesson #5");
//        System.out.println("Запросите у пользователя расстояние в км между двумя городами и за сколько часов он хочет добраться.\n" +
//                           " Посчитайте скорость, с которой необходимо двигаться, чтобы успеть вовремя.");
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.println("Enter the distance between cities.");
//        double distance = scanner4.nextDouble();
//        System.out.println("Enter the time you want to cover the distance.");
//        double time = scanner4.nextDouble();
//        int speed = (int) (distance / time);
//        System.out.println("In order to overcome this distance in the right time, you need to move at a speed " + speed + " km/h.");
//
//        System.out.println("Lesson #6");
//        System.out.println("Реализуйте конвертор валют. Пользователь вводит доллары, программа переводит в евро. Курс валюты храните в константе. ");
//        Scanner scanner5 = new Scanner(System.in);
//        System.out.println("EUR/USD\n1 = 1.06");
//        final double EUR = 1.06 ;
//        System.out.println("How many dollars do you want to exchange?");
//        double USD = scanner5.nextDouble();
//        double converter = USD * EUR;
//        System.out.printf("You'll get %.2f \n" , converter , " euro.");
//
//        System.out.println("Lesson #7");
//        System.out.println("Пользователь указывает объем флешки в Гб.\n" +
//                           " Программа должна посчитать сколько файлов размером в 820 Мб помещается на флешку. ");
//        Scanner scanner6 = new Scanner(System.in);
//        System.out.println("How many gigabytes of memory does a flash drive have?");
//        int gigabytes = 1024;
//        int file = 840;
//        int memory = scanner6.nextInt();
//        int files = gigabytes * memory / 840;
//        System.out.println("Number of files in size " + files + " fit.");
//
//        System.out.println("Lesson #8");
//        System.out.println("Пользователь вводит сумму денег в кошельке и цену одной шоколадки.\n" +
//                           "Программа выводит сколько шоколадок может купить пользователь и сколько сдачи у него останется. ");
//        Scanner scanner7 = new Scanner(System.in);
//        System.out.println("How much money do you have?");
//        double wallet = scanner7.nextDouble();
//        //double Wallet = wallet;
//        System.out.println("How much does chocolate cost?");
//        double price = scanner7.nextDouble();
//        int quantity = (int) (wallet / price);
//        double rest = wallet - price * quantity;
//        System.out.println("You can buy " + quantity + " pieces.");
//        System.out.printf("The rest of money %.2f %n", rest);
    }
}
