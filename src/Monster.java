public class Monster extends LivingBeing{
 
  boolean monsterAlive; 
  int maxDamage;
 
 public Monster()//makes a default monster
 {
   super("Monster", "monster", 100, World.roomDefault, false, 0.0f);
   monsterAlive = true;
 }
 
 public Monster(String n, String t, int h, Room l, boolean r, float m, boolean a, String i, int md){
   super(n,t,h,l,r,m);
   name = n;
   livingBeingType = t;
   hitPoints = h;
   location = l;
   roamsOnOwn = r;
   moveProb = m;
   monsterAlive = a;
   info = i;
   maxDamage = md;
}

void doAttack(Player player, int h){
  player.decreaseHealth(h);
}

void decreaseHealth(int h){
  hitPoints = hitPoints - h;
  if(hitPoints <= 0)
  {
   kill();
    //System.out.println(name + " is kill.");
  }
  else
  {
    System.out.println(name + " took " + h + " points of damage.\n " + hitPoints + " HP remaining.");
  }
}

void kill(){
 monsterAlive = false; 
}


  public int getMaxDamage()
  {
    return maxDamage; 
  }

  public String getName()
  {
    return name;
  }

public String toString(){
 return super.toString() + "  Monster Alive = " + monsterAlive;
}

}

