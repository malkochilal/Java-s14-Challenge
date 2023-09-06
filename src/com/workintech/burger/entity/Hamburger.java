package com.workintech.burger.entity;

public class Hamburger implements Addable{
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;



    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
    public void addAddition(String additionName, double price) {
if(addition1==null){
   
    this.addition1=new Addition(additionName,price);
}else if(addition2==null){
    this.addition2=new Addition(additionName,price);
}else if(addition3==null){
    this.addition3=new Addition(additionName,price);
}else if(addition4==null){
    this.addition4=new Addition(additionName,price);
}else{
    System.out.println("Burger is full");
}
    }
    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        //this.breadRollType = breadRollType;

        this.price = price;
        this.meat="Normal";
    }

    public String itemize(){
        StringBuilder builder=new StringBuilder();
        builder.append("Name:"+ name +"\n");
        builder.append("Meat:"+ meat +"\n");
        builder.append("BreadRollType:"+ breadRollType +"\n");

        if(addition1 !=null){
            builder.append("Addition1: " + addition1.getAdditionName() +"\n");
            price=price+addition1.getAdditionPrice();
        }

        if(addition2 !=null){
            builder.append("Addition2: " + addition2.getAdditionName()+"\n");
            price=price+addition2.getAdditionPrice();
        }

        if(addition3 !=null){
            builder.append("Addition3: " + addition3.getAdditionName()+"\n");
            price=price+addition3.getAdditionPrice();
        }

        if(addition4 !=null){
            builder.append("Addition4: " + addition4.getAdditionName()+"\n");
            price=price+addition4.getAdditionPrice();
        }
        return builder.toString();

    }
    public double  itemizeHamburger(){
       String explanation= itemize();
        System.out.println(explanation);
        System.out.println("Price:"+ getPrice());
        System.out.println("*****************");
return getPrice();
    }




}
