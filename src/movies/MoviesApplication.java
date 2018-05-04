package movies;
import util.Input;
public class MoviesApplication {
    public static void main(String[] args) {
        //MoviesArray master = new MoviesArray();
        Movie[] list = MoviesArray.findAll();
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - View movies in the Animated Genre");
        System.out.println("3 - View movies in the Drama Genre");
        System.out.println("4 - View movies in the Horror Genre");
        System.out.println("5 - View movies in the Sci-Fi Genre");
        System.out.println();
        ask(list);

    }
    public static void ask(Movie[] list) {

        System.out.print("Enter Your Selection: ");
        int selection = Input.getInt();
        if (selection == 0) {
            System.out.println();
            System.out.println("Goodbye...");
        }else if (selection == 1) {
            System.out.println();
            allMovies(list);
        }else if (selection == 2) {
            System.out.println();
            animated(list);
        }else if (selection == 3) {
            System.out.println();
            drama(list);
        }else if (selection == 4) {
            System.out.println();
            horror(list);
        }else if (selection == 5) {
            System.out.println();
            scifi(list);
        }else {
            System.out.println();
            System.out.println("Invalid input, try again");
            System.out.println();
            ask(list);
        }
    }

    public static void allMovies(Movie[] list) {
        for (Movie film:list) {
            System.out.println(film.getName()+" -- "+film.getCategory());
        }
        System.out.println();
        ask(list);
    }

    public static void animated(Movie[] list) {
        for (Movie film:list) {
            if (film.getCategory().equals("animated")) {
                System.out.println(film.getName()+" -- "+film.getCategory());
            }
        }
        System.out.println();
        ask(list);
    }

    public static void drama(Movie[] list) {
        for (Movie film:list) {
            if (film.getCategory().equals("drama")) {
                System.out.println(film.getName()+" -- "+film.getCategory());
            }
        }
        System.out.println();
        ask(list);
    }

    public static void horror(Movie[] list) {
        for (Movie film:list) {
            if (film.getCategory().equals("horror")) {
                System.out.println(film.getName()+" -- "+film.getCategory());
            }
        }
        System.out.println();
        ask(list);
    }

    public static void scifi(Movie[] list) {
        for (Movie film:list) {
            if (film.getCategory().equals("scifi")) {
                System.out.println(film.getName()+" -- "+film.getCategory());
            }
        }
        System.out.println();
        ask(list);
    }

}
