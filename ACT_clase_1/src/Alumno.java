import java.util.List;

public class Alumno {

	private List<String> aprobadas;
	private String nombre;
	
	Alumno(String nombre, List<String> aprobadas) {
		this.aprobadas = aprobadas;
		this.nombre = nombre;
	}

	public List<String> getAprobadas() {
		return aprobadas;
	}

	public void setAprobadas(List<String> aprobadas) {
		this.aprobadas = aprobadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
