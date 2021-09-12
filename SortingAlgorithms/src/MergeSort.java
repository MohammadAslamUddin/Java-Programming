import java.util.*;
public class MergeSort {
    int array[];
    int tempArray[];
    int length;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arraytoSort = new int[5];
        
        System.out.println("Enter how many elements will you take: ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            arraytoSort[i] = input.nextInt();
        }
        
        MergeSort arr = new MergeSort();
        arr.sort(arraytoSort);
        
        System.out.println("Sorted Array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arraytoSort[i] + " ");
        }
        System.out.println(arraytoSort.length);
    }
    
    public void MergeSort(int low, int high){
        int mid = 0;
        if (low < high) {
            mid = (low+high)/2;
            MergeSort(low, mid);
            MergeSort(mid+1, high);
            Merge(low, mid, high);
        }
    }

    private void Merge(int low, int mid, int high) {
        for(int i = low; i < high; i++) {
            tempArray[i] = array[i];
        }
        int i = low,
            j = mid+1,
            k = low;
        
        while(i <= mid && j <= high){
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            }
            else{
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            array[k]=tempArray[i];
            i++;
            k++;
        }
    }

    private void sort(int[] arraytoSort) {
        this.array = arraytoSort;
        this.length = arraytoSort.length;
        this.tempArray = new int[length];
        MergeSort(0,length-1);
    }
    
}
