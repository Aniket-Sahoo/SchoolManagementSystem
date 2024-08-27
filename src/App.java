import java.util.ArrayList;
import java.util.List;

/**
 * Main class that runs the application
 */
public class App {
    public static void main(String[] args) throws Exception {
        Teacher liz = new Teacher(1, "Lizzy", 500);
        Teacher john = new Teacher(2, "Lizzy", 500);
        Teacher bob = new Teacher(3, "Bob", 500);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(liz);
        teacherList.add(john);
        teacherList.add(bob);

        Student jake = new Student(1, "Aninull", 4);
        Student ron = new Student(1, "Ron", 8);
        Student harry = new Student(1, "Harry", 12);
        List<Student> studentList = new ArrayList<>();
        studentList.add(jake);
        studentList.add(ron);
        studentList.add(harry);

        School bSchool = new School(teacherList, studentList);
        System.out.println(bSchool.toString());
    }
}
