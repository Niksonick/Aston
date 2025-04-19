package Module2.Task2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Иван", List.of(
                        new Book("Jkhkhje", 2015, 400),
                        new Book("Аmbnmbn", 2001, 500),
                        new Book("Cutyuty", 2008, 300),
                        new Book("Sutyuty", 2019, 350),
                        new Book("utyuty", 1999, 250)
                )),
                new Student("Мария", List.of(
                        new Book("das", 2018, 450),
                        new Book("Аewq", 2001, 500),
                        new Book("Deqweqw", 2016, 200),
                        new Book("Kczxczxc", 2020, 320),
                        new Book("dsadqweqweqwe", 2005, 150)
                ))
        );
    }
}
