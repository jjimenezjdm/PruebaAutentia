package com.jjimenezpj.service;

import com.jjimenezpj.mapper.ProfesorMapper;
import com.jjimenezpj.pojos.Profesor;
import com.jjimenezpj.service.Profesor.ProfesorServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProfesorServiceTest {

    ProfesorServiceImpl profesorServiceImpl;

    @MockBean
    ProfesorMapper profesorMapper;

    @Before
    public void init(){
        profesorMapper = mock(ProfesorMapper.class);
        profesorServiceImpl = new ProfesorServiceImpl(profesorMapper);
    }

    @Test
    public void getAllProfesorTest(){
        List<Profesor> expectedProfesores = new ArrayList<>();
        when(profesorMapper.getAllProfesor()).thenReturn(expectedProfesores);
        List<Profesor> expectedInsertado = profesorServiceImpl.getAllProfesor();
        verify(profesorMapper).getAllProfesor();
        assertEquals(expectedInsertado,expectedProfesores);

    }
}
