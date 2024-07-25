

package final_part_alon_daniel_package;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
    In all classes, just necessary getters and setters appears.
 */


public class Main {


    private static Scanner scanner = new Scanner(System.in); // close scanner in the end of the program

    ///////////////////////////////////// input segment /////////////////////////////////////////

    private static String enterStr(){

        String s = scanner.nextLine().trim();

        while(s.isEmpty()){
            System.out.print("Empty word! enter again: ");
            s = scanner.nextLine().trim();
        }

        return s;
    }

    private static int enterInt(){

        int val;

        while(true){

            try {

                val = Integer.parseInt(enterStr());
                return val;
            }
            catch (InputMismatchException | NumberFormatException  e){
                System.out.print("It's not a number(int)! Try again: ");
            }


        }


    }

    private static double enterDouble(){

        double val;

        while(true) {

            try {

                val = Double.parseDouble(enterStr());
                return val;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.print("It's not a number(double)! Try again: ");
            }
        }

    }


    private static String chooseName() {
        System.out.print("Enter name: ");
        return enterStr();
    }

    private static String choosePassword() {
        System.out.print("Enter password: ");
        return enterStr();
    }


    private static String chooseCountry() {
        System.out.print("Enter country: ");
        return enterStr();
    }

    private static String chooseCity() {
        System.out.print("Enter City: ");
        return enterStr();
    }

    private static String chooseStreetName() {
        System.out.print("Enter StreetName: ");
        return enterStr();
    }

    private static int chooseBuildingNumber() {
        System.out.print("Enter BuildingNumber: ");
        int buildingNumber = enterInt();

        while(!isPositiveInt(buildingNumber)){
            System.out.println("Invalid Input! need positive number");
            System.out.print("Enter again: ");
            buildingNumber = enterInt();
        }

        return buildingNumber;
    }

    private static String chooseProductName(){
        System.out.print("Enter product name: ");
        return enterStr();
    }

    private static double chooseProductPrice(){

        System.out.print("Enter product price: ");
        double price = enterDouble();

        while(!isPositiveDouble(price)){
            System.out.println("Invalid Input! need positive number");
            System.out.print("Enter again: ");
            price = enterDouble();
        }

        return price;

    }

    private static boolean isPositiveDouble(double num){
        return num > 0;
    }

    private static boolean isPositiveInt(int num){
        return num > 0;
    }



    //------------------------------------ chooseValidCategoryOrdinal  ------------------------------------

    private static boolean isCategoryOrdinalNotInRange(int choice){
        return (choice < 0 || choice >= Category.values().length);
    }

    private static int chooseValidCategoryOrdinal() {
        showAllProductCategories();
        System.out.print("Enter category: ");
        int choice = enterInt();

        while (isCategoryOrdinalNotInRange(choice)){
            System.out.println("Invalid choice try again!");
            System.out.print("Enter again: ");
            choice = enterInt();
        }

        return choice;
    }

    //------------------------------------ enterYesOrNo  ------------------------------------

    private static boolean enterYesOrNo(){

        String choose;

        while( true ){

            System.out.println("Enter y/n: ");

            choose = enterStr();

            if( choose.equalsIgnoreCase("y") ){
                return true;
            }
            if (choose.equalsIgnoreCase("n")){
                return false;
            }
            System.out.println("Wrong input!");
        }

    }

    //------------------------------------ chooseSpecialPackagingPrice  ------------------------------------

    private static double chooseSpecialPackagingPrice(){

        System.out.println("Do the product needs special packaging?");

        if( enterYesOrNo() ){
            System.out.println("Enter Special packaging price: ");

            double price = enterDouble();

            while(!isPositiveDouble(price)){
                System.out.println("You chose to do a special packaging, so the price has to be positive!");
                System.out.print("Enter again: ");
                price = enterDouble();

            }

            System.out.println("Special packaging price " + price + "$ was selected to product");
            return price;
        }

        System.out.println("Special packaging price not needed");

        return 0;

    }

    //------------------------------------ selectShoppingCartOfBuyer  ------------------------------------

    private static int selectShoppingCartOfBuyer(Buyer buyer){

        System.out.println("These are all shopping carts history of " + buyer.getUserAccount().getUserName());
        buyer.printAllShoppingCartsHistory();

        while( true ){

            System.out.println("Choose between 0-" + (buyer.getCurrentShoppingCartIndex()-1) );

            int choose = enterInt();

            if( choose >= 0 && choose <= (buyer.getCurrentShoppingCartIndex()-1) ){
                return choose;
            }

            System.out.println("Wrong input!");

        }

    }




    /////////////////////////////////////  /////////////////////////////////////////


    //------------------------------------ enterExistSeller  ------------------------------------

    private static String enterExistSeller(MarketManager marketManager){

        System.out.print("Choose Seller - ");
        String sellerName = chooseName();

        while ((marketManager.getSeller(sellerName) == null)){
            System.out.print("Seller is not exists! try again: ");
            sellerName = chooseName();
        }

        System.out.println("------The seller " + sellerName + " has been chosen successfully");

        return sellerName;

    }

    //------------------------------------ enterExistBuyer  ------------------------------------

    private static String enterExistBuyer(MarketManager marketManager){

        System.out.print("Choose Buyer - ");
        String buyerName = chooseName();

        while ((marketManager.getBuyer(buyerName) == null)){
            System.out.print("Buyer is not exists! try again: ");
            buyerName = chooseName();
        }

        System.out.println("------The buyer " + buyerName + " has been chosen successfully");

        return buyerName;



    }


    //------------------------------------ show Menu  ------------------------------------

    private static void printLine(){
        System.out.println("------------------------------------------------------------------");
    }

    private static void showMenu() {
        System.out.println("\n\n******************************************************************");
        System.out.println("Welcome! Select an option: ");
        System.out.println("0 - exit");
        System.out.println("1 - Add seller");
        System.out.println("2 - Add buyer");
        System.out.println("3 - Add product to seller");
        System.out.println("4 - Add product to buyer");
        System.out.println("5 - Payment for buyer");
        System.out.println("6 - Show all buyers");
        System.out.println("7 - Show all sellers");
        System.out.println("8 - Show all products by category");
        System.out.println("9 - Create Cart From History");
        System.out.println("******************************************************************");
        System.out.print("\nEnter your choice: ");
    }

    private static void showAllProductCategories(){
        System.out.println("Category Products:");
        System.out.println("KIDS - " + Category.KIDS.ordinal());
        System.out.println("Electricity - " + Category.ELECTRICITY.ordinal());
        System.out.println("OFFICE - " + Category.OFFICE.ordinal());
        System.out.println("CLOTHING - " + Category.CLOTHING.ordinal());

    }


    // ======================================= Options 0-9 ======================================================


    // ------------------------------------ option 1 - addSeller ------------------------------------------------

    private static void option1(MarketManager marketManager){

        System.out.println("------------------------------- SELECTED: Add seller -------------------------------\n");

        while(!marketManager.addSeller(chooseName(),choosePassword())){
            System.out.println("Seller already exist!");
        }
        System.out.println("Seller added successfully!");


    }

    // ------------------------------------ option 2 - add buyer ------------------------------------------------

    private static void option2(MarketManager marketManager){

        System.out.println("--------------------------- SELECTED: Add buyer was selected ------------------------\n");

        while(!marketManager.addBuyer(chooseName(),choosePassword(),chooseCountry(),chooseCity(),chooseStreetName(),chooseBuildingNumber())){
            System.out.println("Buyer already exist!");
        }
        System.out.println("Buyer added successfully!");


    }


    // ------------------------------------ option 3 - add product to seller ------------------------------------------------

    private static void option3(MarketManager marketManager){

        System.out.println("---------------------------- SELECTED: add Product To Seller -----------------------------\n");

        if(marketManager.isSellersEmpty()){
            System.out.println("There are no sellers in the market !");
            return;
        }

        String sellerName = enterExistSeller(marketManager);
        Seller seller = marketManager.getSeller(sellerName);

        String productName = chooseProductName();

        if(seller.getProduct(productName) != null){
            System.out.println("Product already exists!");
            return;
        }

        double productPrice = chooseProductPrice();
        int category = chooseValidCategoryOrdinal();
        double specialPackagingPrice = chooseSpecialPackagingPrice();

        while(!marketManager.addProductToSeller(seller, productName, productPrice, category, specialPackagingPrice)){
            System.out.println("Product not added!");
        }

        System.out.println("Added product to seller successfully");


    }


    // ------------------------------------ option 4 - add product to buyer ------------------------------------------------

    private static void option4(MarketManager marketManager){

        System.out.println("--------------------- SELECTED: add Product To Buyer Shopping Cart ------------------------\n");

        if(marketManager.isBuyersEmpty()){
            System.out.println("There are no buyers in the market !");
            return;
        }

        if(marketManager.isSellersEmpty()){
            System.out.println("There are no sellers in the market to buy from them products !");
            return;
        }

        String buyerName = enterExistBuyer(marketManager);
        Buyer buyer = marketManager.getBuyer(buyerName);

        String sellerName = enterExistSeller(marketManager);
        Seller seller = marketManager.getSeller(sellerName);

        if(!seller.hasProducts()){
            System.out.println("the seller "+ sellerName +" doesn't have products!");
            return;
        }

        System.out.println("These are the products the seller " + sellerName + "have: ");
        seller.printProducts();

        Product product = seller.getProduct(chooseProductName());

        while(product == null){
            System.out.println("product doesn't exist!");
            product = seller.getProduct(chooseProductName());
        }

        marketManager.addProductToBuyerShoppingCart(buyer, product);
        System.out.println("Added product to buyer shopping cart successfully");



    }


    // ------------------------------------ option 5 - payment for buyer shopping cart ------------------------------------------------

    private static void option5(MarketManager marketManager){

        System.out.println("------------------ SELECTED: payment Shopping Cart Of Buyer -----------------------\n");

        if(marketManager.isBuyersEmpty()){
            System.out.println("There are no buyers in the market !");
            return;
        }

        String buyerName = enterExistBuyer(marketManager);
        Buyer buyer = marketManager.getBuyer(buyerName);

        try{
            marketManager.paymentShoppingCartOfBuyer(buyer);
        }
        catch (PaymentForEmptyShoppingCartException e){
            System.out.println(e.getMessage());
            return;
        }


        System.out.println("the shopping cart added to the history successfully");
        System.out.println("new shopping cart was added!");

    }


    // ------------------------------------ option 6 - show all buyers ------------------------------------------------

    private static void option6(MarketManager marketManager){

        System.out.println("-------------------------- SELECTED: show All Buyers -------------------------------\n");
        marketManager.showAllBuyers();

    }

    // ------------------------------------ option 7 - show all sellers ------------------------------------------------

    private static void option7(MarketManager marketManager){


        System.out.println("-------------------------- SELECTED: show All Sellers -------------------------------\n");
        marketManager.showAllSellers();

    }


    // -------------------------------- option 8 - show all products of same category from all sellers --------------------

    private static void option8(MarketManager marketManager){

        System.out.println("-------------------------- SELECTED: show All Products By Category ------------------------------\n");
        if(marketManager.isSellersEmpty()){
            System.out.println("There are no sellers in the market! So there are no products at all!");
            return;
        }
        marketManager.showAllProductsByCategory(chooseValidCategoryOrdinal());

    }


    // ------------------------------------ option 9 - Create Cart From History ------------------------------------------------

    private static void option9(MarketManager marketManager){

        System.out.println("---------------------------- SELECTED: Create Cart From History ---------------------------------\n");

        if(marketManager.isBuyersEmpty()){
            System.out.println("There are no buyers in the market !");
            return;
        }

        Buyer buyer = marketManager.getBuyer(enterExistBuyer(marketManager));

        if( !buyer.hasShoppingCartsHistory() ){
            System.out.println("Buyer doesn't have history of shopping carts!");
            return;
        }

        if( !buyer.getCurrentShoppingCart().isShoppingCartEmpty() ){

            System.out.println("Warning! Your shopping cart is not empty, are you sure that do you want to change cart?");

            if( !enterYesOrNo() ){
                return;
            }
        }

        marketManager.createNewShoppingCartFromHistory(buyer, selectShoppingCartOfBuyer(buyer));

    }


    // ============================================================================================



    public static void main(String[] args) {

        int userChoice;
        boolean toContinue = true;
        MarketManager marketManager = new MarketManager();

        while(toContinue) {

            showMenu();

            userChoice = enterInt();

            switch (userChoice) {

                case 1: //Enter details and get validation after.

                    option1(marketManager);
                    break;

                case 2: //Enter details and get validation after.

                    option2(marketManager);
                    break;

                case 3:

                    option3(marketManager);
                    break;

                case 4:

                    option4(marketManager);
                    break;

                case 5:
                    option5(marketManager);
                    break;

                case 6:
                    option6(marketManager);
                    break;

                case 7:
                    option7(marketManager);
                    break;

                case 8:
                    option8(marketManager);
                    break;

                case 9:
                    option9(marketManager);
                    break;


                case 0:
                    System.out.println("Goodbye");
                    toContinue = false;
                    break;

                default:
                    System.out.println("\nInvalid selection. Try again. (0-9)");
                    break;

            }

            printLine();

        }

        scanner.close();


    }



}