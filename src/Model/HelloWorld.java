/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author asequ
 */
public class HelloWorld {

    int intValue = 1;
    float floatValue = 1.2f;
    double doubleValue = 19.99d;
    String stringValue = "Andrea";
    char charValue = 'a';
    boolean booleanValue = true;
    int[] arrayValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String args[]) {
        HelloWorld h = new HelloWorld();
        System.out.println("The value assigned to int is : " + h.intValue);
        System.out.println("The value assigned to float is : " + h.floatValue);
        System.out.println("The value assigned to float is : " + h.doubleValue);
        System.out.println("The value assigned to string is : " + h.stringValue);
        System.out.println("The value assigned to char is : " + h.charValue);
        System.out.println("The value assigned to boolean is : " + h.booleanValue);
        System.out.println("The value assigned to array is  : ");
        for (int i = 0; i < h.arrayValue.length; i++) {
            System.out.print(" " + h.arrayValue[i]);
        }

    }

}
