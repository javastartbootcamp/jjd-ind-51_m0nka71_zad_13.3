package pl.javastart.task;

import java.math.BigDecimal;
import java.util.List;

public class ProductUtils {
    static Currency currency;

    static BigDecimal calculateSumOfProductsEur(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        BigDecimal result = BigDecimal.ZERO;
        for (Product product : products) {
            if (product.getCurrency().equals(currency.getCountryCode())) {
                BigDecimal number = product.getPrice();
                BigDecimal number2 = currency.getRate();
                result = number.divide(number2);
            }
            sum = sum.add(result);
        }
        return sum;
    }

    static void calculateMeanValueOfProductsInEur() {
    }

    static void findHighestPriceOfProductInEur() {
    }

    static void findLowestPriceOfProductInEur() {
    }

}
