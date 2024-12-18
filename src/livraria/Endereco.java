package livraria;

import java.util.Scanner;

public class Endereco {

    String rua, bairro, cep, cidade;
    Scanner cafe = new Scanner(System.in);

    Endereco() {
        System.out.println(" qual e a rua ");
        rua = cafe.next();
        System.out.println("qual e o bairro ");
        bairro = cafe.next();
        System.out.println(" qual e o cep");
        cep = cafe.next();
        System.out.println(" qual e a cidade ");
        cidade = cafe.next();
    }

    void exibir() {
        System.out.println("rua:" + rua);
        System.out.println("bairro:" + bairro);
        System.out.println("cep:" + cep);
        System.out.println("cidade:" + cidade);
    }

    void atulizarImfor() {
        System.out.println(" qual e a rua ");
        rua = cafe.next();
        System.out.println("qual e o bairro ");
        bairro = cafe.next();
        System.out.println(" qual e o cep");
        cep = cafe.next();
        System.out.println(" qual e a cidade ");
        cidade = cafe.next();
    }
}
