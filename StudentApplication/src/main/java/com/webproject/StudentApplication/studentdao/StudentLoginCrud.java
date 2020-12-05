package com.webproject.StudentApplication.studentdao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.webproject.StudentApplication.model.StudentLoginData;

public interface StudentLoginCrud extends CrudRepository<StudentLoginData, String>{

	
}
