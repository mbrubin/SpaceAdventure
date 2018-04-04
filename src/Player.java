public class Player extends LivingBeing{
 double money;
 Bag things;
 
 public Player()//makes a default player
 {
   super("Player", "human", 100, World.getRooms().get(0), false, 0.0f);
   money = 50.0;
   things = new Bag(10);
 }
 
 public Player(String n, String t, int h, Room l, boolean r, float m, double ss, Bag stuff){
   super(n,t,h,l,r,m);
   name = n;
   livingBeingType = t;
   hitPoints = h;
   location = l;
   roamsOnOwn = r;
   moveProb = m;
   money = ss;
   things = stuff;
}

void doAttack(Monster monster,int dmg){
  monster.decreaseHealth(dmg);
}
void decreaseHealth(int h){
  hitPoints = hitPoints - h;
}

void increaseHealth(int h){
  hitPoints = hitPoints + h;
}

 public void setLocation(Room room)
 {
   location = room;
 }
 
 void money(int hashtagcashmoney){
   money = hashtagcashmoney;
 }
 
 public void setName(String n)
 {
   name = n;
 }
 
 String getName(){
  return name;
}
 
 public void fight(Monster mon)
 {
   
   //return fatality;
 }

public String toString(){
 return super.toString() + "  money = " + money + "  things = " + things; 
}

}

