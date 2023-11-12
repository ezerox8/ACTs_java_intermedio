import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
	
	public static void main(String[] args) {
		Materia disenoDeSistemas = new Materia("diseño de sistemas" , List.of("Paradigmas de Programación", "Algoritmos", "Estructuras de Datos"));
		Materia ParadigmasDeProgramación = new Materia("Paradigmas de Programación" ,List.of("Algoritmos", "Estructuras de Datos"));
		Materia Algoritmos = new Materia("Algoritmos" ,new ArrayList<String>());
		Materia EstructurasDeDatos = new Materia("Estructuras de Datos" ,new ArrayList<String>());
		Alumno pepe = new Alumno("Pepe", List.of("Algoritmos", "Estructuras de Datos"));
		Alumno lola = new Alumno("Lola", List.of("Paradigmas de Programación", "Algoritmos", "Estructuras de Datos"));
		Alumno juan = new Alumno("Juan", List.of("Algoritmos"));
		Alumno maria = new Alumno("Maria", new ArrayList<String>());
		String siNo;
		
		siNo = (aprobada(disenoDeSistemas, pepe))? "Si" : "No";
		System.out.println("puede " + pepe.getNombre() + " cursar " + disenoDeSistemas.getNombre() + "?: " + siNo);
		siNo =  (aprobada(ParadigmasDeProgramación, pepe))? "Si" : "No";
		System.out.println("puede " + pepe.getNombre() + " cursar " + ParadigmasDeProgramación.getNombre() + "?: " + siNo);
		siNo =  (aprobada(Algoritmos, pepe))? "Si" : "No";
		System.out.println("puede " + pepe.getNombre() + " cursar " + Algoritmos.getNombre() + "?: " + siNo);
		siNo =  (aprobada(EstructurasDeDatos, pepe))? "Si" : "No";
		System.out.println("puede " + pepe.getNombre() + " cursar " + EstructurasDeDatos.getNombre() + "?: " + siNo);

		
		siNo = (aprobada(disenoDeSistemas, lola))? "Si" : "No";
		System.out.println("puede " + lola.getNombre() + " cursar " + disenoDeSistemas.getNombre() + "?: " + siNo);
		siNo =  (aprobada(ParadigmasDeProgramación, lola))? "Si" : "No";
		System.out.println("puede " + lola.getNombre() + " cursar " + ParadigmasDeProgramación.getNombre() + "?: " + siNo);
		siNo =  (aprobada(Algoritmos, lola))? "Si" : "No";
		System.out.println("puede " + lola.getNombre() + " cursar " + Algoritmos.getNombre() + "?: " + siNo);
		siNo =  (aprobada(EstructurasDeDatos, lola))? "Si" : "No";
		System.out.println("puede " + lola.getNombre() + " cursar " + EstructurasDeDatos.getNombre() + "?: " + siNo);

		
		siNo = (aprobada(disenoDeSistemas, juan))? "Si" : "No";
		System.out.println("puede " + juan.getNombre() + " cursar " + disenoDeSistemas.getNombre() + "?: " + siNo);
		siNo =  (aprobada(ParadigmasDeProgramación, juan))? "Si" : "No";
		System.out.println("puede " + juan.getNombre() + " cursar " + ParadigmasDeProgramación.getNombre() + "?: " + siNo);
		siNo =  (aprobada(Algoritmos, juan))? "Si" : "No";
		System.out.println("puede " + juan.getNombre() + " cursar " + Algoritmos.getNombre() + "?: " + siNo);
		siNo =  (aprobada(EstructurasDeDatos, juan))? "Si" : "No";
		System.out.println("puede " + juan.getNombre() + " cursar " + EstructurasDeDatos.getNombre() + "?: " + siNo);

		
		siNo = (aprobada(disenoDeSistemas, maria))? "Si" : "No";
		System.out.println("puede " + maria.getNombre() + " cursar " + disenoDeSistemas.getNombre() + "?: " + siNo);
		siNo =  (aprobada(ParadigmasDeProgramación, maria))? "Si" : "No";
		System.out.println("puede " + maria.getNombre() + " cursar " + ParadigmasDeProgramación.getNombre() + "?: " + siNo);
		siNo =  (aprobada(Algoritmos, maria))? "Si" : "No";
		System.out.println("puede " + maria.getNombre() + " cursar " + Algoritmos.getNombre() + "?: " + siNo);
		siNo =  (aprobada(EstructurasDeDatos, maria))? "Si" : "No";
		System.out.println("puede " + maria.getNombre() + " cursar " + EstructurasDeDatos.getNombre() + "?: " + siNo);
		
	}
	// Retorna true solo si el alumno tiene aprobadas las correlativas 
	// de la materia que se desea y la misma no esta ya aprobada
	
	public static boolean aprobada(Materia materia, Alumno alumno) {
		return materia.getCorrelativas().stream().allMatch((String mat) -> {
			return alumno.getAprobadas().stream().anyMatch(m -> m == mat);
		}) && !alumno.getAprobadas().stream().anyMatch(m -> m == materia.getNombre());
	}

}
