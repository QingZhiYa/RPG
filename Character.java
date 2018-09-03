public abstract class Character{
  private String name;

  public Character(String n){
    name = n;
  }
  //set the name, abstract method
  public abstract void talk(Player p);
  public abstract void giveStuffs(Player p);

  public String getName(){
    return name;
  }
  public void setName(String n){
    name = n;
  }

}