/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.california.services;

import java.util.List;

/**
 *
 * @author 210016299
 */
public interface VoteService {
    
    public int totalVotes();
    // can duplicate for own domain 
    public List<String> voters();
}
