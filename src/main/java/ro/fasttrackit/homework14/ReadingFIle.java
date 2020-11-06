package ro.fasttrackit.homework14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFIle {
    public List<Quote> readingQuotes(String line) {
        List<Quote> result = new ArrayList<>();
        String lineToRead = "";
        int idNumber = 1;
        Quote quote;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(line))) {

            while ((lineToRead = bufferedReader.readLine()) != null) {

                String[] tokens = lineToRead.split("~");
                quote = new Quote(idNumber, tokens[0], tokens[1]);
                result.add(quote);
                idNumber++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }


}
