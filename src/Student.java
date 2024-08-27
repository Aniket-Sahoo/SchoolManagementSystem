/**
 * This class is used to keep track of students fees, names, grades and fees paid
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    
    /**
     * Constructor for Student class.
     * @param id - id for student: unique
     * @param name - name of student
     * @param grade - grade of student
     * Fees for every student is 30000
     * Fees paid initally is 0
     */
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /**
     * 
     * @return id of student
     */
    public int getId() {
        return id;
    }


    /**
     * 
     * @return name of student
     */
    public String getName() {
        return name;
    }


    /**
     * 
     * @return grade of student
     */
    public int getGrade() {
        return grade;
    }


    /**
     * 
     * @return feesPaid by student
     */
    public int getFeesPaid() {
        return feesPaid;
    }


    /**
     * 
     * @return Totalfees
     */
    public int getFeesTotal() {
        return feesTotal;
    }
    
    /**
     * Used to update students grade
     * @param grade - new grade of student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * The school is going to recieve funds from student.
     * @param fees - fees paid by student in this payment
     */
    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }


}
