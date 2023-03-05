package org.mirea.kt.practice_2;

public class Surgeon extends Doctor {

    public Surgeon(Integer age, String name, Integer workHours, Integer cabinet) {
        super(age, name, workHours, cabinet);
    }

    public void doSurgery() {
        System.out.println(getName() + " начинает проводить операцию!");
    }

}
