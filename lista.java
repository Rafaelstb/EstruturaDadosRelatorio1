import java.util.Scanner;

import javax.xml.transform.Source;

public class lista<T> {

          private No<T> inicio;
          private No<T> ultimo;
          private int tamanho = 0;

          public void adiciona(T elemento) {
                    No<T> celula = new No<T>(elemento);
                    if (this.tamanho == 0) {
                              this.inicio = celula;
                    } else {
                              this.ultimo.setProximo(celula);
                    }

                    this.ultimo = celula;
                    this.tamanho++;

          }

          public int getTamanho() {
                    return this.tamanho;
          }

          public int alterar() {
                    Scanner posicaoAltera = new Scanner(System.in);
                    System.out.println("Digite a posição que deseja alterar");
                    int num = posicaoAltera.nextInt();

                    return 1;
          }

          @Override
          public String toString() {

                    if (this.tamanho == 0) {

                              return "[]";
                    }

                    StringBuilder builder = new StringBuilder();

                    No<T> atual = this.inicio;
                    builder.append(atual.getElemento()).append(",");
                    while (atual.getProximo() != null) {
                              atual = atual.getProximo();
                              builder.append(atual.getElemento()).append(",");

                    }

                    return builder.toString();

          }

}