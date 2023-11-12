import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		// start of exercise one
		List<String> list = Arrays.asList("primero", "segundo", "tercero", "cuarto", "quinto", "sexto"); 
        System.out.println(Uppercase(list));
        // end of exercise one
		
		// start of exercise two
		List<String> listTwo = Arrays.asList("uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"); 
        System.out.println(verify(listTwo, 4));
        // end of exercise two
        
        
        
	}
	
	// Exercise one
	public static List<String> Uppercase(List<String> list) {
		return list.stream().map((e) -> e.toUpperCase()).collect(Collectors.toList());
	}
	
	// Exercise two
	public static String verify(List<String> list, int integer) {
		return list.stream().filter((e) -> e.length() > integer).collect(Collectors.joining(", ", "{", "}"));
	}
}
