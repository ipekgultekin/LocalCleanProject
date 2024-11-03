import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date orderDate;
    private ArrayList<LaundryItem> itemList = new ArrayList<>();
    private boolean paidStatus;

    /**
     * Default Constructor an Order
     */
    public Order() {
        this.orderDate = new Date();
        this.itemList.clear();
        this.paidStatus = false;
    }

    /**
     * Construct an Order with itemList, orderDate and paidStatus
     */
    public Order(ArrayList<LaundryItem> itemList, Date orderDate, boolean paidStatus) {
        this.itemList = itemList;
        this.orderDate = orderDate;
        this.paidStatus = paidStatus;
    }

    /**
     * Construct an Order with orderDate and paidStatus
     */
    public Order(Date orderDate, boolean paidStatus) {
        this.orderDate = orderDate;
        this.paidStatus = paidStatus;
    }


    /**
     * This method calculates the total cost of all LaundryItems.
     * It iterates through each item in itemList and sums the costs of each to get the total order cost.
     * @return
     */
    public double totalOrderCost(){
        double totalCost = 0;
        for (LaundryItem item : itemList) {
            totalCost += item.totalCost();
        }
        return totalCost;
    }

    /**
     * I added a method "addLaundryItem". This method adds a LaundryItem to the Order's itemList.
     * This method allows laundry items to be dynamically added to an order without rebuilding the list each time.
     * @param laundryItem
     */
    public void addLaundryItem(LaundryItem laundryItem){
        this.itemList.add(laundryItem);
    }

    public ArrayList<LaundryItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<LaundryItem> itemList) {
        this.itemList = itemList;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

}
