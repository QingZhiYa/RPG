import java.util.Scanner;
public class Her extends Character{
  
  //set the Name
  public Her(String n){
    super(n);
  }
  Scanner input = new Scanner(System.in);
  
  //Override talk
  public void talk(Player p){
    
    System.out.println("Would you like to talk with " + getName() + " ?");
    System.out.println("(Type y for yes, type anything else for no.)");
    
    
    if(input.next().equals("y")){
      //make it random
      int i = (int)(Math.random()*10);
      if(i < 5){
        p.addLove(-1);
        System.out.println("You said some stupid words. She thought you were a weird person.Σ( ° △ °|||)(Love -1)");
      }else{
      System.out.println("You have a nice talk with " + getName() + "♡.(Love +1)");
        p.addLove(1);//may need to change the num
      }
    }
  }
  
  //Override giveStuffs
  public void giveStuffs(Player p){
    System.out.println("Would you like to give something to her?");
    System.out.println("(Type y for yes, type anything else for no.)");
    
    
    if(input.next().equals("y")){
      p.checkItem();
      //track the item
      System.out.println("What would like to give to her?");
      System.out.println("(Type w, c, fo, or f to give. Type anything else to quit.)");
      String i = input.next();
      if(i.equals("w")&&p.getWater()>0){
        //remove it and add data
        p.removeItem("water");
        p.addLove(1);//may need to change the num
        System.out.println("\"Thank you♡.\"(Love +1)");
      }else if(i.equals("c")&&p.getChocolate()>0){
        p.removeItem("chocolate");
        p.addLove(3);
        System.out.println("\"Thank you♡.\"(Love +3)");
      }else if(i.equals("f")&&p.getFlower()>0){
        p.removeItem("flower");
        p.addLove(7);
        System.out.println("\"Thank you♡.\"(Love +7)");
      }else if(i.equals("b")&&p.getBook()>0){
        p.removeItem("book");
        p.addLove(1);
        System.out.println("\"Thank you♡.\"(Love +1)");
      }else{
        System.out.println("You do not have that item or you type wrong(๑°ㅁ°๑).");
      }
    }
  }

}