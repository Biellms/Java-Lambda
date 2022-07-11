package reduce;

import java.util.*;
import java.util.stream.DoubleStream;

public class reduceExample {
    
    public static void main(String[] args) {
        
        /* REDUCE
         * Pegar todos os elementos de uma stream e transforma-los em em um unico elemento. Sua função aplicada nos paramentro que dira qual sera sua forma de reduzir os elementos para apenas um.
         */

        List<Integer> list = Arrays.asList(5, 3, 2, 4, 1, 6, 8, 7);

        String s = "Ola eu me chamo Gabriel e sou desenvolvedor!";
        String[] split = s.split(" ");
        List<String> listString = Arrays.asList(split);

        // soma
        // valor de identidade = 0 -> .reduce(0, (n1, n2) -> n1 + n2);
        Optional<Integer> soma = list.stream()
            .reduce((n1, n2) -> n1 + n2);

        System.out.println("Soma: "+soma);

        // multiplicacao
        // valor de identidade = 1 -> .reduce(1, (n1, n2) -> n1 * n2);
        Optional<Integer> multi = list.stream()
            .reduce((n1, n2) -> n1 * n2);
        
        System.out.println("Multiplicacao: "+multi);

        // concatenacao
        // valor de identidade = "" -> .reduce("", (s1, s2) -> s1.concat(s2));
        Optional<String> concat = listString.stream()
            .reduce((s1, s2) -> s1.concat(s2));

        System.out.println("Concatenacao: "+concat);

        // Menor valor
        // valor de identidade = double.POSITIVE_INFINITY
        double menorValor = DoubleStream.of(1.2, 0.6, 2.9, 3.9, 0.2)
            .reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));

        System.out.println("Menor Valor: "+menorValor);

        // subtracao | NÃO FAÇA!
        // Optional<Integer> subtracao = list.stream()
        //     .reduce((n1, n2) -> n1 - n2);

        // System.out.println("Subtracao: "+subtracao);
    }
}
