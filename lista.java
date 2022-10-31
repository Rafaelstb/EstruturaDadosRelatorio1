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

          public void alterarDado(int posicao, int novoValor) {
                    selecionarDado(posicao).setElemento(novoValor);
          }

          public void excluirDado(int posicao) {
                    No anterior = selecionarDado(posicao).getAnterior();
                    No proximo = selecionarDado(posicao).getProximo();

                    selecionarDado(posicao).getProximo().setAnterior(anterior);
                    selecionarDado(posicao).getAnterior().setProximo(proximo);

                    tamanho--;
          }

          public No selecionarDado(int posicao) {
                    No atual = inicio;
                    for (int i = 0; i < posicao; i++) {
                              if (atual.getProximo() != null) {
                                        atual = atual.getProximo();
                              }
                    }
                    return atual;
          }

          public void pesquisarDado(int dado) {

                    No atual = inicio;
                    for (int i = 0; i < tamanho; i++) {
                              if (dado == atual.getElemento()) {
                                        System.out.println("O valor " + dado + " está na posição " + i);
                              }
                              if (atual.getProximo() != null) {
                                        atual = atual.getProximo();
                              }
                    }
          }

          @Override
          public String toString() {

                    if (this.tamanho == 0) {

                              return "[]";
                    }

                    StringBuilder builder = new StringBuilder();

                    No<T> atual = this.inicio;
                    for (int i = 0; i < this.tamanho - 2; i++) {
                              builder.append(atual.getElemento()).append(",");
                              atual = atual.getProximo();
                    }
                    builder.append(atual.getElemento());

                    return builder.toString();

          }

}