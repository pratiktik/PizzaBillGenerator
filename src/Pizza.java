public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheeseAdded = 100;
    private int extraToppingsAdded = 150;
    private int takeawayOpted = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeaway = false;


    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price+=extraCheeseAdded;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price+=extraToppingsAdded;
    }
    public void takeAway(){
        isOptedTakeaway = true;
        this.price += takeawayOpted;
    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza : "+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: "+ extraCheeseAdded + "\n";
        }if(isExtraToppingsAdded){
            bill += "Extra toppings added: "+ extraToppingsAdded + "\n";
        }if(isOptedTakeaway){
            bill += "Takeaway opted: "+ takeawayOpted + "\n";
        }
        bill += "Bill: " + this.price;
        System.out.println(bill);
    }
}
