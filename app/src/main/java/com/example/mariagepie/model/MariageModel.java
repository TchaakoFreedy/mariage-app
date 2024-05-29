package com.example.mariagepie.model;

public class MariageModel {
    private String description;
    private  String type;
    private String name;

    public MariageModel(String description, String type, String name) {
        this.description = description;
        this.type = type;
        this.name = name;
    }
    public  MariageModel(){};

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
