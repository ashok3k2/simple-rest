package com.myntra.simplerest.model;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by ashok.maurya on 01/07/17.
 */
@JsonRootName(value = "resource")
public class Resource {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
