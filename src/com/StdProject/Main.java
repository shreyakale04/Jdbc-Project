package com.StdProject;

public class Main {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDao();


				dao.addStudent(
				4,
				"Pranav",
				"ghi@gmail.com",
				25
				);	


				dao.displayStudents();
	}

}
