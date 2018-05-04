package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String a,String b) {
        name = a;
        category = b;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setCategory(String newCat) {
        category = newCat;
    }
}
