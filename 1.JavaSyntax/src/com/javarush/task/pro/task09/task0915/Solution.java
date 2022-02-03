package com.javarush.task.pro.task09.task0915;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] stringArray = new String[6];
        for (int i = 0; i < 6; i++) {
            if(st.hasMoreTokens()){
                stringArray[i] = st.nextToken();
            }
            else {
                stringArray[i] = null;
            }
        }
        return stringArray;
    }
}
