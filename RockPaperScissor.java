import java.util.*;
class RockPaperScissors
{
    int n;
    Scanner sc=new Scanner(System.in);
    void instructions()
    {
        System.out.println("->WELCOME TO ROCK, PAPER & SCISSORS GAME");
        System.out.println("->In this game, the user would play against the computer.");
        System.out.println("->The game would be of N rounds, the user would have the choice for Number of Rounds(N)");
        System.out.println("->Play Well, All the Best!!");
        System.out.println("*--------------------------------------------------------------------------------------------------------*");
        System.out.println("*--------------------------------------------------------------------------------------------------------*");
    }
    void input()
    {
        System.out.println("Enter number of rounds you wish to play");
        n=sc.nextInt();
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    void game()
    {
        System.out.println("Enter Your Choice:");
        System.out.println("0-Rock, 1-Paper, 2-Scissors");
        int uchoice,cscore=0,uscore=0;
        for(int i=1;i<=n;i++)
        {
            Random rand=new Random();
            int cchoice=rand.nextInt(3);
            System.out.print("Enter :");
            uchoice=sc.nextInt();
            String choice1="",choice2="";
            if(cchoice==0)
            choice1="Rock";
            else if(cchoice==1)
            choice1="Paper";
            else if(cchoice==2)
            choice1="Scissors";
            if(uchoice==0)
            choice2="Rock";
            else if(uchoice==1)
            choice2="Paper";
            else if(uchoice==2)
            choice2="Scissors";
            if(uchoice==0 && cchoice==1)
            {
                cscore++;
                System.out.println("Computer chose: "+choice1);
                System.out.println("You chose: "+choice2);
                System.out.println("Your Score="+uscore+","+"Computer Score="+cscore);
            }
            else if(uchoice==0 && cchoice==2)
            {
                uscore++;
                System.out.println("Computer chose: "+choice1);
                System.out.println("You chose: "+choice2);
                System.out.println("Your Score="+uscore+","+"Computer Score="+cscore);
            }
            else if(uchoice==1 && cchoice==0)
            {
                uscore++;
                System.out.println("Computer chose: "+choice1);
                System.out.println("You chose: "+choice2);
                System.out.println("Your Score="+uscore+","+"Computer Score="+cscore);
            }
            else if(uchoice==1 && cchoice==2)
            {
                cscore++;
                System.out.println("Computer chose: "+choice1);
                System.out.println("You chose: "+choice2);
                System.out.println("Your Score="+uscore+","+"Computer Score="+cscore);
            }
            else if(uchoice==2 && cchoice==0)
            {
                cscore++;
                System.out.println("Computer chose: "+choice1);
                System.out.println("You chose: "+choice2);
                System.out.println("Your Score="+uscore+","+"Computer Score="+cscore);
            }
            else if(uchoice==2 && cchoice==1)
            {
                uscore++;
                System.out.println("Computer chose: "+choice1);
                System.out.println("You chose: "+choice2);
                System.out.println("Your Score="+uscore+","+"Computer Score="+cscore);
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
        System.out.println("Game Over!!");
        System.out.println("Your Final Score:"+uscore);
        System.out.println("Computer's Final Score:"+cscore);
        if(uscore>cscore)
        System.out.println("You Won!!");
        if(uscore<cscore)
        System.out.println("You Lost!!");
        if(uscore==cscore)
        System.out.println("Draw");
    }
    public static void main(String ab[])
    {
        RockPaperScissors obj=new RockPaperScissors();
        obj.instructions();
        obj.input();
        obj.game();
    }
}
