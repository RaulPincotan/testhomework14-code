package ro.fasttrackit.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private final List<Quote> quotes;


    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<Quote> getQuotesForAuthor(String autor) {
        List<Quote> result = new ArrayList<>();

        for (Quote quote : quotes) {
            if (quote.getAuthor().equalsIgnoreCase(autor)) {
                result.add(quote);
            }
        }
        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            result.add(quote.getAuthor());
        }
        return result;
    }

    public List<Quote> getFavourites() {
        List<Quote> result = new ArrayList<>();

        for (Quote quote : quotes) {
            if (quote.isFavourite()) {
                result.add(quote);
            }
        }
        return result;
    }

    public void setFavourites(int id) {

        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
            }
        }
    }

    public String getRandomQuote() {
        Random random = new Random();
        int randomNumber = random.nextInt(quotes.size()) + 1;

        for (Quote quote : quotes) {
            if (quote.getId() == randomNumber) {
                return quote.getQuote();
            }
        }
        return "";
    }
}
