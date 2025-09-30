package com.adil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adil.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}