public class CartItem {
    private int productId;
    private String name;
    private double unitPrice;
    private int quantity;
    private boolean addedToCart;

    public CartItem(String name, double unitPrice) {
        this.productId = (int)(Math.random() * 10000);
        this.name = name;
        setUnitPrice(unitPrice);
        this.quantity = 0;
        this.addedToCart = false;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAddedToCart() {
        return addedToCart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative");
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;

        if (quantity > 0) {
            this.addedToCart = true;
        } else if (quantity == 0) {
            this.addedToCart = false;
        }
    }

    public void setAddedToCart(boolean addedToCart) {
        this.addedToCart = addedToCart;
        if (!addedToCart) {
            this.quantity = 0;
        }
    }

    public void incrementQuantity() {
        this.quantity++;
        if (quantity > 0) {
            this.addedToCart = true;
        }
    }

    public void decrementQuantity() {
        if (this.quantity > 1) {
            this.quantity--;
        } else if (this.quantity == 1) {
            this.quantity = 0;
            this.addedToCart = false;
        }
    }

    public double getTotalPrice() {
        return this.unitPrice * this.quantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5d Name: %-10s Price: $%-8.2f Quantity: %-3d Total: $%.2f", productId, name, unitPrice, quantity, getTotalPrice());
    }
}