package by.tasks.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main_2 {
    public static void main(String[] args) {
       //Задан набор пар городов: между каждой парой городов сотрудник компании совершил
        //прямой перелёт, но информация, в каком направлении был совершен перелёт, утеряна.
        //Известно, что все указанные перелёты относятся к одному путешествию, и что каждый следующий
        //перелёт сотрудник начинал из того города, в котором закончил предыдущий. Также вы знаете, что никакой
        //город не был посещён сотрудником дважды, в том числе город в котором путешествие началось отличается от
        //города, в котором оно закончилось. Выведите города в порядке следования по маршруту. Очевидно, что есть
        //два возможных ответа, подойдёт любой.
        //Можно использовать коллекции.
        //
        List<List<String>> sample1 = List.of(
                List.of("Moscow", "Belgrade"),
                List.of("Stavropol","Erevan"),
                List.of("Moscow", "Erevan")
        ); //answer: "Stavropol","Erevan", "Moscow", "Belgrade"
        researchTrack(sample1).forEach(System.out::println);
    }
    public static List<String> researchTrack(List<List<String>> tracks) {
        // Карта для хранения направления городов: ключ -> следующий город
        Map<String, String> map = new HashMap<>();
        // Множество для всех городов назначения
        Set<String> destinations = new HashSet<>();

        // Заполняем карту и множество
        for (List<String> track : tracks) {
            String from = track.get(0);
            String to = track.get(1);
            map.put(from, to);
            destinations.add(to);
        }
        System.out.println(destinations);

        // Находим начальный город (город, который не является пунктом назначения)
        String startCity = null;
        for (String city : map.keySet()) {
            if (!destinations.contains(city)) {
                startCity = city;
                break;
            }
        }

        // Построение маршрута
        List<String> route = new ArrayList<>();
        while (startCity != null) {
            route.add(startCity);
            startCity = map.get(startCity);  // Переходим к следующему городу
        }
        return route;
    }
}
