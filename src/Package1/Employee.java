package Package1;

import java.util.Date;

/**
 * This class contains Package1.Employee details such as id, name, surname, dateOfBirth, startDate,
 * getter and setter methods, and constructors.
 * @author İpek Gültekin
 */
public class Employee {
    private int id;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private Date startDate;


    /**
     * Default Constructor a Customer
     */
    public Employee() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
    }

    /**
     * Constructor an Package1.Employee with id, name, surname, date of birth and start date
     * @param id employee id
     * @param name employee name
     * @param surname employee surname
     * @param dateOfBirth date of birth employee
     * @param startDate start date for employee
     */
    public Employee(int id, String name, String surname, Date dateOfBirth, Date startDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startDate = new Date() ;
    }

    /**
     * Constructor an Package1.Employee with id, name and surname
     * @param id employee id
     * @param name employee name
     * @param surname employee surname
     */
    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    /**
     * Getter method for dateOfBirth
     * @return dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter method for dateOfBirth
     * @param dateOfBirth date of birth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter method for id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter method for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for start date
     * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter method for start date
     * @param startDate start date
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter method for surname
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Setter method for surname
     * @param surname surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

}
