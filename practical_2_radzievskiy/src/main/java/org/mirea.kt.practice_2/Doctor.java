package org.mirea.kt.practice_2;

import java.util.Scanner;

public class Doctor extends Person {
    private Integer workHours;
    private Integer cabinet;

    public Doctor(Integer age, String name, int workHours, int cabinet) { // constructor of class Doctor
        super(age, name);
        this.workHours = workHours;
        this.cabinet = cabinet;
    }

    public void db(Doctor doctor) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер кабинета врача: ");
        doctor.setCabinet(scan.nextInt());
        System.out.print("Введите кол-во рабочих часов врача: ");
        doctor.setWorkHours(scan.nextInt());
        System.out.print("Введите имя врача: ");
        doctor.setName(scan.next());
        doctor.setAge(-1);
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        if (workHours < 0 || workHours > 24) {
            this.workHours = 6;
        } else {
            this.workHours = workHours;
        }
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        if (cabinet < 0) {
            this.cabinet = 666;
        } else {
            this.cabinet = cabinet;
        }
    }

    public void database() {
        System.out.println("Имя врача: " + getName() + "\nКол-во рабочих часов: " + getWorkHours() + "\nКабинет приёма:" + getCabinet() + "\nВозраст: " + getAge());
    }
}
