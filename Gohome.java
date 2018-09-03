import java.util.Scanner;
public class Gohome extends Place{
  Scanner input = new Scanner(System.in);
  //if with her, wont meet another girl
  boolean withHer;
  
  //Override whatToDo
  public void whatToDo(Player p, Friend f, Her h){
    System.out.println("You prefer to get home in a further way or in a closer way?");
    System.out.println("(Type f to further way or c to closer way.)");
    String i = input.next();
    
    //ensure not type wrong
    while((!i.equals("f"))&&
          (!i.equals("c"))){
      System.out.println("(Type f or c.)");
      i = input.next();
    }
    if(i.equals("f")){
      p.addLove(4);
      System.out.println("You chose the further way, so you could send " + h.getName() + " home, but you got home late.(Love +4, Rebelling +2)");
      p.addRebelling(2);
      withHer = true;//set withHer
    }else if(i.equals("c")){
      p.addFriendship(2);
      System.out.println("You got home and talked with " + f.getName() + " on the way home.(Friendship +2, Rebelling-1)");
      p.addRebelling(-1);
      withHer = false;
    }
  }
  
  //Override meetSomeone
  public void meetSomeone(Player p, Friend f, Her h, Agirl a){
    if(!a.getMeetA() && !withHer){
      System.out.println("You see a mysterious girl with black hair on the way home. She wears the same school uniform as you do. It looks like she lives near your home. \"Never seen her before\" you thought. You don't know why but still think she is kind of cool, and want to know more about her|ω・).(Affection +1)");
      p.addAffection(1);
      a.setMeetA(true);
      //in Agirl class, only happen once, set it true.
    }
    int b = (int)(Math.random()*10);
    if(((b < 2 && p.getAffection() > 0)||(b < 6 && p.getAffection() > 6)) && !withHer){
      System.out.println("You meet with " + a.getName() + ".");
      
      if(p.getAffection() > 4){
        System.out.println("You see " + a.getName() + " is smiling and feeding stray cats.(Affection +1)");
        p.addAffection(1);
      }
      a.talk(p);
      if(p.getAffection() > 10 && !a.getIfSaid()){
        System.out.println("She tells you her name is Alyssa, and she is a senior as well.\"I feed cats here everyday after school. They are soooo cute.(///∇//)\"");
        a.setName("Alyssa");
        a.setIfSaid(true);
        //after she said her name, change the name and set it true, so she wont say it again
      }
      if(p.getAffection() > 20 && !a.getIS3()){
        System.out.println("\"I like playing video games. That helps me to release the stress.✧(•̀ω•́ )\"");
        System.out.println("\"That is unusual among girls\" you answer.(Affection +3)");
        p.addAffection(3);
        a.setIS3(true);
      }
      int x = (int)(Math.random()*10);
      if(p.getAffection()>15 && x < 4){
        System.out.println("You find that you have the same interests with her♡.");
        if(p.getPersonality().equals("s") && !a.getIS2()){
          System.out.println("Both of you like reading books and watching movies.");
          a.setIS2(true);
        }else if(p.getPersonality().equals("a") && !a.getIS2()){
          System.out.println("Both of you like playing video games and sports.");
          a.setIS2(true);
        }System.out.println("(Affection +2)");
        p.addAffection(2);
      }
      if(p.getAffection() > 30 && !a.getIS1()){
        System.out.println("She says her dream is to travel around the world before 20 years old.");
        a.setIS1(true);
        System.out.println("(Type w to answer \"I have the same wish!\", type g to answer \"That sounds great.\", or type anything else to answer \"That sounds too crazy\")");
        if(input.next().equals("w")){
          System.out.println("\"Maybe we could go together someday!(* ॑ᐜ ॑*)\"(Affection +5)");
          p.addAffection(5);
          p.setIfGo(true);
          //reach one end, will check it in Story class
        }else if(input.next().equals("g")){
          System.out.println("\"I know.→_→\"(Affection +2)");
          p.addAffection(2);
        }else{
          System.out.println("(｡ŏ_ŏ)(Affection -8)");
          p.addAffection(-8);
        }
      }
      a.giveStuffs(p);
    }
  }
  
  
  
}