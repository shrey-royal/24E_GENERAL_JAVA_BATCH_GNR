import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class RestaurantMenu {
    public ArrayList<MenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Burger", 149));
        menuItems.add(new MenuItem("Pizza", 399));
        menuItems.add(new MenuItem("Salad", 720));
        menuItems.add(new MenuItem("Pasta", 179));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}

class Order {
    private ArrayList<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem menuItem : items) {
            total += menuItem.getPrice();
        }
        return total;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantMenu restaurantMenu = new RestaurantMenu();
        Order order = new Order();

        int choice;
        do {
            System.out.println("\n1. Display Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. View Order");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    displayMenu(restaurantMenu);
                    break;

                case 2:
                    addItemToOrder(sc, restaurantMenu, order);
                    break;
                
                case 3:
                    viewOrder(order);
                    break;
                    
                case 4:
                    System.out.println("Thank you for visiting. Have a nice day!");
                    break;
            
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        } while(choice != 4);
        sc.close();
    }

    private static void displayMenu(RestaurantMenu restaurantMenu) {
        System.out.println("\nMenu: ");
        ArrayList<MenuItem> menuItems = restaurantMenu.getMenuItems();
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i+1) + ". " + menuItem.getName() + " - Rs." + menuItem.getPrice());
        }
    }

    public static void addItemToOrder(Scanner sc, RestaurantMenu restaurantMenu, Order order) {
        displayMenu(restaurantMenu);
        System.out.print("\nEnter the number of the item to add your order: ");
        int itemNumber = sc.nextInt();
        ArrayList<MenuItem> menuItems = restaurantMenu.getMenuItems();
        if(itemNumber >= 1 && itemNumber <= menuItems.size()) {
            order.addItem(menuItems.get(itemNumber - 1));
            System.out.println("Item added to your order.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void viewOrder(Order order) {
        System.out.println("\nYour Order: ");
        ArrayList<MenuItem> items = order.getItems();
        for(MenuItem item : items) {
            System.out.println("-> " + item.getName() + ": Rs." + item.getPrice());
        }
        System.out.println("Total Cost: Rs." + order.calculateTotal());
    }
}