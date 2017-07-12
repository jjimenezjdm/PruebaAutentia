package com.jjimenezpj.bean;

import com.jjimenezpj.pojos.Curso;
import com.jjimenezpj.service.Curso.CursoService;
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
public class CursoBeanTest {

    @MockBean
    private CursoBean cursoBean;
    CursoService cursoService;

    @Before
    public void init() {
        cursoService = mock(CursoService.class);
        cursoBean = new CursoBean(cursoService);
}


    /**
     * Test de la clase CursoBean y profesorBean, comprobamos que el bean llama al servicio asegurandonos
     * de que al obtener la lista de Cursos, ambos devuelven lo mismo.
     * Además, mockeamos el servicio para simular su comportamiento,
     * pues el objetivo de este test no es probar la capa de servicio.
     */
    @Test
    public void cursoBeanShouldCallServiceCursosActivos() {
        List<Curso> expectedCurso = new ArrayList<>();
        Curso C = new Curso();
        C.setActivo("true");
        C.setHoras(5);
        C.setIdProfesor(4);
        C.setNivel("Básico");
        C.setTitulo("IOS");
        expectedCurso.add(C);
        when(cursoService.getCursosActivos()).thenReturn(expectedCurso);
        List<Curso> expectedCursosByBean = cursoBean.getCursosActivos();
        verify(cursoService).getCursosActivos();//Comprobar que profesorService es llamado correctamente
        assertTrue(expectedCursosByBean.size() == expectedCurso.size());
    }

    @Test
    public void cursoBeanShouldCallServiceInsertarCurso() {
        Curso C = new Curso();
        boolean insertado = false;
        when(cursoService.insertCurso(C)).thenReturn(insertado);
        boolean expectedInsertado = cursoBean.insertarCurso();
        assertTrue(expectedInsertado == insertado);
    }

}
