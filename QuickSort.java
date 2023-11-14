package algoritmos;


public class QuickSort implements AlgoritmoOrdencao{

    @Override
    public void ordenacao(int[] array) {
        int n = array.length;
        
        System.out.println("-------------------- QUICK SORT ---------------------");
        impressao(array);

        QuickSort(array, 0, n-1);
    }
    
    private void QuickSort(int[] array, int i, int j){
        if (i < j){
            int indice = Particao(array, i, j);
            System.out.println("Pivo: " + array[indice]);
            impressao(array);
            QuickSort(array, i, indice - 1);
            QuickSort(array, indice + 1, j);
        }
    }
    

    
    // O Pivo é sempre o ultimo elemento
    private int Particao(int[] array, int i, int j){
        int pivo = array[j];
        int indice = i - 1;

        for (int k = i; k <= j; k++){
            if (array[k] < pivo){
                indice++;
                int aux = array[indice];
                array[indice] = array[k];
                array[k] = aux;
            }
        }
        
        indice++;
        if(j != indice){
            int aux = array[j];
            array[j] = array[indice];
            array[indice] = aux;
        }
        return indice;
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