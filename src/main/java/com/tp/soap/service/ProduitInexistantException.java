package com.tp.soap.service;

import jakarta.xml.ws.WebFault;

@WebFault(name = "ProduitInexistantFault", targetNamespace = "http://service.stock.tp.com/")
public class ProduitInexistantException extends Exception {
    private String codeErreur;

    public ProduitInexistantException(String message, String codeErreur) {
        super(message);
        this.codeErreur = codeErreur;
    }
    public String getCodeErreur() { return codeErreur; }
}