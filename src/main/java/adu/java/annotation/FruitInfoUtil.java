package adu.java.annotation;

import java.lang.reflect.Field;

/**
 * @author adu
 * @data 2019/5/11
 */
public final class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println(String.format("FruitName: %s", fruitName.value()));
            }
            if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println(String.format("FruitColor: %s", fruitColor.fruitColor().toString()));
            }
        }
    }
}
