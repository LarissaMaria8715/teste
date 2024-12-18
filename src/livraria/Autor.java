package livraria;



import java.util.Scanner;

public class Autor {

    String nome, email;
    Endereco endereço;
    Scanner cafe = new Scanner(System.in);

    Autor(char des) {
        if (des == 's' || des == 's') {
            System.out.println(" qual e o nome do autor ");
            nome = cafe.next();
            System.out.println(" qual e o email do autor ");
            email = cafe.next();
            endereço = new Endereco();
        } else {
            nome = null;
            email = null;
            endereço = null;
        }
    }

    void exibir() {
        System.out.println("nome:" + nome);
        System.out.println("email:" + email);
    }

    void atulizarImfor() {
        System.out.println(" qual e o nome do autor ");
        nome = cafe.next();
        System.out.println(" qual e o email do autor ");
        email = cafe.next();
        endereço.atulizarImfor();
    }
     void atulizaremail() {
        System.out.println(" qual e o email do autor ");
        email = cafe.next();
    }
}
