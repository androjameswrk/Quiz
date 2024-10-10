import java.io.*;

import java.util.*;



import java.util.Scanner;

public class PerfTask {    

    

     

static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){

           int correct = 0;

           int incorrect=0;

          int questions = 5;

          System.out.println("Welcome to the Multiple Choice Quiz! \n");



           String[][] Ques_Ans = {

 {"What is the size of float variable? ","\n A. 8 bit \n B. 16 bit \n C. 32 bit \n D. 64\n","C"},

 {"Which one of these is not a primitive data type? ","\n A. integer \n B. char \n C. float \n D. double\n","B"},

 {"Which data type is used to create a variable that should store text? ","\n A. myString \n B. string \n C. character \n D. String64\n","D"},

 {"How do you create a variable with the numeric value 5? ","\n A. num x = 5; \n B. float x = 5; \n C. x = 5; \n D. int x = 5;\n","A"},

 {"Which method can be used to find the length of a string in JAVA?","\n A. length() \n B. getlength() \n C. len \n D. getsize()\n","A"}};



          String[] user_ans = new String[(int) questions];

          int i=0;

           

          do {

              System.out.print("" + (i+1) + ". " + Ques_Ans[i][0] + "   "+Ques_Ans[i][1]);

              user_ans[i] = String.valueOf(cin.next().charAt(0));

              

                

              

              

              if(Ques_Ans[i][2].equals(user_ans[i])) {

                  System.out.println("\n Correct!");

                   correct++; 

                  

              }

              else

              {

                  System.out.println("\n Incorrect. The correct answer is "+Ques_Ans[i][2]);

                  incorrect++;

              }



              System.out.print("\n");

              i++;

         }while(i<questions);                      



         System.out.println("\n Number of correct answers: "+ correct);

         System.out.println("\n Number of incorrect answers: "+ incorrect);

         System.exit(0);

    }



}