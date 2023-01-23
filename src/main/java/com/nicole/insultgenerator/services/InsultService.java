package com.nicole.insultgenerator.services;

import com.nicole.insultgenerator.models.Insult;

public interface InsultService {
    Insult getInsultForPerson(String name);

}
