public class Action //item actions - include battlemoves in this class?
{  
  static Player player = new Player();
  static Monster monster;
  static Item item;
  
  static void none()
   {
     System.out.println("You can't use this now.");
   }
  
   /*static void heal(int points)
   {
     player.increaseHealth(points);
   }*/
   
   static void damage(int points, Boolean isAttack, String name)
   {
     if(isAttack)
     {
       System.out.println(player.getName() + " used " + name + " on " + monster.getName() + " for " + points + " points of damage.");
       monster.decreaseHealth(points);
     }
     else //if the player is using an item to damage a monster rather than an attack {should we leave this out to simplify?}
     {
       System.out.println(player.getName() + " used the " + item.getName() + " on " + monster.getName() + " for " + item.getPoints() + " points of damage.");
       monster.decreaseHealth(item.getPoints());
     }
   }
   
   static void drawMap(World w)
   {
     w.drawMap();  
   }
   
   static void setPlayer(Player p)
   {
     player = p; 
   }
   
   public static Player getPlayer()
   {
     return player; 
   }
   
   static void setTargetMonster(Monster m)
   {
     monster = m; 
   }
   
   static void setItem(Item i)
   {
     item = i; 
   }
   
}