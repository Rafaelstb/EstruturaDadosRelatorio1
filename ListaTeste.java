public class ListaTeste {

          public static void main(String[] args) {
                    lista<Integer> lista = new lista<>();
                    lista.adiciona(1);

                    System.out.println("Tamanho = " + lista.getTamanho());
                    System.out.println(lista);

                    lista.adiciona(2);
                    System.out.println(lista);

                    lista.adiciona(3);
                    System.out.println(lista);

          }
}
