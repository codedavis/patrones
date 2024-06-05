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
public class AdministrativePersonal extends Empleado{

        
	
    public AdministrativePersonal() {
       
    }

    
    
    public AdministrativePersonal(String firstName, String lastName, String dui,String titulo, String cargo) {
        super(firstName, lastName, dui, titulo, cargo);
   
    }

    
    @Override
    public void task() {
        System.out.println("SOY UN: " + this.getClass().getName().toUpperCase() + 
            " Y GESTIONO A LOS MIEMBORS DE LAS IES");    
    }



    @Override
    public String toString() {
        return "AdministrativePersonal{"
                + super.toString() + ", "
                + "charge=" + getCargo() + '}';
    }
    
    
}
