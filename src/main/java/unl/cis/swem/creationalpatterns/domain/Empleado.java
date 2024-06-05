package unl.cis.swem.creationalpatterns.domain;


public class Empleado  extends Person {

	private String titulo;
    private String cargo;
    
    
    public Empleado(String firstName,String lastName, String dui,String titulo, String cargo) {
        super(firstName, lastName, dui);
        this.titulo = titulo;
        this.cargo = cargo;
    }
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		
	}
    
    
}
