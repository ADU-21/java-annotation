package adu.java.annotation;

/**
 * @author adu
 * @data 2019/5/11
 */
public class Apple {

    @FruitName("Apple")
    private String appleName;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
}
