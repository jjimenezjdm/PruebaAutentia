package com.jjimenezpj.pojos;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CursoTest {

    Curso cursoTest = new Curso();


    @Test
    public void setCursoTituloTest(){
        cursoTest.setTitulo("Spring");
        assertEquals("Spring",cursoTest.getTitulo());
    }

    @Test
    public void setCursoHorasTest(){
        cursoTest.setHoras(25);
        assertEquals(25,cursoTest.getHoras());
    }

    @Test
    public void setCursoActivoTest(){
        cursoTest.setActivo("true");
        assertEquals("true",cursoTest.getActivo());
    }
    @Test
    public void setCursoNivelTest(){
        cursoTest.setNivel("Intermedio");
        assertEquals("Intermedio",cursoTest.getNivel());
    }

    @Test
    public void setCursoidProfesorTest(){
        cursoTest.setIdProfesor(4);
        assertEquals(4,cursoTest.getIdProfesor());
    }

    @Test
    public void getCursoHorasTest(){
        cursoTest.setHoras(25);
        assertEquals(25,cursoTest.getHoras());
    }

    @Test
    public void getCursoActivoTest(){
        cursoTest.setActivo("true");
        assertEquals("true",cursoTest.getActivo());
    }

    @Test
    public void getCursoIdTest(){
        cursoTest.setId(1);
        assertEquals(1, cursoTest.getId());
    }

    @Test
    public void getCursoToStringTest(){
        cursoTest.setNivel("Intermedio");
        cursoTest.setIdProfesor(4);
        cursoTest.setHoras(25);
        cursoTest.setActivo("true");
        cursoTest.setTitulo("Spring");
        cursoTest.setId(5);
        String cursoToString = "Curso{" +
                "id=" + cursoTest.getId() +
                ", titulo='" + cursoTest.getTitulo() + '\'' +
                ", activo='" + cursoTest.getActivo() + '\'' +
                ", nivel='" + cursoTest.getNivel() + '\'' +
                ", horas=" + cursoTest.getHoras() +
                ", idProfesor=" + cursoTest.getIdProfesor() +
                '}';

        assertEquals(cursoToString,cursoTest.toString());
    }





}
