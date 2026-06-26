public class sum_of_subarray {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int[] arr = {23,45,64,34,34,22,45,23,45};
        int n = 3;
        for(int i = 0; i<arr.length-n; i++){
                    int sum = 0 ; 
          for(int j = 0; j<n ;j++){
            sum = sum + arr[i+j];
        }
        System.out.println(sum);
            for(int k= 0;k <arr.length; k++){
                if(arr[k]<x){ 
                    k = arr[k];
                     System.out.println("this is smallest"+k);
                    
                }

        }
        // System.out.println("this is smallest"+k);


    }

    }
}
