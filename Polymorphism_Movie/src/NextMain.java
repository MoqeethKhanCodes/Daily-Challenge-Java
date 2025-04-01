public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        System.out.println("___________________");

        /** Movie Type cast to Adventure Type*/
        /*Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws");
        jaws.watchMovie();*/ // ClassCastException

        /** Adventure Type cast to Movie Type*/
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        System.out.println("___________________");

        /** Object Type cast to Movie Type - But calling Comedy method to a Movie Type*/
        /*
        * Object comedy = Movie.getMovie("C", "Airplane");
        Movie comedyMovie = (Movie) comedy;
        * comedyMovie.watchComedy(); //Won't Compile
        * */

        /** Object Type -> Movie Type -> Adventure Type -> Comedy*/
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        System.out.println("___________________");

        /** Local Variable Type Inference (LVTI) since Java 10 (See Generics)
         * var - Helps figure out compile-time type */
        var airplane = Movie.getMovie("C", "Jackie");
        airplane.watchMovie();

        System.out.println("___________________");

        Object unjnownObject = Movie.getMovie("C", "Airplane");
        if(unjnownObject.getClass().getSimpleName().equalsIgnoreCase("Comedy")) {
            Comedy c = (Comedy) unjnownObject;
            c.watchComedy();
        }else if (unjnownObject instanceof Adventure) { // InstanceOf
            ((Adventure) unjnownObject).watchAdventure();
        }else if (unjnownObject instanceof ScienceFiction scifi) { // Pattern Matching since JDK 16
            scifi.watchFiction();
        }
    }
}
