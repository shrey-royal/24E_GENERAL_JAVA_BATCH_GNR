class InsufficientStockException extends Exception {
    public InsufficientStockException(String msg) {
        super(msg);
    }
}

class Product {
    private int availableStock;

    public Product(int availableStock) {
        this.availableStock = availableStock;
    }

    public void addToCart(int quantity) throws InsufficientStockException {
        if(quantity >= availableStock) {
            throw new InsufficientStockException("Not enough stock available for this product");
        } else {
            System.out.println("Product successfully added to cart");
        }
    }
}


public class Custom_Exception {
    public static void main(String[] args) {
        Product p = new Product(10);
        System.out.println("Before Exception");

        try {
            p.addToCart(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("After Exception");
    }
}
