package final_part_alon_daniel_package;

public interface MarketAPI {

    boolean addSeller(String sellerName,String sellerPassword);
    boolean addBuyer(String buyerName,String buyerPassword,String country,String city,String streetName,int buildingNumber);
    boolean addProductToSeller(Seller seller,String productName, double productPrice, int numberOfCategory, double specialPackagingPrice);
    boolean addProductToBuyerShoppingCart(Buyer buyer ,Product product);
    boolean paymentShoppingCartOfBuyer(Buyer buyer) throws PaymentForEmptyShoppingCartException;
    void showAllBuyers();
    void showAllSellers();
    void showAllProductsByCategory(int categoryOrdinal);
    boolean createNewShoppingCartFromHistory(Buyer buyer, int shoppingCartIndexHistory);


}
