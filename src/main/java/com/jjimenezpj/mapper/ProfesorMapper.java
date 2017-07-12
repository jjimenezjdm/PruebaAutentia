package com.jjimenezpj.mapper;

import com.jjimenezpj.pojos.Profesor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfesorMapper {
    List<Profesor> getAllProfesor();
}
