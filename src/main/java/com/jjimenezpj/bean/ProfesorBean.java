package com.jjimenezpj.bean;

import com.jjimenezpj.pojos.Profesor;
import com.jjimenezpj.service.Profesor.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase Controller del objeto Profesor
 */
@ManagedBean
@ViewScoped
public class ProfesorBean {

    @ManagedProperty("#{profesorService}")
    private ProfesorService profesorService;

    private List<Profesor> profesores;

    @Autowired
    public ProfesorBean(ProfesorService profesorService) {
        this.profesorService = profesorService;
        profesores = new ArrayList<>();
    }

    public List<Profesor> getAllProfesor() {
        profesores = profesorService.getAllProfesor();
        return profesores;
    }
}
