package algoritmos;

public class BubbleSort implements AlgoritmoOrdencao{
    
    @Override
    public void ordenacao(int[] array) {
        int n = array.length;
        
        System.out.println("-------------------- BUBBLE SORT ---------------------");
        impressao(array);

        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            impressao(array);
        }
                
    }

    @Override
    public void impressao(int[] array) {
        int n = array.length;
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
    
}