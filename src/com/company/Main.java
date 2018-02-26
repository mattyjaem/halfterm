package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static int scorecounter;
    public static int[] used = new int[10];
    public static void main(String[] args) {
	EntryWelcome();

	System.out.print(scorecounter);
    }
    public static void EntryWelcome(){
        int input;
        System.out.print("One team competes tonight for a chance to win the mattjaem challenge trophy + '\n" + "press 1 to continue");
        Scanner scan = new Scanner (System.in);
        input = scan.nextInt();
        if (input ==1){
            System.out.print("If you don't know the rules by now you never will" + "fingers on the buzzers, heres your firsr starter for ten.");
            questionsequence();
        }
        else{
        System.out.print("Oh come on. put the right number in for heavens sake. Lets try this again");
            EntryWelcome();
    }}
    private static void questionsequence(){
        questionchoser();
        //scorecounter();
    }
    private static void questionchoser(){
        Random rn = new Random();
        int i;
        int x = rn.nextInt(10) + 1;
        for (i=0;i<10; i++){
            if (x ==used[i]){
                int y = rn.nextInt(10) + 1;
            }
        }


        if (x ==1){
            question1();
        }else if(x ==2){
            question2();
        }else if(x ==3){
            question3();
        }else if(x ==4){
            question4();
        }else if(x ==5){
            question5();
        }

    }
    private static void bonuschooser(){
        Random rn = new Random();
        int x = rn.nextInt(10) + 1; // fix the random int stuff.
        if (x ==1){
            bonusquestion1();
        }else if(x ==2){
            bonusquestion2();
        }else if(x ==3){
            bonusquestion3();
        }else if(x ==4){
            bonusquestion4();
        }else if(x ==5){
            bonusquestion5();
        }

    }

    private static void question1(){
        int input;
        Scanner scan = new Scanner (System.in);
        System.out.print("Who was the author of crome yellow?");
        System.out.print("\n"+"1 : George Bernard Shaw");
        System.out.print("\n"+"2 : Aldous Huxley");
        System.out.print("\n"+"3 : George Orwell");
        System.out.print("\n"+"4 : H.G. Wells");
        input = scan.nextInt();
        if (input == 2){
            System.out.print("Aldous Huxley is correct." + '\n' + "Here are your bonus questions.");
            scorecounter = scorecounter +10;
            bonuschooser();
        }else{
            questionchoser();
        }
    }
    private static void question2(){
        int input;
        Scanner scan = new Scanner (System.in);
        System.out.print("Which barrister and conservative politician always carried a copy of 'The wealth of Nations' in their bag?");
        System.out.print("\n"+"1 : David Cameron");
        System.out.print("\n"+"2 : Craig Oliver");
        System.out.print("\n"+"3 : Margaret Thatcher");
        System.out.print("\n"+"4 : Jeremy Corbyn");

        input = scan.nextInt();
        if (input == 3){
            System.out.print("Thatcher is correct." + '\n' + "Here are your bonus questions.");
            scorecounter = scorecounter +10;
            bonuschooser();
        }}
    private static void question3(){
        int input;
        Scanner scan = new Scanner (System.in);
        System.out.print("Which social thinker wrote 'A critique of pure reason'?");
        System.out.print("\n"+"1 : Sigmund Freud");
        System.out.print("\n"+"2 : John Maynard Keynes");
        System.out.print("\n"+"3 : Friedrich Hayek");
        System.out.print("\n"+"4 : Emmanuel Kant");
        input = scan.nextInt();
        if (input == 4){
            System.out.print("Emmanuel Kant is correct." + '\n' + "Here are your bonus questions.");
            scorecounter = scorecounter +10;
            bonuschooser();
        }}
    private static void question4(){
        int input;
        Scanner scan = new Scanner (System.in);
        System.out.print("Which contemporary of Thomas More resided in Rotterdam and ");
        System.out.print("\n"+"1 : Erasmus");
        System.out.print("\n"+"2 : Acquinas");
        System.out.print("\n"+"3 : Geoe Orwell");
        System.out.print("\n"+"4 : Thomas More");
        input = scan.nextInt();
        if (input == 2){
            System.out.print("Aldous Huxley is correct." + '\n' + "Here are your bonus questions.");
            scorecounter = scorecounter +10;
            bonuschooser();
        }}
    private static void question5(){
        int input;
        Scanner scan = new Scanner (System.in);
        System.out.print("Which contemporary of Thomas More resided in Rotterdam and ");
        System.out.print("\n"+"1 : E");
        System.out.print("\n"+"2 : Aldous Huxley");
        System.out.print("\n"+"3 : Geoe Orwell");
        System.out.print("\n"+"4 : Thomas More");
        input = scan.nextInt();
        if (input == 2){
            System.out.print("Aldous Huxley is correct." + '\n' + "Here are your bonus questions.");
            scorecounter = scorecounter +10;
            bonuschooser();
        }}
        private static void bonusquestion1(){
            int input;
            Scanner scan = new Scanner (System.in);
            System.out.print("Which contemporary of Thomas More resided in Rotterdam and ");
            System.out.print("\n"+"1 : E");
            System.out.print("\n"+"2 : Aldous Huxley");
            System.out.print("\n"+"3 : Geoe Orwell");
            System.out.print("\n"+"4 : Thomas More");
            input = scan.nextInt();
            if (input == 2){
                System.out.print("Aldous Huxley is correct." + '\n' + "Here are your bonus questions.");
                scorecounter = scorecounter +10;
                bonuschooser();
            }

        }
        private static void bonusquestion2(){

        }
        private static void bonusquestion3(){

        }
        private static void bonusquestion4(){

        }
        private static void bonusquestion5(){

    }
}
/*
list usedNumbers {10}
int scorecounter = 0


function entryWelcome()
    input("Welcome. Press 1 to continue")
    if input == 1
        print("here are your first questions")
        call questionSequence
    else
        print("That does't appear to be correct. Let's try again")
	entrywelcome()
    endif
endfunction

function questionChooser()
    x = random int from 1 to 10
    for i = 1 to 10
        if x = usedNumbers.i
        ////////
    next i
    if x = 1
        call question1
    elseif x = 2
        call question2
    elseif x = 3
        call question3
    elseif x = 4
        call question4
       ETC
    endif
endfunction

function bonusChooser()
x = random int from 1 to 10
    for i = 1 to 10
        if x = usedNumbers.i
        ////////
    next i
    if x = 1
        call bonusquestion1
    elseif x = 2
        call bonusquestion2
    elseif x = 3
        call bonusquestion3
    elseif x = 4
        call bonusquestion4
       ETC
    endif
endfunction

function question1()
   print("Who was the author of crome yellow?");
   print("\n"+"1 : George Bernard Shaw");
   print("\n"+"2 : Aldous Huxley");
   print("\n"+"3 : George Orwell");
   answer = input("\n"+"4 : H.G. Wells");
    if answer = 2
        print ("correct")
        scorecounter = scorecounter + 10
    endif
endfunction

MAIN PROGRAM
entrywelcome()


 */
