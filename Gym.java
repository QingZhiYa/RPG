import java.util.Scanner;
public class Gym extends Place{
  Scanner input = new Scanner(System.in);
  
  //Override whatToDo
  public void whatToDo(Player p, Friend f, Her h){
    System.out.println("※In the gym.🏀");
    System.out.println("What would you like to do?");
    System.out.println("(Type b to play basketball, v to play volleyball.)");
    String a = input.next();
    //ensure not Type wrong
    while((!a.equals("b"))&&
          (!a.equals("v"))){
      System.out.println("(Type b or v.)");
      a = input.next();
    }
    if(a.equals("b")){
      p.addBasketball(3);
      p.addFriendship(2);
      System.out.println("You played basketball with " + f.getName() + ".(Basketball +3, Friendship +2)");
      int i = (int)(Math.random()*10);
      if(i < 2){
        System.out.println(h.getName() + "was watching you playing basketball, she thought you looked cool♡.");
        p.addLove(3);
        System.out.println("Love +3");
      }
      
    }else if(a.equals("v")){
      System.out.println("You played volleyball.");
      int i = (int)(Math.random()*10);
      if(i < 3){
        System.out.println(h.getName() + " played volleyball today as well, and she thought you were a good player♡.(Love +2)");
        p.addLove(2);
      }
    }
  }
  
  //Override meetSomeone
  public void meetSomeone(Player p, Friend f, Her h, Agirl a){
    int i = (int)(Math.random()*10);
    if(i < 4){
      System.out.println("You meet with " + h.getName() + ".");
      h.talk(p);
      h.giveStuffs(p);
    }
    
    if(i < 6){
      System.out.println("You meet with " + f.getName() + ".");
      f.talk(p);
      f.giveStuffs(p);
    }
  }
  
}