package com.sneaker.sneakerstore.sneaker;

import java.util.List;

public interface ISneakerService {

    void deleteSneaker(int sneakerId);

    List<ISneaker> getAllSneakers();

    void saveSneaker(ISneaker sneaker);

}
