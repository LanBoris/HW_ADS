public class App {
    public static void main(String[] args) throws Exception {
        /*
        * Реализовать алгоритм пирамидальной сортировки (HeapSort)
        */

        int[] array = {12, 4, 7, 2, 21, -1, 5, 45, 90, 34, 22};

        Solution.PrintArray(array);
        Solution.heapSort(array);
        System.out.println();
        Solution.PrintArray(array);
    }
}
