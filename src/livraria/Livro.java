package livraria;

import java.util.Scanner;

public class Livro {

    String titulo, genero;
    float preco;
    Autor autor;
    Scanner cafe = new Scanner(System.in);
    Livro() {
        char des;
        System.out.println(" digite o titulo ");
        titulo = cafe.next();
        System.out.println(" digite o genero ");
        genero = cafe.next();
        System.out.println(" digite qual e o preço ");
        preco = cafe.nextFloat();
        System.out.println(" o livro tem um autor ?");
        des = cafe.next().charAt(0);
    }
     float calculePreco( byte TipoDePagamento ){
         float valor=0;
         switch (TipoDePagamento){
             case 1:
                 valor = preco - (preco * 100/20);
                 break;
             case 2:
                 valor = preco - (preco * 100/20);
             case 3:
                 valor= preco;
                 break;
         }
          return valor ;
     }
     void exibir() {
        System.out.println("titulo:" + titulo);
        System.out.println("preço:" + preco);
        System.out.println("genero:" + genero);
    }
}
