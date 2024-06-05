package unl.cis.swem.creationalpatterns.view;
import unl.cis.swem.creationalpatterns.singleton.Ies;
import unl.cis.swem.creationalpatterns.domain.Student;
import unl.cis.swem.creationalpatterns.domain.Teacher;
import unl.cis.swem.creationalpatterns.domain.AdministrativePersonal;
import unl.cis.swem.creationalpatterns.domain.SocialEconomicLevel;

public class SingletonMethodMain {
	  public static void main(String[] args) {
		  
		  System.out.println("==========SINGLETON============");
	        Ies ies = Ies.getInstance();

	        //instancia de profesor
	        Teacher profesor = new Teacher("Alberto", "Marin", "1900359769", "1998-02-01","Ingeniero","Docente");
	        //instancia de personal administrativo
	        AdministrativePersonal admin = new AdministrativePersonal("Juan", "Guaman", "1103212009", "Jefa de Seccion Software","Contador","Coordinacion");
	        //instancia de estudiante
	        SocialEconomicLevel socialEconomic = null;
	        Student estudiante = new Student("Carlos", "Jijal", "1105644270",socialEconomic.MEDIUM);
	       
	     
	        
	        //metodo para agregar a listas de profesores, estudiantes y administrativos
	        ies.gestionProfesores(profesor);
	        ies.gestionAdministrativos(admin);
	        ies.gestionEstudiantes(estudiante);
	        
	        
	        //generacion de referenicia de la instancia singleton
	        Ies ies2 = Ies.getInstance();

	 
	        //verificar las dos referencias si apuntan a la misma instancia
	        if (ies == ies2) {
	            System.out.println("singleton1 y singleton2 son la misma instancia.");
	        } else {
	            System.out.println("singleton1 y singleton2 son diferentes instancias.");
	        }

	        
	        ies.imprime();
	        
	  }

}
