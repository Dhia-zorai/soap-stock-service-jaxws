package com.tp.soap.service;

import com.tp.soap.model.Produit;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


//kan fama fi a5er lien &quot 7atina " fi blastou
@WebService(targetNamespace = "http://service.stock.tp.com/")
public interface StockService {

    @WebMethod
    Produit chercherProduit(@WebParam(name = "id") Long id) throws ProduitInexistantException;
}
