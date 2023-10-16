import java.util.*;

public class Number_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random()*100)+1;
        boolean guess = false;
        int attempt = 1, max_attempt = 10;
        while(guess!=true){
            System.out.println("Guess the generated number: ");
            int user_guess = sc.nextInt();
            if(user_guess == number){
                System.out.println("Congratulations! You guess the number in " + attempt + " attempt");
                guess = true;
            }
            else if(user_guess>number){
                System.out.println("Guess is too high");
            }
            else{
                System.out.println("Guess is too low");
            }
            attempt++;
            if(attempt > max_attempt){
                System.out.println("Sorry! You have reached the maximum number of attempts and the correct number is " + number);
                break;
            }
        }
        sc.close();
    }
}