package pl.javastart.task;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public class ProductUtils {

    static List<Product> getProductsWithEuroPrice(List<Product> products, List<Currency> currencies) {
        List<Product> productsEuro = new ArrayList<>();
        for (Product product : products) {
            BigDecimal productPrice = product.getPrice();
            BigDecimal currency1 = getCurrencyByCode(product.getCurrency(), currencies);
            BigDecimal euroPrice = productPrice.divide(currency1, MathContext.DECIMAL64);
            Product newProducts = new Product(product.getName(), euroPrice, product.getCurrency());
            productsEuro.add(newProducts);
        }
        return productsEuro;
    }

    private static BigDecimal getCurrencyByCode(String currencyCode, List<Currency> currencies) {
        for (Currency currency : currencies) {
            if (currency.getCountryCode().equals(currencyCode)) {
                return currency.getRate();
            }
        }
        return null;
    }

    static BigDecimal sumOfProductsInEuro(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            sum = sum.add(product.getPrice());
        }
        return sum;
    }

    static BigDecimal calculateMeanValueOfProductInEur(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        int counter = 0;
        for (Product product : products) {
            sum = sum.add(product.getPrice());
            counter++;
        }
        return sum.divide(new BigDecimal(counter), MathContext.DECIMAL64);
    }

    static BigDecimal findHighestPriceOfProductInEur(List<Product> products) {
        BigDecimal highestNumber = BigDecimal.ZERO;
        for (Product product : products) {
            highestNumber = highestNumber.max(product.getPrice());
        }
        return highestNumber;
    }

    static BigDecimal findLowestPriceOfProductInEur(List<Product> products) {
        for (Product product : products) {
            BigDecimal lowestNumber1 = product.getPrice();
            return lowestNumber1.min(product.getPrice());
        }
        return null;
    }
}
