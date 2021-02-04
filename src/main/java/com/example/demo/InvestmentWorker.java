package com.example.demo;

import java.util.List;

public class InvestmentWorker {

    private List<Person> receivedShare;

    void pay (Person person, int amount)
    {
        Person p = person.Pay ((person.investment*5)/100);
        receivedShare.add(p);
    }

    public List<Person> getReceivedShare(){
        return this.receivedShare;
    }




}
