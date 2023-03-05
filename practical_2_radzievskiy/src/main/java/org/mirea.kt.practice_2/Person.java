package org.mirea.kt.practice_2;

public class Person { // создание класса Person
    private Integer age;
    private String Name;

    public Person(Integer age, String name) { // конструктор класса Person
        this.age = age;
        Name = name;
    }

    public Integer getAge() { // геттер (возвращает значение) возраста
        return age;
    }

    public void setAge(Integer age) { // сеттер(проверяет и устанавливает значение) возраста
        if (age < 0 || age > 100) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public String getName() { // геттер имени
        return Name;
    }

    public void setName(String name) { // сеттер имени
        Name = name;
    }


}