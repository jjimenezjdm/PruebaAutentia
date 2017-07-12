package com.jjimenezpj.bean;

import com.jjimenezpj.faces.ProfesorBean;
import com.jjimenezpj.pojos.Profesor;
import com.jjimenezpj.service.Profesor.ProfesorService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProfesorBeanTest {

    @MockBean
    private ProfesorBean profesorBean;
    ProfesorService profesorService;

    @Before
    public void init() {
        profesorService = mock(ProfesorService.class);
        profesorBean = new ProfesorBean(profesorService);
    }

    /**
     * Test de la clase ProfesorBean, comprobamos que el bean llama al servicio asegurandonos
     * de que al obtener la lista de Cursos, ambos devuelven lo mismo.
     * Además, mockeamos el servicio para simular su comportamiento,
     * pues el objetivo de este test no es probar la capa de servicio.
     */
    @Test
    public void profesorBeanShouldCallServiceProfesores() {
        List<Profesor> expectedProfesor = new ArrayList<>();
        when(profesorService.getAllProfesor()).thenReturn(expectedProfesor);
        List<Profesor> expectedProfesoresByBean = profesorBean.getAllProfesor();
        verify(profesorService).getAllProfesor(); //Comprobar que profesorService es llamado correctamente
        assertTrue(expectedProfesoresByBean.size() == expectedProfesor.size());
    }

}
