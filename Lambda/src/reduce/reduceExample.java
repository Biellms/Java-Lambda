package reduce;

import java.util.*;

public class reduceExample {
    
    public static void main(String[] args) {
        
        /* REDUCE
         * Pegar todos os elementos de uma stream e transforma-los em em um unico elemento. Sua função aplicada nos paramentro que dira qual sera sua forma de reduzir os elementos para apenas um.
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        String s = "Ola eu me chamo Gabriel e sou desenvolvedor!";
        String[] split = s.split(" ");
        List<String> listString = Arrays.asList(split);

        // soma
        Optional<Integer> soma = list.stream()
            .reduce((n1, n2) -> n1 + n2);

        System.out.println("Soma: "+soma);

        // multiplicacao
        Optional<Integer> multi = list.stream()
            .reduce((n1, n2) -> n1 * n2);
        
        System.out.println("Multiplicacao: "+multi);

        // concatenacao
        Optional<String> concat = listString.stream()
            .reduce((s1, s2) -> s1.concat(s2));

        System.out.println("Concatenacao: "+concat);

        // subtracao | NÃO FAÇA!
        Optional<Integer> subtracao = list.stream()
            .reduce((n1, n2) -> n1 - n2);

        System.out.println("Subtracao: "+subtracao);
    }
}
