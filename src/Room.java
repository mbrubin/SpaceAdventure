import java.util.ArrayList;
public class Room
{
  protected String name;
  protected ArrayList<RoomExit> exits = new ArrayList<RoomExit>();
  private Item item;
  boolean hasMonster = false;
  boolean hasItem = true;
  private Monster mon = new Monster();
  
  //private ArrayList<LivingBeing> beings;
  protected int planet;

  
  public Room(String n, int p)
  {
    name = n;
    planet = p;
  }
  
  public Room()
  {
    name = "none";
    planet = 9;
  }
  
  public String describe()
  {
    if(planet == 1)
      return "You are on Earth, your home planet. It's nice and green, a pretty decent place. Why are you leaving again? (Hint: remember to search every planet you get to!)";
    else if(planet == 2)
      return "You are on the Moon. It's gray, dusty, and cratered. And gray. The gravity is also pretty low.";
    else if(planet == 3)
      return "You are on Mars. It's red and dusty. The gravity is pretty comfortable though, it's pretty close to Earth.";
    else if(planet == 4)
      return "You are on Hoth. It's icy and really, really cold. The gravity is fairly close to earth. The snow is also great for snowballs.";
    else if(planet == 5)
      return "You are on Tatooine. It's sandy, and really hot. The gravity is similar to Earth's. You've heard that this was the home planet of some guy name Airstrider or something like that.";
    else if(planet == 6)
      return "You are on Pluto. It's small and pretty cold. There isn't much here. The gravity is really low. This place isn't even a planet.";
    else if(planet == 7)
      return "You are on a comet. It's a standard ball of ice. Interestingly enough, it has a probe on it. That was probably pretty impressive at the time. Very little gravity here.";
    //else if(planet == 8)
      return "You are on the Death Star. It's a pretty interesting place- like a big spaceship, with standard Earth gravity. These peopple seem pretty evil though, you should do something about them.";
  }
  
  public String getName()
  {
    return name; 
  }
    
   public void addExit(RoomExit e)
   {
     exits.add(e);
   }
   
  public Item getItem()
  {
    return item; 
  }
   
   public void addItem(Item i)
   {
    item = i; 
   }
   
     public Monster getMonster()
  {
    return mon; 
  }
   
   public void addMonster(Monster mon)
   {
     this.mon = mon;
     this.hasMonster = true;
   }
   
   public void listExits()
   {
     for(int i = 0; i < exits.size(); i++)
       System.out.println(exits.get(i).getDirection());
   }
   
   public String toString()
   {
     return name + ": contains monster " + mon.getName() + " and item " + item.getName();
   }
}