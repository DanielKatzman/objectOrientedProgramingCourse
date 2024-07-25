package final_part_alon_daniel_package;


import java.util.Arrays;
import java.util.Comparator;

public class MarketManager implements MarketAPI {


    // --------------------------------------------------- fields ------------------------------------------

    private Seller[] sellers;
    private int sellersCounter = 0; //how many sellers in array
    private Buyer[] buyers;
    private int buyersCounter = 0; //how many buyers in array
    private final int ARR_FACTOR_SIZE = 2;

    // --------------------------------------------------- Comparators --------------------------------------

    private static final Comparator<Seller> SELLER_COMPARATOR = Comparator.nullsLast((s1, s2) -> s2.getProductsCounter() - s1.getProductsCounter());

    private static final Comparator<Buyer> BUYER_COMPARATOR = Comparator.nullsLast(Comparator.comparing(b -> b.getUserAccount().getUserName()));


    // --------------------------------------------------- ctor ------------------------------------------

    public MarketManager() {
        sellers = new Seller[2]; //default value
        buyers = new Buyer[2];//default value
    }


    //=================================================================================
    //----------------------------- private methods --------------------------------------

    //-------------------------------------  is Array Full -----------------------------------

    private boolean isArrayFull(int arraySize, int currentSize){
        return arraySize == currentSize;
    }


    //-------------------------------------  fix Seller Array -----------------------------------

    private Seller[] fixSellerArray(){

        Seller[] fixedArraySellers = new Seller[sellers.length * ARR_FACTOR_SIZE];

        for(int i = 0; i < sellersCounter; i++){
            fixedArraySellers[i] = sellers[i];
        }

        return fixedArraySellers;
    }


    //-------------------------------------  fix Buyer Array -----------------------------------

    private Buyer[] fixBuyerArray(){

        Buyer[] fixedArrayBuyers = new Buyer [buyers.length * ARR_FACTOR_SIZE];

        for(int i = 0; i < buyersCounter; i++){
            fixedArrayBuyers[i] = buyers[i];
        }

        return fixedArrayBuyers;
    }

    //-------------------------------------  sort sellers -----------------------------------

    private void sortSellers(){
        Arrays.sort(sellers, SELLER_COMPARATOR);
    }

    //-------------------------------------  sort buyers -----------------------------------


    private void sortBuyers(){
        Arrays.sort(buyers, BUYER_COMPARATOR);
    }


    //------------------------------------------  printUserArr -----------------------------------

    private void printUserArr(User[] users, int usersLength){
        for (int i = 0; i < usersLength; i++) {
            users[i].printUserDetails();
            System.out.println("-----------------------------------------------------------");

        }
    }


    //=================================================================================
    //----------------------------- public methods --------------------------------------


    //-------------------------------------  isBuyersEmpty -----------------------------------


    public boolean isBuyersEmpty(){
        return buyersCounter == 0;
    }

    //-------------------------------------  isSellerEmpty -----------------------------------

    public boolean isSellersEmpty(){
        return sellersCounter == 0;
    }


    //-----------------------------------------  getBuyer -------------------------------------

    public Buyer getBuyer(String name){

        for (int i = 0; i < buyersCounter; i++) {
            if (buyers[i].getUserAccount().getUserName().equals(name)){
                return buyers[i];
            }
        }

        return null;

    }


    //------------------------------------------  getSeller -----------------------------------

    public Seller getSeller(String name){

        for (int i = 0; i < sellersCounter; i++) {
            if (sellers[i].getUserAccount().getUserName().equals(name)){
                return sellers[i];
            }
        }

        return null;

    }





    //**************************************************************************************
    //                       Options to menu (1-7)
    //**************************************************************************************


    //------------------------------------ addSeller - 1 ------------------------------------

    @Override
    public boolean addSeller(String sellerName,String sellerPassword){
        if (getSeller(sellerName) != null){
            return false;
        }

        // if array sellers is full , create a new one (doubled size) and return it with all data
        if (isArrayFull(sellers.length ,sellersCounter)){
            sellers = fixSellerArray();
        }

        sellers[sellersCounter] = new Seller(new UserAccount(sellerName,sellerPassword));
        sellersCounter++;

        return true;
    }

    //------------------------------------ addBuyer - 2 ------------------------------------

    @Override
    public boolean addBuyer(String buyerName,String buyerPassword,String country,String city,String streetName,int buildingNumber) {

        if (getBuyer(buyerName) != null){
            return false;
        }

        // if array buyers is full , create a new one (doubled size) and return it with all data
        if (isArrayFull(buyers.length ,buyersCounter)){
            buyers = fixBuyerArray();
        }

        buyers[buyersCounter] = new Buyer(new UserAccount(buyerName,buyerPassword),new UserAddress(country,city,streetName,buildingNumber));
        buyersCounter++;

        return true;
    }

    //------------------------------------ addProductToSeller - 3 ------------------------------------
    @Override
    public boolean addProductToSeller(Seller seller,String productName, double productPrice, int numberOfCategory, double specialPackagingPrice){

        Category category = Category.values()[numberOfCategory];

        return seller.addProductToSeller(new Product(productName,productPrice,category, specialPackagingPrice));

    }

    //------------------------------------ addProductToBuyerShoppingCart - 4 ------------------------------------
    @Override
    public boolean addProductToBuyerShoppingCart(Buyer buyer ,Product product){

        return buyer.getCurrentShoppingCart().addProductToShoppingCart(product);
    }

    //------------------------------------ paymentShoppingCartOfBuyer - 5 ------------------------------------
    @Override
    public boolean paymentShoppingCartOfBuyer(Buyer buyer) throws PaymentForEmptyShoppingCartException {

        ShoppingCart shoppingCart = buyer.getCurrentShoppingCart();


        if( shoppingCart.isShoppingCartEmpty() ){
           throw new PaymentForEmptyShoppingCartException();
        }

        System.out.println( buyer.getUserAccount().getUserName() + " has pay for the cart, and the price was: " + buyer.getCurrentShoppingCart().getSumPrice() + "$");
        buyer.setCurrentShoppingCart(); // update new shopping cart in array
        return true;
    }



    //------------------------------------ showAllBuyers - 6 -----------------------------------------

    @Override
    public void showAllBuyers() {

        sortBuyers();

        System.out.println("list of all Buyers: ");
        System.out.println("---------------------");

        printUserArr(buyers, buyersCounter);

        if( buyersCounter == 0 ){
            System.out.println("The market has no buyers");
        }

    }

    //------------------------------------ showAllSellers - 7 ------------------------------------

    @Override
    public void showAllSellers() {

        sortSellers();

        System.out.println("list of all Sellers: ");
        System.out.println("---------------------");

        printUserArr(sellers, sellersCounter);

        if( sellersCounter == 0 ){
            System.out.println("The market has no sellers");
        }

    }

    //------------------------------------ show All Products By Category - 8 ------------------------------------
    @Override
    public void showAllProductsByCategory(int categoryOrdinal){
        for(int i = 0; i < sellersCounter;i++){
            Seller seller = sellers[i];
            System.out.println("The seller is: " + seller.getUserAccount().getUserName());
            seller.printProductByCategory(Category.values()[categoryOrdinal]);
        }
    }


    //------------------------------------ Create new shopping cart from history - 9 ------------------------------------


    @Override
    public boolean createNewShoppingCartFromHistory(Buyer buyer, int shoppingCartIndexHistory){

        buyer.setCurrentShoppingCartFromHistory(shoppingCartIndexHistory);
        return true;
        
    }

}


