package org.cse.springtute;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.cse.springtute.Student;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
                studentsDb.put(stu.getRegNumber(), stu);
	}

	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
            studentsDb.remove(stu.getRegNumber());

	}

	@Override
	public Student findStudent(long regNumber) {
		// TODO Auto-generated method stub
            return studentsDb.get(regNumber);
		
	}

	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
           studentsDb.remove(stu.getRegNumber());
           studentsDb.put(stu.getRegNumber(), stu);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
            LinkedList <Student>list = new LinkedList();
            Set keyset = studentsDb.keySet();
            Iterator it = keyset.iterator();
            while(it.hasNext()){
                list.add(findStudent((Long)it.next()));
            }
	    return list;
	}

}
