package adu.java.annotation;

import adu.java.annotation.FruitColor.Color;

/**
 * @author adu
 * @data 2019/5/11
 */
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = Color.RED)
    private String fruitColor;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
}
