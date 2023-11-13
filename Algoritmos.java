package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos {

    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        while (true) {
            int opc = Integer.parseInt(
                    JOptionPane.showInputDialog("Menu\n1-BubbleSort\n2-InsertionSort\n3-QuickSort\n4-Sair"));
            switch (opc) {
                case 1:
                    AlgoritmoOrdencao bubble = new BubbleSort();
                    bubble.ordenacao(array.clone());
                    break;
                case 2:
                    InsertionSort insertion = new InsertionSort();
                    insertion.ordenacao(array.clone());
                    break;
                case 3:
                    //AlgoritmoOrdencao quick = new QuickSort();
                    //quick.ordenacao(array);
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
        }
    }
}