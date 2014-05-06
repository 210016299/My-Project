/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.services;

import com.joseph.california.domain.Person;
import java.util.List;

/**
 *
 * @author BradleyJoseph
 */
public interface PeopleAgeService {

    public List<Person> getAgeAbove(int i);
    
}
