package com.apnacollege; 

import java.util.Arrays;
//for the using of the Arrays we must import this
import java.util.Scanner;
public class Main {}
    private static int userNumber;

    public static void printjava() { //we have made the new methods of our self
        System.out.println("Hello java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
// Introduction for the java that how java works


    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("Hello Khalid Abbas");

//P1 how to use the variables in java

        String name = "Khalid";
        int age = 21;
        String brother = "Hamid";

//P2 We can assign the values to the other variables

        String bro = "brother";
        String my = "name";

//P3 Types of java
//1 Primitive
//2 Non-Primitive/Refrence

//1 Primitive
// In which we can store the simple types of the values

//2 Non-Primitive/Refrence
// In this we can store the complex types of the values

//1 Primitive

//byte - 1 [-128 to 127]
//short - 2
//int - 4 [1,2,3]
//long - 8
//float - 4 [3.14]
//double - 8
//char - 2 [a,b,c,d]
//boolean - 1 [True/False]

        byte no = 11;
        int phone = 1234567890; //It reaches the limit of int
        long phone1 = 123456789034653L;//L denotes the long int is used
        float pi = 3.14F;//F denotes this is floating
        char letter = '@';
        boolean isAdult = true;//In this we can use true or false

//Non-Primitive types
        String name1 = "Khalid";
        System.out.println(name1.length());//"" These will help to give the output which is written
        //When we do not use then it will give the length of the String
        String name2 = "Apu";
        String friend = new String("Aku");
        System.out.println(name2.length());
// We can create the new space and save this

// Strings
// Types of the Strings
// Concatenate
        String name4 = "man";
        String name5 = "aku";
        String name6 = "apu";
        String name7 = name5 + " and " + name6 + " and " + name4;
        System.out.println(name7);
//charAt
        String name8 = "Aman";
        System.out.println(name.charAt(2));
//length
        String name9 = "Aman";
        System.out.println(name.length());
//replace
        String name11 = "khalid";
        String name12 = name.replace('a', 'b');
        System.out.println(name11);
        System.out.println(name12);
//substrings
        String name13 = "khalid and hamid";
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(2, 5));

//Arrays

        int age1 = 21;
        int physics = 91;
        int chem = 89;
        int eng = 90;

        int[] marks = new int[3];
        marks[0] = 91;
        marks[1] = 89;
        marks[2] = 90;
//        boolean[] marks = new boolean[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//For printing any marks we must have to use this[]
//length
        System.out.println(marks.length);

//sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] marks7 = {91, 89, 90};
//2D Array
        int[][] finalmarks = {{91, 89, 90}, {95, 95, 98}};
        System.out.println(finalmarks[0][0]);
        System.out.println(finalmarks[1][1]);
//casting
//they are of the two types
// 1 Implicit
// 2 Explicit

// 1 Implicit casting
        double price = 100.00;
        double finalPrice = price + 18.24;
        System.out.println(finalPrice);
// 2 Explicit casting
        int p = 147;
        int fP = p + (int) 18.24;
        System.out.println(fP);

// Constants
        int ages = 30;
        ages = 31;
        ages = 32;

        final float PI = 3.14F;

// Operators
/*
1 Arthimatic operators
2 Assingment operators
3 Logical operators
4 Comparision operators
 */
        int a = 2;
        int b = 4;
        int sum = a + b;
        int diff = a - b;
        int div = a / b;
        double modulo = a % b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(div);

        int numb = 1;  // input as a 1
        numb++;
        System.out.println(++numb);  //3
        System.out.println(numb);  //3
        System.out.println(--numb);  //2
        System.out.println(numb--);  //2

//Maths class

        //5, 6
        System.out.println(Math.max(5, 6));
        System.out.println(Math.min(5, 6));
// random
        System.out.println((int) (Math.random() * 100));

//How to take the input
// By the help of the Scanner
//         sc = new Scanner(System.in);
//        System.out.println("Input your Name:");
//        String name10 = sc.nextLine(); //For taking the whole line as input
//        System.out.println(name10);
//        String age5 = sc.next();
//        System.out.println(age5);

//Comparison Operators
//a == b
//a != b
//a > b
//a < b
//a <= b
//a >= b
//Some Conditional Statements
        boolean isSunUp = false;
        if (isSunUp == true)
            System.out.println("Day");
        else ;
        System.out.println("Night");

        int age30 = 19;
        if (age30 > 18)
            System.out.println("Can vote");
        else
            System.out.println("Cannot vote");

//Logical Operators
// &&
        int a1 = 60;
        int b1 = 40;
//        if(a1 < 50 && b1 < 50)
//            System.out.println("both are less than 50");

// ||
        if (a < 50 || b < 50)
            System.out.println("Atleast one less than 50");

// !
        boolean isAdult2 = true;
        if (!isAdult2)
            System.out.println("is Adult");
        else
            System.out.println("is not Adult");

//conditional statements
        //eg:
        Scanner sc = new Scanner(System.in);
        //pen = 10;  notebook = 40
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("Cannot buy anything");
            System.out.println("need more cash");
        } else if (cash > 10 && cash < 40) {
            System.out.println("can get 1 thing");
        } else {
            System.out.println("can get the both");
        }
//Switch statements
    /* It takes only one value and then check many
    conditions on them
     */

        int day = 1; //1 Monday  2 Tuesday
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed - Sun");
        }
//Loops
        //for loop  (1-100)
        for (int i = 1; i <= 100; i = i + 1) {
            System.out.println(i);
        }  // (100-1)
        for (int i = 100; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        //while loop
        int j = 100;
        while (j >= 1) {
            System.out.println(j);
            j = j - 1;
        }
//Do while
        int k = 100;
        do {
            System.out.println(k);
            k = k - 1;
        } while (k >= 1);

        Scanner sc1 = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Input a number");
            number = sc1.nextInt();
            System.out.println("Here is your number");
            System.out.println(number);
        } while (number >= 0);
        System.out.println("The End");
        //Break and Continue

        int i = 0;
        while (true) {
            if (i == 3) {
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if (i > 5) {
                break;
            }
        }
// Exception handling
        int[] marks3 = {97, 98, 95};
        try {


            System.out.println(marks[5]); /*In this they
                                        exceed there
                                        limit*/
        } catch (Exception exception) {
            //do something after catching
        }
        System.out.println("The name is Aman");
//Methods and functions
//To perform the operation

        //Methods
        printjava();
        printjava();
        printjava();
        printName("Khalid");
        printName("Hamid");
        printName("hello");
//       printSum(a: 1 b: 6);

//Mini project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);

        do {
            System.out.println("Guess my number: ");
            int userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("yes its Correct number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
            while (userNumber >= 0) ;

            System.out.println("My number was");
            System.out.println(myNumber);
        }





public static class Main {

}