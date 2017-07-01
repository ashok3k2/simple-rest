package com.myntra.simplerest.model;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

/**
 * Created by ashok.maurya on 01/07/17.
 */
@JsonRootName(value = "subjectOfCare")
public class SubjectOfCare {

    private String personId;
    private List<Listing> listings;
    private HealthCareFacility healthCareFacility;
    private Resource resource;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

    public HealthCareFacility getHealthCareFacility() {
        return healthCareFacility;
    }

    public void setHealthCareFacility(HealthCareFacility healthCareFacility) {
        this.healthCareFacility = healthCareFacility;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
