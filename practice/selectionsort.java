class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4};

        for(int i=0;i<arr.length;i++){
            int minindex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minindex] > arr[j]){
                    minindex=j;
                }
            }
            int temp = arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After selection sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
