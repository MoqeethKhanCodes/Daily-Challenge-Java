import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Initial Version
        Movie theMovie = new Movie("Home Alone");
        theMovie.watchMovie();

        Movie theAdventureMovie = new Adventure("Percy Jackson");
        theAdventureMovie.watchMovie();

        Movie theComedyMovie = new Comedy("Mr.Bean");
        theComedyMovie.watchMovie();

        Movie theFictionMovie = new ScienceFiction("Transformer");
        theFictionMovie.watchMovie();

        //Matured Version
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
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}