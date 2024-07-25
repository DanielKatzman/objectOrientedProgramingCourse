package final_part_alon_daniel_package;

public class Product {

    private String productName;
    private double productPrice;
    private Category category;
    private int serialNumber;
    private static int counter = 0;
    private double specialPackagingPrice = 0;
    private double totalPrice = 0;
    private boolean isInSpecialPackaging;

    //--------------------------------- ctor --------------------------------------

    public Product(String productName, double productPrice, Category category, double specialPackagingPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.serialNumber = ++counter;
        this.category = category;
        this.specialPackagingPrice = specialPackagingPrice;
        totalPrice = productPrice + specialPackagingPrice;
        isInSpecialPackaging = specialPackagingPrice > 0;
    }

    //--------------------------------- getters --------------------------------------

    public String getProductName() {
        return productName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Category getCategory() {return category;}
    //--------------------------------- toString --------------------------------------

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", category=" + category +
                ", serialNumber=" + serialNumber +
                ", specialPackagingPrice=" + specialPackagingPrice + '$'+
                ", totalPrice=" + totalPrice + '$'+
                ", isInSpecialPackaging=" + isInSpecialPackaging +
                "}\n";
    }
}

