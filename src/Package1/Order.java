package Package1;

import java.util.ArrayList;
import java.util.Date;

/**
 * This class contains Package1.Order details such as order date, list of items associated with the laundry items, and paid status,
 * getter and setter methods, constructors, and extra methods.
 * @author İpek Gültekin
 */

public class Order {
    private Date orderDate;
    private ArrayList<LaundryItem> itemList = new ArrayList<>();
    private boolean paidStatus;

    /**
     * Default Constructor an Package1.Order
     */
    public Order() {
        this.orderDate = new Date();
        this.itemList.clear();
        this.paidStatus = false;
    }

    /**
     * Construct an Package1.Order with itemList, orderDate and paidStatus
     * @param itemList list of laundry items
     * @param orderDate order date
     * @param paidStatus paid status
     */
    public Order(ArrayList<LaundryItem> itemList, Date orderDate, boolean paidStatus) {
        this.itemList = itemList;
        this.orderDate = orderDate;
        this.paidStatus = paidStatus;
    }

    /**
     * Construct a Package1.Order with orderDate and paidStatus
     * @param orderDate order date
     * @param paidStatus paid status
     */
    public Order(Date orderDate, boolean paidStatus) {
        this.orderDate = orderDate;
        this.paidStatus = paidStatus;
    }


    /**
     * This method calculates the total cost of all LaundryItems.
     * It iterates through each item in itemList and sums the costs of each to get the total order cost.
     * @return totalCost
     */
    public double totalOrderCost(){
        double totalCost = 0;
        for (LaundryItem item : itemList) {
            totalCost += item.totalCost();
        }
        return totalCost;
    }

    /**
     * This helper method adds a Package1.LaundryItem to the Package1.Order's itemList.
     * This method allows laundry items to be dynamically added to an order without rebuilding the list each time.
     * @param laundryItem laundryItem
     */
    public void addLaundryItem(LaundryItem laundryItem){
        this.itemList.add(laundryItem);
    }

    /**
     * Getter method for list of items
     * @return itemList
     */
    public ArrayList<LaundryItem> getItemList() {
        return itemList;
    }

    /**
     * Setter method for list of items
     * @param itemList itemList
     */
    public void setItemList(ArrayList<LaundryItem> itemList) {
        this.itemList = itemList;
    }

    /**
     * Getter method for order date
     * @return orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Setter method for date of order
     * @param orderDate orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Getter method for paid status for order
     * @return paidStatus
     */
    public boolean isPaidStatus() {
        return paidStatus;
    }

    /**
     * Setter method for paid status (yes or no)
     * @param paidStatus paidStatus
     */
    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

    /**
     * Returns a string representation of the Package1.Order object.
     * @return A string representing the item list, order date, paid stats,
     * and total order cost.
     */
    @Override
    public String toString() {
        return "Order{" +
                "itemList=" + itemList +
                ", Order Date=" + orderDate +
                ", Paid Status=" + paidStatus +
                ", Total order cost=" + totalOrderCost() + " $ "+
                '}';
    }
}
