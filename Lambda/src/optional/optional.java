package optional;

import java.util.Optional;

public class optional {
    
    /* OPTIONAL: classe que representa que um valor de retorno pode existir ou nao, sem ter que retornar null
     *
     * Criando:
     * of() -> retorna optional
     * empty() -> retorna optional vazio
     * ofNullable() -> permite retornar null
     * 
     * Usando:
     * isPresent() -> verifica se há um valor presente ou nao
     * get() -> pega o elemento do Optinal. Caso esteja vazio ele retorna uma exeption
     * ifPresent() -> recebe uma lambda que so e executada se houver um valor presente dentro do Optional
     * orElse() -> fornece um valor deafault a ser retornado
     * orElseGet() -> igual o orElse, porem e retornado uma funcao lambda, o que torna a operecao mais complexa e custosa
     * orElseThrow() -> lanca uma exception caso o Optional esteja vazio
     */

    public static void main(String[] args) {
        
        // String s = "8";
        String s = "stringExample";
        converteEmNumero(s)
            .ifPresent(n -> System.out.println("ifPresent: "+n));

        Integer orElse = converteEmNumero(s)
            .orElse(4);
                System.out.println("orElse: "+orElse);


        Integer orElseThrow = converteEmNumero(s)
            .orElseThrow(() -> new NullPointerException("Optional vazio!"));
                System.out.println("orElseThrow: "+orElseThrow);
    }

    public static Optional<Integer> converteEmNumero(String string) {

        try {
            Integer integer = Integer.valueOf(string);
            return Optional.ofNullable(integer);
        } catch (Exception e) {
            return Optional.empty();
        }

    }
}
