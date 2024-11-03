import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private Date startDate;


    /**
     * Default Construct a Customer
     */
    public Employee() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
    }

    /**
     * Construct an Employee with id, name, surname, date of birth and start date
     */
    public Employee(int id, String name, String surname, Date dateOfBirth, Date startDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startDate = new Date() ;
    }
    /**
     * Construct an Employee with id, name and surname
     */
    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
