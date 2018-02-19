/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 * @author Anders Jackson
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World");
        String test = in.nextLine();
        System.out.format("Result read was: %s%n", test);
        System.exit(0);
    }
}
