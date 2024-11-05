package Package1;

/**
 * This class contains Laundry item details such as type, quantity, price, notes, assigned employee,
 * getter and setter methods, constructors, and extra methods.
 * @author İpek Gültekin
 */

public class LaundryItem {
    private String type;
    private int quantity;
    private int price;
    private String notes;
    private Employee assigned;

    /**
     * Default Constructor a Package1.LaundryItem
     */
    public LaundryItem(){
        this.assigned = assigned;
        this.notes = notes;
        this.quantity = quantity;
        this.type = type;
    }

    /**
     * Construct a Package1.LaundryItem with assigned Package1.Employee, notes, price, quantity and type
     * @param assigned assigned employee
     * @param notes notes for item
     * @param price price for item
     * @param quantity quantity for item
     * @param type item type
     */
    public LaundryItem(Employee assigned, String notes, int price, int quantity, String type) {
        this.assigned = assigned;
        this.notes = notes;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    /**
     * Construct a Package1.LaundryItem with assigned Package1.Employee, price and quantity
     * @param assigned assigned employee
     * @param price price for item
     * @param quantity quantity for item
     */
    public LaundryItem(Employee assigned, int price, int quantity) {
        this.assigned = assigned;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * This method calculate the total cost for each item.
     * @return quantity*price = cost
     */
    public double totalCost(){
        return quantity*price;
    }

    /**
     * Getter method for assigned
     * @return assigned
     */
    public Employee getAssigned() {
        return assigned;
    }

    /**
     * Setter method for assigned employee
     * @param assigned assigned
     */
    public void setAssigned(Employee assigned) {
        this.assigned = assigned;
    }

    /**
     * Getter method for item notes
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Setter method for item notes
     * @param notes notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Getter method for item quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for item quantity
     * @param quantity quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter method for item type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for item type
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns a string representation of the Package1.LaundryItem object.
     * @return A string representing the assigned employee, item type, quantity, price,
     * and notes.
     */
    @Override
    public String toString() {
        return "LaundryItem{" +
                "assigned=" + assigned.getName() +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", notes='" + notes + '\'' +
                '}';
    }
}
