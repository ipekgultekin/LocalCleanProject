import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * This class manages the basic functionality of the CyprusDryClean application.
 * @author İpek Gültekin
 */
public class CyprusDryClean {
    public static ArrayList<Employee> empList = new ArrayList<Employee>();
    public static ArrayList<Customer> customerList = new ArrayList<Customer>();

    public static void main(String[] args) {
        //I created objects in each method when necessary.
        PopulateData.newData(); //for testing
        CyprusDryClean obj = new CyprusDryClean();
        obj.menu();
    }

    /**
     * This method displays a menu for user.
     */
    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CyprusDry Clean!!");
        int choice;
        do{
            System.out.println("1. Add Employee\n"
                    + "2. Delete Employee\n"
                    + "3. List Employee Details\n"
                    + "4. Add Customer\n"
                    + "5. Delete Customer\n"
                    + "6. List Customer Details\n"
                    + "7. Put Order\n"
                    + "8. Customer Order Details\n"
                    + "9. Customer Order Total Cost\n"
                    + "10. List Employees\n"
                    + "11. List Customers\n"
                    + "12. Exit\n"
            );

            System.out.print("Enter a choice: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.print("Please enter employee ID to delete: ");
                    int employeeID = input.nextInt();
                    deleteEmployee(employeeID);
                    break;
                case 3:
                    System.out.print("Please enter employee ID to list of details: ");
                    employeeID = input.nextInt();
                    listEmployeeDetails(employeeID);
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    System.out.print("Please enter customer ID to delete: ");
                    int customerID = input.nextInt();
                    deleteCustomer(customerID);
                    break;
                case 6:
                    System.out.print("Please enter customer ID to list of details: ");
                    customerID = input.nextInt();
                    getCustomerDetails(customerID);
                    break;
                case 7:
                    System.out.print("Please enter customer ID: ");
                    customerID = input.nextInt();
                    putOrder(customerID);
                    break;
                case 8:
                    System.out.print("Please enter customer ID: ");
                    customerID = input.nextInt();
                    input.nextLine();
                    System.out.print("Please enter the order date to check (dd-MM-yyyy): ");
                    String dateOrder = input.nextLine();
                    Date orderDate = dateConversion(dateOrder);

                    getCustomerOrderDetails(customerID,orderDate);
                    break;
                case 9:
                    System.out.print("Please enter customer ID: ");
                    customerID = input.nextInt();
                    input.nextLine();
                    System.out.print("Please enter the order date to check (dd-MM-yyyy): ");
                    String costDate = input.nextLine();
                    Date orderCostDate = dateConversion(costDate);

                    getCustomerOrderTotalCost(customerID, orderCostDate);
                case 10:
                    listEmployees();
                    break;
                case 11:
                    listCustomers();
                    break;
                case 12:
                    exit();
                    break;
                default:
                    System.out.print("Invalid choice!! ");
                    System.out.print("Sorry!");
                    break;
            }
        }while(choice !=12);
    }


    /**
     * This helper method converts a date from String format to Date format.
     * @param string date in String format
     * @return the date in Date format
     */
    public static Date dateConversion(String string){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;

        try {
            date = dateFormat.parse(string);

        }catch (ParseException e){
            System.out.println("Invalid date format!");
        }

        return date;

    }


    /**
     * This method adds a new Employee to the employeeList
     * also it controls the ID to be unique.
     */
    public static void addEmployee() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter new employee id: ");
        int id = input.nextInt();
        input.nextLine();
        for (Employee employee : empList) {
                if (id == employee.getId())
            {
                System.out.println("Invalid ID! This ID has already taken!");
                return;
            }
        }

        System.out.print("Enter new employee name: ");
        String name = input.nextLine();

        System.out.print("Enter new employee surname: ");
        String surname = input.nextLine();

        System.out.print("Enter new employee's date of birth (dd-MM-yyyy): ");
        String dateBirth = input.nextLine();
        Date dateOfBirth = dateConversion(dateBirth);

        System.out.print("Enter new employee's start date (dd-MM-yyyy): ");
        String dateStart = input.nextLine();
        Date startDate = dateConversion(dateStart);

        Employee newEmployee = new Employee(id,name,surname,dateOfBirth,startDate);
        empList.add(newEmployee);
        System.out.println("New employee added successfully!");
    }


    /**
     * This helper method check that the employee ID entered by the user and the IDs in the system match.
     * @param empID the ID of the employee to finding
     * @return null if they are not match
     */
    public static Employee findEmployeeID(int empID){
        for(Employee employee: empList){
            if(employee.getId() == empID){
                return employee;
            }
        }
        return null;
    }


    /**
     * This helper method check that the customer ID entered by the user and the IDs in the system match.
     * @param customerID the ID of the customer to finding
     * @return null if they are not match
     */
    public static Customer findCustomerID(int customerID){
        for(Customer customer: customerList){
            if(customer.getCustomerID() == customerID){
                return customer ;
            }
        }
        return null;
    }


    /**
     * This method deletes an Employee from the employeeList based on the ID.
     * @param empID the ID of the employee
     */
    public static void deleteEmployee(int empID) {
        Employee employee = findEmployeeID(empID);
        if (employee != null) {
            empList.remove(employee);
            System.out.println("Employee deleted successfully.");
        }
        else{
            System.out.println("Employee not found! Please enter a valid ID.");
        }

    }


    /**
     * This method displays all Employee details based on the specific ID.
     * @param empId the ID of the employee
     */
    public static void listEmployeeDetails(int empId){
        Employee employee = findEmployeeID(empId);
        if(employee != null ){
            System.out.println("Employee is found!");
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empList.get(empId).getName());
            System.out.println("Employee Surname: " + empList.get(empId).getSurname());
            System.out.println("Employee Date of Birth: " + empList.get(empId).getDateOfBirth());
            System.out.println("Employee Start Date: " + empList.get(empId).getStartDate());
        }
        else{
            System.out.println("Employee not found! Please enter a valid ID.");
        }
    }


    /**
     * This method adds a new Customer to the customerList
     * also it controls the ID to be unique.
     */
    public static void addCustomer() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter new customer id: ");
        int customerId = input.nextInt();
        input.nextLine();
        for (Customer customer : customerList) {
            if (customerId == customer.getCustomerID())
            {
                System.out.println("Invalid ID! This ID has already taken!");
                return;
            }
        }

        System.out.print("Enter new customer name: ");
        String customerName = input.nextLine();

        System.out.print("Enter new customer surname: ");
        String customerSurname = input.nextLine();

        System.out.print("Enter the registration date (dd-MM-yyyy): ");
        String registrationDate = input.nextLine();
        Date date = dateConversion(registrationDate);

        Customer newCustomer = new Customer(customerId,customerName,customerSurname,date);
        customerList.add(newCustomer);
        System.out.println("New customer added!");

    }


    /**
     * This method deletes a Customer from the employeeList based on the ID.
     * @param customerID the ID of the customer
     */
    public static void deleteCustomer(int customerID) {
        Customer customer = findCustomerID(customerID);
        if (customer != null) {
            customerList.remove(customerID);
            System.out.println("Customer deleted successfully.");
        }
        else{
            System.out.println("Customer not found! Please enter a valid ID.");
        }
    }


    /**
     * This method displays all Customer details based on the specific ID.
     * @param customerID the ID of the customer
     */
    public void getCustomerDetails(int customerID){
        Customer customer = findCustomerID(customerID);
        if(customer != null){
            System.out.println("Customer is found!");
            System.out.println("Customer ID: " + customer.getCustomerID());
            System.out.println("Customer Name: " + customer.getCustomerName());
            System.out.println("Customer Surname: " + customer.getCustomerSurname());
            System.out.println("Registration Date: " + customer.getRegistrationDate());
            System.out.println("Total Orders: " +  customer.toString());
        }
        else{
            System.out.println("Customer not found! Please enter a valid ID.");
        }
    }


    /**
     * This helper method allows laundry items to be given to employees randomly.
     * @return a randomly selected Employee object
     */
    public Employee getRandomEmployee(){
        Random random = new Random();
        return empList.get(random.nextInt(empList.size()));
    }


    /**
     * This method places an order for a customer, and assigns to each employee to each item, and adds the items their order.
     * @param customerID the ID of the customer place the order
     */
    public void putOrder(int customerID) {
        Customer customer = findCustomerID(customerID);
        if(customer == null){
            System.out.println("Customer does not found. Please enter valid customer ID.");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Paid status -> (yes/no)");
        boolean isPaid = input.nextLine().equalsIgnoreCase("yes");

        Order order = new Order(new java.util.Date(),isPaid);

        System.out.print("Enter the number of laundry items: ");
        int numberOfItems = input.nextInt();
        input.nextLine();

        //This is an assumption. I decided to do like this.
        // Price list display for the user
        System.out.println("Price List:\n"+
                "Shirt: 8$\n" +
                "Jean: 10$\n" +
                "Dress: 12$\n" +
                "T-Shirt: 5$\n");

        for(int i=0; i<numberOfItems; i++){
            System.out.println("Enter the type of item (Shirt, Jean, Dress, T-Shirt): ");
            String itemType = input.nextLine();

            int priceItem = 0;
            switch (itemType){
                case "Shirt":
                    priceItem = 8;
                    break;
                case "Jean":
                    priceItem = 10;
                    break;
                case "Dress":
                    priceItem = 12;
                    break;
                case "T-Shirt":
                    priceItem = 5;
                    break;
                default:
                    System.out.println("Invalid type. Please choose correct type.");
                    continue;
            }

            System.out.println("Enter quantity of " + itemType + ": ");
            int quantity = input.nextInt();
            input.nextLine();

            System.out.println("Enter notes: ");
            String notes = input.nextLine();

            Employee employeeAssigned = getRandomEmployee();
            LaundryItem laundryItem = new LaundryItem(employeeAssigned,notes,priceItem,quantity,itemType);

            order.addLaundryItem(laundryItem);
            System.out.println("\nThank you for choosing us!\n" +
                    "Your order added successfully!\n" +
                    quantity + " " +itemType + " assigned to " + employeeAssigned.getName()
                    + " and its cost is " + laundryItem.totalCost() + " $.");

        }
        System.out.println("The total cost of all your orders:  " + order.totalOrderCost() + " $\n");


        customer.addOrder(order);
        System.out.println("Putting order successfully!");

    }


    /**
     * Compares two Date objects and checks if they represent the same calendar day
     * by comparing only the year, month, and day components, ignoring the time.
     * @param date1 first date
     * @param date2 second date
     * @return true if both dates are equal
     */
    public static boolean isSameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }


    /**
     * This method displays all orders made by a specific customer on a given date.
     * @param customerID the ID of the customer
     * @param orderDate the specific date of order
     */
    public void getCustomerOrderDetails(int customerID, Date orderDate){
        Customer customer = findCustomerID(customerID);
        if(customer == null){
            System.out.println("Customer is not found!");
            return;
        }

        if (orderDate == null) {
            System.out.println("Invalid date. Please enter a valid date.");
            return;
        }

        boolean orderFound = false;

        ArrayList<Order> orders = customer.getOrders();
        System.out.println("Orders for customer " + customerID + " on " + orderDate );

        for (Order order: orders){
            if(isSameDay(orderDate,order.getOrderDate())){
                orderFound = true;
                System.out.println("\nOrder date: " + order.getOrderDate());
                System.out.println("Paid status: " + ((order.isPaidStatus()) ? "Yes" : "No"));
                System.out.println("Laundry items: ");

                for(LaundryItem laundryItem : order.getItemList()){
                    System.out.println("  Item type: " + laundryItem.getType()+ ",  Quantity: " + laundryItem.getQuantity());
                }
            }
            if(!orderFound){
                System.out.println("Sorry, order is not found for this customer and this date.");
            }
        }
    }


    /**
     * This method calculate and display the total cost of all orders made by a specific customer on a given date.
     * @param customerID the ID of the customer whose order costs are being calculated
     * @param orderDate the specific date to calculate order costs
     */
    public void getCustomerOrderTotalCost(int customerID, Date orderDate){
        Customer customer = findCustomerID(customerID);
        if(customer == null){
            System.out.println("Customer is not found!");
            return;
        }

        if (orderDate == null) {
            System.out.println("Invalid date. Please enter a valid date.");
            return;
        }


        ArrayList<Order> orders = customer.getOrders();
        boolean orderFound = false;

        System.out.println("Order total cost of customer " + customerID + " on " + orderDate);
        for(Order order: orders){
            if(isSameDay(orderDate,order.getOrderDate())){
                orderFound = true;
                double totalCost = order.totalOrderCost(); //call
                System.out.println("Order date: " + order.getOrderDate() + " and total cost: " + totalCost + "$.");
            }
        }
        if(!orderFound){
            System.out.println("Sorry, order is not found for this customer and this date.");
        }
    }


    /**
     * This method lists of all employees with their all details
     */
    public void listEmployees() {
        for (Employee employee : empList) {
            System.out.println("Employee ID:" + employee.getId() +
                    " Name: " + employee.getName() +
                    " Surname: " + employee.getSurname()+
                    " Date of Birth: " + employee.getDateOfBirth()+
                    " Start Date: " + employee.getStartDate());
        }
    }


    /**
     * This method lists of all customers with their all details
     */
    public void listCustomers() {
        for (Customer customer : customerList) {
            System.out.println("Customer ID:" + customer.getCustomerID() +
                    " Name: " + customer.getCustomerName() +
                    " Surname: " + customer.getCustomerSurname() +
                    " Registration Date: " + customer.getRegistrationDate() +
                    " Total Orders: " + customer.toString());
        }
    }


    /**
     * This method contains a  message to end the program.
     */
    public void exit(){
        System.out.println("Have a nice day!");
    }
}