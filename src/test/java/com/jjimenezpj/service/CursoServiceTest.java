package com.jjimenezpj.service;

import com.jjimenezpj.mapper.CursoMapper;
import com.jjimenezpj.pojos.Curso;
import com.jjimenezpj.service.Curso.CursoService;
import com.jjimenezpj.service.Curso.CursoServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CursoServiceTest {

    CursoServiceImpl cursoServiceImpl;

    @MockBean
    CursoMapper cursoMapper;

    @Before
    public void init(){
        cursoMapper = mock(CursoMapper.class);
        cursoServiceImpl = new CursoServiceImpl(cursoMapper);
    }

    @Test
    public void insertCursoTest(){
        Curso cursoNuevo = new Curso();
        when(cursoMapper.insertCurso(cursoNuevo)).thenReturn(true);
        boolean expectedInsertado = cursoServiceImpl.insertCurso(cursoNuevo);
        verify(cursoMapper).insertCurso(cursoNuevo);
        assertEquals(true,expectedInsertado);

    }

    @Test
    public void getCursosActivosTest(){
        List<Curso> expectedCursos = new ArrayList<>();
        when(cursoMapper.findByActive()).thenReturn(expectedCursos);
        List<Curso> expectedInsertado = cursoServiceImpl.getCursosActivos();
        verify(cursoMapper).findByActive();
        assertEquals(expectedInsertado,expectedCursos);

    }
}
