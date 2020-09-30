package com.ortiz.repasoxd;

public class Objeto {
    String Producto;
    String Garantia;
    String Electro;
    String Stock;
    String Rank;

    public Objeto(String producto, String garantia, String electro, String stock, String rank) {
        Producto = producto;
        Garantia = garantia;
        Electro = electro;
        Stock = stock;
        Rank = rank;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        Producto = producto;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String garantia) {
        Garantia = garantia;
    }

    public String getElectro() {
        return Electro;
    }

    public void setElectro(String electro) {
        Electro = electro;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }
}
