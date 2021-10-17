/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ххх
 */
public class Service {
   Scanner scaner = new Scanner(System.in);
   List<Item> items = new ArrayList<Item>();
   SaveDeposit save = new SaveDeposit();
   public void processing(){
    addItems();
    setSaveDeposit();
    getResult();
    printAllItems();
    save.printResultSet();
   }
   private void setSaveDeposit(){
       long choice = 0;
       while (choice != -1){
           System.out.println("Введите объем сейфа(Целое число) '-1'-Exit ");
           if(scaner.hasNextLong()){
               choice = scaner.nextLong();
               if (choice == -1)
                   return;
               
               save.setVolume(choice);
               return;
           }else{
               System.out.println("Необходимо ввести число!");
           }
           
       }
   }
   
   private void addItems(){
       int choice = -1;
      Item item = null;
      while(choice != 0){
        System.out.println("Желаете добавить предмет? 0-нет/1-да");
        if (scaner.hasNextInt()){
            choice = scaner.nextInt();
        
        switch(choice){
            case 0:
                return;
            case 1:
                item = getItemAttr();
                if (item != null){
                    items.add(item);
                }
                break;
            default:
                System.out.println("Необходимо ввести число!");
        }
        
    }else{
        System.out.println("Необходимо ввести число!");}

    }
    
    }
      
   private Item getItemAttr(){
       Item item = new Item();
       Long choice = -2L;
       
       while (choice != -1L | choice > 0L){
       System.out.println("Введите объем предмета(Целое число) '-1'-Exit");
       
       
       if (scaner.hasNextLong()){
           choice = scaner.nextLong();
           item.setVolume(choice);

           System.out.println("Введите ценность предмета(Целое число) '-1'-Exit");
           if (scaner.hasNextLong()){
               choice = scaner.nextLong();
               item.setValue(choice);
               item.setAverageValue(0L);
               return item;
           }else{
                System.out.println("Необходимо ввести целое число!");
                return null;
            }    
       }else{
           System.out.println("Необходимо ввести целое число!");
           return null;
       }
       }
       return null;
   }
   private void getResult(){
       
       Collections.sort(items, new Comparator<Item>() {
           @Override
           public int compare(Item it1, Item it2) {
               return it1.getAverageValue().intValue() - it2.getAverageValue().intValue();
           }
       });
       
       for(Item item: items){
           if (save.freeSpace >= item.getVolume()){
               save.addItem(item);
           }
       }
   }
   
   private void printAllItems(){
     System.out.println("Предметов в всего:");
     int i = 0;
     for(Item item: items){
         i++;
         System.out.println("Предмет:" + i + " Ценность:" + item.getValue() + " Обьем:" + item.getVolume());
     }
   }
}
