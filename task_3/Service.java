/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ххх
 */
public class Service {
private Set vowels;  
   public void processing(){
        Scanner scaner = new Scanner(System.in, "windows-1251");
        System.out.println("Введите слова на русском языке:");
        
        setVowels();
        List<Data> data = new ArrayList<Data>();
        int i = -1;
        String[] tmp = scaner.nextLine().split(" ");
        for(String str: tmp){
            Data dt = new Data();
            dt.setCountVolwes(getCount(str));
            dt.setStr(setUpperFirstVovel(str));
            i++;
            data.add(dt);
        }
        
        Collections.sort (data, new Comparator<Data>(){
                @Override
                public int compare(Data dt1, Data dt2) {
		return dt2.getCountVolwes() - dt1.getCountVolwes();
	} });
        
        for(Data ds : data){
            System.out.println(ds.getCountVolwes());
             System.out.println(ds.getStr());
        }
    }
    public int getCount(String str){
      String[] arrStr = str.split("");
      int counter = 0;
      for(String st: arrStr){
            if(vowels.contains(st)){
                counter++;
        }
     }
    return counter;
    }
    private String setUpperFirstVovel(String str){
        String[] arrTmp = str.split("");
        
        String tmp = "";
        boolean isFirst = false;
        for(String ch: arrTmp){
            if(vowels.contains(ch)){
                if (isFirst == false){
                    isFirst = true;
                    tmp = tmp + ch.toUpperCase();
                }else{
                    tmp = tmp + ch;
                }
                    
            }else{
                tmp = tmp + ch;
                }
         }
        return tmp;
    }   
    public void setVowels(){
        vowels = new HashSet<String>();
        for (String str: "аоуыэяёюеи".split("")){
            vowels.add(str);
        }
    }
}
