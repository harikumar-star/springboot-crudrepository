package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.*;


@Repository
public interface UserDao extends CrudRepository<Employees, Integer> {

}
