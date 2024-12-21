import java.util.Scanner;
public class NumberGussing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scoreobtain = 0; //Track the score
        String Playagain;

        System.out.println("Welcome To Number Guess Game.");
        System.out.println("Let's Begin The Game.");

        do { 
            int number = 1 + (int)(100 * Math.random()); //Genrate a random number
            int attempt = 10;
            boolean guessright = false;

            System.out.println("\nI have taken a number between 1 to 100");
            System.out.println("can you guess which number i taken within "+attempt+" attempts?");

            //loop for the allowed attempts
            for(int i =1; i<=attempt;i++){
                System.out.print("Attempt "+i+": Enter your Guess: ");
                int Guess = sc.nextInt();

                if(Guess==number){
                    System.out.println("Congratulation! you guessed the right number.");
                    scoreobtain += (attempt - i + 1); //Add points based on remainging attempts.
                    guessright = true;
                    break;
                }
                else if(Guess < number){
                    System.out.println("The Number is Too High than " + Guess);
                }
                else{
                    System.out.println("The Number is Too Low than " + Guess);
                }
            }
            if(!guessright){
                System.out.println("Sorry, you have used all attemps. The actual number is "+number);
            }

            //Ask if User want to play again
            System.out.println("\nDo you want to play again? : ");
            Playagain = sc.next();

        } while (Playagain.equalsIgnoreCase("yes"));

        //Display score
        System.out.println("Your Total score is: "+scoreobtain);
        System.out.println("Thanks For Playing.");
    }
}
