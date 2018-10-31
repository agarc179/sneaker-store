//package com.sneaker.sneakerstore.sneaker.sneakerShop.nosql;
//
//import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.ISneaker;
//import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStore;
//import com.sneaker.sneakerstore.sneaker.sneakerShop.jdbc.Sneaker;
//
//import java.util.List;
//import java.util.Random;
//
//
//public class Main {
//
//    public static void main(String[] args){
//        Main main = new Main();
//        //main.createNewSneaker();
//        //main.showEntities();
//        //main.showStore("60605");
//
//    }
//
//    private void createNewSneaker(){
//        Random rnd = new Random();
//        int idInt = 100000 + rnd.nextInt(900000);
//
//        SneakerService services = new SneakerService();
//        Sneaker sneaker = new Sneaker();
//        sneaker.setName("Travis Scott Air Jordan IV");
//        sneaker.setId(sneaker.getName().substring(0, 3) + idInt);
//        sneaker.setBrand("Jordan");
//        sneaker.setColor("Light Blue");
//        sneaker.setSize("8.5");
//        sneaker.setType("Street");
//        sneaker.setPrice("225");
//        sneaker.setGender("male");
//        services.saveSneaker(sneaker);
//    }
//
//    private void showEntities(){
//        SneakerService service = new SneakerService();
//        List<ISneaker> sneakers = service.getAllSneakers();
//
//        System.out.println("");
//        System.out.println("---Sneaker Collection---");
//        for(ISneaker sneaker: sneakers){
//            if(sneaker.getBrand().equals("nike")){
//                System.out.println(sneaker.getId() + ", " + sneaker.getName() + ", " + sneaker.getBrand() + ", " + sneaker.getColor());
//            }
//            //System.out.println(sneaker.getId() + ", " + sneaker.getName() + ", " + sneaker.getBrand() + ", " + sneaker.getColor());
//        }
//
//    }
//
////    private void showStore(String zip){
////        StoreService service = new StoreService();
////        List<IStore> stores = service.getStore(zip);
////
////        System.out.println("");
////        System.out.println("---Store collection based on zipCode: " + zip);
////        for(IStore store: stores){
////            System.out.println(store.getName() + ", " + store.getZip());
////        }
////    }
//}
