package com.sneaker.sneakerstore.sneaker.sneakerShop.services;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Store;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStore;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStoreService;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

//MongoDB StoreService

public class StoreService implements IStoreService {

    private MongoClient mongoClient;

    private MongoCollection<Document> db;
    private static final String name = "name";
    private static final String street = "street";
    private static final String city = "city";
    private static final String zip = "zip";



    private static final String USER_NAME = "agarc179";
    private static final String PASSWORD = "Ag490527";
    private static final String MONGO_URL = "mongodb://"+USER_NAME+":"+PASSWORD+"@ds033196.mlab.com:33196/sneaker-store-db";
    private static final String COLLECTION_NAME = "storeLocation";

    public StoreService(){
        MongoClientURI uri = new MongoClientURI(MONGO_URL);
        mongoClient = new MongoClient(uri);

        db = mongoClient.getDatabase(uri.getDatabase()).getCollection(COLLECTION_NAME);
    }

    @Override
    public List<IStore> getAllStores() {
        List<IStore> stores = new ArrayList<>();
        FindIterable<Document> it = db.find();
        it.forEach(new Block<Document>() {
            @Override
            public void apply(Document d) {
                Store s = new Store();
                s.setName(d.get(name, String.class));
                s.setCity(d.get(street, String.class));
                s.setStreet(d.get(city, String.class));
                s.setZip(d.get(zip, String.class));
                stores.add(s);
            }
        });
        return stores;
    }

    @Override
    public List<IStore> getStore(String zipCode) {
        List<IStore> stores = new ArrayList<>();
        FindIterable<Document> it = db.find();
        it.forEach(new Block<Document>() {
            @Override
            public void apply(Document d) {
                Store s = new Store();
                s.setName(d.get(name, String.class));
                s.setStreet(d.get(street, String.class));
                s.setCity(d.get(city, String.class));
                s.setZip(d.get(zip, String.class));
                if(s.getZip().equals(zipCode)){
                    stores.add(s);
                }

            }
        });
        return stores;
    }
}
