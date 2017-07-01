package com.myntra.simplerest.service.impl;

import com.myntra.simplerest.model.HealthCareFacility;
import com.myntra.simplerest.model.Listing;
import com.myntra.simplerest.model.Resource;
import com.myntra.simplerest.model.SubjectOfCare;
import com.myntra.simplerest.service.SubjectOfCareService;

import java.util.ArrayList;

/**
 * Created by ashok.maurya on 01/07/17.
 */
public class SubjectOfCareServiceImpl implements SubjectOfCareService {
    @Override
    public SubjectOfCare get(Integer id) {
        Resource resource = new Resource();
        resource.setId("res1");
        resource.setName("resName");

        HealthCareFacility healthCareFacility = new HealthCareFacility();
        healthCareFacility.setId("health 1");
        healthCareFacility.setName("healthName");

        Listing listing = new Listing();
        listing.setName("listing1");

        Listing listing1 = new Listing();
        listing1.setName("listing2");

        ArrayList<Listing> listings = new ArrayList<>();
        listings.add(listing);
        listings.add(listing1);

        SubjectOfCare subjectOfCare = new SubjectOfCare();
        subjectOfCare.setPersonId("Lucky");
        subjectOfCare.setHealthCareFacility(healthCareFacility);
        subjectOfCare.setListings(listings);
        subjectOfCare.setResource(resource);

        return subjectOfCare;
    }
}
