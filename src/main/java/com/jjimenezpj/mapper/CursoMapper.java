package com.jjimenezpj.mapper;

import com.jjimenezpj.pojos.Curso;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Interfaz que hace el mappeo de lo que "tengo" con la base de datos
 */
@Mapper
public interface CursoMapper {
    List<Curso> findByActive();
    boolean insertCurso(Curso nuevoCurso);
}
