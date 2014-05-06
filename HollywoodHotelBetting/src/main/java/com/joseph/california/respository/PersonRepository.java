/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.respository;

import com.joseph.california.domain.Person;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author BradleyJoseph
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
