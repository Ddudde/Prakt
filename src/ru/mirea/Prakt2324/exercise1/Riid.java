package ru.mirea.Prakt2324.exercise1;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Riid {
    public static void main(String[] args) throws IOException, CsvException {

        String fileName = "src/ru/mirea/Prakt2324/exercise1/movementList.csv";
        Path myPath = Paths.get(fileName);

        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

        try (Reader br = Files.newBufferedReader(myPath,  StandardCharsets.UTF_8);
             CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
                     .build()) {

            List<String[]> rows = reader.readAll();

            for (String[] row : rows) {

                for (String e : row) {

                    System.out.format("%s ", e);
                }

                System.out.println();
            }
        }
    }
}
