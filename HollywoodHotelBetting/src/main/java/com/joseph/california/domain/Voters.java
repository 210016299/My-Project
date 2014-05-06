/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.domain;

import java.io.Serializable;
import javax.persistence.Column; //to use @Column annotation
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 210016299
 */
@Entity //Creates tables, columns, etc.
public class Voters implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Ensures that String name needs to be unique
    @Column(unique=true)
    private String name; // encapsulate field makes it private
    //Embedded is derived from embeddables 
    //
    private String address;
    private int ballets;
    
    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voters)) {
            return false;
        }
        Voters other = (Voters) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joseph.california.domain.Voters[ id=" + id + " ]";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getBallets() {
        return ballets;
    }
    
}
