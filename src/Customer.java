import java.util.Date;
import java.util.ArrayList;


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
     * I added "addOrder" method to add a new Order to the Customer.
     * @param order
     */
    public void addOrder(Order order){
        this.orders.add(order);
    }

    public void putOrder(){
        this.orders.add(orders.getLast());

    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

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
