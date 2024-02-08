import java.util.*;

public class Assignment2 {
    public void part1(int[] data) {
        int[] evenArray = new int[data.length];
        int[]  oddArray = new int[data.length];
        int evenCount=0, oddCount=0, i=0;
        for(i=0; i<data.length; i++) {
            if(data[i]%2==0) {
                evenArray[evenCount] = data[i];
                evenCount++;
            }
            else {
                oddArray[oddCount] = data[i];
                oddCount++;
            }
        }
        System.out.println("Original Array: ");
        for(i=0; i< data.length; i++) {
            System.out.print(data[i]+ "\t");
        }
        System.out.println("\nEven Array: ");
        for(i=0; i< data.length; i++) {
            System.out.print(evenArray[i]+ "\t");
        }
        System.out.println("\nOdd Array: ");
        for(i=0; i< data.length; i++) {
            System.out.print(oddArray[i] + "\t");
        }
    }

    public int part2(int[] data) {
        for(int i=0; i<data.length; i++) {
            for(int j=i+1; j<data.length; j++) {
                if(data[i] != data[j]) {
                    if(Math.abs(data[i] - data[j]) == 1) {
                        return i+1;
                    }
                }
                else {
                    System.out.println("Error! Distance cannot be zero");
                }
            }
        }
        return -1;
    }

    public ArrayList<Integer> part3() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        System.out.println("Enter number of elements you want to add in array: ");
        int size = s.nextInt();
        for(int i=0; i<size; i++) {
            System.out.print("Enter data number: " + (i+1) + ": ");
            data.add(s.nextInt());
        }
        return data;
    }
}
