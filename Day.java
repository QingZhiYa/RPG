import java.util.Scanner;
public class Day{
  Scanner input = new Scanner(System.in);
  
  //morning-check the data  then pick events
  public void pickEvents(Player p, Friend f, Her h, Agirl a){
    System.out.println("\n>In the morning.◴");
    Events e = new Events();
    //make it random, Events about her wont happen at the same time
    int x = (int)(Math.random()*100);
    if(x < 25){
      e.sheNeedFood(p,h);
    }else if(x > 84){
      e.upset(p,h);
    }else if(x > 24 && x < 40){
      e.talkDrama(p,h);
    }
    int y =(int)(Math.random()*100);
    if(y < 20){
      e.popQuiz(p);
    }
    //basketballGame and videoGame wont happen at the same time
    int z =(int)(Math.random()*100);
    if(z < 15){
      e.basketballGame(p,h);
    }else if(z > 84){
      e.videoGame(p,h);
    }
    int b = (int)(Math.random()*100);
    if(b < 20){
      e.goMovie(p,f,h);
    }
    //check the Rebelling Counter
    if(p.getRebellingC()>2){
      e.tooRebellious(p);
      p.setRebellingC(0);
    }
  }
  //noon-pick places
  public void pickPlaces(Player p, Friend f, Her h, Agirl a){
    System.out.println("\n>In the afternoon.◷");
    System.out.println("Where would you like to go for afternoon activity?");
    System.out.println("(Type l to Library, s to Store, g to Gym, or ga to play game.)");
    //check the input
    String i = input.next();
    while((!i.equals("l"))&&
          (!i.equals("g"))&&
          (!i.equals("s"))&&
          (!i.equals("ga"))){
      System.out.println("(Type l, s, g, or ga.)");
      i = input.next();
    }
    //creat new places
    Library l = new Library();
    Gym g = new Gym();
    Store s = new Store();
    Game ga = new Game();
    
    //go to the corresponded places
    if(i.equals("l")){
      l.whatToDo(p,f,h);
      l.meetSomeone(p,f,h,a);
    }else if(i.equals("g")){
      g.whatToDo(p,f,h);
      g.meetSomeone(p,f,h,a);
    }else if(i.equals("s")){
      s.whatToDo(p,f,h);
      s.meetSomeone(p,f,h,a);
    }else{
      ga.whatToDo(p,f,h);
      ga.meetSomeone(p,f,h,a);
    }
    
    
  }
  //afternoon-pick ways
  public void goHome(Player p, Friend f, Her h, Agirl a){
    System.out.println("\n>After school.◵");
    Gohome gh = new Gohome();
    gh.whatToDo(p,f,h);
    gh.meetSomeone(p,f,h,a);
  }
  
  
  
  
}