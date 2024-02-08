import java.util.*;

public class Input {
    public int[] inputData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = s.nextInt();
        int[] data = new int[size];
        System.out.println("Enter elements of the array: ");
        for(int i=0; i<data.length; i++) {
            data[i] = s.nextInt();
        }
        return data;
    }
}
