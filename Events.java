import java.util.Scanner;
public class Events{
  Scanner input = new Scanner(System.in);
  //setter and getter
  public void popQuiz(Player p){
    int i = (int)(Math.random()*10);
    //different Rebelling data have different chances to win
    if(p.getRebelling() > 10){
      if(i < 8){
        System.out.println("The teacher took a pop quiz, but you did bad.Σ( ° △ °|||)(Knowledge -2, Rebelling +1)");
        p.addKnowledge(-2);
        p.addRebelling(1);
      }else{
        System.out.println("The teacher took a pop quiz this morning, you did not bad.(Knowledge +2, Rebelling -1)");
        p.addKnowledge(2);
        p.addRebelling(-1);
      }
    }else{
      if(i < 3){
        System.out.println("The teacher took a pop quiz this morning, but you did bad.Σ( ° △ °|||)(Knowledge -2, Rebelling +1)");
        p.addKnowledge(-2);
        p.addRebelling(1);
      }else{
        System.out.println("The teacher took a pop quiz this morning, you did not bad.(Knowledge +2, Rebelling -1)");
        p.addKnowledge(2);
        p.addRebelling(-1);
      }
    }
  }
  
  public void sheNeedFood(Player p, Her h){
    System.out.println(h.getName() + " got up late and did not eat the brackfast. Would you like to buy some snacks for her?");
    System.out.println("(Type y for yes or anything for no.)");
    String i = input.next();
    if(i.equals("y") && p.getMoney()-5 >= 0){
      p.addMoney(-5);
      p.addLove(3);
      System.out.println("You bought her some snacks, she thought you were a nice person♡.(Love +3, Money -5)");
      System.out.println(p.printMoney());
    }else if(i.equals("y") && p.getMoney()-5 < 0){
      System.out.println("You do not have enough money.Σ(っ °Д °;)っ");
    }
    
  }
  
  public void basketballGame(Player p, Her h){
    System.out.println("There is a basketball game. You participated.");
    //different basketball skills have different chances to win
    int i = (int)(Math.random()*10);
    if(p.getBasketball() > 10){
      if(i < 7){
        System.out.println("You won the game, and got 20 bucks award. " + h.getName() + " watched your game and cheered for you♡.(Basketball +1, Money +20, Love +2)");
        p.addBasketball(1);
        p.addMoney(20);
        p.addLove(2);
        System.out.println(p.printMoney());
      }else{
        System.out.println("However, you lost the gameΣ(っ °Д °;)っ.(Basketball -1)");
        p.addBasketball(-1);
      }
    }else{
      if(i < 4){
        System.out.println("You won the game, and got 20 bucks award. " + h.getName() + " watched your game and cheered for you♡.(Basketball +1, Money +20, Love +2)");
        p.addBasketball(1);
        p.addMoney(20);
        p.addLove(2);
        System.out.println(p.printMoney());
      }else{
        System.out.println("However, you lost the gameΣ(っ °Д °;)っ.(Basketball -1)");
        p.addBasketball(-1);
      }
    }
  }
  
  public void videoGame(Player p, Her h){
    System.out.println("There is a video game competition. You participated.");
    //different videoGame skills have different chances to win
    int i = (int)(Math.random()*10);
    if(p.getGame() > 8){
      if(i < 7){
        System.out.println("You won the game, and got 25 bucks award. " + h.getName() + " thought you did a good job♡.(Game +1, Money +20, Love +2)");
        p.addGame(1);
        p.addMoney(20);
        p.addLove(2);
        System.out.println(p.printMoney());
      }else{
        System.out.println("However, you lost the gameΣ(っ °Д °;)っ.(Game -1)");
        p.addGame(-1);
      }
    }else{
      if(i < 4){
        System.out.println("You won the game, and got 20 bucks award. " + h.getName() + " thought you did a good job♡.(Game +1, Money +20, Love +2)");
        p.addGame(1);
        p.addMoney(20);
        p.addLove(2);
        System.out.println(p.printMoney());
      }else{
        System.out.println("However, you lost the gameΣ(っ °Д °;)っ.(Game -1)");
        p.addGame(-1);
      }
    }
  }
  
  
  
  public void goMovie(Player p, Friend f, Her h){
    System.out.println(f.getName() + " asked you to go to the movie this afternoon. He said he would ask " + h.getName() + " as well. Will you go?");
    System.out.println("(Type y for yes or anything else for no.)");
    if(input.next().equals("y")){
      //if go, check the money
      if(p.getMoney()<15){
        System.out.println("You dont have enough money to go to the movie.Σ(っ °Д °;)っ");
      }else{
        System.out.println("You said you would go.");
        p.setIfMovie(true);
      }
    }
  }
  
  public void upset(Player p, Her h){
    System.out.println(h.getName() + " looks really upset. Would you like to talk to her?");
    System.out.println("(Type y for yes or anything else for no.)");
    int i = (int)(Math.random()*10);
    if(input.next().equals("y")){
      if(i < 5){
        System.out.println("You ask her what heppened and try to comfort her. However, you are not good at comforting people. She smiles \"I know you are tring to comfort me, I am better now\"♡.(Love +1)");
        p.addLove(1);
      }else{
        System.out.println("You ask her what happened, and tell a joke. She laughs♡.(Love +3)");
        p.addLove(3);
      }
    }
  }
  
  public void talkDrama(Player p, Her h){
    System.out.println(h.getName() + " asks you about recent drama.");
    //different drama skills have different chances to win
    int i = (int)(Math.random()*10);
    if(p.getDrama() > 8){
      if(i < 8){
        System.out.println("You watched it as well. You two discuss it happily♡.(Love +3, Drama +1)");
        p.addLove(3);
        p.addDrama(1);
      }else{
        System.out.println("But you did not watch it. She thought you were kind of boring.Σ(っ °Д °;)っ(Love -1, Drama -1)");
        p.addDrama(-1);
        p.addLove(-1);
      }
    }else{
      if(i < 4){
        System.out.println("You watched it as well. You two discuss it happily♡.(Love +3, Drama +1)");
        p.addLove(3);
        p.addDrama(1);
      }else{
        System.out.println("But you did not watch it. She thought you were kind of boringΣ(っ °Д °;)っ.(Love -1, Drama -1)");
        p.addDrama(-1);
        p.addLove(-1);
      }
    }
  }
  
  public void tooRebellious(Player p){
    
    //checked rebelling counter in Day class
    System.out.println("You mom thinks you are too rebellious recently. She took 15 bucks from you and asked you to focus on your studyΣ(っ °Д °;)っ.(Money -15, Love -6)");
    p.addMoney(-15);
    p.addLove(-6);
    System.out.println(p.printMoney());
  }

  
  
  
  
}