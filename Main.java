import java.util.*;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        int[] data = input.inputData();
        Assignment2 assignment2 = new Assignment2();
        assignment2.part1(data);

        int index = assignment2.part2(data);
        System.out.println("The index number for smallest distance is: " + (index+1));

        ArrayList<Integer> arrayList = assignment2.part3();
        System.out.println("Array List: " +  arrayList);
    }
}