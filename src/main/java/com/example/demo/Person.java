package com.example.demo;

public class Person {

    int investment;

    boolean active= false;

    int Recieved_Share = 0;

    public Person Pay (int amount)
    {
        Recieved_Share += amount;
        return this;
    }


    public int getInvestment() {
        return investment;
    }

    public void setInvestment(int investment) {
        this.investment = investment;
    }

    public int getRecieved_Share() {
        return Recieved_Share;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public Person(int investment, boolean active) {
        this.investment = investment;
        this.active = active;

    }



}
