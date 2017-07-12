package com.jjimenezpj.mapper;

import com.jjimenezpj.pojos.Profesor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * Interfaz que hace el mappeo de lo que "tengo" con la base de datos
 */
@Mapper
public interface ProfesorMapper {
    List<Profesor> getAllProfesor();
}
