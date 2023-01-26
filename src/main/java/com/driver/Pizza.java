package com.driver;

public class Pizza
{
    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;

    boolean isExtraaCheeseAdded;
    boolean isExtraaToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.bill = "";
        this.isExtraaCheeseAdded = false;
        this.isExtraaToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;

        if (isVeg==true)
        {
            this.price = 300;
            this.toppings = 70;
        }
        else
        {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
    }
                    // getter & setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

                        //functions start
    public void addExtraCheese()
    {
        if (isExtraaCheeseAdded != true)
        {
            price = price + cheese;             //this.price = this.price + this.cheese
            isExtraaCheeseAdded = true;
        }
    }

    public void addExtraToppings()
    {
        if (isExtraaToppingsAdded != true)
        {
            price = price + toppings;             //this.price = this.price + this.toppings
            isExtraaToppingsAdded = true;
        }
    }

    public void addTakeaway()
    {
        if (isTakeAwayAdded != true)
        {
            price = price + 20;             //this.price = this.price + this.toppings
            isTakeAwayAdded = true;
        }
    }

    public String getBill()
    {                                              //this.bill, this.cheese, this.toppings
        if (isBillGenerated != true)
        {
            if (isExtraaCheeseAdded == true)
            {
                bill += "Extra Cheese Added: "+cheese+"\n";
            }
            if (isExtraaToppingsAdded == true)
            {
                bill += "Extra Toppings Added: "+toppings+"\n";
            }
            if (isTakeAwayAdded == true)
            {
                bill += "Paperbag Added: "+"20"+"\n";
            }
            bill += "Total Price: "+price+"\n";
            isBillGenerated = true;
        }
        return bill;
    }
}
