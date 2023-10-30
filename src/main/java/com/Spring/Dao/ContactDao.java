package com.Spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.entities.Contact;

public interface ContactDao extends JpaRepository<Contact,Long>{

}
