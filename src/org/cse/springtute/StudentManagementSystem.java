package org.cse.springtute;

import java.util.Iterator;

public class StudentManagementSystem {

	private SimpleStudentRepository repo;
        
        public StudentManagementSystem()
        {
            repo=new SimpleStudentRepository() {};
        }

	public void listAllStudents() {
		//Get all the students from repository and print them in the screen
            
            Iterator it = repo.findAllStudents().iterator();
            while(it.hasNext()){
                Student s = (Student)it.next();
                System.out.println(s.getFirstName()+" "+s.getLastName()+" "+s.getRegNumber()+" "+s.getAddress());
            }
	}

	public void registerStudent(Student stu){
		//Save the new student using repository
            repo.saveStudent(stu);
	}
        
        public StudentRepository getStudentRepository ()
        {
            return repo;
        }
}
