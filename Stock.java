package homework6;

import java.util.Random;

public class Stock implements Goods {

    static int totalCostGoodsStock;

    @Override
    public int totalCost(Product x) {
        return x.getPrice();
    }

    public static int getQuantityProducts(int x) {
        Random r = new Random();
        int quantityStock = r.nextInt(x);
        System.out.println("Количество товара на складе равно: " + quantityStock + " штук.");
        return quantityStock;
    }

    public static Product getGoodsStock(int quantityStock) {
        Random r = new Random();
        return Product.values()[r.nextInt(Product.values().length)];
    }
}
