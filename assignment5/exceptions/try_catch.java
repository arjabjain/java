
public class try_catch {
    public static void main(String[] args) {
        int[] arr = new int[9];

        try {
            System.out.println(arr[9]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
