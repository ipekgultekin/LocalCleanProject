import Package1.Employee;
import Package1.LaundryItem;
import Package1.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This PopulateData class is used to add sample data into the CyprusDryClean system.
 * It initializes 3 Employee and 3 Customer objects along with their associated orders and laundry items.
 * @author İpek Gültekin
 */
public class PopulateData {
    public static void newData() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Creating Package1.Employee objects with their id, name, surname, date of birth and start date.
            Employee emp1 = new Employee(1, "Demi", "Lovato", dateFormat.parse("20-08-1992"), dateFormat.parse("10-01-2010"));
            Employee emp2 = new Employee(2, "Justin", "Bieber", dateFormat.parse("01-03-1994"), dateFormat.parse("12-03-2013"));
            Employee emp3 = new Employee(3, "Selena", "Gomez", dateFormat.parse("22-07-1992"), dateFormat.parse("18-07-2021"));

            // Adding employees to the CyprusDryClean employeeList.
            CyprusDryClean.empList.add(emp1);
            CyprusDryClean.empList.add(emp2);
            CyprusDryClean.empList.add(emp3);


            // Creating Customer objects with orders and laundry items
            Customer customer1 = new Customer(1, "Sukru", "Eraslan");
            Order order1 = new Order(new Date(), true);
            order1.addLaundryItem(new LaundryItem(emp1, "Don't forget to iron! Thank you.", 8, 2, "Shirt"));
            customer1.addOrder(order1);
            CyprusDryClean.customerList.add(customer1);


            Customer customer2 = new Customer(2, "Mariem", "Hmila");
            Order order2 = new Order(new Date(), true);
            order2.addLaundryItem(new LaundryItem(emp2, "Please wash it well", 10, 1, "Jean"));
            customer2.addOrder(order2);
            CyprusDryClean.customerList.add(customer2);

            Customer customer3 = new Customer(3, "Yeliz", "Yılmaz");
            Order order3 = new Order(new Date(), true);
            order3.addLaundryItem(new LaundryItem(emp3, "Please wash at 30 degrees.", 12, 3, "Dress"));
            customer3.addOrder(order3);
            CyprusDryClean.customerList.add(customer3);

        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }

}
