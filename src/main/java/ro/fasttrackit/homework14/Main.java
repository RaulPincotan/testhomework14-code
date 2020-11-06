package ro.fasttrackit.homework14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Quote> quotes = new ReadingFIle().readingQuotes("C:\\Users\\raulp\\Desktop\\fisiertext\\quotes.txt");
        QuoteService quoteService = new QuoteService(quotes);


        for (Quote quote : quotes) {
            System.out.println(quote);
        }

        System.out.println(quoteService.getAllQuotes());
        System.out.println();
        System.out.println(quoteService.getQuotesForAuthor("Abraham Lincoln"));
        System.out.println();
        System.out.println(quoteService.getAuthors());

        quoteService.setFavourites(2);
        quoteService.setFavourites(25);
        quoteService.setFavourites(10);
        quoteService.setFavourites(29);
        System.out.println();
        System.out.println(quoteService.getFavourites());

        System.out.println();
        System.out.println(quoteService.getRandomQuote());
    }
}
