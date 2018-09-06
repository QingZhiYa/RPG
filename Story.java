import java.util.Scanner;
public class Story{
  Scanner input = new Scanner(System.in);
  boolean aEnd;
  
  public void getStory(Player p, Friend f, Her h){
    System.out.println("");
    System.out.println("You are a high school student. Your best friend is " + f.getName() +". Like most high school students do, you have liked a girl in school for a long time. Her name is " + h.getName() + ". She is cute. She is a good student, and she is good at volleyball. There are 30 more days to College Entrance Examination. After 30 days, you are planning to tell her your affection. Before that, do your best to attract her.(ง •_•)ง");
  }
  
  public void getEnd(Player p, Friend f, Her h, Agirl a){
    if(p.getIfGo()){
      System.out.println(a.getName() + " asks you if you are willing to travel around the world with her.");
      System.out.println("(Type y for yes, or anything for no.)");
      if(input.next().equals("y")){
        System.out.println("You pack your stuffs and go travel with " + a.getName() + ". Sometimes you will think about " + h.getName() + ", you feel that is just a beautiful mistake. Thanks god for letting you meet with " + a.getName() + ", your real soulmate.(●'◡'●)");
        aEnd = true;
      }
    }
    if(p.getLove() > 120 && !aEnd){
      if(p.getLove()>135){
      System.out.println(h.getName() + " tells you that she has been into you for a long time. She hopes you could be her boyfriend. You happily acceptes her.");
      }else{
        System.out.println("You tell " + h.getName() + "that you have been into her for a long time, and you hope she could be your girlfriend. She acceptes you.");
      }
      if(p.getKnowledge() > 60){
        System.out.println("After the colleges you applied release the result, you find that you get in the same college with her. So does " + f.getName() + ". You start your college life with them, and the time you liked her in high school became a good memory.❀");
      }else{
        System.out.println("However, good memory does not last long. After the colleges you applied release the result, you find that you did not get in the same college with her. After a few months of college life, she complains that the time you are with her is too short. You are separated after endless arguements.(｡ŏ_ŏ)");
      }
    }else if(!aEnd){
      System.out.println(h.getName() + " tells you that she has a boyfriend, and introduces her boyfriend to you. You say hi awkwardly and leave.");
      if(p.getFriendship() > 50){
        System.out.println("However, at this time, your best friend " + f.getName() + " tells you that his affection to you has been over friendship, and he asks you would you like to be his boyfriend?");
        System.out.println("(Type y for yes, anything else  for no.)");
        if(input.next().equals("y")){
          System.out.println("He happily hugged you. After the colleges you applied release the result, you go to the same college with him, and start your college life with him. The time you spent together in high school became a good memory.☻");
        }else{
          System.out.println("He leaves with disappointment, After the colleges you applied release the result, you go the the same college with him and start your college life, but you are not friends anymore. In the college, you make some new friends, but sometimes you will see him in the campus and cherish the memory you spent with him.(´・ω・`)");
        }
      }else{
        System.out.println("After the colleges you applied release the result, you go the the same college with your best friend " + f.getName() + ". You start your college life, but sometimes you will still think of the memory about " + h.getName() + ".♬");
      }
    }
  }
  
}
