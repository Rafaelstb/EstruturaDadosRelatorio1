
public class Vetor {

          int elementos[];
          int topo;

          public Vetor() {

                    elementos = new int[10];
                    topo = -1;

          }

          public void push(int e) {

                    topo++;
                    elementos[topo] = e;
          }

          public int pop() {
                    int e;
                    e = elementos[topo];
                    topo--;
                    return e;
          }

          public boolean isEmpty() {
                    return (topo == -1);

          }

          public boolean isFull() {
                    return (topo == 9);
          }

          public int top() {
                    return elementos[topo];
          }

          public void imprimir() {

                    for (int i = topo; i < -1; i--) {
                              System.out.println("Elemento : " + elementos[i]);
                    }

          }

}
