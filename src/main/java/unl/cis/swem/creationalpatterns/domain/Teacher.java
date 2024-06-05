/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unl.cis.swem.creationalpatterns.domain;

import java.time.LocalDate;

/**
 *
 * @author wduck
 */
public class Teacher extends Empleado{
    
   

    
    //constructor sin parametros
    public Teacher() {
    	
    }
    
    
    public Teacher(String firstName, String lastName, String dui,String titulo, String cargo) {
        super(firstName, lastName, dui, titulo, cargo);
       
    }





	@Override
    public void task() {
        System.out.println("SOY UN: " + this.getClass().getCanonicalName().toUpperCase() + 
            " E IMPARTO CLASES");
    }

   

    @Override
    public String toString() {
        return  super.toString() + ", "
                + "academicDegree=" + this.getTitulo() + '}';
    }

    
    
}
