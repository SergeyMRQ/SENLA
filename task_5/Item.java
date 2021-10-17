/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

/**
 *
 * @author ххх
 */
public class Item {
    private Long volume = 0L;
    private Long value = 0L;
    private Long averageValue = 0L;

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(Long averageValue) {
        this.averageValue = this.volume/this.value;
    }
    
}
