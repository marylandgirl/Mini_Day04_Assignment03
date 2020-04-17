import java.util.Arrays;

public class Fix {
    public static void main(String[] args) {

        int total = 0;

        //Create an array to hold the numbers 1-10. &
        //Loop through the array to calculate the sum of all the elements
        //Print the sum to the screen
        int[] numlist = {1,2,3,4,5,6,7,8,9,10};
        for (int i= 0; i < 10; i++) {
            total = total + numlist[i];
        }
        System.out.println("The total of the numbers is " + total);
    }
}
