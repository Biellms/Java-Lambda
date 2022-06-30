package stream;

import java.util.*;
import java.util.stream.Collectors;

public class finalOperations {

    public static void main(String[] args) {
        
        //Arrays de inteiros
        List<Integer> List = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9);

        /* OPERACOES FINAIS
         * .count() -> faz a contagem de elementos
         * .min() -> pega o menor valor dos elementos
         * .max() -> pega o maior valor dos elementos
         * .collect() -> toList() -> cria uma nova lista
         *            -> groupinBy() -> agrupa os elementos em novas listas, de acordo com o resultado do processamento
         *            -> joining() -> coleta todo os elementos em uma unica string
         */

        System.out.println("Stream 1: count");

        long count = List.stream()
            .filter(e -> e % 2 == 0)
                .count();

        System.out.println(count);

        System.out.println("Stream 2: min, max");

        Optional<Integer> min = List.stream()
            .filter(e -> e % 2 > 0)
                .min(Comparator.naturalOrder());
        Optional<Integer> max = List.stream()
        .filter(e -> e % 2 > 0)
            .max(Comparator.naturalOrder());

        System.out.println(min.get());
        System.out.println(max.get());

        System.out.println("Stream 3: collect - toList");

        List<Integer> list = List.stream()
            .map(e -> e + 4)
                .collect(Collectors.toList());

        System.out.println(list);

        System.out.println("Stream 4: collect - groupingBy");

        Map<Integer, List<Integer>> group = List.stream()
            .collect(Collectors.groupingBy(e -> e % 3));

        System.out.println(group);

        System.out.println("Stream 5: collect - joining");

        String join = List.stream()
            .map(e -> String.valueOf(e))
                .collect(Collectors.joining(", "));

        System.out.println(join);
    }
}
