/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_2;

import java.util.Scanner;

/**
 *
 * @author ххх
 */
public class Lesson_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите что нибудь:");
        
        Long lng;
        if (scaner.hasNextLong()){
            lng = Long.parseLong(scaner.next());
            String str = getSomn(lng);
            
            if (str.equalsIgnoreCase(Long.toString(lng))) {
                System.out.println("это простоe число");
                return;
            }
            System.out.println(str);
            
        }else{
            System.out.println("Это не число");
        }
        
    }
   private static  String getSomn(Long number){
        for (long i = 2; i < number; i++ ){
            
           if (number/i==1){
               return Long.toString(number);}
           
           if (number%i==0){
               System.out.println(i);
               return getSomn(number/i);
           }
        }
        return "";
   } 
}
