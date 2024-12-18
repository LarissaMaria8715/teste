package livraria;

import java.util.Scanner;

public class Livraria {

    public static void main(String[] args) {
        byte esc,esclv;
        Scanner cafe = new Scanner(System.in);
        Livro lv1 = new Livro();
        Livro lv2 = new Livro();
        Livro lv3 = new Livro();
        System.out.println("+---+--------------------------------------------------------------------+\n"
                + "| 1 | Exibir livros // mostrará os dados do livro, com os dados do autor |\n"
                + "+---+--------------------------------------------------------------------+\n"
                + "| 2 | Exibir livros de um determinado autor                              |\n"
                + "+---+--------------------------------------------------------------------+\n"
                + "| 3 | Exibir a cidade do autor do primeiro livro criado                  |\n"
                + "+---+--------------------------------------------------------------------+\n"
                + "| 4 | Atualizar e-mail do autor de um dos três livros                    |\n"
                + "+---+--------------------------------------------------------------------+\n"
                + "| 5 | Calcular valor do livro                                            |\n"
                + "+---+--------------------------------------------------------------------+\n"
                + "| 6 | sair                                                               |\n"
                + "+---+--------------------------------------------------------------------+");
        esc = cafe.nextByte();
        switch (esc) {
            case 1:
                lv1.exibir();
                lv2.exibir();
                lv3.exibir();
                break;
            case 2:
                System.out.println("diga o autor");
                String pes_autor = cafe.next();
                if(pes_autor.equalsIgnoreCase(lv1.autor.nome)){
                    System.out.print(lv1.titulo);
                }if(pes_autor.equalsIgnoreCase(lv2.autor.nome)){
                    System.out.print(lv2.titulo);
                }if(pes_autor.equalsIgnoreCase(lv3.autor.nome)){
                    System.out.print(lv3.titulo);
                }
                break;
            case 3:
                System.out.print(lv1.autor.endereço.cidade);
                break;
            case 4:
                lv1.exibir();
                lv2.exibir();
                lv3.exibir();
                System.out.println("qual deseja compar");
                String atulv = cafe.next();
                if(atulv.equalsIgnoreCase(lv1.titulo))
                lv1.calculePreco();
                break;
            case 5:
                break;
            case 6:
                break;
        }
        w
    }
}
