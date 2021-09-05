package com.kelaniya.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public Double[] getNumbers() throws IOException {
        //read the numbers from text files
        List<String> stringsStrs = Files.readAllLines(
                Paths.get("D:\\My\\SE\\2 ND YEAR\\Sem 1\\Software Constructions\\Git Local\\Calculator\\src\\" +
                        "Numbers.txt")
        );

        double number1 = Double.parseDouble(stringsStrs.get(0));
        double number2 = Double.parseDouble(stringsStrs.get(1));

        return new Double[]{number1,number2};

    }

}
