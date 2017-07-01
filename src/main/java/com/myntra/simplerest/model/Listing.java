package com.myntra.simplerest.model;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by ashok.maurya on 01/07/17.
 */
@JsonRootName(value = "listing")
public class Listing {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
