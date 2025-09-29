import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class reverseNumber {
    public static void main(String[] args) {
//        Pattern3();
//        Pattern2();
//        Pattern1();
//        CountNoOfSpaces();
//        getTodayDateWithTime();
//        getTodayDate();
//        LeapYearCheck();
//        rootsOfQuadEquatn();
//        charFreq();
//        LargestOfThree();
//        vowelConsonent();
//        EvenOrOdd();
//        SwappingTwoNumbers();
//        QandROfTwoNumbers();
//        printAsciiValue();
//        multiplyTwoFloatingPointNumbers();
//        addTwoNumbers();
//        printUserEnteredNumber();
//        reverseInt();
//        StringBuilderTest();
//        stringBuilderDate();
        checkForAnagramStrings();
    }

    private static void checkForAnagramStrings()
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String  s2 = sc.next();
        if(s1.length() == s2.length())
        {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] s1Chars = s1.toCharArray();
            char[] s2Chars = s2.toCharArray();
            Arrays.sort(s1Chars);
            Arrays.sort(s2Chars);

            boolean result =  Arrays.equals(s1Chars,s2Chars);
            if(result)
                System.out.println("Given string are anagram strings.");
            else
                System.out.println("Given strings are not anagram strings.");
        }
        else
        {
            System.out.println("Given strings are not anagram strings.");
        }
    }

    private static void stringBuilderDate(){
        LocalDate date ;//= LocalDate.now();
        //System.out.println(date);
        String s = "20-04-2024";
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        date = LocalDate.parse(s,dt);
        System.out.println(date);
    }
    private static void StringBuilderTest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string.");
        StringBuilder string = new StringBuilder(sc.nextLine());
        StringBuilder reveresedStr = new StringBuilder();
        for(int i = string.length()-1 ; i >= 0; i--)
        {
            reveresedStr.append(string.charAt(i));
            System.out.println(string.charAt(i));
        }
        System.out.println(reveresedStr + " is the reversed string.");
//        System.out.println(string.charAt(0));
//        string.delete(2,string.length());
//        string.insert(2,'n');
//        System.out.println(string);
//        int spaceOccrances = 0;
//        for(int i = 0; i < string.length(); i++)
//        {
//            if(string.charAt(i)==' ')
//            {
//                spaceOccrances++;
////                int index = i;
////                string.insert(index,'P');
//            }
//        }
//        System.out.println(spaceOccrances + " is the no of space occurances.");
    }

    private static void reverseInt(){
        System.out.print("Please Enter your Integer value = ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reversedInt = 0;
        while(num != 0)
        {
            int digit = num%10;
            reversedInt = reversedInt * 10 + digit;

            num /= 10;
        }
        System.out.println(reversedInt);
    }

    private static void printUserEnteredNumber()
    {
        System.out.println("Please enter any number.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num + " is the number you have entered.");
    }

    private static void addTwoNumbers()
    {
        System.out.println("Please enter two numbers a and b below.");
        System.out.print("a = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b =");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.println("Sum on a and b is : " + (a+b) );
    }

    private static void multiplyTwoFloatingPointNumbers()
    {
        System.out.print("Enter a floating point value a = ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.print("Enter a floating point Value b = ");
        Scanner sc1 = new Scanner(System.in);
        float b = sc1.nextFloat();
        int integerOfAB = (int) (a*b);
        float mulitplyValueOfAB = a*b;
        System.out.println(mulitplyValueOfAB + " is the float value and integer value is "+ integerOfAB);
    }

    private static void printAsciiValue()
    {
        System.out.println("Please enter a character.");
        Scanner sc = new Scanner(System.in);
        char character  = sc.next().charAt(0);
        int charAsciiValue = character;
        int CAV = (int) character;

        System.out.println(charAsciiValue +"  "+ CAV + " is the character ascii values.");
    }
    private static void QandROfTwoNumbers()
    {
        System.out.println("Enter two numbers A and B");
        int a = 44, b = 5;
        float quotient = a / b;
        int Remainder = a % b;
        System.out.println("Quotient and Reminder is : "+ quotient + "  "+ Remainder);
    }

    private static void SwappingTwoNumbers()
    {
        int firstNum = 23;
        int secondNum = 33;
        System.out.println("first and second Numb are :"+ firstNum +"  "+ secondNum);
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("first and second Numb are :"+ firstNum +"  "+ secondNum);
    }

    private static void EvenOrOdd()
    {
        System.out.println("Enter a number (interger)");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isEven = num % 2 == 0;
        System.out.println("The given number "+ num + " is even is "+ isEven);
    }

    private static void vowelConsonent()
    {
        System.out.println("Plese enter a character.");
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(1);
        char ch2 = sc.next().charAt(0);
//        boolean isVowel = IsVowel(ch1);
        if(IsVowel(ch1))
        System.out.println("The character "+ ch1 + " is a vowel." );
        else System.out.println("The character "+ ch1 + " is a consonent." );


        if(IsVowel(ch2))
            System.out.println("The character "+ ch2 + " is a vowel." );
        else System.out.println("The character "+ ch2 + " is a consonent." );
    }

    private static boolean IsVowel(char ch1) {

        switch (ch1)
        {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return  false;
        }
    }

    private static void LargestOfThree()
    {
        System.out.println("Please enter three numbers.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2)
        {
            if(num1 >= num3)
            {
                if(num1 == num3)
                {System.out.println("Both" + num1+ "and" + num3+" are largest numbers.");}
                else
                {
                    // if num1 and num2 are equal print both are largest num.
                    if( num1 == num2)
                    {
                        System.out.println("Both" + num1+ "and" + num2+" are largest numbers.");
                    }
                    else {
                        System.out.println(num1 + "is the largest of the given numbers.");
                    }
                }
            }
            else
            {
                System.out.println(num3 + " is the greatest of the given numbers.");
            }
        }
        else
        {
            if(num2 >= num3)
            {
                if(num2==num3){
                    System.out.println("Both" + num3+ "and" + num2+" are largest numbers.");}
                else System.out.println(num2 + " is the largerst of given numbers.");
            }
            else {
                System.out.println(num3 + " is the largerst of given numbers.");

            }
        }
    }

    private static void charFreq()
    {
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Please enter a character.");
        char ch = sc.next().charAt(0);
        int occurences = 0;
        for(int i = 0; i< str.length()-1; i++)
        {
            if(str.charAt(i) == ch) {
                occurences++;
            }
        }
        System.out.println(occurences + " is the no of times "+ ch +" repeated in "+str);
    }

    private static void rootsOfQuadEquatn()
    {
        // for any quadratic equation like a.x*2 + b.x + c = 0;
        double a = 3,b = 4,c = 5;
        double D = (b*b)-(4*a*c);
        double root1,root2;

        if(D>0)
        {
        root1 = ((-1*b) + Math.sqrt(D))/(2*a);
        root2 = ((-1*b)- Math.sqrt(D))/(2*a);
            System.out.println("Roots are real and distict."+ "\n"+ root1+ "\n"+ root2);
        }
        else if(D == 0)
        {
            root1= root2 = (-1*b)/(2*a);
            System.out.println("Roots are real and equal"+root1);
        }
        else
        {
            root1 = ((-1*b) + Math.sqrt(-D))/(2*a);
            root2 = ((-1*b) - Math.sqrt(-D))/(2*a);
            System.out.println("Both roots are imagenary and distinct."+ "\n"+ root1+ "\n"+ root2);
        }
    }
    private static void LeapYearCheck()
    {
         Scanner sc = new Scanner(System.in);
         int year = sc.nextInt();
         if(year % 4 == 0)
         {
             if(year % 100==0)
             {
                 if(year % 400 == 0)
                 {
                     System.out.println(year +  "  is a leap year.");
                 }
                 else
                 {
                     System.out.println(year +  "  is not a leap year.");
                 }
             }
             else
             {
                 System.out.println(year +  "  is a leap year.");
             }
         }
         else
         {
             System.out.println(year +  "  is not a leap year.");
         }
    }

    private static void  getTodayDate()
    {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String _string = dateTime.format(dateTimeFormatter);
        System.out.println(_string + " is today date.");
    }
    private static void getTodayDateWithTime()
    {
        LocalDateTime DateTime = LocalDateTime.now();
        DateTimeFormatter DTFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy HH:mm:ss:SSSS");
        String myString = DateTime.toString();
        System.out.println(myString+ "....");
        myString = DateTime.format(DTFormatter);
        System.out.println(myString+ "....");
        DTFormatter = DateTimeFormatter.ofPattern("MM***dd***yyyy HH--mm--ss--SSSSSS");
        myString = DateTime.format(DTFormatter);
        System.out.println(myString+ "....");

    }

    private static void CountNoOfSpaces()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any string with spaces included in it.");
//        String ster = sc.next();
        String str = sc.nextLine();
        str = str.replaceAll(" ","");
        int spaceOccrances = 0;
        for(int i = 0; i< str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                spaceOccrances++;
            }
        }
        System.out.println(spaceOccrances + " of string :" + str + " is the no of occrances.");
    }


    private static void Pattern1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese enter no of rows needed.");
        int a = sc.nextInt();
        System.out.println("Plese enter no of columns needed.");
        int b = sc.nextInt();

        for(int i = 0; i < a ; i++)
        {
            System.out.println();
            for(int j = 0; j < b ; j++)
            {
                System.out.print(" *");
            }
        }
    }

    private static void Pattern2()
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = 1 ; i <= a; i++)
        {
            for(int j = 1 ; j <= b; j++)
            {
                if(j==1 || j == b ||i == a || i == 1)
                    System.out.print("*");
                else if (j!=b) {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void Pattern3()
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = 1 ; i <= a; i++)
        {
            for(int j = 1 ; j <= b; j++)
            {
                if( j == 1 || i == j|| i>j)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
