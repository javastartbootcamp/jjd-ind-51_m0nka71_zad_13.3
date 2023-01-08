package pl.javastart.task;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String firstFileName = "src/main/resources/currencies.csv";
        String secondFileName = "src/main/resources/products.csv";

        List<Product> products = FileUtils.readProducts(secondFileName);
        List<Currency> currencies = FileUtils.readCurrency(firstFileName);

        List<Product> productsWithEuroPrice = ProductUtils.getProductsWithEuroPrice(products, currencies);

        BigDecimal sum =  ProductUtils.sumOfProductsInEuro(productsWithEuroPrice);
        System.out.println("Suma wszystkich produktów w EUR: " + sum);

        BigDecimal meanValue = ProductUtils.calculateMeanValueOfProductInEur(productsWithEuroPrice);
        System.out.println("Średnia: " + meanValue);

        BigDecimal highestNumber = ProductUtils.findHighestPriceOfProductInEur(productsWithEuroPrice);
        System.out.println("Najwyższa cena w EUR: " + highestNumber);

        BigDecimal lowestNumber = ProductUtils.findLowestPriceOfProductInEur(productsWithEuroPrice);
        System.out.println("Najniższa cena w EUR: " + lowestNumber);

    }
}
