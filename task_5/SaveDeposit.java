/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ххх
 */
public class SaveDeposit {
    Long volume = 0L;
    List<Item> items = new ArrayList<Item>();

    public long getFreeSpace() {
        return freeSpace;
    }
    long freeSpace = 0L;
    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
        this.freeSpace = volume;
    }
    
    public void addItem(Item item){
        items.add(item);
        freeSpace = freeSpace - item.getVolume();
    }
     public void printResultSet(){
     System.out.println("Свободное место:" + freeSpace);
     System.out.println("Предметы в сейфе:");
     int i = 0;
     for(Item item: items){
         i++;
         System.out.println("Предмет:" + i + " Ценность:" + item.getValue() + " Обьем:" + item.getVolume());
     }
     }
}
