/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumof2number;

import java.util.Scanner;

/**
 *
 * @author phuc
 */
public class SumOf2Number {

    public static String findSum(String str1, String str2){

            if (str1.length() > str2.length()){
                    String t = str1;
                    str1 = str2;
                    str2 = t;
            }

            String str = "";

            int n1 = str1.length(), n2 = str2.length();

            str1=new StringBuilder(str1).reverse().toString();
            str2=new StringBuilder(str2).reverse().toString();

            int carry = 0;
            for (int i = 0; i < n1; i++)
            {
                    int sum = ((int)(str1.charAt(i) - '0') +
                                            (int)(str2.charAt(i) - '0') + carry);
                    str += (char)(sum % 10 + '0');

                    // Calculate carry for next step
                    carry = sum / 10;
            }

            for (int i = n1; i < n2; i++)
            {
                    int sum = ((int)(str2.charAt(i) - '0') + carry);
                    str += (char)(sum % 10 + '0');
                    carry = sum / 10;
            }

            if (carry > 0)
                    str += (char)(carry + '0');

            str = new StringBuilder(str).reverse().toString();

            return str;
    }
        //Hàm này giống hàm trên nhưng dùng cho test
        public String findSum2(String str1, String str2){

            if (str1.length() > str2.length()){
                    String t = str1;
                    str1 = str2;
                    str2 = t;
            }

            String str = "";

            int n1 = str1.length(), n2 = str2.length();

            str1=new StringBuilder(str1).reverse().toString();
            str2=new StringBuilder(str2).reverse().toString();

            int carry = 0;
            for (int i = 0; i < n1; i++)
            {
                    int sum = ((int)(str1.charAt(i) - '0') +
                                            (int)(str2.charAt(i) - '0') + carry);
                    str += (char)(sum % 10 + '0');

                    // Calculate carry for next step
                    carry = sum / 10;
            }

            for (int i = n1; i < n2; i++)
            {
                    int sum = ((int)(str2.charAt(i) - '0') + carry);
                    str += (char)(sum % 10 + '0');
                    carry = sum / 10;
            }

            if (carry > 0)
                    str += (char)(carry + '0');

            str = new StringBuilder(str).reverse().toString();

            return str;
    }
    public static void main(String [] args){

            String s1 = "";
            String s2 = "";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n1: ");
            s1=sc.nextLine();
            System.out.println("Enter n2: ");
            s2=sc.nextLine();
            System.out.println("Result: "+findSum(s1, s2));
    }
}


    

