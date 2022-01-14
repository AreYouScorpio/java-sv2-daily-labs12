package day04;


public class Teacher {
    String name;
    String subject;
    String classTeached;
    int hours;

    public Teacher(String name, String subject, String classTeached, int hours) {
        this.name = name;
        this.subject = subject;
        this.classTeached = classTeached;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", classTeached='" + classTeached + '\'' +
                ", hours=" + hours +
                '}';
    }
}
