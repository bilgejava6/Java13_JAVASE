package com.muhammet.repository;

import com.muhammet.entity.Contact;

public class ContactRepository extends RepositoryManager<Contact,Long>{
    public ContactRepository() {
        super(new Contact());
    }
}
