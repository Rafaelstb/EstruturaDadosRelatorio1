import javax.xml.transform.Source;

public class lista {

          int elementos[];
          int topo;

          public lista() {

                    elementos = new int[10];
                    topo = -1;

          }

          public int push(int e) {
                    if (isFull()) {
                              throw new RuntimeException("Stack OverFlow");
                    }
                    topo++;
                    elementos[topo] = e;
                    return topo;

          }

          public int pop() {
                    if (isEmpty()) {
                              throw new RuntimeException("Stack Empty");
                    }
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
                    if (isEmpty()) {
                              throw new RuntimeException("Empty Stack");
                    }
                    return elementos[topo];
          }

}
