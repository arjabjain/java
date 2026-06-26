import java.util.*;
public class collection {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
         colors.add("Red");
        colors.add("Blue");
        colors.add("Green");


        for (String c : colors) {
    System.out.println(c);
}
colors.add(0, "Yellow");  // index 0 = first position
System.out.println(colors.get(1));  // gets second element
colors.set(1, "Black");  // rcolors.remove(2);  // index 2 = third element
if (colors.contains("Red")) {
    System.out.println("Found");
} else {
    System.out.println("Not Found");
}

Collections.sort(colors);
System.out.println(colors);
Collections.reverse(colors);
System.out.println(colors);




    }
    
}
