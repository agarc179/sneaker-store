package com.sneaker.sneakerstore.sneaker.nosql;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.sneaker.sneakerstore.sneaker.ISneaker;
import com.sneaker.sneakerstore.sneaker.ISneakerService;
import com.sneaker.sneakerstore.sneaker.jdbc.Sneaker;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class SneakerService implements ISneakerService {
    private MongoClient mongoClient;

    private MongoCollection<Document> db;
    private static final String id = "id";
    private static final String name = "name";
    private static final String brand = "brand";
    private static final String color = "color";
    private static final String size = "size";
    private static final String type = "type";
    private static final String price = "price";
    private static final String gender = "gender";



    private static final String USER_NAME = "agarc179";
    private static final String PASSWORD = "Ag490527";
    private static final String MONGO_URL = "mongodb://"+USER_NAME+":"+PASSWORD+"@ds033196.mlab.com:33196/sneaker-store-db";
    private static final String COLLECTION_NAME = "sneaker";

    public SneakerService() {
        MongoClientURI uri = new MongoClientURI(MONGO_URL);
        mongoClient = new MongoClient(uri);

        db = mongoClient.getDatabase(uri.getDatabase()).getCollection(COLLECTION_NAME);
    }

    @Override
    public void deleteSneaker(int sneakerId) {

    }

    @Override
    public List<ISneaker> getAllSneakers() {
        List<ISneaker> sneakers = new ArrayList<>();
        FindIterable<Document> it = db.find();
        it.forEach(new Block<Document>() {
            @Override
            public void apply(Document d) {
                Sneaker s = new Sneaker();
                s.setId(d.get(id, String.class));
                s.setName(d.get(name, String.class));
                s.setBrand(d.get(brand, String.class));
                s.setColor(d.get(color, String.class));
                s.setSize(d.get(size, String.class));
                s.setType(d.get(type, String.class));
                s.setPrice(d.get(price, String.class));
                s.setGender(d.get(gender, String.class));
                sneakers.add(s);
            }
        });
        return sneakers;
    }

    @Override
    public void saveSneaker(ISneaker sneaker) {
        db.insertOne(new Document().
                append(id, sneaker.getId()).
                append(name, sneaker.getName()).
                append(brand, sneaker.getBrand()).
                append(color, sneaker.getColor()).
                append(size, sneaker.getSize()).
                append(type, sneaker.getType()).
                append(price, sneaker.getPrice()).
                append(gender, sneaker.getGender()));

    }
}
