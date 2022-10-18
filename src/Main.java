import laden.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Product> calculateDiscount(List<Product> list)
    {
        List<Product> discountPriceList = new ArrayList<>();
        for(Product s: list)
        {
            discountPriceList.add(new Product(s.getDiscountPrice(), s.getAge()));
        }
        return discountPriceList;
    }

    public static List<Product> expensiveItems(List<Product> list)
    {
        List<Product> discountPriceList = new ArrayList<>();
        for(Product s: list)
        {
            if(s.getBasePrice() > 100)
                discountPriceList.add(s);
        }
        return discountPriceList;
    }

    public static List<Product> sortByDiscountPrice(List<Product> list)
    {
        List<Product> discountPriceList;
        discountPriceList = calculateDiscount(list);
        discountPriceList.sort(Comparator.comparingDouble(Product::getBasePrice));
        return discountPriceList;
    }
    public static Product cheapestProduct(List<Product> list)
    {
        Product minProd = new Product(0,0);
        double minPrice = list.get(1).getBasePrice();
        for(Product s: list)
        {
            if(s.getBasePrice() < minPrice)
            {
                minPrice = s.getBasePrice();
                minProd = s;
            }
        }
        return minProd;
    }

    public static Product mostExpensiveProduct(List<Product> list)
    {
        Product maxProd = new Product(0,0);
        double maxPrice = list.get(1).getBasePrice();
        for(Product s: list)
        {
            if(s.getBasePrice() > maxPrice)
            {
                maxPrice = s.getBasePrice();
                maxProd = s;
            }
        }
        return maxProd;
    }

    public static void printList(List<Product> list)
    {
        for(Product p: list)
        {
            System.out.printf("%.2f, ", p.getBasePrice());
            System.out.println(p.getAge());
        }
    }

    public static void printProduct(Product p)
    {
        System.out.printf("%.2f, ", p.getBasePrice());
        System.out.println(p.getAge());
    }

    public static void main(String[] args)
    {
        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product(10.02,5));
        prodList.add(new Product(8.05,9));
        prodList.add(new Product(12.07,19));
        prodList.add(new Product(101,25));
        prodList.add(new Product(1,5));
        printList(calculateDiscount(prodList));
        printList(expensiveItems(prodList));
        printList(sortByDiscountPrice(prodList));
        printProduct(cheapestProduct(prodList));
        printProduct(mostExpensiveProduct(prodList));
    }
}