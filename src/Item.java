//import java.util.ArrayList; //??

public class Item
{
  private String name;
  private String action;
  private String info;
  
  private int points; //how many hit points this item heals/damages (if applicable)
  
  public Item(String name, String action, String info)
  {
    this.name = name;
    this.action = action;
    this.info =  info;
  }
  
  public Item(String name, String action, String info, int points)
  {
    this.name = name;
    this.action = action;
    this.info =  info;
    this.points = points;
  }
  
  public String toString()
  {
    return name + ": , Action - " + action + ", Info - " + info;//return "Used " + name; 
  }
  
  public int getPoints()
  {
    return points; 
  }
  
  public String getName()
  {
    return name; 
  }
  
  public String getAction()
  {
    return action; 
  }
  
  public String getInfo()
  {
    return info; 
  }
  
  void use()     //is this unnecessary now?
  {
    if(action.equals("none"))
      Action.none();
    else if(action.equals("heal"))
      Action.player.increaseHealth(points);
    else if(action.equals("damage"))
      Action.monster.decreaseHealth(points);
    
    }
  }
