public class before_and_after_greater_element {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int i = 1 ; i<arr.length; i+=2){
            if(arr[i]<arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1]; 
                arr[i-1] = temp;

            }
            if(i+1< arr.length && arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;


        }
                }
                  for(int i= 0; i<arr.length ; i++ ){
                System.out.print(arr[i] + " " );
    // for(int i= 0; i<arr.length ; i++ ){
    //             System.out.println(arr[i]);
            }
    }
    
}
