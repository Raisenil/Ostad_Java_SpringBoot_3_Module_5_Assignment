import java.util.ArrayList;
import java.util.Scanner;

public class CartManager {
    private ArrayList<CartItem> cartItems;
    private Scanner scanner;

    public CartManager() {
        cartItems = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    public void displayCart() {
        System.out.println("\n========== SHOPPING CART ==========");
        boolean cartIsEmpty = true;

        for (CartItem item : cartItems) {
            if (item.isAddedToCart()) {
                System.out.println(item);
                cartIsEmpty = false;
            }
        }

        if (cartIsEmpty) {
            System.out.println("Your cart is empty!");
        }
        System.out.println("===================================\n");
    }

    public void displayTotalAmount() {
        double total = 0;

        for (CartItem item : cartItems) {
            if (item.isAddedToCart()) {
                total += item.getTotalPrice();
            }
        }

        System.out.println("\n========== TOTAL AMOUNT ==========");
        System.out.printf("Total Payable Amount: $%.2f%n", total);
        System.out.println("==================================\n");
    }

    public void displayMenu() {
        System.out.println("\n========== SHOPPING CART MENU ==========");
        System.out.println("1. Add Egg to cart");
        System.out.println("2. Add Milk to cart");
        System.out.println("3. Add Noodles to cart");
        System.out.println("4. Remove an item from cart");
        System.out.println("5. Increment quantity (+)"); // Like the '+' button
        System.out.println("6. Decrement quantity (-)"); // Like the '-' button
        System.out.println("7. View cart");
        System.out.println("8. View total amount");
        System.out.println("9. Exit");
        System.out.println("=========================================\n");
        System.out.print("Enter your choice (1-9): ");
    }

    public void removeItemMenu() {
        System.out.println("\n========== REMOVE ITEM ==========");
        System.out.println("1. Remove Egg");
        System.out.println("2. Remove Milk");
        System.out.println("3. Remove Noodles");
        System.out.println("4. Back to main menu");
        System.out.println("=================================\n");
        System.out.print("Enter choice (1-4): ");
    }

    public void incrementItemMenu() {
        System.out.println("\n========== INCREMENT QUANTITY ==========");
        System.out.println("1. Increment Egg quantity");
        System.out.println("2. Increment Milk quantity");
        System.out.println("3. Increment Noodles quantity");
        System.out.println("4. Back to main menu");
        System.out.println("=========================================\n");
        System.out.print("Enter choice (1-4): ");
    }

    public void decrementItemMenu() {
        System.out.println("\n========== DECREMENT QUANTITY ==========");
        System.out.println("1. Decrement Egg quantity");
        System.out.println("2. Decrement Milk quantity");
        System.out.println("3. Decrement Noodles quantity");
        System.out.println("4. Back to main menu");
        System.out.println("=========================================\n");
        System.out.print("Enter choice (1-4): ");
    }

    public void handleRemoveItem(CartItem egg, CartItem milk, CartItem noodles) {
        removeItemMenu();
        int removeChoice = scanner.nextInt();

        switch (removeChoice) {
            case 1:
                if (egg.isAddedToCart()) {
                    egg.setQuantity(0);
                    System.out.println("+ Egg removed from cart!");
                } else {
                    System.out.println("Egg is not in your cart!");
                }
                break;
            case 2:
                if (milk.isAddedToCart()) {
                    milk.setQuantity(0);
                    System.out.println("+ Milk removed from cart!");
                } else {
                    System.out.println("Milk is not in your cart!");
                }
                break;
            case 3:
                if (noodles.isAddedToCart()) {
                    noodles.setQuantity(0);
                    System.out.println("+ Noodles removed from cart!");
                } else {
                    System.out.println("Noodles is not in your cart!");
                }
                break;
            case 4:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice! Returning to main menu.");
        }
    }

    public void handleIncrementItem(CartItem egg, CartItem milk, CartItem noodles) {
        incrementItemMenu();
        int incChoice = scanner.nextInt();

        switch (incChoice) {
            case 1:
                if (egg.isAddedToCart()) {
                    egg.incrementQuantity();
                    System.out.println("+ Egg quantity increased to " + egg.getQuantity());
                } else {
                    System.out.println("Add Egg to cart first!");
                }
                break;
            case 2:
                if (milk.isAddedToCart()) {
                    milk.incrementQuantity();
                    System.out.println("+ Milk quantity increased to " + milk.getQuantity());
                } else {
                    System.out.println("Add Milk to cart first!");
                }
                break;
            case 3:
                if (noodles.isAddedToCart()) {
                    noodles.incrementQuantity();
                    System.out.println("+ Noodles quantity increased to " + noodles.getQuantity());
                } else {
                    System.out.println("Add Noodles to cart first!");
                }
                break;
            case 4:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice! Returning to main menu.");
        }
    }

    public void handleDecrementItem(CartItem egg, CartItem milk, CartItem noodles) {
        decrementItemMenu();
        int decChoice = scanner.nextInt();

        switch (decChoice) {
            case 1:
                if (egg.isAddedToCart()) {
                    egg.decrementQuantity();
                    if (egg.getQuantity() == 0) {
                        System.out.println("- Egg removed from cart (quantity became 0)");
                    } else {
                        System.out.println("- Egg quantity decreased to " + egg.getQuantity());
                    }
                } else {
                    System.out.println("Egg is not in your cart!");
                }
                break;
            case 2:
                if (milk.isAddedToCart()) {
                    milk.decrementQuantity();
                    if (milk.getQuantity() == 0) {
                        System.out.println("- Milk removed from cart (quantity became 0)");
                    } else {
                        System.out.println("- Milk quantity decreased to " + milk.getQuantity());
                    }
                } else {
                    System.out.println("Milk is not in your cart!");
                }
                break;
            case 3:
                if (noodles.isAddedToCart()) {
                    noodles.decrementQuantity();
                    if (noodles.getQuantity() == 0) {
                        System.out.println("- Noodles removed from cart (quantity became 0)");
                    } else {
                        System.out.println("- Noodles quantity decreased to " + noodles.getQuantity());
                    }
                } else {
                    System.out.println("Noodles is not in your cart!");
                }
                break;
            case 4:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice! Returning to main menu.");
        }
    }

    public void main() {
        CartItem egg = new CartItem("Egg", 10);
        CartItem milk = new CartItem("Milk", 20);
        CartItem noodles = new CartItem("Noodles", 30);

        addItem(egg);
        addItem(milk);
        addItem(noodles);

        System.out.println("Welcome to E-Commerce Shopping Cart Manager!");
        System.out.println("Items available: Egg (৳10), Milk (৳20), Noodles (৳30)");

        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Egg to cart
                    if (!egg.isAddedToCart()) {
                        egg.setQuantity(1);
                        System.out.println("+ Egg added to cart!");
                    } else {
                        System.out.println("Egg is already in your cart!");
                    }
                    break;

                case 2: // Add Milk to cart
                    if (!milk.isAddedToCart()) {
                        milk.setQuantity(1);
                        System.out.println("+ Milk added to cart!");
                    } else {
                        System.out.println("Milk is already in your cart!");
                    }
                    break;

                case 3: // Add Noodles to cart
                    if (!noodles.isAddedToCart()) {
                        noodles.setQuantity(1);
                        System.out.println("+ Noodles added to cart!");
                    } else {
                        System.out.println("Noodles is already in your cart!");
                    }
                    break;

                case 4: // Remove item from cart
                    handleRemoveItem(egg, milk, noodles);
                    break;

                case 5: // Increment quantity (+)
                    handleIncrementItem(egg, milk, noodles);
                    break;

                case 6: // Decrement quantity (-)
                    handleDecrementItem(egg, milk, noodles);
                    break;

                case 7: // View cart
                    displayCart();
                    break;

                case 8: // View total amount
                    displayTotalAmount();
                    break;

                case 9: // Exit
                    running = false;
                    System.out.println("\nThank you for shopping with us!");
                    System.out.println("Final Cart Summary:");
                    displayCart();
                    displayTotalAmount();
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1-9.");
            }
        }
        scanner.close();
    }
}