
import java.util.Scanner;

public class menuVetor {

          public int menu() {
                    Scanner opcaoMenuVetor = new Scanner(System.in);

                    menuPrincipal Mp = new menuPrincipal();
                    operacoes Op = new operacoes();

                    System.out.println("----------------------------");
                    System.out.println("|    1. Inserir Dados      |");
                    System.out.println("|    2. Alterar Dados      |");
                    System.out.println("|    3. Pesquisar Dados    |");
                    System.out.println("|    4. Mostrar Dados      |");
                    System.out.println("|    5. Voltar             |");
                    System.out.println("----------------------------");
                    System.out.println("Digite a opção desejada: ");
                    int o = opcaoMenuVetor.nextInt();

                    switch (o) {
                              case 1:

                                        Op.inserir();
                                        // menu();

                                        break;
                              case 2:

                                        break;
                              case 3:
                                        System.out.println("Opcao 01 inserida");
                                        break;
                              case 4:

                                        // Op.imprimir();

                                        break;
                              case 5:
                                        Mp.menu();
                                        break;

                    }

                    return o;

          }

}
