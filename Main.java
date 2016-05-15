package com.company;

import org.jetbrains.annotations.Contract;
import sun.net.smtp.SmtpClient;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /// Check Array Index is Prime or Not
        int array[] = new int[]{2,4, 3, 5,4, 7, 9, 11, 13, 17, 19,23,31};
        System.out.println("Find Array Index Number is Prime ?");

        for (int i = 2; i <= array.length; i++)
        {
            if(isPrimeNumber(i))
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your Array Length ? ");
        int ALength = sc.nextInt();

        int arraylength[] = new int[ALength];

        System.out.println(" How Many Prime Number do you want find please Enter ? ");
        int FPrime = sc.nextInt();

        int FindPrime[] = new int[FPrime];

        if(FPrime>ALength) {
            System.out.println("Please Enter Find Prime Less than your Total Array List ");
            return;
        }
        
        else
        {
            for (int i = 2; i <= arraylength.length ; i++)
            {
                if(i < FPrime) {
                    if (isPrimeNumber(i)) {
                        System.out.print(i + " ");
                    }
                }
            }
        }


    }

    @Contract(pure = true)
    private static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0) {
                return false;
            }
        return true;
    }
}
