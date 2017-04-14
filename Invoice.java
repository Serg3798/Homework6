package homework6;

import java.util.Random;

public class Invoice implements Goods {

    static int totalCostGoodsInvoices;
    static int totalQuantityFruitInvoices;
    static int totalQuantityVegetablesInvoices;
    static int totalQuantityClothesInvoices;
    static int totalQuantityAppliancesInvoices;
    static int totalQuantityChemicalsInvoices;
    static int totalQuantityOtherInvoices;

    @Override
    public int totalCost(Product x) {
        return x.getPrice();
    }

    public static int getQuantityInvoice(int x) {
        Random r = new Random();
        int quantityInvoice = r.nextInt(x);
        return quantityInvoice;
    }

    public static void getQuantityTypeProductInvoice(Product x) {
        switch (x) {
            case Fruit:
                Invoice.totalQuantityFruitInvoices = Invoice.totalQuantityFruitInvoices + 1;
                break;
            case Vegetables:
                Invoice.totalQuantityVegetablesInvoices = Invoice.totalQuantityVegetablesInvoices + 1;
                break;
            case Clothes:
                Invoice.totalQuantityClothesInvoices = Invoice.totalQuantityClothesInvoices + 1;
                break;
            case Appliances:
                Invoice.totalQuantityAppliancesInvoices = Invoice.totalQuantityAppliancesInvoices + 1;
                break;
            case Chemicals:
                Invoice.totalQuantityChemicalsInvoices = Invoice.totalQuantityChemicalsInvoices + 1;
                break;
            case Other:
                Invoice.totalQuantityOtherInvoices = Invoice.totalQuantityOtherInvoices + 1;
                break;
        }
    }
}
