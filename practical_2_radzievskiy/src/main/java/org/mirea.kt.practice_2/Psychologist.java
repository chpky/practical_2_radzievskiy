package org.mirea.kt.practice_2;

import java.util.Scanner;

public class Psychologist extends Doctor {
    public Psychologist(Integer age, String name, Integer workHours, Integer cabinet) {
        super(age, name, workHours, cabinet);
    }

    public void doCheckUp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Как вы себя чувствуете? ");
        String answer = scan.next();
        System.out.println("Вам " + answer + "!");
    }

    public void drinkTea() {
        System.out.println("Перерыв!");
    }
}
