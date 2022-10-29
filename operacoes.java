import java.util.Scanner;

public class operacoes {

          Scanner num = new Scanner(System.in);
          Vetor Vet = new Vetor();
          int n;

          public void inserir() {

                    while (n != 100) {

                              System.out.println("Digite um numero para inserir no vetor ou 100 para sair");
                              n = num.nextInt();
                              Vet.push(n);
                    }
          }

          public void imprimir() {

                    while (!Vet.isEmpty()) {
                              int e = Vet.pop();
                              System.out.println("Numero:" + e);

                    }

          }

}
