package unl.cis.swem.creationalpatterns.builder;

import java.time.LocalDate;

import unl.cis.swem.creationalpatterns.domain.AdministrativePersonal;
import unl.cis.swem.creationalpatterns.domain.SocialEconomicLevel;
import unl.cis.swem.creationalpatterns.domain.Student;
import unl.cis.swem.creationalpatterns.domain.Teacher;

public class PersonaBuilder {

	private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String uuid;
    private SocialEconomicLevel socialEconomicLevel; // Solo para Estudiante
    private String academicDegree; // Solo para Profesor
    private String charge; // Solo para Admin
    private String titulo; //Solo para empleado
    private String cargo; //Solo para empleado
    
    
    public PersonaBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonaBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonaBuilder setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public PersonaBuilder setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public PersonaBuilder setSocialEconomicLevel(SocialEconomicLevel level) {
        this.socialEconomicLevel = level;
        return this;
    }

    public PersonaBuilder setAcademicDegree(String degree) {
        this.academicDegree = degree;
        return this;
    }

    public PersonaBuilder setCharge(String charge) {
        this.charge = charge;
        return this;
    }
    
    
    public Student buildStudent() {
        Student student = new Student();
        student.setFirstName(this.firstName); 
        student.setLastName(this.lastName);
        student.setBirthDate( this.birthDate);
        student.setUuid(this.uuid);
        student.setSocialEconomicLevel(this.socialEconomicLevel);;
        return student;
    }

    public Teacher buildTeacher() {
        Teacher profesor = new Teacher();
        profesor.setFirstName(this.firstName) ;
        profesor.setLastName(this.lastName);
        profesor.setBirthDate(this.birthDate);
        profesor.setUuid(this.uuid);
        profesor.setTitulo(this.titulo);
        profesor.setCargo(this.cargo);
        
        return profesor;
    }
    
    public AdministrativePersonal buildAdministrativePersonal() {
        AdministrativePersonal admin = new AdministrativePersonal();
        admin.setFirstName(this.firstName); 
        admin.setLastName(this.lastName);
        admin.setBirthDate(this.birthDate);
        admin.setUuid(this.uuid);
        admin.setTitulo(this.titulo);
        admin.setCargo(this.cargo);
        return admin;
    }
}
