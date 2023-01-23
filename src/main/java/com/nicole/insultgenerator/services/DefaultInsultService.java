package com.nicole.insultgenerator.services;

import com.nicole.insultgenerator.models.Insult;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class DefaultInsultService  implements InsultService{

    List<String> insultsList;
    @PostConstruct
        private void initInsultsList(){
        insultsList = new ArrayList<>();
        insultsList.add("silly");
        insultsList.add("Daft");
        insultsList.add("crazy");
        insultsList.add("foolish");
    }
    private String getRandomInsult(){
        int sizeOfInsultsList = insultsList.size();
        int randomInsultLocation = ThreadLocalRandom.current().nextInt(sizeOfInsultsList);
        return insultsList.get(randomInsultLocation);
    }


    @Override
    public Insult getInsultForPerson(String name) {
        return new Insult(name, getRandomInsult() );
    }
}
