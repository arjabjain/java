// package assignment3;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,3,5,2,6};
        // int[] arr = {1,1,1,1};

        int[] arr2 = new int[arr.length];
        int k = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
            if(arr[i]==arr[j]){
            // System.out.println(arr[j]);
            }
             else{
                arr2[k++] = arr[i++];
               
            }
        }
        }
            for(int f= 0 ; f<arr2.length; f++){
        System.out.println(arr2[f]);
    }

    }
}

    