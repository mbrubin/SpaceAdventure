import java.util.Scanner;
public class SpaceAdventure{
  
  public static void print(String s)//slowPrint(String s) //prints one letter at a time
  {
    double x = 0;
    for(int i = 0; i < s.length(); i++)
    {
      x = System.currentTimeMillis();
      while(System.currentTimeMillis() - x < 30){} //wait a certain number of milliseconds
      System.out.print(s.charAt(i));
    }
    System.out.println();
  }
  
  public static void pause()
  {
    print("    "); 
  }
  
  public static void main(String args[]){
   World world = new World(); 
   Bag bag = new Bag(5);
   Player p1 = new Player("Bob", "human", 100, World.rooms.get(1), false, 0.0f , 50.0, bag);
   p1.setLocation(World.rooms.get(1));//SET TO CORRECT STARTING PLANET
   Action.setPlayer(p1);
   //Monster monster1 = new Monster("lol", "alien", 100, World.getRooms().get(2), true, 1.0f , true);
   //new Item("Laser Sword", "damage", "The almighty sword. You better save this baby for a dire situation.", 50));
   
   //**Main loop*******************************************************************************************************
   String input = "";
   Boolean b = true; //generic boolean used in while loops
   int temp = 0;
   boolean usedCommand = false;
   Scanner scan = new Scanner(System.in);
   
   print("You are a person.");
   pause();
   print("What is your name?");
   p1.setName(scan.nextLine());
   print("Hello, " + p1.getName() + ".");
   pause();
   print("Welcome to your adventure!");
   pause();  
   print("Once upon a time, you decide to travel to outer space for some reason.");
   
   print("Note: type \"help\" anytime for command list");
   
   do
   {
     //System.out.println(p1);
     System.out.println("\n---Enter a command:\n");
     input = scan.nextLine().toLowerCase().trim();
     if(input.equals("help"))
       System.out.println("Valid Commands:\n-help\n-bag/inventory/items\n-search/inspect\n-move/go");
     else if(input.equals("bag") || input.equals("inventory") || input.equals("items"))
       System.out.println(bag);
     else if(input.equals("search") || input.equals("inspect"))
     { 
       print(p1.getName() + " looked around on " + p1.getLocation().getName() + ".");
       pause();
       if(p1.getLocation().hasItem) //if the room's item has not already been collected (boolean)
       { 
         print("***" + p1.getName() + " sees an item laying on the ground in the distance.");
         pause();
         //if(has space in bag)
         print(p1.getName() + " approaches and picks up the " + p1.getLocation().getItem().getName() + ".\n");
         bag.add(p1.getLocation().getItem());
         p1.getLocation().hasItem = false;
       }
       if(p1.getLocation().hasMonster)
       {
         print("***Oh wow! " + p1.getName() + " spotted an " + p1.getLocation().getMonster().getName() + "!");
         pause();
         print("Crikey!");
         pause();
         print(p1.getLocation().getMonster().getName() + " is running towards you!");
         pause();
         print("Fight!");
         //***battle while loop
         while((p1.getHP() > 0 && p1.getLocation().getMonster().getHP() > 0) && b)
         {
           print("\n" + p1.getName() + "'s HP: " + p1.getHP() + "/100\t\t" + p1.getLocation().getMonster().getName() + "'s HP: " + p1.getLocation().getMonster().getHP() + "/50");
           pause();
           System.out.println("!!!Enter a battle command:");
           input = scan.nextLine();
           input = input.trim().toLowerCase();
           while(input.equals("help") || input.equals("search") || input.equals("inspect"))
           {
             if(input.equals("help"))
             {
               System.out.println("Valid battle commands:\n-search/inspect\n-item/items/bag/use\n-run/escape");
               input = scan.nextLine().trim().toLowerCase();
             }
             if(input.equals("search") || input.equals("inspect"))
             {
               print(p1.getName() + " examined " + p1.getLocation().getMonster().getName() + ":");
               pause();
               print(p1.getLocation().getMonster().getInfo());
             }
             input = scan.nextLine().trim().toLowerCase();
           }
           if(input.equals("item") || input.equals("items") || input.equals("bag") || input.equals("use"))
           {
             usedCommand = true;
             print("Use which item? (type \"back\" to go back)");
             while(b)
             {
              for(int i = 0; i < bag.size(); i++)
                System.out.println("-" + bag.get(i).getName());
              input = scan.nextLine();                
              input = input.trim().toLowerCase();
              if(input.equals("back"))
                
                break;
              for(int i = 0; i < bag.size() && b; i++)
              {
                if(input.equals(bag.get(i).getName().trim().toLowerCase()))
                {
                  if(bag.get(i).getAction().equals("damage"))
                  {
                    print(p1.getName() + " hit " + p1.getLocation().getMonster().getName() + " with the " + bag.get(i).getName() + " for " + bag.get(i).getPoints() + " damage."); 
                    p1.getLocation().getMonster().decreaseHealth(bag.get(i).getPoints());
                  }
                  else if(bag.get(i).getAction().equals("heal"))
                  {
                    if(p1.getHP() == 100)
                      print("You already have maximum HP, dumbo.");
                    else
                    {
                      temp = 100 - p1.getHP();
                      if(bag.get(i).getPoints() <= temp)
                      {
                        print(p1.getName() + " was healed by " + bag.get(i).getPoints() + " HP.");
                        p1.increaseHealth(bag.get(i).getPoints());
                      }
                      else //if item heals more HP than the player's maximum
                      {
                        print(p1.getName() + " was healed by " + temp + " HP.");
                        p1.increaseHealth(temp);
                      }
                        
                    }
                  }
                  b = false;
                }
              }
             }
             b = true;
           }
           else if(input.equals("run") || input.equals("escape"))
           {
             usedCommand = true;
             print(p1.getName() + " is trying to run away from " + p1.getLocation().getMonster().getName());
             pause();
             System.out.print(". ");
             pause();
             pause();
             System.out.print(". ");
             pause();
             pause();
             System.out.print(". ");
             pause();
             pause();
             if((int)(Math.random()*2) == 1)
             {
               print(p1.getName() + " escaped!");
               b = false;
               break;
             }
             else
               print(p1.getName() + " could not escape!");
           }
           if(p1.getLocation().getMonster().getHP() <= 0)
           {
             p1.getLocation().hasMonster = false;
             print(p1.getLocation().getMonster().getName() + " is kill. It exploded into bits.");
           }
           if(p1.getLocation().getMonster().getHP() > 0 && usedCommand)  //monster attacks player
           {
             temp = (int)(Math.random()*p1.getLocation().getMonster().getMaxDamage()) + 20;
             System.out.println("SMACK!");
             pause();
             pause();
             print(p1.getLocation().getMonster().getName() + " attacked " + p1.getName() + " for " + temp + " points of damage!!1!");
             p1.decreaseHealth(temp);
           }
           usedCommand = false;
           if(p1.getHP() <= 0)
           {
             print("YOU ARE KILL.");
             b = false;
           }
         }
         b = true;
       }
     }
     else if(input.equals("move") || input.equals("go"))
     {
       //(list exits?) prompt the user to decide which exit to take
       print("Go where?");
       for(int x = 0; x < p1.getLocation().exits.size(); x++)
         print("-" + p1.getLocation().exits.get(x).getDirection());
       do
       {
         input = scan.nextLine();
         for(int z = 0; z < p1.getLocation().exits.size(); z++)
         {
           if(input.equals(p1.getLocation().exits.get(z).getDirection()))
           {
             p1.setLocation(p1.getLocation().exits.get(z).getDestination());
             b = false;
             print(p1.getName() + " landed on " + p1.getLocation().getName() + "!");
           }
         }               
       }
       while(b);
       b = true;
     }
     
   }
   while(!input.equals("end") && p1.getHP() > 0);
   
   print("\nThanks for playing!\n\nGame made by ‚ Ben Mesnik 2014");
  }
} 