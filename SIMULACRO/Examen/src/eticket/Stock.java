package eticket;
import eticket.NotEnoughStock;
import eticket.Product;
import eticket.ProductDoesNotExists;
import java.util.HashMap;

public class Stock {
    private HashMap<Integer, Integer> stockMap;
    public Stock(){
        stockMap= new HashMap<>();
    }
    public void addProduct(Product product, int amount){
        stockMap.put(product.getCode(),stockMap.getOrDefault(product.getCode(),0)+amount);
    }
    public void allocateProduct(Product product, int amount)throws NotEnoughStock,ProductDoesNotExists{
        if (!stockMap.containsKey(product.getCode())) {
            throw new ProductDoesNotExists("El producto no esta en stock");
        }
        int currentAmount= stockMap.get(product.getCode());
    }
}
