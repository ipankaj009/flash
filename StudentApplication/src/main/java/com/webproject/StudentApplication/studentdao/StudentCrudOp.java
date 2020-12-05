package com.webproject.StudentApplication.studentdao;

import org.springframework.data.repository.CrudRepository;

import com.webproject.StudentApplication.model.StudentData;

public interface StudentCrudOp extends CrudRepository<StudentData, Integer>{

	
}
