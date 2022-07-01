package optional;

import java.util.Optional;

public class optional {
    
    public static void main(String[] args) {
        
        String s = "113";
        Optional<Integer> numero = converteEmNumero(s);
        System.out.println(numero);
    }

    public static Optional<Integer> converteEmNumero(String string) {

        Integer integer = Integer.valueOf(string);

        return Optional.of(integer);
    }
}
