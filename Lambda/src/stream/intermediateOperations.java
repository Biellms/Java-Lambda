package stream;

import java.util.Arrays;
import java.util.List;

public class intermediateOperations {
    
    public static void main(String[] args) {
        
        //Arrays de inteiros
        List<Integer> List = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9);
        List<Integer> List2 = Arrays.asList(5, 2, 6, 8, 8, 9, 9, 1, 3, 4, 5);

        /* .forEach() -> percorre a array
         * .skip() -> ignora os primeiros elementos de acordo com o valor do parametro
         * .limit() -> limita a quantidade de elementos a serem percorridos
         * .distinct() -> não permite o processamento de elementos repitidos
         * .filter() -> personaliza o processamento de elementos
         * .map() -> altera o valor dos elementos mapeados
         */

        // Exemplos
        System.out.println("Stream 1");
        List.stream()
            .skip(2)
                .limit(7) 
                    .distinct()
                        .forEach(e -> System.out.println(e));

        System.out.println("Stream 2");                
        List2.stream()
            .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));

        System.out.println("Stream 3");                
        List2.stream()
            .map(e -> e * 2)
                .forEach(e -> System.out.println(e));
    }
}
