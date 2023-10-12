public class Human {
    String name;
    String surname;
    String secondname;
    String date;
    String phone;
    String male;

    public Human(String surname, String name, String secondname, String date, String phone, String male) {
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.date = date;
        this.phone = phone;
        this.male = male;
    }

    @Override
    public String toString() {
        return  String.format("<%s><%s><%s><%s><%s><%s>",surname, name, secondname, date, phone, male);
    }
}
