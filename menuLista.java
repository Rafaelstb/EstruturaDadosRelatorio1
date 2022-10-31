
import java.util.Scanner;

public class menuLista {
          int o;
          OperacoesLista Op = new OperacoesLista();

          public void menu() {
                    Scanner opcaoMenuVetor = new Scanner(System.in);
                    menuPrincipal Mp = new menuPrincipal();

                    System.out.println("----------------------------");
                    System.out.println("|    1. Inserir Dados      |");
                    System.out.println("|    2. Alterar Dados      |");
                    System.out.println("|    3. Excluir Dados      |");
                    System.out.println("|    4. Pesquisar Dados    |");
                    System.out.println("|    5. Mostrar Dados      |");
                    System.out.println("|    6. Voltar             |");
                    System.out.println("----------------------------");
                    System.out.println("Digite a opçõ desejada: ");

                    o = opcaoMenuVetor.nextInt();

                    if (o == 1) {
                              Op.inserir();
                    }
                    if (o == 2) {
                              // Op.alterar();
                    }
                    if (o == 3) {
                              // Op.pesquisar();
                    }
                    if (o == 4) {
                              // Op.imprimir();
                    }
                    if (o == 5) {
                              Op.mostrar();
                    }
                    if (o == 6) {
                              Mp.menu();
                    }

                    menu();

          }
}
