
import java.util.Scanner;

public class menuVetor {

          int o;

          public void menu() {

                    Scanner opcaoMenuVetor = new Scanner(System.in);

                    menuPrincipal Mp = new menuPrincipal();
                    operacoes Op = new operacoes();

                    while (o != 5) {

                              System.out.println("----------------------------");
                              System.out.println("|    1. Inserir Dados      |");
                              System.out.println("|    2. Alterar Dados      |");
                              System.out.println("|    3. Pesquisar Dados    |");
                              System.out.println("|    4. Mostrar Dados      |");
                              System.out.println("|    5. Voltar             |");
                              System.out.println("----------------------------");
                              System.out.println("Digite a opção desejada: ");
                              o = opcaoMenuVetor.nextInt();

                              if (o == 1) {
                                        Op.inserir();
                              }
                              if (o == 2) {
                                        Op.alterar();
                              }
                              if (o == 3) {
                                        Op.inserir();
                              }
                              if (o == 4) {
                                        Op.imprimir();
                              }
                              if (o == 5) {
                                        Mp.menu();
                              }

                    }
          }

}
