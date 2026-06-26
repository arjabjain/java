

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {34,5,6,7,43,63,24};
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>x){
                x = arr[i];

            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>y && arr[i] != x){
                y = arr[i];
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}
