package com.Alevel.homeWorks.lesson13.Back2School;

public class Person {
    private String name;
    private int age;
    private String gender;

public Person(String name, int age, String gender){
    this.gender = gender;
    this.age = age;
    this.name = name;
}

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name  +
                ", age:" + age +
                ", gender:" + gender;
    }
}
