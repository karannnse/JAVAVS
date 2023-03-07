package gameproject;
import java.util.Scanner;
import java.lang.*;

public class Launch1
{
    public static void main(String[] args) {

        System.out.println("game started");          
        umpire u=new umpire();
        u.collectfromguesser();
        u.collectfromplayers();
        u.compare();

        
    }
    
}


class Guesser
{
    int guessNum;

    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser! KINDLY GUESS THE NUMBER");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class player
{
    int guessNum;
        int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("player kindly guess the number" );
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class umpire
{

    int numfromguesser;
    int numfromplayer1;
    int numfromplayer2;
    int numfromplayer3;

   void collectfromguesser()
   {
    Guesser g=new Guesser();
    numfromguesser=g.guessingNumber();
   }

   void collectfromplayers()
   {
    player p1=new player();
    player p2=new player();
    player p3=new player();
    numfromplayer1=p1.guessingNumber();
    numfromplayer2=p2.guessingNumber();
    numfromplayer3=p3.guessingNumber();

   }

   void compare()
   {

            if(numfromguesser==numfromplayer1  )
            {
                if(numfromguesser==numfromplayer2 && numfromguesser==numfromplayer3)
                {
                    System.out.println("sab sahi hain all are the winner");
                }
                else if(numfromguesser==numfromplayer2)
                {
                    System.out.println("player 1 and player2 both are winner");

                }
                else if(numfromguesser==numfromplayer3)
                {
                    System.out.println("player1 and player 3 are winner");

                }
                else{
                    System.out.println("player 1 is the won the game");

                }
            }
            else if(numfromguesser==numfromplayer2)
            {
                if(numfromguesser==numfromplayer3)
                {
                    System.out.println("player 2 and 3 is thw winner");

                }
                else{
                    System.out.println("player 2 is winner");

                }
            }
            else if(numfromguesser==numfromplayer3)
            {
                System.out.println("player 3 is wineer");

            }
            else 
            {
                System.out.println("all are lose the game");
            }
        }

}
