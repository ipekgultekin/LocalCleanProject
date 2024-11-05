import Package1.Order;

import java.util.Date;
import java.util.ArrayList;

/**
 * This class contains Customer details such as customerID, customerName, customerSurname, registrationDate,list of orders associated with the customer,
 * getter and setter methods, and constructors.
 * @author İpek Gültekin
 */

public class Customer {
    private int customerID;
    private String customerName;
    private String customerSurname;
    private Date registrationDate = new Date();
    private ArrayList<Order> orders = new ArrayList<Order>();

    /** Construct a Customer with the specified customerID, customerName and customerSurname
     */
    public Customer(int customerID, String customerName, String customerSurname) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.registrationDate = new Date();
        this.orders = new ArrayList<>();
    }
    /** Construct a Customer with the specified customerID, customerName, customerSurname and registrationDate
     */
    public Customer(int customerID, String customerName, String customerSurname, Date registrationDate) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.registrationDate = new Date();
        this.orders = new ArrayList<>();
    }

    /** Default Construct a Customer
     */
    public Customer(){
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.orders = new ArrayList<>();
    }

    /**
     * This helper method to add a new Package1.Order to the customerList.
     * @param order
     */
    public void addOrder(Order order){
        this.orders.add(order);
    }


    /**
     * This method retrieves the most recent order and adds it to the customer's list of orders.
     */
    public void putOrder(){
        this.orders.add(orders.getLast());

    }
    /**
     * Getter method for list of orders
     * @return orders
     */
    public ArrayList<Order> getOrders() {
        return orders;
    }

    /**
     * Setter method for list of orders
     * @param orders orders
     */
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    /**
     * Getter method for id
     * @return customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Setter method for id
     * @param customerID customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * Getter method for name
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter method for name
     * @param customerName customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Getter method for surname
     * @return customerSurname
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * Setter method for surname
     * @param customerSurname customerSurname
     */
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    /**
     * Getter method for registration date
     * @return registrationDate
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }
    /**
     * Setter method for registration date
     * @param registrationDate registrationDate
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * Returns a string representation of the Customer object.
     * @return A string representing the customer's details, including ID, name, surname,
     * registration date, and associated orders.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "Customer ID=" + customerID +
                ", Customer Name='" + customerName + '\'' +
                ", Customer Surname='" + customerSurname + '\'' +
                ", Registration Date=" + registrationDate +
                ", Orders=" + orders +
                '}';
    }
}
