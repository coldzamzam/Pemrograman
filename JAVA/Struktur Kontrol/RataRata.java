import java.util.Scanner;

public class RataRata{
    public static void main(String[] args){
        int summ = 0;
        int i;
        int modus = 0;

        Scanner myNumber = new Scanner(System.in);
        System.out.println("How many number do you want to add: ");
        int count = myNumber.nextInt();

        if (count >= 10){
            for (i = 0; i < count; i++){
                System.out.println("Add a number :");
                int value = myNumber.nextInt();

                summ += value;
                if (i == count-1){
                    myNumber.close();
                }
                if (value > modus){
                    modus = value;
                }
            }
        } else{
            System.out.println("You must add at least 10 numbers.");
            return;
        }
        
        double avg = summ/count;
        System.out.println("Total = " + summ);
        System.out.println("Average = " + avg);
        System.out.println("The biggest number in your numbers is " + modus);
    }
}
