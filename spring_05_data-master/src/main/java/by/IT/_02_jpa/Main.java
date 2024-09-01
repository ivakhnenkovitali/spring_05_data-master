package by.IT._02_jpa;

import by.itclass._02_jpa.configs.AppConfig;
import by.itclass._02_jpa.entities.Airplane;
import by.itclass._02_jpa.repositories.AirplaneRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var repository = ctx.getBean(AirplaneRepository.class);

        var boeing = repository.findByModelLike("Boe%");
        System.out.println(boeing);
        System.out.println("___________________");
        var airbus = repository.findByPlaceBetween(250, 500);
        airbus.forEach(System.out::println);
    }
}
