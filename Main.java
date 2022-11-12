class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Cafe Java!\n");

    System.out.println("Here is the Menu: \n\n \tFOOD RESTRICTION KEY:\nGTN = Includes Gluten\nNTS = Includes Nuts\nMP = Includes Milk Products\nSPC = Spicy \n\nAppetizer \n\t Spring Rolls GTN --------- 7 \n\t Lettuce Wraps NTS --------- 7\n\t Sweet Corn --------- 8\n\t Wonton GTN MP --------- 8\n\t Thai Curry Puffs MP --------- 9\n\t Crispy Chilli Baby Corn SPC --------- 10\n\t Pan Fried Chili Paneer SPC MP --------- 10\n\t Veggie Soup GTN --------- 8\n\t Vegtable Coins GTN --------- 9\n\t");

    System.out.println("\n Entrees \n\t Vegtable Thai Yellow Curry GTN MP --------- 8\n\t Cauliflower Manchurian --------- 8 \n\t Chilli Bean Eggplant SPC  --------- 9\n\t Street Side Chow Mein NTS --------- 9\n\t Lo Mein GTN --------- 8\n\t French Fries --------- 8\n\t Kung Pao Paneer SPC --------- 9\n\t Chili Garlic Noodles SPC NTS --------- 9\n\t Momos GTN--------- 9 \n\t Veg Biryani --------- 9\n\t");

     System.out.println("\n Desserts \n\t Fried Ice Cream GTN MP --------- 8\n\t Chocolate Spring Rolls MP--------- 10 \n\t Date Wontons with Ice Cream MP  --------- 10\n\t  Gulab Jamun GTN --------- 10\n\tRasmalai MP --------- 8\n\t Vanilla Cake MP  --------- 8\n\t Strawberry Cupcake MP--------- 10\n\t Bannana Split MP --------- 10\n\t Pumpkin Pie GTN --------- 10 \n\t Cookies NTS--------- 10\n\t");

    Order Mark = new Order(true, false, false, false);
    Order Sally = new Order(false, true, false, false);
    Order Shawn = new Order(false, false, false, true);
    Order Anish = new Order(false, false, false, false);
    Order Nancy = new Order(false, false, false, false);

    System.out.println("Here is Mark's Order: \n");
    String[] markOrder = Mark.chooseOrder();
    for(int i = 0; i< markOrder.length; i++){
      System.out.print(markOrder[i]);
      System.out.print(", ");
    }
    System.out.println("\n\n");
    System.out.println("Here is Sally's Order: \n");
    String[] sallyOrder = Sally.chooseOrder();
    for(int i = 0; i< sallyOrder.length; i++){
      System.out.print(sallyOrder[i]);
      System.out.print(", ");
    }
    System.out.println("\n\n");
    System.out.println("Here is Shawn's Order: \n");
    String[] shawnOrder = Shawn.chooseOrder();
    for(int i = 0; i<shawnOrder.length; i++){
      System.out.print(shawnOrder[i]);
      System.out.print(", ");
    }
    System.out.println("\n\n");
    System.out.println("Here is Anish's Order: \n");
    String[] anishOrder = Anish.chooseOrder();
    for(int i = 0; i< anishOrder.length; i++){
      System.out.print(anishOrder[i]);
      System.out.print(", ");
    }
    System.out.println("\n\n");
    System.out.println("Here is Nancy's Order: \n");
    String[] nancyOrder = Nancy.chooseOrder();
    for(int i = 0; i< nancyOrder.length; i++){
      System.out.print(nancyOrder[i]);
      System.out.print(", ");
    }
    System.out.println("\n\n\n");

    double markPrice = Mark.personalBill(markOrder);
    double sallyPrice = Sally.personalBill(sallyOrder);
    double shawnPrice = Shawn.personalBill(shawnOrder);
    double anishPrice = Anish.personalBill(anishOrder);
    double nancyPrice = Nancy.personalBill(nancyOrder);

    System.out.println("Here is how much Mark's order is: $"+markPrice);
    System.out.println("Here is how much Sally's order is: $"+sallyPrice);
    System.out.println("Here is how much Shawn's order is: $"+shawnPrice);
    System.out.println("Here is how much Anish's order is: $"+anishPrice);
    System.out.println("Here is how much Nancy's order is: $"+nancyPrice);

    System.out.println("\n\nHere is the total bill including tax and tip: $"+String.format("%.2f", Order.totalBill(markPrice, sallyPrice, shawnPrice, anishPrice, nancyPrice)));

    System.out.println("\n\n\nThank you for your payment!");
    System.out.println("Come back to Cafe Java Soon!");
    
    
        
    

    
  }
}