package com.bryceblankinship.eventful.dto;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.UUID;

public class PersonDTO {

    private String name;
    private UUID uuid;

    public PersonDTO(String name){
        this.name = name;
        registerPerson();
    }

    private void registerPerson(){
        uuid = UUID.randomUUID();
        // Add person to database
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
