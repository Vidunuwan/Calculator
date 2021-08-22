package com.kelaniya.uni.v2;

public class Main {
    public static void main(String[] args) {
        //make sure to validate the argumant before the using
        if(args.length==0){
            System.out.println("Please provide the oparation as a argumant");
            return;
        }
        String oparator=args[0];
        if(!(oparator.equals("add") || oparator.equals("sub") || oparator.equals("mul") ||oparator.equals("div"))){
            System.out.println("Please provide the cuttect argumant");
            return;

        }
        System.out.println(args[0]);

    }
}
