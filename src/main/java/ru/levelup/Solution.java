package ru.levelup;

import java.lang.reflect.Field;

/**
 * Created by Ирина on 02.12.2017.
 */
public class Solution {
    public static String toString(Object object) {
        Class<?> clss = object.getClass();
        Field[] fields = clss.getDeclaredFields();
        String solution = "";

        for (Field field : fields) {
            Class fieldType = field.getType();
            solution += "name: " + field.getName() + ", " + "type: " + fieldType.getName() + " \n";
        }
        return solution;
    }
}
