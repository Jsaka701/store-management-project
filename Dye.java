//Creates SubClass of Styling Which is Named Dye for the Styling Service
public class Dye extends Styling {

   //Instance Variable color created for Dye Class
    private String color;

 //No-Argument Constructor
    public Dye() {
        super();//Uses the no-argument constructor instance variable default values from the Super Class Styling
        this.color = "Natural";//Default Dye Value for No-Argument Constructor
    }

//Parameterized Constructor
    public Dye(double price, String stylist, boolean washHair, String color) {
        super(price, stylist, washHair); //Uses the parameterized constructor instance variables values from the Super Class Styling
        this.color = color; //Uses inputed value from the parameter to intialize it to the object
    }

 //Getter/Acessor Method for the Color
    public String getColor() {
        return color;
    }

 //Setter/Mutator Method for the Color
    public void setColor(String color) {
        this.color = color;
    }
  
   //toString Method allows us to return an organized representation to print to the console for the Dye Subclass
    public String toString() {
        return super.toString() + //Uses the toString Method from the Super Class Styling 
          "\nHair Color: " + color; //Then adds the Color from the Sub Class onto the Super Class toString Method
    }
}