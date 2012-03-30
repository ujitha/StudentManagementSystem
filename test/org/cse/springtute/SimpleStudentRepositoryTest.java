/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cse.springtute;

import java.util.Iterator;
import junit.framework.Assert;
import java.util.List;
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
public class SimpleStudentRepositoryTest {
    private static Student s;
    private static SimpleStudentRepository instance ;
    public SimpleStudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        s = new Student();
        s.setFirstName("Tharindu");
        s.setLastName("Lakmal");
        s.setAddress("Pore, Athurugiriya");
        s.setRegNumber(12345);
        instance = new SimpleStudentRepository();
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
     * Test of saveStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student stu = s;
        instance.saveStudent(stu);
        Student a = instance.findStudent(s.getRegNumber());
        System.out.println(s.getFirstName()+s.getLastName()+s.getRegNumber()+s.getAddress());
    }

    /**
     * Test of deleteStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student stu = s;
        instance.deleteStudent(stu);
        Assert.assertEquals("Null excepted",null,instance.findStudent(s.getRegNumber()));
    }

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        Student stu = s;
        instance.saveStudent(stu);
        long regNumber = s.getRegNumber();
        Student expResult = s;
        Student result = instance.findStudent(regNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of updateStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        s.setAddress("cse. uom");
        Student stu = s;
        instance.updateStudent(stu);
        Assert.assertEquals("cse.uom expected", "cse. uom", instance.findStudent(s.getRegNumber()).getAddress());
    }

    /**
     * Test of findAllStudents method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        List result = instance.findAllStudents();
        Iterator it = result.iterator();
        while(it.hasNext()){
            Student b = (Student)it.next();
            System.out.println(b.getFirstName()+b.getLastName()+b.getRegNumber()+b.getAddress());
        }
    }

}