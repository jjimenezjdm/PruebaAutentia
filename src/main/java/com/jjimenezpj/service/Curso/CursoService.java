package com.jjimenezpj.service.Curso;


import com.jjimenezpj.pojos.Curso;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Servicio de Curso
 */
@Service("cursoService")
public interface CursoService {
    @Transactional //BBDD
    boolean insertCurso(Curso curso);
    @Transactional
    List<Curso> getCursosActivos();
}
