package percuso1;

import java.util.Scanner;

public class menuVetor {

          public int menu() {
                    Scanner opcaoMenuVetor = new Scanner(System.in);
                    menuPrincipal Mp = new menuPrincipal();
                    vetorOperacao Vet = new menuVetor();

                    System.out.println("----------------------------");
                    System.out.println("|    1. Inserir Dados      |");
                    System.out.println("|    2. Alterar Dados      |");
                    System.out.println("|    3. Pesquisar Dados    |");
                    System.out.println("|    4. Mostrar Dados      |");
                    System.out.println("|    5. Voltar             |");
                    System.out.println("----------------------------");
                    System.out.println("Digite a opçõ desejada: ");

                    int o = opcaoMenuVetor.nextInt();

                    switch (o) {
                              case 1:
                                        Vet.push(5);

                                        break;
                              case 2:
                                        System.out.println("Opcao 01 inserida");
                                        break;
                              case 3:
                                        System.out.println("Opcao 01 inserida");
                                        break;
                              case 4:
                                        System.out.println("Opcao 01 inserida");
                                        break;
                              case 5:
                                        Mp.menu();
                                        break;

                    }

                    return o;

          }

}
