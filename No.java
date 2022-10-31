public class No<T> {

          private T elemento;
          private No<T> proximo;
          private No<T> anterior;
          public Object tamanho;

          public No(T elemento) {
                    this.elemento = elemento;
                    this.proximo = null;
          }

          public No(T elemento, No<T> proximo, No<T> anterior) {
                    this.elemento = elemento;
                    this.anterior = anterior;
                    this.proximo = proximo;
          }

          public void setElemento(T elemento) {
                    this.elemento = elemento;
          }

          public T getElemento() {

                    return elemento;
          }

          public No<T> getAnterior() {
                    return anterior;
          }

          public No<T> getProximo() {
                    return proximo;
          }

          public void setAnterior(No<T> anterior) {
                    this.anterior = anterior;

          }

          public void setProximo(No<T> proximo) {
                    this.proximo = proximo;
          }

          @Override
          public String toString() {
                    return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
          }

          public Object getTamanho() {
                    return tamanho;
          }

          public void setTamanho(Object tamanho) {
                    this.tamanho = tamanho;
          }

}
