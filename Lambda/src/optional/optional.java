package optional;

import java.util.Optional;

public class optional {
    
    /* OPTIONAL: classe que representa que um valor de retorno pode existir ou nao, sem ter que retornar null
     * of -> retorna optional
     * empty -> retorna optional vazio
     * ofNullable -> permite retornar null
     */

    public static void main(String[] args) {
        
        String s = "stringExample";
        Optional<Integer> numero = converteEmNumero(s);
        System.out.println(numero);
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
