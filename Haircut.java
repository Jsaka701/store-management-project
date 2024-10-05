//Creates SubClass of Styling Which is Named Haircut for the Styling Service
public class Haircut extends Styling {

  //Instance Variable haircutType created for Haircut Class
    private String haircutType;

  //No-Argument Constructor
    public Haircut() {
        super(); //Uses the no-argument constructor instance variable default values from the Super Class Styling
        this.haircutType = "Standard"; //Default Haircut Value for No-Argument Constructor
    }

  //Parameterized Constructor
    public Haircut(double price, String stylist, boolean washHair, String haircutType) {
        super(price, stylist, washHair); //Uses the parameterized constructor instance variables values from the Super Class Styling
        this.haircutType = haircutType; //Uses inputed value from the parameter to intialize it to the object
    }

  //Getter/Acessor Method for the haircutType 
    public String getHaircutType() {
        return haircutType;
    }

  //Setter/Mutator Method for the haircutType 
    public void setHaircutType(String haircutType) {
        this.haircutType = haircutType;
    }

 //toString Method allows us to return a organized representation to print to the console for the Haircut Subclass
    public String toString() {
        return super.toString() + //Uses the toString Method from the Super Class Styling 
          "\nHaircut Type: " + haircutType; //Then adds the HaircutType from the Sub Class on to it
    }
}