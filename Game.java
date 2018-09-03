public class Game extends Place{
  
  //Override whatToDo
  public void whatToDo(Player p, Friend f, Her h){
    p.addGame(3);
    System.out.println("You played video games.☪(Game +3)");
  }
  
  //Override meetSomeone
  public void meetSomeone(Player p, Friend f, Her h, Agirl a){
    int i = (int)(Math.random()*10);
    if(i < 4){
      p.addFriendship(2);
      System.out.println("You have a good game time with " + f.getName() + ".(Friendship +2)");
    }else if((i > 7 && p.getAffection()>0) || (i > 4 && p.getAffection() > 5)){
      System.out.println("You meet with " + a.getName() + ", and play video games with her. You have a good cooperation♡.(Affection +3)");
      p.addAffection(3);
    }
  }
}