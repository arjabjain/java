public class product_array {
    public static void main(String[] args) {
        int [] arr = {3,4,5,64,4,45,63,23,23};
        int prod = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length ; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] * arr[j]>prod){
                    prod = arr[i]*arr[j];

                }
            }

        }
            System.out.println(prod);

    }
    
}
