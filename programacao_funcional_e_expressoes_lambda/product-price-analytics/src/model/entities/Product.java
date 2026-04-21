package model.entities;

public class Product {

    private String productNames;
    private Double productPrices;

    public Product() {
    }

    public Product(String productNames, Double productPrices) {
        this.productNames = productNames;
        this.productPrices = productPrices;
    }

    public String getProductNames() {
        return productNames;
    }

    public void setProductNames(String productNames) {
        this.productNames = productNames;
    }

    public Double getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(Double productPrices) {
        this.productPrices = productPrices;
    }

    @Override
    public String toString() {
        return  productNames
                + ", "
                + String.format("%.2f", productPrices);
    }
}
