package com.jjimenezpj.pojos;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProfesorTest {

    Profesor profesorTest = new Profesor();
    @Test
    public void setIdTest(){
        profesorTest.setId(1);
        assertEquals(1,profesorTest.getId());
    }
    @Test
    public void setNombreTest(){
        profesorTest.setNombre("Jose Muñoz");
        assertEquals("Jose Muñoz",profesorTest.getNombre());
    }

    @Test
    public void getToStringTest(){
        profesorTest.setNombre("Jose Muñoz");
        profesorTest.setId(1);

        String claseString = "Profesor{" +
                "id=" + profesorTest.getId() +
                ", nombre='" + profesorTest.getNombre() + '\'' +
                '}';
        assertEquals(claseString, profesorTest.toString());

    }



}
