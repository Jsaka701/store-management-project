//Creates SuperClass for the Styling Service
public class Styling {

  //Instance Variables In Super Class
  private double price; //Price
  private String stylist; //Name of the Stylist
  private boolean washHair; //If Washed Hair

  //No-Arguement Constructor
  public Styling(){
      this.price = 0.0;
      this.stylist = "Unknown";
      this.washHair = false;
  }
//Default Values Given No Parameters
  
   public Styling(double price, String stylist, boolean washHair) {
        this.price = price;
        this.stylist = stylist;
        this.washHair = washHair;
   }
//Parameterized Constructor that uses inputed Instance Variables

//Getter Methods For Instance Variable lines 25-35 (These are my Accessor Methods)
   public double getPrice() {
        return price;
    }

  public String getStylist() {
        return stylist;
    }

  public boolean getWashHair() {
        return washHair;
    }

  //Setter Methods For Instance Variables for values to be set from lines 38-48 (These are my Mutator Methods)
  public void setPrice(double price) {
        this.price = price;
    }

   public void setStylist(String stylist) {
        this.stylist = stylist;
    }

   public void setWashHair(boolean washHair) {
        this.washHair = washHair;
    }

  //toString Method allows us to return a organized representation to print to the console
  public String toString() {
    String border = "---------------------------------------------------------------------"; //Used to separate each object that is being instantiated that gets print to the console
    return  border +
           "\nStyling: " +
           "\nPrice: $" + getPrice() + //Oragnizes to print out the Price to the console
           "\nStylist: " + getStylist() + //Oragnizes to print out the Stylist Name to the console
           "\nWash Hair: " + (getWashHair() ? "Yes" : "No") ; //Oragnizes to print out if the Hair is Washed to the console
      }
}