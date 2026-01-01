# 📝 Assignment on Module 5

**Course:** Backend Web Development with Java & SpringBoot  
**Topic:** E-Commerce Shopping Cart Manager

## 📘 Project Overview

This project is a Java console application created as part of **Module 5** of the Backend Web Development with Java & SpringBoot Course. The goal is to demonstrate proficiency in object-oriented programming concepts with classes, objects, and encapsulation.

## 📂 Files Included

- `CartItem.java` - Contains the CartItem class definition
- `CartManager.java` - Contains the CartManager class with main logic
- `Main.java` - Entry point to run the application

## 📌 Program Requirements

The Java program implements:

1. **CartItem Class**:
    - Attributes: `productId`, `name`, `unitPrice`, `quantity`, `addedToCart`
    - Primary constructor that auto-generates random integer ID using `Math.random()`
    - Proper validation for unitPrice (must be non-negative)
    - Getters and setters for all attributes
    - `incrementQuantity()` and `decrementQuantity()` methods
    - Business logic: Quantity cannot be less than 1 when item is in cart

2. **CartManager Class**:
    - `main()` method as required
    - Creates 3 objects of CartItem class:
        - Egg (unit price: 10, quantity: 0, addedToCart: false)
        - Milk (unit price: 20, quantity: 0, addedToCart: false)
        - Noodles (unit price: 30, quantity: 0, addedToCart: false)
    - User can add/remove items by entering 1, 2, or 3
    - User can increment/decrement quantity by entering 5 or 6
    - User can print entire cart (excluding items not added)
    - User can print total payable amount
    - Validations:
        - Cannot remove items not in cart
        - Quantity cannot be less than 1 for items in cart

## ▶️ How to Run the Program

1. Open the project in **IntelliJ IDEA**
2. Ensure **JDK 21** is selected
3. Compile all Java files:
   ```
   javac CartItem.java CartManager.java Main.java
   ```
4. Run `Main.java`
5. Use menu options (1-9) to manage your shopping cart

## 🧠 Module 5 Learning

- Class and object implementation
- Constructor with random ID generation
- Encapsulation with private fields and public methods
- ArrayList to manage collections
- Input validation techniques
- E-commerce business logic implementation

## 🚀 Author

**MD. Raisul Islam Niloy**