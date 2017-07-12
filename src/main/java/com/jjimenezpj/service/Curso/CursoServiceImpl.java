package com.jjimenezpj.service.Curso;


import com.jjimenezpj.pojos.Curso;
import com.jjimenezpj.mapper.CursoMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CursoServiceImpl implements CursoService {

    private CursoMapper cursoMapper;

    public CursoServiceImpl(CursoMapper cursoMapper){
        this.cursoMapper = cursoMapper;
    }

    public boolean insertCurso(Curso curso) {
        System.out.println("INSERTANDO CURSO: "+curso.toString());
        return (cursoMapper.insertCurso(curso));
    }

    public List<Curso> getCursosActivos() {
        List<Curso> listaCursosActivos = cursoMapper.findByActive();
        return listaCursosActivos;
    }
}
