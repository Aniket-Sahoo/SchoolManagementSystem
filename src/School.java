
import java.util.List;

/**
 * Many Students and teachers
 */
public class School {
    
    private List<Teacher> teachers;
    private List<Student> students;
    private int revenueEarned;
    private int expenses;


    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.revenueEarned = 0;
        this.expenses = 0;
    }
    
    /**
     * 
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teachers teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /**
     *  
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * 
     * @param students to be added to the chool
     */
    public void addStudents(Student student) {
        this.students.add(student);
    }

    /**
     * 
     * @return the revenue earned by school
     */
    public int getRevenueEarned() {
        return revenueEarned;
    }

    /**
     * Adds the total revenue earned by the school
     * @param revenueEarned revenue earned to be added
     */
    public void updateRevenueEarned(int revenueEarned) {
        this.revenueEarned += revenueEarned;
    }

    /**
     * 
     * @return total expenses of the school
     */
    public int getExpenses() {
        return expenses;
    }

    /**
     * update the money that is spent by the school 
     * @param expenses - amount that is spent by the school
     */
    public void updateExpenses(int expenses) {
        this.expenses += expenses;
    }
    
    @Override
    public String toString() {
        return "School [teachers=" + teachers + ", students=" + students + ", revenueEarned=" + revenueEarned
                + ", expenses=" + expenses + "]";
    }

}
