package pl.javastart.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    static List<Product> readProducts(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        List<Product> items = new ArrayList<>();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] split = line.split(";");
            Product nextProduct = new Product(split[0], new BigDecimal(split[1]), split[2]);
            items.add(nextProduct);
        }
        return items;
    }

    static List<Currency> readCurrency(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        List<Currency> currencies = new ArrayList<>();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] split = line.split(";");
            Currency nextCurrency = new Currency(split[0], new BigDecimal(split[1]));
            currencies.add(nextCurrency);
        }
        return currencies;
    }
}
