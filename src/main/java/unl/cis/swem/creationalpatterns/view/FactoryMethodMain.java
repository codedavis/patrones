/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unl.cis.swem.creationalpatterns.view;

import unl.cis.swem.creationalpatterns.domain.Person;
import unl.cis.swem.creationalpatterns.factorymethod.AdministrativePersonalFactory;
import unl.cis.swem.creationalpatterns.factorymethod.PersonFactoryMethod;
import unl.cis.swem.creationalpatterns.factorymethod.StudentFactory;
import unl.cis.swem.creationalpatterns.factorymethod.TeacherFactory;

/**
 *
 * @author wduck
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
       
        System.out.println("FACTORY!");
        
        PersonFactoryMethod personFactory;
        //personFactory = new TeacherFactory();
        //personFactory = new StudentFactory();
        System.out.println("==========ADMINISTRATIVO============");
        personFactory = new AdministrativePersonalFactory();
        
        Person object = personFactory.create();
        System.out.println(object.toString());
        System.out.println();
        System.out.println(object.fullName());
        object.task();
        
        System.out.println("==========PROFESOR============");
        TeacherFactory teacher;
        teacher = new TeacherFactory();
        Person objectTeacher = teacher.create();
        System.out.println(objectTeacher.toString());
        System.out.println();
        System.out.println(objectTeacher.fullName());
        objectTeacher.task();
        
        System.out.println("==========ESTUDIANTE============");
        StudentFactory student;
        student = new StudentFactory();
        Person objectStudent = student.create();
        System.out.println(objectStudent.toString());
        System.out.println();
        System.out.println(objectStudent.fullName());
        objectStudent.task();
        
        
       

        
        
    }
}
