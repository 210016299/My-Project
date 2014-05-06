/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author 210016299
 */
@Embeddable
public class Demographic {
    private String ethenicity;
    private String gender;

    public String getEthenicity() {
        return ethenicity;
    }

    public void setEthenicity(String ethenicity) {
        this.ethenicity = ethenicity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
