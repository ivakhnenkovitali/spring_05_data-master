package by.liveCoding_3;

import java.util.List;
import java.util.stream.Stream;

public class Main_1 {
    public static void main(String[] args) {
        Book jamesBond = new Book("James Bond", 2001);
        Book jamesBond2 = new Book("James Bond2", 2003);
        Book jamesBond3 = new Book("James Bond3", 2008);
        Book jamesBond4 = new Book("James Bond4", 2011);
        Author author1 = new Author("Ian Fleming", List.of(jamesBond, jamesBond2, jamesBond3, jamesBond4));

        Book garryPotter = new Book("Garry Potter", 2001);
        Book garryPotter2 = new Book("Garry Potter2", 2003);
        Book garryPotter3 = new Book("Garry Potter3", 2008);
        Book garryPotter4 = new Book("Garry Potter4", 2011);
        Author author2 = new Author("Joanne Rowling", List.of(garryPotter, garryPotter2, garryPotter3, garryPotter4));

        Stream.of(author1, author2)
        // вывести список названий книг авторов написанных после 2005
                . flatMap(s->s.getBooks().stream())
                .filter(s->s.getYear()>2005)
                .map(Book::getName)
                .forEach(System.out::println);

 }
}

class Author {
    private String name;
    private List<Book> books;

    public Author(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("name='").append(name).append('\'');
        sb.append(", books=").append(books);
        sb.append('}');
        return sb.toString();
    }



}

class Book {
    private String name;
    private Integer year;

    public Book(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}