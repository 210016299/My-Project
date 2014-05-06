/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.services.Impl;

import com.joseph.california.domain.Person;
import com.joseph.california.respository.PersonRepository;
import com.joseph.california.services.TotalPeopleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BradleyJoseph
 */
@Service
public class TotalPeopleServiceImpl implements TotalPeopleService{
    @Autowired
    private PersonRepository personRepository;
    

    @Override
    public List<Person> getTotalPeople() {
        return personRepository.findAll();
        }
    
}
