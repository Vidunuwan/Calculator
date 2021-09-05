package com.kelaniya.uni.v4.oparations;

public class OperationFactory {

    public Operations getInstance(String operator){
        Operations operations=null;

        if (operator.equals("add")) {
            operations = new AddOperation();

        } else if (operator.equals("sub")) {
            operations = new SubOperation();

        } else if (operator.equals("mul")) {
            operations = new MulOperation();

        } else if(operator.equals("div")) {
            operations = new DivOperation();
        }

        return operations;
    }

}
