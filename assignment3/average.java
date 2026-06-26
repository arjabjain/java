public class average {
    public static void main(String[] args) {
        int[] arr = {34,5,6,867,4,3,45,3,4,2,45,2,1,4};
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int sum = 0 ;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                System.out.println(max);
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum += arr[i];

        }
        sum = sum-min -max;
        System.out.println(sum);
    }
}
