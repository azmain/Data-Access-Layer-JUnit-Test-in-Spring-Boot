package io.azmain.studentdal;

import io.azmain.studentdal.entities.Student;
import io.azmain.studentdal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent(){
        Student student = new Student();
        student.setName("John");
        student.setCourse("Java Web Service");
        student.setFee(30d);
        studentRepository.save(student);

    }

    @Test
    public void testFindStudentById(){
        /*findOne method is now changed to findById
        But findById returns entity or optional
        so we need to specify null explicitly*/
        Student student = studentRepository.findById(1l).orElse(null);
        System.out.println(student);
    }

    @Test
    public void testUpdateStudent(){
        Student student = studentRepository.findById(1l).orElse(null);
        student.setFee(40d);
        studentRepository.save(student);
    }

    @Test
    public void testDeleteStudent(){
        Student student = new Student();
        student.setId(1l);
        studentRepository.delete(student);
    }

}
