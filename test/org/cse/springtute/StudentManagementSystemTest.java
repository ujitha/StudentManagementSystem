/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cse.springtute;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100590g
 */
public class StudentManagementSystemTest {

    private static Student s;
    private static SimpleStudentRepository instance ;
    private static StudentManagementSystem sms;
    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        StudentManagementSystem instanc = new StudentManagementSystem();
        instanc.listAllStudents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        s = new Student();
        s.setFirstName("Ujitha");
        s.setLastName("Iroshan");
        s.setAddress("Badulla");
        s.setRegNumber(103889);
        sms=new StudentManagementSystem();
        sms.registerStudent(s);
        instance=new SimpleStudentRepository();
        instance=(SimpleStudentRepository)sms.getStudentRepository();
      
      //Assert.assertEquals("not found",s.getAddress(),instance.findStudent(s.getRegNumber()).getAddress());
      Assert.assertEquals(s,instance.findStudent(s.getRegNumber()) );
       
    }

}