package pl.javastart.task;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String firstFileName = "src/main/resources/currencies.csv";
        String secondFileName = "src/main/resources/products.csv";

        List<Product> products = FileUtils.readProducts(secondFileName);
        List<Currency> currencies = FileUtils.readCurrency(firstFileName);

        ProductUtils.calculateSumOfProductsEur(products);
        System.out.println(ProductUtils.calculateSumOfProductsEur(products));

    }
}
