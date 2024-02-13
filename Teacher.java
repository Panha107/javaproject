import java.util.List;

class Teacher {
    String name;
    String subject;
    List<String> availability;

    public Teacher(String name, String subject, List<String> availability) {
        this.name = name;
        this.subject = subject;
        this.availability = availability;
    }
}