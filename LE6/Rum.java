class Rum extends Decorator{
    
    Rum(Offering Offering){
        this.Offering=Offering;
    }
    
    String getName(){
        return Offering.getName()+" with Rum ";
    }
    
    int getPrice(){
        return Offering.getPrice()+55;
    }
}