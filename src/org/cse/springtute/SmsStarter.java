package org.cse.springtute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

	public static void main(String[] args) {
		StudentManagementSystem sms;
		//load the bean from spring
//		sms.listAllStudents();
//		sms.registerStudent(stu);
//		sms.listAllStudents();
                
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-content.xml");
        context.start();
        Student std1=(Student)context.getBean("student1");
        Student std2=(Student)context.getBean("student2");
        Student std3=(Student)context.getBean("student3");
        sms= (StudentManagementSystem)context.getBean("sms");
        sms.listAllStudents();
        sms.registerStudent(std1);
        sms.registerStudent(std2);
        sms.listAllStudents();
	}
}
