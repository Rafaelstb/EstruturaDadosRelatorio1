import java.util.Scanner;

public class OperacoesLista {

          Scanner num = new Scanner(System.in);
          Scanner novoNumero = new Scanner(System.in);
          Scanner numPesq = new Scanner(System.in);

          lista<Integer> lista = new lista<>();

          int n;
          int i;

          public void inserir() {

                    while (i != 99) {

                              System.out.println("Digite um numero para inserir na lista, se quiser encerrar digite 99");

                              i = num.nextInt();

                              lista.adiciona(i);
                              System.out.println("Tamanho da lista agora é = " + lista.getTamanho());

                    }

          }

          public void mostrar() {

                    System.out.println(lista);
          }

}
