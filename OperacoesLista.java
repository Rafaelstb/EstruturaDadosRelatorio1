import java.util.Scanner;

public class OperacoesLista {

          Scanner num = new Scanner(System.in);
          Scanner novoNumero = new Scanner(System.in);
          Scanner numPesq = new Scanner(System.in);

          lista<Integer> lista = new lista<>();

          int n;
          String fim = "fim";

          public void inserir() {

                    // while (fim != "fim") {

                    lista.adiciona(1);

                    System.out.println("Tamanho = " + lista.getTamanho());
                    System.out.println(lista);

                    lista.adiciona(2);
                    System.out.println(lista);

                    lista.adiciona(3);
                    System.out.println(lista);

                    // }

          }

}
