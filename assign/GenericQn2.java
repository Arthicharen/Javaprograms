package assign;

public class GenericQn2 {
	public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
        // Check if the indices are within bounds
        if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Swap the elements
        T temp = list[firstPos];
        list[firstPos] = list[secondPos];
        list[secondPos] = temp;

        return list;
    }
	public static void main(String[] args) {
        Integer[] myArray = {50, 20, 30, 40, 10};
        
            Integer[] swappedArray = swap(myArray, 1, 3);
            System.out.print("Swapped array: ");
            for (Integer element : swappedArray) {
                System.out.print(element + " ");
            
       
    }
	}}

