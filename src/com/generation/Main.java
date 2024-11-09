package com.generation;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent( new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent( new Student( "Ian", "1040", 28 ) );
        studentService.addStudent( new Student( "Elise", "1050", 26 ) );
        studentService.addStudent( new Student("Santiago", "1020", 33 ) );

        try {
			studentService.enrollStudents( "Math", "1030" );
			studentService.enrollStudents( "Math", "1040" );
			studentService.enrollStudents( "story", "1040" );
		} catch (CourseNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}catch(StudentNotFoundException e) {
			System.out.println(e);
		}
  
        studentService.showAllCourses();

        studentService.showEnrolledStudents("Math");
    }
}