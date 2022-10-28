package percuso1;

import java.util.Scanner;

public class menuPrincipal {

          menuLista Ml = new menuLista();
          menuVetor Mv = new menuVetor();

          public int menu() {

                    Scanner opcaoMenuPrincipal = new Scanner(System.in);
                    System.out.println("--------------------");
                    System.out.println("|    1. Vetor      |");
                    System.out.println("|    2. lista      |");
                    System.out.println("--------------------");
                    System.out.println("");
                    System.out.println("Digite a opçõ desejada: ");

                    int o = opcaoMenuPrincipal.nextInt();

                    if (o == 1) {

                              Ml.menu();
                    } else if (o == 2) {

                              Mv.menu();
                    }
                    return o;

          }

}
