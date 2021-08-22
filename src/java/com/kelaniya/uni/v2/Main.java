package com.kelaniya.uni.v2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {//exseption handling
        //make sure to validate the argumant before the using
        if (args.length == 0) {
            System.out.println("Please provide the oparation as a argumant");
            return;
        }
        String oparator = args[0];
        if (!(oparator.equals("add") || oparator.equals("sub") || oparator.equals("mul") || oparator.equals("div"))) {
            System.out.println("Please provide the correct argument");
            return;
        }
        //read the numbers from text files
        List<String> stringsStrs = Files.readAllLines(
                Paths.get("D:\\My\\SE\\2 ND YEAR\\Sem 1\\" +
                        "Software Constructions\\Git Local\\Calculator\\src\\java\\com\\kelaniya\\uni\\Numbers.txt")
        );

        double number1 = Double.parseDouble(stringsStrs.get(0));
        double number2 = Double.parseDouble(stringsStrs.get(1));

        double result = 0;

        if (oparator.equals("add")) {
            result = number1 + number2;
        } else if (oparator.equals("sub")) {
            result = number1 - number2;
        } else if (oparator.equals("mul")) {
            result = number1 * number2;
        } else {
            result = number1 / number2;
        }
        System.out.println("The result is " + result);


    }
}
