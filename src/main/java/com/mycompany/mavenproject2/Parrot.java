/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *
 * @author earltstephens
 */
@Component
public class Parrot {
    private String name;
    
    @PostConstruct
    public void inti() {
        this.name = "Koko";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
