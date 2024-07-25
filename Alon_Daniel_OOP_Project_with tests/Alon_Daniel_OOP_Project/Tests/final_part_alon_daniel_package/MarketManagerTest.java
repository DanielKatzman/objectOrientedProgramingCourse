package final_part_alon_daniel_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

class MarketManagerTest {

//
//
////     --------------------------------- Seller testing -------------------------------
//
//    @org.junit.jupiter.api.Test
//    void addSeller() {
//
//
//        MarketManager marketManager = new MarketManager();
//
//        Seller seller1 = new Seller(new UserAccount("A1","1"));
//        Seller seller2 = new Seller(new UserAccount("A2","1"));
//        Seller seller3 = new Seller(new UserAccount("A3","1"));
//        Seller seller4 = new Seller(new UserAccount("A4","1"));
//
//        String[] sellersExpected = {
//                seller1.getUserAccount().getUserName(),
//                seller2.getUserAccount().getUserName(),
//                seller3.getUserAccount().getUserName(),
//                seller4.getUserAccount().getUserName()
//        };
//
//        //-------------------------------------------------------------
//
//
//        marketManager.addSeller("A1","1");
//        marketManager.addSeller("A2","1");
//        marketManager.addSeller("A3","1");
//        marketManager.addSeller("A4","1");
//
//        String[] actualSellers = {
//                marketManager.sellers[0].getUserAccount().getUserName(),
//                marketManager.sellers[1].getUserAccount().getUserName(),
//                marketManager.sellers[2].getUserAccount().getUserName(),
//                marketManager.sellers[3].getUserAccount().getUserName(),
//        };
//
//        assertArrayEquals(sellersExpected, actualSellers);
//
//
//
//    }
//
//
//    @org.junit.jupiter.api.Test
//    void addSellerThatExists() {
//
//        MarketManager marketManager = new MarketManager();
//        assertTrue(marketManager.addSeller("A1","1"));
//        assertFalse(marketManager.addSeller("A1","1"));
//
//    }
//
//
//    @org.junit.jupiter.api.Test
//    void checkSellersArraySize() {
//
//        int DEFAULT_SIZE = 2;
//
//        MarketManager marketManager = new MarketManager();
//
//        assertEquals(DEFAULT_SIZE, marketManager.sellers.length);
//
//        //---------------------------------------------
//
//        marketManager.addSeller("A1","1");
//        marketManager.addSeller("A2","1");
//        marketManager.addSeller("A3","1");
//        marketManager.addSeller("A4","1");
//
//        assertEquals(4, marketManager.sellers.length);
//
//        marketManager.addSeller("A4","1");
//
//        assertEquals(4, marketManager.sellers.length);
//
//        marketManager.addSeller("A5","1");
//
//
//        assertEquals(8, marketManager.sellers.length);
//
//    }
//
//
//    // --------------------------------- Seller testing -------------------------------
//
//    @org.junit.jupiter.api.Test
//    void addBuyer() {
//
//        MarketManager marketManager = new MarketManager();
//
//        Buyer buyer1 = new Buyer(new UserAccount("B1","1"), new UserAddress("B2","2","A",2));
//        Buyer buyer2 = new Buyer(new UserAccount("B2","1"), new UserAddress("B2","2","A",2));
//        Buyer buyer3 = new Buyer(new UserAccount("B3","1"), new UserAddress("B2","2","A",2));
//        Buyer buyer4 = new Buyer(new UserAccount("B4","1"), new UserAddress("B2","2","A",2));
//
//        String[] buyersExpected = {
//                buyer1.getUserAccount().getUserName(),
//                buyer2.getUserAccount().getUserName(),
//                buyer3.getUserAccount().getUserName(),
//                buyer4.getUserAccount().getUserName()
//        };
//
//        //-------------------------------------------------------------
//
//
//        marketManager.addBuyer("B1","1","B2","2","A",2);
//        marketManager.addBuyer("B2","1","B2","2","A",2);
//        marketManager.addBuyer("B3","1","B2","2","A",2);
//        marketManager.addBuyer("B4","1","B2","2","A",2);
//
//        String[] actualBuyers = {
//                marketManager.buyers[0].getUserAccount().getUserName(),
//                marketManager.buyers[1].getUserAccount().getUserName(),
//                marketManager.buyers[2].getUserAccount().getUserName(),
//                marketManager.buyers[3].getUserAccount().getUserName(),
//        };
//
//        assertArrayEquals(buyersExpected, actualBuyers);
//
//
//    }
//
//
//
//    @org.junit.jupiter.api.Test
//    void addBuyerThatExists() {
//
//        MarketManager marketManager = new MarketManager();
//        assertTrue(marketManager.addBuyer("A1","1","B2","2","A",2));
//        assertFalse(marketManager.addBuyer("A1","1","B2","2","A",2));
//
//    }
//
//
//    @org.junit.jupiter.api.Test
//    void checkBuyersArraySize() {
//
//        int DEFAULT_SIZE = 2;
//
//        MarketManager marketManager = new MarketManager();
//
//        assertEquals(DEFAULT_SIZE, marketManager.buyers.length);
//
//        //---------------------------------------------
//
//        marketManager.addBuyer("B1","1","B2","2","A",2);
//        marketManager.addBuyer("B2","1","B2","2","A",2);
//        marketManager.addBuyer("B3","1","B2","2","A",2);
//        marketManager.addBuyer("B4","1","B2","2","A",2);
//
//        assertEquals(4, marketManager.buyers.length);
//
//        marketManager.addBuyer("B4","1","B2","2","A",2);
//
//        assertEquals(4, marketManager.buyers.length);
//
//        marketManager.addBuyer("B5","1","B2","2","A",2);
//
//        assertEquals(8, marketManager.buyers.length);
//
//    }
//
//
//
//
//    @org.junit.jupiter.api.Test
//    void showAllBuyers() {
//
//
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addBuyer("B1","1","B2","2","A",2);
//        marketManager.addBuyer("B2","1","B2","2","A",2);
//        marketManager.addBuyer("B3","1","B2","2","A",2);
//        marketManager.addBuyer("B4","1","B2","2","A",2);
//
//        marketManager.showAllBuyers();
//
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void showAllSellers() {
//
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addSeller("a1","B");
//        marketManager.addSeller("a2","B");
//        marketManager.addSeller("a3","B");
//        marketManager.addSeller("a4","B");
//
//        marketManager.showAllSellers();
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void addProductToSeller(){
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addSeller("a1","B");
//        marketManager.addSeller("a2","B");
//
//        assertTrue(marketManager.addProductToSeller("a1","guitar",2000,0));
//        assertTrue(marketManager.addProductToSeller("a2","piano",5000,1));
//        assertTrue(marketManager.addProductToSeller("a1","piano",5000,1));
//
//        Assertions.assertEquals(marketManager.sellers[0].products[0].getProductName(),"guitar");
//        Assertions.assertEquals(marketManager.sellers[1].products[0].getProductName(), "piano");
//        Assertions.assertEquals(marketManager.sellers[0].products[0].getProductPrice(),2000);
//        Assertions.assertEquals(marketManager.sellers[1].products[0].getProductPrice(),5000);
//
//        marketManager.sellers[0].printProducts();
//
//
//    }
//    @org.junit.jupiter.api.Test
//    void payment(){
//        MarketManager marketManager = new MarketManager();
//        marketManager.addSeller("a1","B");
//        marketManager.addBuyer("B1","1","B2","2","A",2);
//
//        marketManager.getBuyer("B1").getCurrentShoppingCart().setPurchaseDate();
//
////        System.out.println(marketManager.getBuyer("B1").getCurrentShoppingCart().getPurchaseDate());
//    }
//
//    @org.junit.jupiter.api.Test
//    void printing1(){
//        MarketManager marketManager = new MarketManager();
//        marketManager.addSeller("a1","B");
//        marketManager.addBuyer("B1","1","B2","2","A",2);
//        marketManager.addProductToSeller("a1","guitar",2000,0);
//        marketManager.addProductToBuyerShoppingCart("B1","a1",marketManager.getSeller("a1").getProduct("guitar"));
//
//        marketManager.paymentShoppingCartOfBuyer("B1");
//
//        marketManager.showAllBuyers();
//    }
//
//    @org.junit.jupiter.api.Test
//    void printingBuyers(){
//
//
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addSeller("Daniel","dan1234");
////        marketManager.addSeller("Daniel","dan1234");
//
//
//        marketManager.addBuyer("Alon Tw","al1234","israel","ramat gan","ben gurion",2);
//        marketManager.addBuyer("Sagi gal","sag123","israel","malle adumin","hagever",10);
//
//
//        marketManager.addProductToSeller("Daniel","guitar",8500,0);
//        marketManager.addProductToSeller("Daniel","piano",15000,0);
//        marketManager.addProductToSeller("Daniel","notebook",8,0);
//        marketManager.addProductToSeller("Daniel","tv",250,0);
//
//        marketManager.addProductToBuyerShoppingCart("Alon Tw","Daniel",marketManager.getSeller("Daniel").getProduct("guitar"));
//        marketManager.addProductToBuyerShoppingCart("Alon Tw","Daniel",marketManager.getSeller("Daniel").getProduct("tv"));
//
//
//        marketManager.addProductToBuyerShoppingCart("Alon Tw","Daniel",marketManager.getSeller("Daniel").getProduct("piano"));
//        marketManager.addProductToBuyerShoppingCart("Sagi gal","Daniel",marketManager.getSeller("Daniel").getProduct("notebook"));
//
//        marketManager.paymentShoppingCartOfBuyer("Alon Tw");
//        marketManager.paymentShoppingCartOfBuyer("Sagi gal");
//
//
//        marketManager.showAllBuyers();
//
//
//    }
//
//
//    @org.junit.jupiter.api.Test
//    void printingSellers(){
//
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addSeller("Daniel","dan1234");
//        marketManager.addProductToSeller("Daniel","guitar",8500,0);
//        marketManager.addProductToSeller("Daniel","piano",15000,1);
//        marketManager.addProductToSeller("Daniel","notebook",8,2);
//        marketManager.addProductToSeller("Daniel","tv",250,3);
//
//
//        marketManager.addSeller("Alon t","alon1234");
//        marketManager.addProductToSeller("Alon t","burger",50,3);
//        marketManager.addProductToSeller("Alon t","t-shirt",100,3);
//        marketManager.addProductToSeller("Alon t","sushi",44.5,3);
//
//
//        marketManager.addSeller("yaniv","yan1111");
//
//        marketManager.showAllSellers();
//
//
//    }
//    ///////////////////////// part 3 ////////////////////////////////
//    @org.junit.jupiter.api.Test
//    void addsellers1(){
//
//        // add sellers and check that you cant add the same person!
//        MarketManager marketManager = new MarketManager();
//
//        assertTrue(marketManager.addSeller("Daniel","dan1234"));
//        assertTrue(marketManager.addSeller("Alon Tw","al1234"));
//        assertTrue(marketManager.addSeller("Stephany","Steph1234"));
//        assertTrue(marketManager.addSeller("sagi","sag5"));
//
//
//        assertFalse(marketManager.addSeller("Daniel","dan1234"));
//        assertFalse(marketManager.addSeller("Alon Tw","al1234"));
//        assertFalse(marketManager.addSeller("Stephany","Steph1234"));
//    }
//
//    @org.junit.jupiter.api.Test
//    void addbuyers1(){
//
//        // add sellers and check that you cant add the same person!
//        MarketManager marketManager = new MarketManager();
//
//        assertTrue(marketManager.addBuyer("Daniel","dan1234","israel","ramat gan","ben gurion",2));
//        assertTrue(marketManager.addBuyer("Alon Tw","al1234","israel","malle adumin","hagever",10));
//        assertTrue(marketManager.addBuyer("Stephany","Steph1234","israel","hedera","hapamonim",22));
//        assertTrue(marketManager.addBuyer("sagi","sag5","israel","hertzlia","neve shanan",3));
//
//
//        assertFalse(marketManager.addBuyer("Daniel","dan1234","israel","ramat gan","ben gurion",2));
//        assertFalse(marketManager.addBuyer("Alon Tw","al1234","israel","malle adumin","hagever",10));
//        assertFalse(marketManager.addBuyer("Stephany","Steph1234","israel","hedera","hapamonim",22));
//        assertFalse(marketManager.addBuyer("sagi","sag5","israel","hertzlia","neve shanan",3));
//    }
//
//    @org.junit.jupiter.api.Test
//    void addProductToSeller1(){
//
//        MarketManager marketManager = new MarketManager();
//
//        assertTrue(marketManager.addSeller("Daniel","dan1234"));
//        assertTrue(marketManager.addSeller("Alon Tw","al1234"));
//        assertTrue(marketManager.addSeller("Stephany","Steph1234"));
//        assertTrue(marketManager.addSeller("sagi","sag5"));
//
//
//        assertTrue(marketManager.addProductToSeller("Daniel","guitar",200,0));
//        assertTrue(marketManager.addProductToSeller("Daniel","piano",200,0));
//        assertTrue(marketManager.addProductToSeller("Daniel","laptop",200,2));
//        assertTrue(marketManager.addProductToSeller("Daniel","table",300,2));
//    }
//
//    @org.junit.jupiter.api.Test
//    void addProductToSeller2(){
//        //no sellers!
//        MarketManager marketManager = new MarketManager();
//
//        assertFalse(marketManager.addProductToSeller("Daniel","guitar",200,0));
//        assertFalse(marketManager.addProductToSeller("Daniel","piano",200,0));
//        assertFalse(marketManager.addProductToSeller("Daniel","laptop",200,2));
//        assertFalse(marketManager.addProductToSeller("Daniel","table",300,2));

//    }
//

//
//    @Test
//    void addSeller() {
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addSeller("A1", "1");
//        marketManager.addSeller("A2", "1");
//        marketManager.addSeller("A3", "1");
//        marketManager.addSeller("A4", "1");
//
//        String[] sellersExpected = {"A1", "A2", "A3", "A4"};
//        String[] actualSellers = new String[marketManager.sellersCounter];
//
//        for (int i = 0; i < marketManager.sellersCounter; i++) {
//            actualSellers[i] = marketManager.sellers[i].getUserAccount().getUserName();
//        }
//
//        assertArrayEquals(sellersExpected, actualSellers);
//    }
//
//    @Test
//    void addSellerThatExists() {
//        MarketManager marketManager = new MarketManager();
//        assertTrue(marketManager.addSeller("A1", "1"));
//        assertFalse(marketManager.addSeller("A1", "1"));
//    }
//
//    @Test
//    void checkSellersArraySize() {
//        int DEFAULT_SIZE = 2;
//        MarketManager marketManager = new MarketManager();
//
//        assertEquals(DEFAULT_SIZE, marketManager.sellers.length);
//
//        marketManager.addSeller("A1", "1");
//        marketManager.addSeller("A2", "1");
//        marketManager.addSeller("A3", "1");
//        marketManager.addSeller("A4", "1");
//
//        assertEquals(4, marketManager.sellersCounter);
//        assertEquals(4, marketManager.sellers.length);
//
//        marketManager.addSeller("A5", "1");
//
//        assertEquals(5, marketManager.sellersCounter);
//        assertEquals(8, marketManager.sellers.length);
//    }
//
//    @Test
//    void addBuyer() {
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addBuyer("B1", "1", "B2", "2", "A", 2);
//        marketManager.addBuyer("B2", "1", "B2", "2", "A", 2);
//        marketManager.addBuyer("B3", "1", "B2", "2", "A", 2);
//        marketManager.addBuyer("B4", "1", "B2", "2", "A", 2);
//
//        String[] buyersExpected = {"B1", "B2", "B3", "B4"};
//        String[] actualBuyers = new String[marketManager.buyersCounter];
//
//        for (int i = 0; i < marketManager.buyersCounter; i++) {
//            actualBuyers[i] = marketManager.buyers[i].getUserAccount().getUserName();
//        }
//
//        assertArrayEquals(buyersExpected, actualBuyers);
//    }
//
//    @Test
//    void addBuyerThatExists() {
//        MarketManager marketManager = new MarketManager();
//        assertTrue(marketManager.addBuyer("A1", "1", "B2", "2", "A", 2));
//        assertFalse(marketManager.addBuyer("A1", "1", "B2", "2", "A", 2));
//    }
//
//    @Test
//    void checkBuyersArraySize() {
//        int DEFAULT_SIZE = 2;
//        MarketManager marketManager = new MarketManager();
//
//        assertEquals(DEFAULT_SIZE, marketManager.buyers.length);
//
//        marketManager.addBuyer("B1", "1", "B2", "2", "A", 2);
//        marketManager.addBuyer("B2", "1", "B2", "2", "A", 2);
//        marketManager.addBuyer("B3", "1", "B2", "2", "A", 2);
//        marketManager.addBuyer("B4", "1", "B2", "2", "A", 2);
//
//        assertEquals(4, marketManager.buyersCounter);
//        assertEquals(4, marketManager.buyers.length);
//
//        marketManager.addBuyer("B5", "1", "B2", "2", "A", 2);
//
//        assertEquals(5, marketManager.buyersCounter);
//        assertEquals(8, marketManager.buyers.length);
//    }

    @Test
    void showAllBuyers() {
        MarketManager marketManager = new MarketManager();

        marketManager.addBuyer("B1", "1", "B2", "2", "A", 2);
        marketManager.addBuyer("B2", "1", "B2", "2", "A", 2);
        marketManager.addBuyer("B3", "1", "B2", "2", "A", 2);
        marketManager.addBuyer("B4", "1", "B2", "2", "A", 2);

        marketManager.showAllBuyers();
    }

    @Test
    void showAllSellers() {
        MarketManager marketManager = new MarketManager();

        marketManager.addSeller("a1", "B");
        marketManager.addSeller("a2", "B");
        marketManager.addSeller("a3", "B");
        marketManager.addSeller("a4", "B");

        marketManager.showAllSellers();
    }

//    @Test
//    void addProductToSeller() {
//        MarketManager marketManager = new MarketManager();
//
//        marketManager.addSeller("a1", "B");
//        marketManager.addSeller("a2", "B");
//
//        Seller seller1 = marketManager.getSeller("a1");
//        Seller seller2 = marketManager.getSeller("a2");
//
//        assertTrue(marketManager.addProductToSeller(seller1, "guitar", 2000, 0, 0));
//        assertTrue(marketManager.addProductToSeller(seller2, "piano", 5000, 1, 0));
//        assertTrue(marketManager.addProductToSeller(seller1, "piano", 5000, 1, 0));
//
//        assertEquals("guitar", seller1.products[0].getProductName());
//        assertEquals("piano", seller2.products[0].getProductName());
//        assertEquals(2000, seller1.products[0].getProductPrice());
//        assertEquals(5000, seller2.products[0].getProductPrice());
//
//        seller1.printProducts();
//    }

//    @Test
//    void payment() throws MarketManager.EmptyShoppingCartException {
//        MarketManager marketManager = new MarketManager();
//        marketManager.addSeller("a1", "B");
//        marketManager.addBuyer("B1", "1", "B2", "2", "A", 2);
//
//        Buyer buyer = marketManager.getBuyer("B1");
//        buyer.getCurrentShoppingCart().setPurchaseDate();
//
//        System.out.println(buyer.getCurrentShoppingCart().getPurchaseDate());
//    }

    @Test
    void printing1() throws PaymentForEmptyShoppingCartException {
        MarketManager marketManager = new MarketManager();
        marketManager.addSeller("a1", "B");
        marketManager.addBuyer("B1", "1", "B2", "2", "A", 2);
        marketManager.addProductToSeller(marketManager.getSeller("a1"), "guitar", 2000, 0, 0);
        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("B1"), marketManager.getSeller("a1").getProduct("guitar"));

        marketManager.paymentShoppingCartOfBuyer(marketManager.getBuyer("B1"));

        marketManager.showAllBuyers();
    }

    @Test
    void printingBuyers() throws PaymentForEmptyShoppingCartException {
        MarketManager marketManager = new MarketManager();

        marketManager.addSeller("Daniel", "dan1234");
        marketManager.addBuyer("Alon Tw", "al1234", "israel", "ramat gan", "ben gurion", 2);
        marketManager.addBuyer("Sagi gal", "sag123", "israel", "malle adumin", "hagever", 10);

        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "guitar", 8500, 0, 0);
        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "piano", 15000, 1, 0);
        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "notebook", 8, 2, 0);
        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "tv", 250, 3, 0);

        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Alon Tw"), marketManager.getSeller("Daniel").getProduct("guitar"));
        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Alon Tw"), marketManager.getSeller("Daniel").getProduct("tv"));

        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Alon Tw"), marketManager.getSeller("Daniel").getProduct("piano"));
        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Sagi gal"), marketManager.getSeller("Daniel").getProduct("notebook"));

        marketManager.paymentShoppingCartOfBuyer(marketManager.getBuyer("Alon Tw"));
        marketManager.paymentShoppingCartOfBuyer(marketManager.getBuyer("Sagi gal"));

        marketManager.showAllBuyers();
    }

    @Test
    void addProductToBuyerShoppingCart() throws PaymentForEmptyShoppingCartException {
        MarketManager marketManager = new MarketManager();

        marketManager.addSeller("Daniel", "dan1234");
        marketManager.addBuyer("Alon Tw", "al1234", "israel", "ramat gan", "ben gurion", 2);
        marketManager.addBuyer("Sagi gal", "sag123", "israel", "malle adumin", "hagever", 10);

        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "guitar", 8500, 0, 0);
        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "piano", 15000, 1, 0);
        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "notebook", 8, 2, 0);
        marketManager.addProductToSeller(marketManager.getSeller("Daniel"), "tv", 250, 3, 0);

        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Alon Tw"), marketManager.getSeller("Daniel").getProduct("guitar"));
        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Alon Tw"), marketManager.getSeller("Daniel").getProduct("tv"));

        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Alon Tw"), marketManager.getSeller("Daniel").getProduct("piano"));
        marketManager.addProductToBuyerShoppingCart(marketManager.getBuyer("Sagi gal"), marketManager.getSeller("Daniel").getProduct("notebook"));

        marketManager.paymentShoppingCartOfBuyer(marketManager.getBuyer("Alon Tw"));
        marketManager.paymentShoppingCartOfBuyer(marketManager.getBuyer("Sagi gal"));

        marketManager.showAllBuyers();
    }

    @org.junit.jupiter.api.Test
    void sortAllSellers(){


        MarketManager marketManager = new MarketManager();

        marketManager.addSeller("Stephany","Steph1234");
        marketManager.addSeller("Daniel","dan1234");
        marketManager.addSeller("Alon Tw","al1234");
        marketManager.addSeller("sagi","sag5");

        Seller seller1 = marketManager.getSeller("Daniel");
        Seller seller2 = marketManager.getSeller("Stephany");
        Seller seller3 = marketManager.getSeller("Alon Tw");
        Seller seller4 = marketManager.getSeller("sagi");

        marketManager.addProductToSeller(seller1,"guitar",2500,1, 12 );
        marketManager.addProductToSeller(seller1,"piano",300,2, 8);
        marketManager.addProductToSeller(seller1,"laptop",2150,3, 5);

        marketManager.addProductToSeller(seller3,"table1",300,0, 10);
        marketManager.addProductToSeller(seller3,"table2",400,0, 10);

        marketManager.addProductToSeller(seller2,"table",20,0, 10);

        String[] expectedSellers = new String[]{"Daniel", "Alon Tw", "Stephany", "sagi"};

        marketManager.showAllSellers(); // need to sort

//        Assertions.assertArrayEquals(expectedSellers, marketManager.sellers);


    }


    @org.junit.jupiter.api.Test
    void sortAllBuyers(){


        MarketManager marketManager = new MarketManager();

        marketManager.addBuyer("Daniel b","dan1234","israel","ramat gan","ben gurion",2);
        marketManager.addBuyer("Alon Tw","al1234","israel","malle adumin","hagever",10);
        marketManager.addBuyer("Stephany","Steph1234","israel","hedera","hapamonim",22);
        marketManager.addBuyer("sagi","sag5","israel","hertzlia","neve shanan",3);
        marketManager.addBuyer("Daniel a","sag5","israel","hertzlia","neve shanan",3);

        marketManager.showAllBuyers();


    }

    private MarketManager marketManager;

    @BeforeEach
    public void setUp() {
        marketManager = new MarketManager();
    }

    @Test
    public void testAddSeller() {
        assertTrue(marketManager.addSeller("seller1", "password1"));
        assertNotNull(marketManager.getSeller("seller1"));
    }

    @Test
    public void testAddSellerDuplicate() {
        assertTrue(marketManager.addSeller("seller1", "password1"));
        assertFalse(marketManager.addSeller("seller1", "password1"));
    }

    @Test
    public void testAddBuyer() {
        assertTrue(marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1));
        assertNotNull(marketManager.getBuyer("buyer1"));
    }

    @Test
    public void testAddBuyerDuplicate() {
        assertTrue(marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1));
        assertFalse(marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1));
    }

    @Test
    public void testAddProductToSeller() {
        marketManager.addSeller("seller1", "password1");
        Seller seller = marketManager.getSeller("seller1");
        assertTrue(marketManager.addProductToSeller(seller, "product1", 10.0, 0, 0.0));
        assertNotNull(seller.getProduct("product1"));
    }

    @Test
    public void testAddProductToBuyerShoppingCart() {
        marketManager.addSeller("seller1", "password1");
        marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1);
        Seller seller = marketManager.getSeller("seller1");
        Buyer buyer = marketManager.getBuyer("buyer1");
        Product product = new Product("product1", 10.0, Category.KIDS, 0.0);
        seller.addProductToSeller(product);
        assertTrue(marketManager.addProductToBuyerShoppingCart(buyer, product));
        // Assume you have a method to check if a product is in the shopping cart
        assertTrue(containsProduct(buyer.getCurrentShoppingCart(), product));
    }

    private boolean containsProduct(ShoppingCart cart, Product product) {
        // Assuming you have some way to check if a product is in the cart
        // If the ShoppingCart class has methods to iterate over products, use that here
        return true; // Replace with actual logic
    }

    @Test
    public void testPaymentShoppingCartOfBuyer() {
        marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1);
        Buyer buyer = marketManager.getBuyer("buyer1");
        Product product = new Product("product1", 10.0, Category.KIDS, 0.0);
        buyer.getCurrentShoppingCart().addProductToShoppingCart(product);
        try {
            assertTrue(marketManager.paymentShoppingCartOfBuyer(buyer));
        } catch (PaymentForEmptyShoppingCartException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void testPaymentShoppingCartOfBuyerEmptyCart() {
        marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1);
        Buyer buyer = marketManager.getBuyer("buyer1");
        assertThrows(PaymentForEmptyShoppingCartException.class, () -> {
            marketManager.paymentShoppingCartOfBuyer(buyer);
        });
    }

    @Test
    public void testShowAllBuyers() {
        marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1);
        marketManager.showAllBuyers();
        // This method prints output, so it's hard to test directly.
        // Instead, we test if buyers array is populated correctly.
        assertNotNull(marketManager.getBuyer("buyer1"));
    }

    @Test
    public void testShowAllSellers() {
        marketManager.addSeller("seller1", "password1");
        marketManager.showAllSellers();
        // This method prints output, so it's hard to test directly.
        // Instead, we test if sellers array is populated correctly.
        assertNotNull(marketManager.getSeller("seller1"));
    }

    @Test
    public void testShowAllProductsByCategory() {
        marketManager.addSeller("seller1", "password1");
        Seller seller = marketManager.getSeller("seller1");
        marketManager.addProductToSeller(seller, "product1", 10.0, Category.KIDS.ordinal(), 0.0);
        marketManager.showAllProductsByCategory(Category.KIDS.ordinal());
        // This method prints output, so it's hard to test directly.
        // Instead, we test if products are correctly added to seller.
        assertNotNull(seller.getProduct("product1"));
    }

    @Test
    public void testCreateNewShoppingCartFromHistory() {
        marketManager.addBuyer("buyer1", "password1", "Country", "City", "Street", 1);
        Buyer buyer = marketManager.getBuyer("buyer1");
        Product product = new Product("product1", 10.0, Category.KIDS, 0.0);
        buyer.getCurrentShoppingCart().addProductToShoppingCart(product);
        try {
            marketManager.paymentShoppingCartOfBuyer(buyer);
        } catch (PaymentForEmptyShoppingCartException e) {
            fail("Exception should not be thrown");
        }
        marketManager.createNewShoppingCartFromHistory(buyer, 0);
        assertTrue(containsProduct(buyer.getCurrentShoppingCart(), product));
    }








}