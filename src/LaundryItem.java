public class LaundryItem {
    private String type;
    private int quantity;
    private int price;
    private String notes;
    private Employee assigned;

    /**
     * Default Constructor a LaundryItem
     */
    public LaundryItem(){
        this.assigned = assigned;
        this.notes = notes;
        this.quantity = quantity;
        this.type = type;
    }

    /**
     * Construct a LaundryItem with assigned Employee, notes, price, quantity and type
     */
    public LaundryItem(Employee assigned, String notes, int price, int quantity, String type) {
        this.assigned = assigned;
        this.notes = notes;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    /**
     * Construct a LaundryItem with assigned Employee, price and quantity
     */
    public LaundryItem(Employee assigned, int price, int quantity) {
        this.assigned = assigned;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalCost(){
        return quantity*price;
    }

    public Employee getAssigned() {
        return assigned;
    }

    public void setAssigned(Employee assigned) {
        this.assigned = assigned;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
