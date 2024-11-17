/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.mycompany.mavenproject2.Parrot;
import config.ProjectConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author earltstephens
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class} )
public class ParrotTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void testItsNameIsKoko() {
        Parrot p = context.getBean(Parrot.class);
        
        assertEquals("Koko", p.getName());
    }
}
