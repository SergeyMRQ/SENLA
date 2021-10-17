/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_1;

import java.util.Scanner;

/**
 *
 * @author ххх
 */
public class Lesson_1 {
    private static Long summ = 0L;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите что нибудь:");
        String str = scaner.next();
        
        summ = Lesson_1.getSumm(str);
        System.out.println(summ);
        
        scaner.close();
        
    }
    private static long getSumm(String str){
        Long summ = 0L;

        for( char ch:str.toCharArray()){
            switch (Character.toString(ch)){
                    case("0"):
                    case("1"):
                    case("2"):
                    case("3"):
                    case("4"):
                    case("5"):
                    case("6"):
                    case("7"):
                    case("8"):
                    case("9"):
                        summ = summ + Long.parseLong(Character.toString(ch));
                        break;
            }
        }
        return summ;
    }
}
