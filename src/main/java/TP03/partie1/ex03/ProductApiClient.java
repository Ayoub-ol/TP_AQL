package TP03.partie1.ex03;

public interface ProductApiClient {
    Product getProduct(String productId) throws ApiCallFailureException, IncompatibleDataFormatException;
}