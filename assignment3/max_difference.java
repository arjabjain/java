// public class max_difference {
//     public static void main(String[] args) {
//         int[] arr ={23,45,66,75,34,64,64,33,200,300};
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 if((arr[j]- arr[i]) >max){
//                     max = (arr[j]- arr[i]);
//                 }
//             }
//             System.out.println(max);
//         }
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        

        }
        return k;
        
    }
}