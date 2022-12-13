package com.github.zipcodewilmington.sample;

public class Person implements PersonInterface{

    String firstName;
    String lastName;
    Integer age;
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}