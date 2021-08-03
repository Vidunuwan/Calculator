package com.kelaniya.uni;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Calculator {
    public int Addition(int x,int y){
        return x+y;
    }
    public int Subtraction(int x,int y){
        return x-y;
    }
    public int Multiplication(int x, int y){
        return x*y;
    }
    public static void main(String arg[]) {
        int[] value=new int[2];
        int i=0;
        File f=new File("D:\\My\\SE\\2 ND YEAR\\Sem 1\\Software Constructions\\Git Local\\Calculator\\src\\java\\com\\kelaniya\\uni\\Numbers.txt");
        Scanner scn= null;
        try {
            scn = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scn.hasNextInt()){
            value[i]=scn.nextInt();
            i++;
        }
        Calculator c=new Calculator();
        Scanner in=new Scanner(System.in);
        System.out.print("Press 1 for Addition\nPress 2 for Subtraction\nPress 2 for Multiplication\nEnter your Option:");
        int input=in.nextInt();
        while(input>3 || input<1){
            System.out.print("Wrong input Try again:");
            input=in.nextInt();
        }
        switch(input){
            case 1:System.out.println(c.Addition(value[0],value[1]));
            break;
            case 2:System.out.println(c.Subtraction(value[0],value[1]));
            break;
            case 3:System.out.println(c.Multiplication(value[0],value[1]));
            break;
        }
    }
}
