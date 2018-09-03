import java.util.Scanner;
public class Library extends Place{
  Scanner input = new Scanner(System.in);
  
  //Override whatToDo
  public void whatToDo(Player p, Friend f, Her h){
    System.out.println("※In the library⌨");
    System.out.println("What would you like to do?");
    System.out.println("(Type s to study or w to watch Korean dramas)");
    String i = input.next();
    while((!i.equals("s"))&&
          (!i.equals("w"))){
      System.out.println("(Type s or w.)");
      i = input.next();
    }
    if(i.equals("s")){
      p.addKnowledge(3);
      p.addRebelling(-1);
      System.out.println("You read books and finished your homework.(Knowledge +3, Rebelling -1)");
      //say something
    }else if(i.equals("w")){
      int a = (int)(Math.random()*10);
      if(a < 4){
        p.addLove(4);
        p.addRebelling(1);
        p.addDrama(3);
        System.out.println("You watched a drama and talked with " + h.getName() + ", she felt you have the same interest with her♡.(Love +4, Rebelling +1, Drama +3)");
      }else{
        System.out.println("You watched a drama and talked with " + h.getName() +"♡.(Love +1, Rebelling +1, Drama +3)");
        p.addRebelling(1);
        p.addLove(1);
        p.addDrama(3);
      }
    }
  }
  
  //Override meetSomeone
  public void meetSomeone(Player p, Friend f, Her h, Agirl a){
    int i = (int)(Math.random()*10);
    if(i < 6){
      System.out.println("You meet with " + h.getName());
      h.talk(p);
      h.giveStuffs(p);
    }
    int j = (int)(Math.random()*10);
    if(i < 4){
      System.out.println("You meet with " + f.getName() + ".");
      f.talk(p);
      f.giveStuffs(p);
    }
    int k = (int)(Math.random()*10);
    if(k < 3){
      System.out.println("You met the teacher in the library and asked him some questions. He likes your attitude and assumes you are a good student☀.(Knowledge +3, Rebelling -1)");
      p.addKnowledge(3);
      p.addRebelling(-1);
    }
  }
  
  
  
  
}