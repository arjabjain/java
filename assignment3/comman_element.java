// package assignment3;

public class comman_element {
    public static void main(String[] args) {
        String[] arr = {"arjab", "aadi", "karan", "jayant"};
        String[] arr2 = {"ekta","piyush", "karan", "arjab"};
        for(int i = 0; i<arr.length; i++){
            for(int j =i ; j<arr.length; j++){
            if(arr[i].equals(arr2[j])){
                System.out.println(arr[i]);
            }
        }
        }

    }
    
}
