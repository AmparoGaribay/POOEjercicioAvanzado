package com.generation.exceptions;

import com.generation.Student;

public class StudentNotFoundException extends Exception
{
	public StudentNotFoundException(Student student )
    {
        super( student +"Student not found!" );
    }
}