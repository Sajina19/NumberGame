import  java.util.Scanner;
public class NumberGame1 {
    public  static  void  main(String [] args)
    {
        int randomnumber = (int)(Math.random()  * 100) + 1;
        boolean haswon = false;
        System.out.println("randomly choose a number between 1 and 100");
        System.out.println("Try to guess it");
        Scanner sc = new Scanner(System.in);
        for(int i=10;i>0;i--)
        {
            System.out.println("You have " + i + " guesses left.Choose again: ");
            int guess = sc.nextInt();
            if(randomnumber<guess)
            {
                System.out.println("It's smaller than " + guess+ ".");

            }
            else  if(randomnumber > guess)
            {
                System.out.println("It's greater than" + guess+ ".");

            }
            else
            {
                haswon = true;
                break;
            }
        }
        if(haswon){
            System.out.println("Correct...YOU WON!!!");
        }
        else
        {
            System.out.println("GAME OVER...YOU LOOSE!!!");
            System.out.println("The number was: " + randomnumber);
        }
    }
}
