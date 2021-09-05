package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.oparations.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {//exseption handling

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();
        Double number1 = numbers[0];
        Double number2 = numbers[1];




        OperationFactory operationFactory = new OperationFactory();
        Operations operations = operationFactory.getInstance(operator);
        Double result = operations.execute(numbers);

        UI ui= new UI();
        ui.showMassage("result is"+result);


    }
}
