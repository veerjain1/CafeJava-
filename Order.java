import java.util.Random;

class Order{
  //declare private variables which are reachable to the rest of the class
  private boolean allergicToGTN;
  private boolean allergicToNTS;
  private boolean allergicToSPC;
  private boolean allergicToMP;

   private String[] appetizer = {"Spring Rolls GTN", "Lettuce Wraps NTS", "Sweet Corn", "Wonton GTN MP", "Thai Curry Puffs MP", "Crispy Chilli Baby Corn SPC", "Pan Fried Chili Paneer SPC MP", "Veggie Soup GTN","Vegtable Coins GTN"};

   private String[] entree = {"Vegtable Thai Yellow Curry GTN MP", "Cauliflower Manchurian ", "Chilli Bean Eggplant SPC", "Street Side Chow Mein NTS", "Lo Mein GTN ", "French Fries ", "Kung Pao Paneer SPC", "Chilli Garlic Noodles SPC NTS", "Momos GTN","Veg Biryani "};

 private  String[] dessert = {"Fried Ice Cream GTN MP", "Chocolate Spring Rolls MP", "Date Wontons with Ice Cream MP", "Gulab Jamun GTN", "Rasmalai MP", "Vanilla Cake MP", "Strawberry Cupcake MP", "Bannana Split MP","Pumpkin Pie GTN", "Cookies NTS"};

  public Order(){
    allergicToGTN = false;
    allergicToNTS = false;
    allergicToSPC = false;
    allergicToMP = false;
  }
  public Order(boolean allergicToGTN, boolean allergicToNTS, boolean allergicToSPC, boolean allergicToMP){

    this.allergicToGTN = allergicToGTN;
    this.allergicToNTS = allergicToNTS;
    this.allergicToSPC = allergicToSPC;
    this.allergicToMP = allergicToMP;
  }

  public String[] chooseOrder(){

    boolean appetizerFound = false;
    
    String chosenAppetizer="";
    
    boolean entreeFound = false;
    String chosenEntree="";

    boolean dessertFound = false;
    String chosenDessert="";

    String allergic =" ";
    int randomNum;
    
    if(allergicToGTN){
       allergic = "GTN";
    }
    if(allergicToNTS){
       allergic = "NTS";
    }
    if(allergicToSPC){
       allergic = "SPC";
    }
    if(allergicToMP){
       allergic = "MP";
    }

    while(appetizerFound != true){
         Random random = new Random();
         randomNum = random.nextInt(0, 9);
         chosenAppetizer = appetizer[randomNum];
         if(chosenAppetizer.indexOf(allergic)!=-1){
           appetizerFound = true;
         }
       
       }
    while(entreeFound != true){
         Random random = new Random();
         randomNum = random.nextInt(0, 10);
         chosenEntree = entree[randomNum];
         if(chosenEntree.indexOf(allergic)!=-1){
           entreeFound = true;
         }
       
       }
     while(dessertFound != true){
         Random random = new Random();
         randomNum = random.nextInt(0, 10);
         chosenDessert = dessert[randomNum];
         if(chosenDessert.indexOf(allergic)!=-1){
           dessertFound = true;
         }
       
       }
    
        String[] order = {chosenAppetizer, chosenEntree, chosenDessert};
        return order;
    }

  public double personalBill(String order[]){
    
    double personalPrice = 0.0;

    if(order[0] == "Spring Rolls GTN" || order[0] == "Lettuce Wraps NTS"){
      personalPrice=personalPrice +7;
    }
    if(order[0] == "Sweet Corn" || order[0] == "Wonton GTN MP" ||order[0] == "Veggie Soup GTN"){
      personalPrice=personalPrice +8;
    }
    if(order[0] == "Thai Curry Puffs MP" ||order[0] == "Paneer Tacos MP" ||order[0] == "Vegtable Coins GTN")
    {
      personalPrice=personalPrice +9;
    }
    if(order[0] == "Crispy Chilli Baby Corn SPC" ||order[0] == "Pan Fried Chili Paneer SPC MP"){
      personalPrice=personalPrice +10;
    }

    if(order[1] == "Vegtable Thai Yellow Curry GTN MP" || order[1] == "Cauliflower Manchurian " ||order[1] == "Lo Mein GTN " ||order[1] == "French Fries "){
      personalPrice=personalPrice +8;
    }
    if(order[1] == "Chilli Bean Eggplant SPC" ||order[1] == "Street Side Chow Meain NTS" ||order[1] == "Kung Pao Paneer SPC" || order[1] == "Chilli Garlic Noodles SPC NTS" ||order[1] == "Momos GTN" ||order[1] == "Veg Biryani "){
      personalPrice =personalPrice +9;
    }

    if(order[2] == "Fried Ice Cream GTN MP"|| order[2] == "Rasmalai MP" || order[2] == "Vanilla Cake MP"){
      personalPrice=personalPrice +8;
    }
    if(order[2]=="Chocolate Spring Rolls MP" || order[2] == "Date Wontons with Ice Cream MP" || order[2] == "Gulab Jamun GTN" || order[2] == "Strawberry Cupcake MP"||order[2] == "Bannana Split MP" || order[2] == "Pumpkin Pie GTN" || order[2] == "Cookies NTS"){
      personalPrice=personalPrice +10;
    }

    return personalPrice;
    
  }
  static public double totalBill(double markPrice, double sallyPrice, double shawnPrice, double anishPrice, double nancyPrice){
    

    double bill = (markPrice+sallyPrice+shawnPrice+anishPrice+nancyPrice)*1.0825*1.1;
    return bill;
  }
    
  }