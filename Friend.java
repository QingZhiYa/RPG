import java.util.Scanner;
public class Friend extends Character{
  //Override and set name
  public Friend(String n){
    super(n);
  }
  Scanner input = new Scanner(System.in);
  
  //Override talk
  public void talk(Player p){
    
    System.out.println("Would you like to talk with " + getName() + " ?");
    System.out.println("(Type y for yes, type anything else for no.)");
    
    if(input.next().equals("y")){
      System.out.println("You have a nice talk with " + getName() + ".");
      p.addFriendship(1);//may need to change the num
      System.out.println("Friendship +1");
    }
  }
  
  //Override giveStuffs
  public void giveStuffs(Player p){
    System.out.println("Would you like to give something to him?");
    System.out.println("(Type y for yes, type anything else for no.)");
    
    
    if(input.next().equals("y")){
      p.checkItem();
      //track the item
      System.out.println("What would like to give to him?");
      System.out.println("(Type w, c, f, b to give. Type anything else to quit.)");
      String i = input.next();
      if(i.equals("w")&&p.getWater()>0){
        //remove it and add data
        p.removeItem("water");
        p.addFriendship(1);//may need to change the num
        System.out.println("\"Thank you.\"(Friendship +1)");
      }else if(i.equals("c")&&p.getChocolate()>0){
        p.removeItem("chocolate");
        p.addFriendship(2);
        System.out.println("\"Thank you.\"(Friendship +2)");
      }else if(i.equals("f")&&p.getFlower()>0){
        p.removeItem("flower");
        p.addFriendship(3);
        System.out.println("\"Ok...thank you.\"(Friendship +3)");
      }else if(i.equals("b")&&p.getBook()>0){
        p.removeItem("book");
        p.addFriendship(1);
        System.out.println("\"Thank you.\"(Friendship +1)");
      }else{
        System.out.println("You do not have that item or you type wrong.(๑°ㅁ°๑)");
      }
      //dont have the item
    }
  }
  
  
  
}