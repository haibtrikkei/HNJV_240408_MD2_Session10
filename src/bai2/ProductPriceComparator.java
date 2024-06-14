package bai2;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.caculateSellPrice()-o1.caculateSellPrice());
    }
}
