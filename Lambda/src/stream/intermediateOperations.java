package stream;

import java.util.Arrays;
import java.util.List;

public class intermediateOperations {
    
    public static void main(String[] args) {
        
        //Arrays de inteiros
        List<Integer> List = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9);
        List<Integer> List2 = Arrays.asList(5, 2, 6, 8, 8, 9, 9, 1, 3, 4, 5);

        /* OPERACOES INTERMEDIARIAS 
         * .skip() -> ignora os primeiros elementos de acordo com o valor do parametro
         * .limit() -> limita a quantidade de elementos a serem percorridos
         * .distinct() -> nao permite o processamento de elementos repetidos
         * .filter() -> personaliza o processamento de elementos
         * .map() -> altera o valor dos elementos mapeados
         * .forEach() -> percorre a array | forEach é uma operacao final
         */

        // Exemplos
        System.out.println("Stream 1: skip, limit, distinct, forEach");
        List.stream()
            .skip(2)
                .limit(7) 
                    .distinct()
                        .forEach(e -> System.out.println(e));

        System.out.println("Stream 2: filter");                
        List2.stream()
            .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));

        System.out.println("Stream 3: map");                
        List2.stream()
            .map(e -> e * 2)
                .forEach(e -> System.out.println(e));
    }
}
