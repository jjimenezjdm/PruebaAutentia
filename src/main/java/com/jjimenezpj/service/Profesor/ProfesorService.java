package com.jjimenezpj.service.Profesor;

import com.jjimenezpj.pojos.Profesor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("profesorService")
public interface ProfesorService {
    @Transactional
    List<Profesor> getAllProfesor();
}
