import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queueRideOnAttraction = new LinkedList<>();
        for (Person client : generateClients()) {
            queueRideOnAttraction.offer(client);
        }
        Person person;

        while (!queueRideOnAttraction.isEmpty()) {
            person = queueRideOnAttraction.poll();
            System.out.printf("%s %s прокатился на аттракционе, осталось билетов: %d \n", person.getName(), person.getSurname(), person.getParkTicket() - 1);
            person.setParkTicket(person.getParkTicket() - 1);
            if (person.getParkTicket() > 0) {
                queueRideOnAttraction.offer(person);
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Александр", "Овечкин", 6));
        clients.add(new Person("Евгений", "Малкин", 5));
        clients.add(new Person("Никита", "Кучеров", 4));
        clients.add(new Person("Артемий", "Панарин", 3));
        clients.add(new Person("Игорь", "Шестёркин", 2));
        return clients;
    }
}
