import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PopulateData {
    public static void newData() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Creating Employee objects with their id, name, surname, date of birth and start date.
            Employee emp1 = new Employee(1, "Demi", "Lovato", dateFormat.parse("20-08-1992"), dateFormat.parse("2020-01-10"));
            Employee emp2 = new Employee(2, "Justin", "Bieber", dateFormat.parse("01-03-1994"), dateFormat.parse("2019-03-12"));
            Employee emp3 = new Employee(3, "Selena", "Gomez", dateFormat.parse("22-07-1992"), dateFormat.parse("2021-07-18"));

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
