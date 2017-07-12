package com.jjimenezpj.bean;

import com.jjimenezpj.pojos.Curso;
import com.jjimenezpj.service.Curso.CursoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase controller del objeto Curso
 */
@ManagedBean
@ViewScoped
public class CursoBean {

    @ManagedProperty("#{cursoService}")
    private CursoService cursoService;

    private Curso nuevoCurso;
    private List<Curso> cursosActivos;

    @Autowired
    public CursoBean(CursoService cursoService) {
        this.cursoService = cursoService;
        this.cursosActivos = new ArrayList<Curso>();
        this.nuevoCurso = new Curso();
    }

    public boolean insertarCurso() {
        boolean insertado = cursoService.insertCurso(nuevoCurso);
        nuevoCurso = new Curso();
        if (insertado)
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("../index.jsf");
            } catch (IOException e) {
                e.printStackTrace();
            }
        return insertado;
    }

    public List<Curso> getCursosActivos() {
        cursosActivos = cursoService.getCursosActivos();
        return this.cursosActivos;
    }

    public Curso getNuevoCurso() {
        return this.nuevoCurso;
    }
}
