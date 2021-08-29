package com.kelaniya.uni.v3;

public class CommandLineInputs {
    private final String[] args;

    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator(){
        //make sure to validate the argumant before the using
        if (args.length == 0) {
            System.out.println("Please provide the oparation as a argumant");
            return "";
        }
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("Please provide the correct argument");
            return "";
        }
        return operator;

    }
}
