import java.util.ArrayList;
import java.util.List;

class Schedule {
    List<Teacher> teachers;
    List<Session> scheduledSessions;

    public Schedule() {
        this.teachers = new ArrayList<>();
        this.scheduledSessions = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void displaySchedule() {
        System.out.println("-----------------------------Display Teacher Schedule-----------------------------");
        for (Teacher teacher : teachers) {
            System.out.println("Teacher: " + teacher.name);
            System.out.println("Subject: " + teacher.subject);
            System.out.println("Availability: " + teacher.availability);
            for (Session session : scheduledSessions) {
                if (session.subject.equals(teacher.subject)) {
                    System.out.println("Subject: " + session.subject);
                    System.out.println("Time Slot: " + session.timeSlot);
                    System.out.println("Duration: " + session.duration + " hours\n");
                }
            }
            System.out.println("----------------------------------------");
        }
    }
    public void scheduleSession(String subject, String timeSlot, int duration) {
        for (Teacher teacher : teachers) {
            if (teacher.subject.equalsIgnoreCase(subject) && teacher.availability.contains(timeSlot)) {
                Session session = new Session(subject, timeSlot, duration);
                scheduledSessions.add(session);
                System.out.println("Session scheduled successfully!");
                return;
            }
        }
        System.out.println("No suitable teacher available for the given subject and time slot.");
    }
}