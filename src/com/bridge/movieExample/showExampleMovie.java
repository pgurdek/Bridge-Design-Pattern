package com.bridge.movieExample;

public class showExampleMovie {

    public static void initExample(){
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Book book = new Book();
        book.setId(143);
        book.setPages(253);
        book.setTitle("Stary człowiek i może");
        book.setAuthor("PG");

        Formatter printFormatter = new PrintFormatter();
        Formatter printFormatterHTML = new HtmlFormatter();


        Printer moviePrinter = new MoviePrinter(movie);
        Printer bookPrinter = new BookPrinter(book);


        System.out.println("========MOVIE PRINTER============");
        String printerMaterialMovie = moviePrinter.print(printFormatter);
        String printerMaterialHTMLMovie = moviePrinter.print(printFormatterHTML);
        System.out.println(printerMaterialMovie);
        System.out.println(printerMaterialHTMLMovie);

        System.out.println("========BOOK PRINTER============");

        String printerMaterialBook = bookPrinter.print(printFormatter);
        String printerMaterialBookHTML = bookPrinter.print(printFormatterHTML);

        System.out.println(printerMaterialBook);
        System.out.println(printerMaterialBookHTML);
    }
}
