public class Person {

    private final String name;

    private final String surname;

    private int ParkTicket;

    public Person(String name, String surname, int parkTicket) {
        this.name = name;
        this.surname = surname;
        this.ParkTicket = parkTicket;
    }

    public void setParkTicket(int parkTicket) {
        this.ParkTicket = parkTicket;
    }

    public int getParkTicket() {
        return ParkTicket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}