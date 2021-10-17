/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ххх
 */
public class Service {
    String[] zero;
    String[] one;
    String[] two;
    String[] three;
    String[] four;
    String[] five;
    String[] six;
    String[] seven;
    String[] eight;
    String[] nine;
    
    
    public void processing(){
        init();
        Scanner scaner = new Scanner(System.in, "windows-1251");
        System.out.println("Введите слова на русском языке:");
        
        String lng = "";
        if ( scaner.hasNextLong()){
            lng = scaner.nextLine();
            List<String[]> outs = new ArrayList<String[]>();
            int maxDigit = getMaxDigit(lng);
            for(String str: lng.split("")){
                switch (str){
                    case "0":
                        outs.add(zero);
                        if ( maxDigit == 0 )
                            replaceElement(zero, "0");
                        break;
                    case "1":
                        outs.add(one);
                        if ( maxDigit == 1 )
                            replaceElement(one, "1");
                        break;
                    case "2":
                        outs.add(two);
                        if ( maxDigit == 2 )
                            replaceElement(two, "2");
                        break;
                    case "3":
                        outs.add(three);
                        if ( maxDigit == 3 )
                            replaceElement(three, "3");
                        break;
                    case "4":
                        outs.add(four);
                        if ( maxDigit == 4 )
                            replaceElement(four, "4");
                        break;
                    case "5":
                        outs.add(five);
                        if ( maxDigit == 5 )
                            replaceElement(five, "5");
                        break;
                    case "6":
                        outs.add(six);
                        if ( maxDigit == 6 )
                            replaceElement(six, "6");
                        break;
                    case "7":
                        outs.add(seven);
                        if ( maxDigit == 7 )
                            replaceElement(seven, "7");
                        break;
                    case "8":
                        outs.add(eight);
                        if ( maxDigit == 8 )
                            replaceElement(eight, "8");
                        break;
                    case "9":
                        outs.add(nine);
                        if ( maxDigit == 9 )
                            replaceElement(nine, "9");
                        break;
                }
            }
            String outStr = "";
            for(int i = 6; i >=0;i--){
                for(String[] tm: outs){
                    outStr = outStr + tm[i] + " ";
            }
                System.out.println(outStr);
                outStr = "";
        }            
        }
 
    }
        
    private void init(){
        zero = new String[7];
        zero[6] = " ** ";
        zero[5] = "*  *";
        zero[4] = "*  *";
        zero[3] = "*  *";
        zero[2] = "*  *";
        zero[1] = "*  *";
        zero[0] = " ** ";

        one = new String[7];
        one[6] = "   *";
        one[5] = "  **";
        one[4] = " * *";
        one[3] = "*  *";
        one[2] = "   *";
        one[1] = "   *";
        one[0] = "   *";
        
        two = new String[7];
        two[6] = " ** ";
        two[5] = "*  *";
        two[4] = "*  *";
        two[3] = "  * ";
        two[2] = " *  ";
        two[1] = "*   ";
        two[0] = "****";

        three = new String[7];
        three[6] = "****";
        three[5] = "  * ";
        three[4] = " *  ";
        three[3] = " ** ";
        three[2] = "   *";
        three[1] = "*  *"; 
        three[0] = " ** ";

        four = new String[7];
        four[6] = "   *";
        four[5] = "  * ";
        four[4] = " * *";
        four[3] = "*  *";
        four[2] = "****";
        four[1] = "   *";
        four[0] = "   *";

        five = new String[7];
        five[6] = "****";
        five[5] = "*   ";
        five[4] = "*** ";
        five[3] = "   *";
        five[2] = "   *";
        five[1] = "*  *";
        five[0] = " ** ";

        six = new String[7];
        six[6] = " ** ";
        six[5] = "*   ";
        six[4] = "*   ";
        six[3] = "*** ";
        six[2] = "*  *";
        six[1] = "*  *";
        six[0] = " ** ";

        seven = new String[7];
        seven[6] = "****";
        seven[5] = "   *";
        seven[4] = "  * ";
        seven[3] = " *  ";
        seven[2] = "*   ";
        seven[1] = "*   ";
        seven[0] = "*   ";

        eight = new String[7];
        eight[6] = " ** ";
        eight[5] = "*  *";
        eight[4] = "*  *";
        eight[3] = " ** ";
        eight[2] = "*  *";
        eight[1] = "*  *";
        eight[0] = " ** ";

        nine = new String[7];
        nine[6] = " ** ";
        nine[5] = "*  *";
        nine[4] = "*  *";
        nine[3] = " ***";
        nine[2] = "   *";
        nine[1] = "*  *";
        nine[0] = " ** ";
    }
    private int getMaxDigit(String lng){
        int maxDigit = 0;
        for(String str: lng.split("")){
            if (Integer.parseInt(str)>maxDigit){
                maxDigit = Integer.parseInt(str);
            }
        }
        return maxDigit;
    }
    private void replaceElement(String[] arr, String chr){
        for(int i = 0;i<7;i++){
            arr[i] = arr[i].replaceAll("\\*", chr);
    }
    }
}
