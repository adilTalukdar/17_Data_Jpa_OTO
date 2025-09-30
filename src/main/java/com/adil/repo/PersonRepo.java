package com.adil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adil.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}