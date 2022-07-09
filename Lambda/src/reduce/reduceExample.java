package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceExample {
    
    public static void main(String[] args) {
        
        /* REDUCE
         * Pegar todos os elementos de uma stream e transforma-los em em um unico elemento. Sua função aplicada nos paramentro que dira qual sera sua forma de reduzir os elementos para apenas um.
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // soma
        Optional<Integer> soma = list.stream()
            .reduce((n1, n2) -> n1 + n2);

        System.out.println("Soma: "+soma);

        // multiplicacao
        Optional<Integer> multi = list.stream()
            .reduce((n1, n2) -> n1 * n2);
        
        System.out.println("Multiplicacao: "+multi);
    }
}
