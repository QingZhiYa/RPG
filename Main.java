import java.util.Scanner;
class Main {
  
  //pause
  public static void pause(int ms){
    try{
      Thread.sleep(ms);
    } catch ( Exception e){}
  }
  
  //clear
  public static void clear(){
    for(int i = 0; i < 60; i++){
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    //set the player's name and the character's name
    System.out.println("You found a game!(●ˇ∀ˇ●) \n");
    System.out.println("Set your name in the game.");
    Player p = new Player(input.next());
    System.out.println("\nSet your best friend's name in the game.");
    Friend f = new Friend(input.next());
    System.out.println("\nSet the name of the girl you like in the game.");
    Her h = new Her(input.next());
    Agirl a = new Agirl("the mysterious girl");
    System.out.println("\nSet your personality in the game.");
    System.out.println("(Type a to be atheletic, c to be charming, s to be scholarly, or anything else to set Hard Mode.)");
    p.setPersonality(input.next());
    p.checkPersonality();
    
    //print the story
    Main.clear();
    Main.pause(1000);
    
    System.out.println("----------------------- Loading ▂▃▅▆▇  -----------------------");
    
    Main.pause(2000);
    
    Story story = new Story();
    story.getStory(p,f,h);
    
    Main.pause(10000);
    System.out.println("\n(Type anything to continue.)");
    input.next();
    Main.clear();
    
    //for loop for 30 days
    for(int i = 1; i <= 30; i++){
      System.out.println("\n---------------Day " + i + "----------------");
      Day d = new Day();
      p.addMoney(5);
      System.out.println("Your mom give you 5 bucks as alimony＄.");
      System.out.println(p.printMoney());
      
      //in the morning pick Events
      Main.pause(2500);
      d.pickEvents(p,f,h,a);
      //in the afternoon pick Places
      Main.pause(2500);
      d.pickPlaces(p,f,h,a);
      Main.pause(2500);
      
      //check will the character to the movie, if not back home
      Events m = new Events();
      if(p.getIfMovie()){
        System.out.println("You go to the movie with " + h.getName() + " and " + f.getName() + ".ლ(╹◡╹ლ)(Money -15, Love +3, Friendship +2)");
        p.addMoney(-15);
        p.addLove(3);
        p.addFriendship(2);
        System.out.println(p.printMoney());
        p.setIfMovie(false);
      }else{
        d.goHome(p,f,h,a);
        Main.pause(2500);
      }
      
    }
    Main.clear();
    
    //print end
    System.out.println("\n----------------☀On the day of graduation☀----------------");
    Main.pause(3000);
    story.getEnd(p,f,h,a);
    System.out.println("\n----------------✿The End✿----------------");
    
    //print the data
    Main.pause(4000);
    System.out.println(p.getLove() +" "+ p.getKnowledge()+" " + p.getRebelling() + " "+p.getMoney()+"  "+  p.getFriendship()+" " +p.getBasketball()+" "+  p.getGame() + " "+  p.getDrama() + " " + p.getAffection());
    System.out.println("Please send the data above to me.");
    System.out.println("Thanks for playing my game, and thanks for Mr.Sartory and people helping me to test it.♡ "); 
    System.out.println("----------------By 青栀桠----------------");
  }
}