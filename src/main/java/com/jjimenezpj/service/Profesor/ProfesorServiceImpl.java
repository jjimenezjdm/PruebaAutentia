package com.jjimenezpj.service.Profesor;

import com.jjimenezpj.pojos.Profesor;
import com.jjimenezpj.mapper.ProfesorMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProfesorServiceImpl implements ProfesorService {

    private ProfesorMapper profesorMapper;

    public ProfesorServiceImpl(ProfesorMapper profesorMapper){
        this.profesorMapper = profesorMapper;
    }

    public List<Profesor> getAllProfesor() {
        List<Profesor> listaProfesores = profesorMapper.getAllProfesor();
        return listaProfesores;
    }
}
