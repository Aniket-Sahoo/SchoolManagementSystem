/**
 * This class is responsible for keeping the track of teacher's name, id, and salary
 */

public class Teacher {
    
    private int id;
    private String name;
    private int salary;

    /**
     * Create new teacher object
     * @param id - id for teacher
     * @param name - name for teacher
     * @param salary - salary for teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Getter fn for id
     * @return id of teacher
     */
    public int getId(){
        return this.id;
    }

    /**
     * Getter for name
     * @return name of teacher
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter for salary
     * @return the salary for the teacher
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * Setter for salary
     * @param salary - salary of the teacher
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

}
