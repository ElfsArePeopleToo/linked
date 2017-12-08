package ru.levelup;

import java.lang.reflect.Field;

/**
 * Created by Ирина on 02.12.2017.
 */
public class Solution {
    public static String toStringIt(Object object) throws NoSuchFieldException, IllegalAccessException {
        Class clss = object.getClass();
        String solution = "";
        final Field[] fields = clss.getDeclaredFields();

        for (Field field : fields) {
            Class fieldType = field.getType();
            String fieldName = field.getName();
            solution +="name: " + clss.getDeclaredField(fieldName).get(object) + ", " + "type: " + fieldType + " \n";
        }
        return solution;
    }
}
