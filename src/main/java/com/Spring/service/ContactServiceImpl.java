package com.Spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Dao.ContactDao;
import com.Spring.entities.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDao contactDao;

	@Override
	public Contact addContact(Contact contact) {
		contactDao.save(contact);
		return contact;
	}

}
