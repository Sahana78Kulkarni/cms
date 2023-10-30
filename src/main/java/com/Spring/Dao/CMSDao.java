package com.Spring.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.entities.Faculty;
public interface CMSDao extends JpaRepository<Faculty,Long> {

}
