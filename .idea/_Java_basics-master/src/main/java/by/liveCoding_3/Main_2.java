package by.liveCoding_3;

import java.util.stream.Stream;

public class Main_2 {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));

        Integer reduce = phoneStream.filter(s -> s.getPrice() < 50000)
                // .map(Phone::getPrice)

                .reduce(0, (x, y) -> x + y.getPrice(), (x, y) -> x + y);
        System.out.println(reduce);

    }
}

class Phone {

    private String name;
    private int price;


    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

