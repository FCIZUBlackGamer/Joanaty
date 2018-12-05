package joanat.freelance.com.joanaty.ReturnBell;

public class ProductInBellReturn {
    int Id, amount, barcode;
    float price, discount, total;
    String name, sell_type;

    public ProductInBellReturn() {
    }

    public ProductInBellReturn(int id, String name) {
        Id = id;
        this.name = name;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setSell_type(String sell_type) {
        this.sell_type = sell_type;
    }

    public String getSell_type() {
        return sell_type;
    }

    public float getDiscount() {
        return discount;
    }

    public float getTotal() {
        return total;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }


}
