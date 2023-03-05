package org.mirea.kt.practice_2;

import java.util.Scanner;


/*Вариант 3. Разработать программу, описывающую с помощью ООП
        сущность ВРАЧ (Doctor). Иерархия классов для сущности должна иметь
        минимум два уровня. Для класса необходимо описать минимум три свойства
        (поля) и три метода (можно больше). Тип объекта, а также значения для
        полей вводит пользователь с клавиатуры после старта программы. В
        результате работы программы необходимо вывести на экран все значения
        полей объекта через запятую.*/

public class practice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Какого врача желаете?\n1 = хирург, 2 = психолог: ");
        byte choice = scan.nextByte();
        switch (choice) {
            case 1 -> {
                Surgeon surgeon1 = new Surgeon(0, "", 0, 0);
                surgeon1.db(surgeon1);
                surgeon1.database();
            }
            case 2 -> {
                Psychologist psychologist1 = new Psychologist(0, "", 0, 0);
                psychologist1.db(psychologist1);
                psychologist1.database();
            }
        }
    }
}