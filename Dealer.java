package homework6;

public class Dealer {

    static int amountOfAssets;

    public static int getAmountOfAssets(int x, int y) {
        amountOfAssets = x + y;
        return amountOfAssets;
    }

    public static void getRevenueProduct(Product x) {
        switch (x) {
            case Fruit:
                System.out.println("Выручка по товару " + Product.Fruit + " равна: " + Invoice.totalQuantityFruitInvoices * Product.Fruit.getPrice());
                break;
            case Vegetables:
                System.out.println("Выручка по товару " + Product.Vegetables + " равна: " + Invoice.totalQuantityVegetablesInvoices * Product.Vegetables.getPrice());
                break;
            case Clothes:
                System.out.println("Выручка по товару " + Product.Clothes + " равна: " + Invoice.totalQuantityClothesInvoices * Product.Clothes.getPrice());
                break;
            case Appliances:
                System.out.println("Выручка по товару " + Product.Appliances + " равна: " + Invoice.totalQuantityAppliancesInvoices * Product.Appliances.getPrice());
                break;
            case Chemicals:
                System.out.println("Выручка по товару " + Product.Chemicals + " равна: " + Invoice.totalQuantityChemicalsInvoices * Product.Chemicals.getPrice());
                break;
            case Other:
                System.out.println("Выручка по товару " + Product.Other + " равна: " + Invoice.totalQuantityOtherInvoices * Product.Other.getPrice());
                break;
            default:
                System.out.println("У торговца такого товара нет");
        }
    }
}
