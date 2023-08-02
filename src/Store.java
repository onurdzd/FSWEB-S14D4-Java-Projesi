import ProductForSaleFile.Bread;
import ProductForSaleFile.Chocolate;
import ProductForSaleFile.Coke;
import ProductForSaleFile.ProductForSale;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products= {new Chocolate("çikolata",50,"bitter çikolata",false),new Coke("kola",20,"kokakola","siyah"),new Bread("ekmek",10,"ekmek",3)};

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        Arrays.stream(products).forEach(product -> product.showDetails());
    }
}