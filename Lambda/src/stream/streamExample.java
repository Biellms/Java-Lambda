package stream;

import java.util.*;

public class streamExample {
    
    public static void main(String[] args) {
        
        // API DE STREAM
        // stream -> fluxo de dados
        // stream = loops implicitos
        // for|while|dowhile = loops explicitos

        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Lambda
        asList.stream() // fluxo de dados
            .filter(e -> e % 2 == 0) // Filtrando números pares
                .forEach(e -> System.out.println(e)); // Printando com forEach
    }
}
