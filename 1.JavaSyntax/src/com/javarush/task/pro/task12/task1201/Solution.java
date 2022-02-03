package com.javarush.task.pro.task12.task1201;

/* 
Автоупаковка
*/

public class Solution {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    public static Byte valueOf(byte byteValue) {
        return new Byte(byteValue);
    }

    public static Short valueOf(short shortValue) {
        return new Short(shortValue);
    }

    public static Integer valueOf(int intValue) {
        return new Integer(intValue);
    }

    public static Long valueOf(long longValue) {
        return new Long(longValue);
    }

    public static Float valueOf(float floatValue) {
        return new Float(floatValue);
    }

    public static Double valueOf(double doubleValue) {
        return new Double(doubleValue);
    }

    public static Character valueOf(char charValue) {
        return new Character(charValue);
    }

    public static Boolean valueOf(boolean booleanValue) {
        return new Boolean(booleanValue);
    }

    Byte byteValueBox = Byte.valueOf(byteValue);

    Short shortValueBox = Short.valueOf(shortValue);

    Integer integerValueBox = Integer.valueOf(intValue);

    Long longValueBox = Long.valueOf(longValue);

    Float floatValueBox = Float.valueOf(floatValue);

    Double doubleValueBox = Double.valueOf(doubleValue);

    Character characterValueBox = Character.valueOf(charValue);

    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
