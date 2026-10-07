package com.tp.soap.service;

import com.tp.soap.model.Produit;
import jakarta.jws.WebService;

@WebService(
        endpointInterface = "com.tp.soap.service.StockService",
        serviceName = "StockService"
)
public class StockServiceImpl implements StockService {

    @Override
    public Produit chercherProduit(Long id) {
        if (id == 10) {
            return new Produit(10L, "Unité Centrale i7", 750.00);
        }
        return null;
    }
}
