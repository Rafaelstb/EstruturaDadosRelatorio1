import java.util.Scanner;

public class OperacoesLista {

          Scanner num = new Scanner(System.in);
          Scanner novoNumero = new Scanner(System.in);
          Scanner numPesq = new Scanner(System.in);
          Scanner f = new Scanner(System.in);

          lista<Integer> lista = new lista<>();
          menuLista Ml = new menuLista();

          int n;
          int i;
          String fim;

          public void inserir() {

                    while (i != 99) {

                              System.out.println("Digite um numero para inserir na lista, se quiser encerrar digite 99");

                              i = num.nextInt();
                              fim = f.nextLine();

                              lista.adiciona(i);

                              /*
                               * System.out.println("Tamanho = " + lista.getTamanho());
                               * System.out.println(lista);
                               * 
                               * lista.adiciona(2);
                               * System.out.println(lista);
                               * 
                               * lista.adiciona(3);
                               * System.out.println(lista);
                               */

                    }

                    Ml.menu();

          }

}
