package unl.cis.swem.creationalpatterns.view;

import unl.cis.swem.creationalpatterns.builder.PersonaBuilder;
import unl.cis.swem.creationalpatterns.domain.AdministrativePersonal;
import unl.cis.swem.creationalpatterns.domain.SocialEconomicLevel;
import unl.cis.swem.creationalpatterns.domain.Student;
import unl.cis.swem.creationalpatterns.domain.Teacher;
import java.time.LocalDate;

public class BuilderMethodMain {
	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		 // Crear un estudiante usando el Builder
        Student estudiante = new PersonaBuilder()
                .setFirstName("Leonardo")
                .setLastName("Rojas")
                .setBirthDate(hoy)
                .setUuid("1105644270")
                .setSocialEconomicLevel(SocialEconomicLevel.MEDIUM)
                .buildStudent();

        // Crear un profesor usando el Builder
        Teacher profesor = new PersonaBuilder()
                .setFirstName("Edgar")
                .setLastName("Sarmiento")
                .setBirthDate(hoy)
                .setUuid("1109212198")
                .setAcademicDegree("PhD")
                .setCharge("Profesor")
                .buildTeacher();

        // Crear adminsitratico usando el Builder
        AdministrativePersonal admin = new PersonaBuilder()
                .setFirstName("Edison")
                .setLastName("Torres")
                .setBirthDate(hoy)
                .setUuid("1709192911")
                .setAcademicDegree("Ingeniero")
                .setCharge("Manager")
                .buildAdministrativePersonal();
        
    	//imprimir
    	System.out.println("BUILDER!");
    	System.out.println(estudiante.getFirstName());
    	System.out.println(profesor.getFirstName());
    	System.out.println(admin.getFirstName());
    	
	}
	

    
}
