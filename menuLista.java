
import java.util.Scanner;

public class menuLista {

          public int menu() {
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

                    int o = opcaoMenuVetor.nextInt();

                    switch (o) {
                              case 1:
                                        System.out.println("Opcao 01 inserida");
                                        break;
                              case 2:
                                        System.out.println("Opcao 02 inserida");
                                        break;
                              case 3:
                                        System.out.println("Opcao 03 inserida");
                                        break;
                              case 4:
                                        System.out.println("Opcao 04 inserida");
                                        break;
                              case 5:
                                        System.out.println("Opcao 05 inserida");
                                        break;
                              case 6:
                                        Mp.menu();
                                        break;

                    }

                    return o;

          }

}
