package org.example.exercise14;

public class Invoice {

    private String itemCode;
    private String description;
    private int amount = 0;
    private double price = 0.0;

    public Invoice() {
    }




    public Invoice(String itemCode, String description, int amount, double price) {
        this.itemCode = itemCode;
        this.description = description;
        this.setAmount(amount);
        this.setPrice(price);
    }

    public double getTotalInvoice() {
        double fact = this.amount * this.price;
        if (fact<0){
            return 0;
        }
        return fact;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount > 0) {
            this.amount = amount;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Invoice: \n" +
                "ItemCode: " + itemCode +
                ".\nDescription: " + description +
                ".\nAmount: " + amount +
                String.format("%nPrice: $ %.2f.%n", price) +
                String.format("Total price: $ %.2f.%n",getTotalInvoice());

    }


}
