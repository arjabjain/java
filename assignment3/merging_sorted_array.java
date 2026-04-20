public class merging_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int[] result = new int[arr.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(arr.length > i && j<arr2.length){
            if(arr[i] > arr2[j]){
                result[k] = arr2[j];
                j++;
                k++;
            }
            else{
                result[k] = arr[i];
                i++;
                k++;

            }


    }
    while(i<arr.length ){
                result[k++]= arr[i++];
        }
          while(j<arr2.length ){
                result[k++]= arr2[j++];
        
    }
    for(int l= 0 ; l<result.length; l++){

            System.out.print(result[l]+ " ");
}
}
}
