package unl.cis.swem.creationalpatterns.singleton;
import unl.cis.swem.creationalpatterns.domain.Student;
import unl.cis.swem.creationalpatterns.domain.Teacher;
import unl.cis.swem.creationalpatterns.domain.AdministrativePersonal;

import java.util.ArrayList;
import java.util.List;



public class Ies {
	 private static Ies instance = null;
	 
	 private List<Teacher> listProfesores;
	 private List<Student> listEstudiantes;
	 private List<AdministrativePersonal> listAdministrativos;
	 
	 
	 private Ies() {
		 this.listProfesores = new ArrayList<>();
	     this.listEstudiantes = new ArrayList<>();
	     this.listAdministrativos = new ArrayList<>();
	 }
	 
	 public static Ies getInstance() {
		 if (instance == null) {
			 instance = new Ies();
	     }
		 return instance;
	 }
	 
	 public void gestionProfesores(Teacher profesor) {
	        this.listProfesores.add(profesor);
	 }

	 public void gestionEstudiantes(Student estudiante) {
	        this.listEstudiantes.add(estudiante);
	 }

	 public void gestionAdministrativos(AdministrativePersonal administrativo) {
	        this.listAdministrativos.add(administrativo);
	 }
	
	 public void imprime() {
		 	System.out.println(this.listProfesores);
		 	System.out.println(this.listEstudiantes);
		 	System.out.println(this.listAdministrativos);
		 
	 }
	 
}
