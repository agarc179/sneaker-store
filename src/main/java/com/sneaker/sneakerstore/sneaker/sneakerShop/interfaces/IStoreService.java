package com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces;

import java.util.List;

public interface IStoreService {

    List<IStore> getAllStores();

    List<IStore> getStore(String zip);
}
