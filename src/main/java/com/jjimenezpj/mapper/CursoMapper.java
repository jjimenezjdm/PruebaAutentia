package com.jjimenezpj.mapper;

import com.jjimenezpj.pojos.Curso;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CursoMapper {

	List<Curso> findByActive();
	boolean insertCurso(Curso nuevoCurso);
}
