public class Book {
    private String title;
    private String genere;
    private String author;
    private int pages;
    
    public Book(){
        title = "";
        genere = "";
        author = "";
        pages = 0;
        // default constructor
    }

    public Book(String t, String g, String a, int p){
        // overloaded constructor
        
        title = t;
        genere = g;
        author = a;
        pages = p;
    }

    public Book(String genere, String author, int pages, String title){
        // overloaded consturctor

        this.title = title;
        this.genere = genere;
        this.author = author;
        this.pages = pages;
    }

}
