public  class LivingBeing{
 protected String name;
 protected String livingBeingType;
 protected int hitPoints;
 protected Room location = World.roomDefault;
 protected boolean roamsOnOwn;
 protected float moveProb;
 protected boolean monsterAlive; 
 protected String info;
 
 public LivingBeing(String n, String t, int h, Room l, boolean r, float m){
   name = n;
   livingBeingType = t;
   hitPoints = h;
   location = l;
   roamsOnOwn = r;
   moveProb = m;
 }
 
 public static void doAttack(){

 }
 
  public Room getLocation()
  {
    return location; 
  }
 
  public int getHP()
  {
    return hitPoints; 
  }
  
  public String getInfo()
  {
    return info; 
  }
  
   public String toString(){
    return "Name = " + name + "  Living Being Type = " + livingBeingType + "  Hit Points = " + hitPoints + "  Location = " + location + "  Roams On Own = " + roamsOnOwn + "  Move Probability = " + moveProb + "  Monster Alive = " + monsterAlive;
  }
   
}

/*public static void main(String args[]){
  Player bob = new Player("bob", "human", 100, deathstar, false, 0.0 , 50, bag);
}*/
