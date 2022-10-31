import java.util.Scanner;

public class OperacoesLista {

          Scanner num = new Scanner(System.in);
          Scanner novoNumero = new Scanner(System.in);
          Scanner numPesq = new Scanner(System.in);
          Scanner s = new Scanner(System.in);

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

          public void alterar() {

                    System.out.println("Digite a posição da alteração:");
                    int posicao = s.nextInt();
                    System.out.println("Digite um novo valor inteiro para o nó:");
                    int valor4 = s.nextInt();
                    lista.alterarDado(posicao, valor4);

          }

          public void excluir() {
                    System.out.println("Digite a posição que quer excluir: ");
                    int valor5 = s.nextInt();
                    lista.excluir(valor5);
          }

          public void pesquisa() {
                    System.out.println("Digite o numero que quer pesquisar ");
                    int d = s.nextInt();
                    lista.pesquisarDado(d);
          }

          public void mostrar() {

                    System.out.println(lista);
          }

}
