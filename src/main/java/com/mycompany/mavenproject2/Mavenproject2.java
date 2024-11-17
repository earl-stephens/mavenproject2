/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author earltstephens
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
