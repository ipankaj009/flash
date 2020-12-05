package com.webproject.StudentApplication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webproject.StudentApplication.model.StudentData;
import com.webproject.StudentApplication.model.StudentLoginData;
import com.webproject.StudentApplication.studentdao.StudentCrudOp;
import com.webproject.StudentApplication.studentdao.StudentLoginCrud;

@Component
public class StudentLoginService {

	@Autowired
	StudentLoginCrud studCrud;
	
	@Autowired
	StudentCrudOp studentCrud;
	
	
	
	public boolean validateStudent(StudentLoginData stud)
	{
		
		System.out.println("...............Inside validate method.............."+stud.getUserName()+" "+stud);
		
		StudentLoginData validStud = studCrud.findById(stud.getUserName()).orElse(null);
		System.out.println("...............Inside validate method.............."+validStud);

		
		if(validStud != null)
		{
			return true;
		}else
			return false;
	}
	
	public boolean registeringStudent(StudentData studs)
	{
		
	StudentData st = studentCrud.save(studs);
	if(st != null)
	{
		return true;
	}
	else
		return false;
	}
	
}
