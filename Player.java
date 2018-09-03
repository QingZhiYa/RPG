import java.util.List;
import java.util.ArrayList;
public class Player{
  private int love = 0;
  private int knowledge = 0;
  private int rebelling = 0;
  private int money = 0;
  private int friendship = 0;
  private int affection = 0;
  private int basketball = 0;
  private int game = 0;
  private int drama = 0;
  //add some initial data
  
  private int water = 0;
  private int chocolate = 0;
  private int book = 0;
  private int flower = 0;
  
  private int rebellingCounter = 0;
  
  private String personality;
  
  private boolean ifGo;
  private boolean ifMovie;
  //type it


  List<String> item = new ArrayList<String>();

  private String name;

  //set name
  public Player(String n){
    name = n;
  }
  
  public void setPersonality(String p){
    personality = p;
  }
  public String getPersonality(){
    return personality;
  }
  public void checkPersonality(){
    if(personality.equals("a")){
      basketball += 5;
    }else if(personality.equals("c")){
      love += 5;
    }else if(personality.equals("s")){
      knowledge += 5;
    }
  }
  //all setter and getter
  public void addLove(int num){
    love += num;
  }
  public int getLove(){
    return love;
  }
  public void addKnowledge(int num){
    knowledge += num;
  }
  public int getKnowledge(){
    return knowledge;
  }
  public void addRebelling(int num){
    rebelling += num;
    if(num > 0){
      rebellingCounter +=1;
    }else{
      rebellingCounter = 0;
    }
  }
  public int getRebelling(){
    return rebelling;
  }
  public void addMoney(int num){
    money += num;
  }
  public String printMoney(){
    return "Now you have " + money + " bucks.";
  }
  public int getMoney(){
    return money;
  }
  public void addFriendship(int num){
    friendship += num;
  }
  public int getFriendship(){
    return friendship;
  }
  public void addAffection(int num){
    affection += num;
  }
  public int getAffection(){
    return affection;
  }
  public void addBasketball(int num){
    basketball += num;
  }
  public int getBasketball(){
    return basketball;
  }
  public void addGame(int num){
    game += num;
  }
  public int getGame(){
    return game;
  }
  public void addDrama(int num){
    drama += num;
  }
  public int getDrama(){
    return drama;
  }
  //item
  public void addItem(String newItem){
    item.add(newItem);
  }
  public void checkItem(){
    water = 0;
    chocolate = 0;
    book = 0;
    flower = 0;
    for(String i : item){
      if(i.equals("water")){
        water +=1;
      }else if(i.equals("chocolate")){
        chocolate +=1;
      }else if(i.equals("book")){
        book += 1;
      }else if(i.equals("flower")){
        flower +=1;
      }
    }
    System.out.println("You have bottle water*" + water + ", chocolate*" + chocolate + ", book*" + book + ", and flower*" + flower);
  }
  
  public int getWater(){
    return water;
  }
  public int getChocolate(){
    return chocolate;
  }
  public int getBook(){
    return book;
  }
  public int getFlower(){
    return flower;
  }
  
  public void removeItem(String usedItem){
    item.remove(usedItem);
  }
  
  public void setRebellingC(int c){
    rebellingCounter = c;
  }
  public int getRebellingC(){
    return rebellingCounter;
  }
  public void setIfGo(boolean ig){
    ifGo = ig;
  }
  public boolean getIfGo(){
    return ifGo;
  }
  public void setIfMovie(boolean im){
    ifMovie = im;
  }
  public boolean getIfMovie(){
    return ifMovie;
  }
}