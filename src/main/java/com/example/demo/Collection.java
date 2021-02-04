package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
public class Collection {

    private List<Person> investmentsFromDb = new ArrayList<>();

    private InvestmentWorker worker = new InvestmentWorker();


    public Collection(){
        investmentsFromDb.add(new Person(1,false));
        investmentsFromDb.add(new Person(222,false));
        investmentsFromDb.add(new Person(333,false));
        investmentsFromDb.add(new Person(111,false));
    }

    @PostMapping("/profit")
    @ResponseBody
    ResponseEntity<List<Person>> login() {

        for (int i=0; i <= investmentsFromDb.size() -1 ; i++){
            if (investmentsFromDb.get(i).investment > 0){
                worker.pay(investmentsFromDb.get(i),10);
                investmentsFromDb.get(i).active=true;
            }
        }
        return ResponseEntity.ok(worker.getReceivedShare());

    }

}

