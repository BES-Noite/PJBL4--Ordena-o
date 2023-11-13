package algoritmos;

public class InsertionSort implements AlgoritmoOrdencao {
    @Override
    public void ordenacao(int[] array) {

        System.out.println("-------------------- INSERTION SORT ---------------------");
        for (int indiceAtual = 1; indiceAtual < array.length; ++indiceAtual) {
            int chave = array[indiceAtual];
            int indiceAnterior = indiceAtual - 1;

            while (indiceAnterior >= 0 && array[indiceAnterior] > chave) {
                array[indiceAnterior + 1] = array[indiceAnterior];
                indiceAnterior = indiceAnterior - 1;
            }
            array[indiceAnterior + 1] = chave;

//            System.out.println("Após a iteração " + indiceAtual + ":");
            impressao(array);
        }
    }

    public void impressao(int[] array) {
        int n = array.length;
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
