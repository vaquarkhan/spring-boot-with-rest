package com.vaquar.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaquar.springboot.rest.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}