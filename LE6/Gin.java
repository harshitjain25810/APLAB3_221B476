class Gin extends Decorator{
    
    Gin(Offering Offering){
        this.Offering=Offering;
    }
    
    String getName(){
        return Offering.getName()+" with Gin ";
    }
    
    int getPrice(){
        return Offering.getPrice()+40;
    }
}