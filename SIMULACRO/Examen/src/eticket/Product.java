package eticket;
public class Product {
    int code=0;
    String brand;
    String model;
    double price;
    String tradeName;
    public int getCode(){
        return code;
    }
    public String getBrand(){
        return brand;
    }

    public String getName(){
        return tradeName;
    }

    public String getModel(){
        return model;
    }

    public double getPrice(){
        return price;
    }
    public Product(String brand,String model, String tradeName, double price){
        this.brand=brand;
        this.model=model;
        this.tradeName=tradeName;
        this.price=price;
    }
    @Override
    public boolean equals(Object obj){
        Product producto= (Product)obj;
        return (producto.equals(obj));
    }
    

}
