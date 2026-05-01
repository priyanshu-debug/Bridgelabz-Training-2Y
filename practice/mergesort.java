import java.util.*;

public class mergesort {
    public static void main (String[] args){
        int[] arr={4,3,7,6,1,9,2,0,5};
        mergeSort(arr,0,arr.length-1);

        for(int n : arr){
            System.out.print(n+" ");
        }
    } 

    public static void mergeSort(int[] arr,int low,int high){
        if(low >= high)
            return;

        int mid = (low+high)/2;

        mergeSort(arr, low, mid);        // ✅ fixed
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp= new ArrayList<>();
        int left=low;
        int right=mid+1;

        while (left <=mid && right <= high) { 
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]); 
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
}
