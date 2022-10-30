import java.util.Scanner;

public class operacoes {

          Scanner num = new Scanner(System.in);
          Scanner novoNumero = new Scanner(System.in);
          Vetor Vet = new Vetor();
          menuVetor Menu = new menuVetor();

          int n;

          public void inserir() {

                    while (!Vet.isFull()) {

                              System.out.println("Digite um numero para inserir no vetor ");
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

          public void alterar() {

                    System.out.println("Digite a posição do numero que quer alterar");
                    int nAlt = num.nextInt();
                    System.out.println("Digite o numero que quer colocar na possição:");
                    int nNovo = novoNumero.nextInt();
                    Vet.elementos[nAlt] = nNovo;

          }
}
