import java.util.List;

public class Materia {
	
	private List<String> correlativas;
	private String nombre;

	public List<String> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(List<String> correlativas) {
		this.correlativas = correlativas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	Materia(String nombre, List<String> correlativas) {
		this.correlativas = correlativas;
		this.nombre = nombre;
	}

}
