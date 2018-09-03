import java.util.Scanner;
public class Agirl extends Character{
  //Override
  public Agirl(String n){
    super(n);
  }
  
  Scanner input = new Scanner(System.in);
  
  //check if some incident happened or not, only happen once
  boolean ifSaid;
  boolean is1;
  boolean is2;
  boolean meetA;
  boolean is3;
  
  //setters and getters
  public void setIfSaid(boolean b){
    ifSaid = b;
  }
  public boolean getIfSaid(){
    return ifSaid;
  }
  public void setIS1(boolean b){
    is1 = b;
  }
  public boolean getIS1(){
    return is1;
  }
  public void setIS2(boolean b){
    is2 = b;
  }
  public boolean getIS2(){
    return is2;
  }
  public void setMeetA(boolean b){
    meetA = b;
  }
  public boolean getMeetA(){
    return meetA;
  }
  public void setIS3(boolean b){
    is3 = b;
  }
  public boolean getIS3(){
    return is3;
  }
  
  //Override talk 
  public void talk(Player p){
    
    System.out.println("Would you like to talk with " + getName() + " ?");
    System.out.println("(Type y for yes, type anything else for no.)");
    
    
    if(input.next().equals("y")){
      System.out.println("You talked with her.(Affection +2)");
      p.addAffection(2);
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
        p.addAffection(2);
        System.out.println("\"Thank you♡.\"(Affection +2)");
      }else if(i.equals("c")&&p.getChocolate()>0){
        p.removeItem("chocolate");
        p.addAffection(4);
        System.out.println("\"Thank you♡.\"(Affection +4)");
      }else if(i.equals("f")&&p.getFlower()>0){
        p.removeItem("flower");
        p.addAffection(8);
        System.out.println("\"Thank you♡.\"(Affection +8)");
      }else if(i.equals("b")&&p.getBook()>0){
        p.removeItem("book");
        p.addAffection(2);
        System.out.println("\"Thank you♡.\"(Affection +2)");
      }else{
        System.out.println("You do not have that item or you type wrong(๑°ㅁ°๑).");
      }
    }
  }
}