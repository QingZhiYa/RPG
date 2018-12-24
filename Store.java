import java.util.Scanner;
public class Store extends Place{
  Scanner input = new Scanner(System.in);
  
  public void whatToDo(Player p, Friend f, Her h){
    System.out.println("※In the Store.☕");
    System.out.println("What would you like to buy?");
    System.out.println(p.printMoney());
    System.out.println("┌----------------------┐");
    System.out.println(" |Water----------3 bucks|");
    System.out.println(" |Flower--------15 bucks|");
    System.out.println(" |Book----------10 bucks|");
    System.out.println(" |Chocolate------8 bucks|");
    System.out.println("└----------------------┘");
    System.out.println("(Type w for water, f for flower, b for book, c for chocolate or type anything else to quit.)");
    String i = input.next();
    if(i.equals("w")&&p.getMoney()>1){
      p.addItem("water");
      System.out.println("You bought a bottle of water.");
      p.addMoney(-3);
    }else if(i.equals("f")&&p.getMoney()>19){
      p.addItem("flower");
      System.out.println("You bought flower.");
      p.addMoney(-15);
    }else if(i.equals("b")&&p.getMoney()>7){
      p.addItem("book");
      System.out.println("You bought a book.(Knowledge +3)");
      p.addMoney(-10);
      p.addKnowledge(3);
    }else if(i.equals("c")&&p.getMoney()>9){
      p.addItem("chocolate");
      System.out.println("You bought some chocolates.");
      p.addMoney(-8);
    }else{
      System.out.println("You dont have enough money or you type wrong(๑°ㅁ°๑).");
    }System.out.println(p.printMoney());
  }
  
  public void meetSomeone(Player p, Friend f, Her h, Agirl a){
    int b = (int)(Math.random()*10);
    if(b < 1 && p.getMoney()>=10){
      System.out.println("Your wallet was stolenΣ(っ °Д °;)っ.(Money -10)");
      p.addMoney(-10);
    }else if(b < 1 && p.getMoney()<10){
      System.out.println("Your wallet was stolenΣ(っ °Д °;)っ.(Money -" + p.getMoney() + ")");
      p.addMoney(-p.getMoney());
    }
  }
  
  
  
}
