package algoritmos;

public class Algoritmos {

    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        
        AlgoritmoOrdencao bubble = new BubbleSort();
        bubble.ordenacao(array.clone());
        
        AlgoritmoOrdencao insertion = new InsertionSort();
        insertion.ordenacao(array.clone());
        
        AlgoritmoOrdencao quick = new QuickSort();
        quick.ordenacao(array);
    }
    
}
