package com.Spring.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.Spring.entities.Contact;

public interface ContactService {
	public Contact addContact(@RequestBody Contact contact);
}
