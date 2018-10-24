//package com.sneaker.sneakerstore.sneaker.sneakerShop.jpa;
//
//import com.sneaker.sneakerstore.sneaker.ISneaker;
//import com.sneaker.sneakerstore.sneaker.ISneakerService;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.List;
//
//public class SneakerService implements ISneakerService {
//
//    private EntityManager em;
//
//    public SneakerService() {
//        em = Persistence.createEntityManagerFactory("jpa-demoPU").createEntityManager();
//    }
//
//
//    @Override
//    public void deleteSneaker(int sneakerId) {
//        EntityTransaction tx = em.getTransaction();
//
//        // begins the delete sql query
//        tx.begin();
//        Sneaker sneaker = em.find(Sneaker.class, sneakerId);
//        em.remove(sneaker);
//        tx.commit();
//    }
//
//    @Override
//    public List<ISneaker> getAllSneakers() {
//        return em.createNamedQuery("findAllSneakers").getResultList();
//    }
//
//    @Override
//    public void saveSneaker(ISneaker sneaker) {
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//        ISneaker sneakerToUpdate;
//        if((sneaker.getId() != null) && (sneaker.getId().length() > 0)) {
//        sneakerToUpdate = em.find(Sneaker.class, sneaker.getId());
//        sneakerToUpdate.setName(sneaker.getName());
//        sneakerToUpdate.setBrand(sneaker.getBrand());
//        sneakerToUpdate.setColor(sneaker.getColor());
//        sneakerToUpdate.setSize(sneaker.getSize());
//        sneakerToUpdate.setType(sneaker.getType());
//        sneakerToUpdate.setPrice(sneaker.getPrice());
//        sneaker.setGender(sneaker.getGender());
//
//        }
//    }
//}
