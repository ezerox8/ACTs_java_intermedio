import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
	
	public static void main(String[] args) {
        List<String> list = Arrays.asList("uno", "dos", "tres", "cuatro", "cinco", "seis", "siete"); 
        System.out.println(listToUpperCase(list, (string)-> string.toUpperCase()));
	}
	
	public static List<String> listToUpperCase(List<String> list, Uppercase fn) {
		return list.stream().map((e) -> fn.toUpper(e)).collect(Collectors.toList());
	}

}
