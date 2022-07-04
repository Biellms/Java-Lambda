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
     */

    public static void main(String[] args) {
        
        // String s = "8";
        String s = "stringExample";
        converteEmNumero(s)
            .ifPresent(n -> System.out.println(n)); 
        /* Optional<Integer> number = converEmNumero(number);
         * System.out.println(number));
         */
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
