package homework6;

import static homework6.Dealer.getRevenueProduct;
import static homework6.Invoice.getQuantityInvoice;
import static homework6.Invoice.getQuantityTypeProductInvoice;
import static homework6.Stock.getQuantityProducts;

public class Homework6 {

    public static void main(String[] args) {
        int maxQuantityStock = 500;
        int quantityStock = getQuantityProducts(maxQuantityStock);
        int maxQuantityInvoice = 20;
        int maxQuantityGoodsInvoice = 100;
        int quantityInvoice = getQuantityInvoice(maxQuantityInvoice);
        Stock stock1 = new Stock();
        Product[] stock = new Product[quantityStock];
        for (int i = 0; i < quantityStock; i++) {
            stock[i] = Stock.getGoodsStock(quantityStock);
            Stock.totalCostGoodsStock = Stock.totalCostGoodsStock + stock1.totalCost(stock[i]);
        }
        System.out.println("Общая стоимость товара на складе равна: " + Stock.totalCostGoodsStock);
        System.out.println("Количество чеков у торговца равно: " + quantityInvoice + " штук.");
        Invoice invoice1 = new Invoice();
        Product[][] invoice = new Product[quantityInvoice][maxQuantityGoodsInvoice];
        for (int i = 0; i < quantityInvoice; i++) {
            int QuantityGoodsInvoiceNumber = getQuantityInvoice(maxQuantityGoodsInvoice);
            if (QuantityGoodsInvoiceNumber == 0) {
                QuantityGoodsInvoiceNumber = 1;
            }
            for (int j = 0; j < QuantityGoodsInvoiceNumber; j++) {
                invoice[i][j] = Stock.getGoodsStock(quantityStock);
                Invoice.totalCostGoodsInvoices = Invoice.totalCostGoodsInvoices + invoice1.totalCost(invoice[i][j]);
                getQuantityTypeProductInvoice(invoice[i][j]);
            }
        }
        System.out.println("Общая количество всех видов товара во всех " + quantityInvoice + " чеках равно: " + (Invoice.totalQuantityFruitInvoices
                + Invoice.totalQuantityVegetablesInvoices + Invoice.totalQuantityClothesInvoices + Invoice.totalQuantityAppliancesInvoices + Invoice.totalQuantityChemicalsInvoices + Invoice.totalQuantityOtherInvoices));
        System.out.println("Общая количество товара вида: " + Product.Fruit + " во всех " + quantityInvoice + " чеках равно: " + Invoice.totalQuantityFruitInvoices);
        System.out.println("Общая количество товара вида: " + Product.Vegetables + " во всех " + quantityInvoice + " чеках равно: " + Invoice.totalQuantityVegetablesInvoices);
        System.out.println("Общая количество товара вида: " + Product.Clothes + " во всех " + quantityInvoice + " чеках равно: " + Invoice.totalQuantityClothesInvoices);
        System.out.println("Общая количество товара вида: " + Product.Appliances + " во всех " + quantityInvoice + " чеках равно: " + Invoice.totalQuantityAppliancesInvoices);
        System.out.println("Общая количество товара вида: " + Product.Chemicals + " во всех " + quantityInvoice + " чеках равно: " + Invoice.totalQuantityChemicalsInvoices);
        System.out.println("Общая количество товара вида: " + Product.Other + " во всех " + quantityInvoice + " чеках равно: " + Invoice.totalQuantityOtherInvoices);
        System.out.println("Общая стоимость товара в " + quantityInvoice + " чеках равна: " + Invoice.totalCostGoodsInvoices);
        System.out.println("Общая стоимость активов на складе и в " + quantityInvoice + " чеках равна: " + Dealer.getAmountOfAssets(Stock.totalCostGoodsStock, Invoice.totalCostGoodsInvoices));
        getRevenueProduct(Product.Fruit);
        getRevenueProduct(Product.Vegetables);
        getRevenueProduct(Product.Clothes);
        getRevenueProduct(Product.Appliances);
        getRevenueProduct(Product.Chemicals);
        getRevenueProduct(Product.Other);
    }
}
