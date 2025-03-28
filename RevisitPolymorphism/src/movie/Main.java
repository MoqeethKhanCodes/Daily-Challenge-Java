package movie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Movie theMovie = new Movie("Lords of the Ring");
//        theMovie.watchMovie();
//
//        lineSeparator();
//
//        Movie movie = new Adventure("Hobbit");
//        movie.watchMovie();
//
//        lineSeparator();
//
//        Movie comedyMovie = new Comedy("Mr.Bean");
//        comedyMovie.watchMovie();
//
//        lineSeparator();
//
//        Movie scienceFiction = new ScienceFiction("Prometheus");
//        scienceFiction.watchMovie();
//
//        lineSeparator();
//        lineSeparator();
//
//        Movie theMovie1 = Movie.getMovie("Adventure", "Lords of the Ring");
//        theMovie1.watchMovie();
//        lineSeparator();

        Scanner inputText = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter Title Code : ");

            System.out.printf("\t• %s%n".repeat(4),
                    "A for Adventure",
                    "C for Comedy",
                    "S for Science Fiction",
                    "Q to Quit"
            );

            String type = inputText.nextLine();
            if ("Qq".contains(type)) {
                System.out.println("Terminated!");
                break;
            }
            System.out.println("Enter Movie Title : ");
            String title = inputText.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

        }

    }

    public static void lineSeparator() {
        System.out.println("----------------\n");
    }
}
