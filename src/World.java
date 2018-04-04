import java.util.ArrayList;
public class World
{
  public static ArrayList<Room> rooms  = new ArrayList<Room>();
  //public Room currentRoom;
  //public Player p;
  
  public static Room roomDefault = new Room("room", -1);
  
  public World()
  {
    //Create Rooms
    Room planet1 = new Room("Earth", 1  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room planet2 = new Room("The Moon", 2  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room planet3 = new Room("Mars", 3  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room planet4 = new Room("Hoth", 4  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room planet5 = new Room("Tatooine", 5  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room planet6 = new Room("Pluto", 6  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room planet7 = new Room("The Comet", 7  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room planet8 = new Room("The Death Star", 8  /*Itemlist i, ArrayList<LivingBeing> b*/);
    Room blank = new Room();
    rooms.add(blank);
    rooms.add(planet1);
    rooms.add(planet2);
    rooms.add(planet3);
    rooms.add(planet4);
    rooms.add(planet5);
    rooms.add(planet6);
    rooms.add(planet7);
    rooms.add(planet8);
    
    //Create Room exits
    RoomExit exit11 = new RoomExit("left", 2);
    RoomExit exit12 = new RoomExit("right", 3);
    RoomExit exit21 = new RoomExit("left", 4);
    RoomExit exit22 = new RoomExit("right", 5);
    RoomExit exit31 = new RoomExit("left", 6);
    RoomExit exit32 = new RoomExit("right", 7);
    RoomExit exit41 = new RoomExit("straight on", 8);
    RoomExit exit51 = new RoomExit("straight on", 8);
    RoomExit exit61 = new RoomExit("straight on", 8);
    RoomExit exit71 = new RoomExit("straight on", 8);
    
    //Add room exits to rooms
    planet1.addExit(exit11);
    planet1.addExit(exit12);
    planet2.addExit(exit21);
    planet2.addExit(exit22);
    planet3.addExit(exit31);
    planet3.addExit(exit32);
    planet4.addExit(exit41);
    planet5.addExit(exit51);
    planet6.addExit(exit61);
    planet7.addExit(exit71);
    
    //Create items for rooms
    Item item1 = new Item("Laser Sword", "damage", "A powerful saber with a main shaft and two smaller hilt light beams to protect the hands.", 50);
    Item item2 = new Item("Pizza", "heal", "Large Cheese Pizza(extra cheese) mmmmmmm.....Probably shouldn't eat this.", 100);
    Item item3 = new Item("Pizza", "heal", "Large Cheese Pizza(extra cheese)mmmmmmm.....Probably shouldn't eat this.", 100);
    Item item4 = new Item("Rocket Fuel 3", "none", "Use this to get off the planet.");
    Item item5 = new Item("Rocket Fuel", "none", "Use this to get off the planet.");
    Item item6 = new Item("Rocket Fuel", "none", "Use this to get off the planet.");
    Item item7 = new Item("Rossetta Rover", "none", "Hey. Its that thing that landed on the comet, but no fuel.");
    Item item8 = new Item("o_o", "none", "What is this, yo?");
    
    
    //Add items to rooms
    planet1.addItem(item1);
    planet2.addItem(item2);
    planet3.addItem(item3);
    planet4.addItem(item4);
    planet5.addItem(item5);
    planet6.addItem(item6);
    planet7.addItem(item7);
    planet8.addItem(item8);
    
    
    
    //Create monsters  public Monster(String n, String t, int h, Room l, boolean r, float m, boolean a)
    //Monster monster1 = new Monster("Alien", "placeholder", 50, planet1, false, 0.0f, true);
    Monster monster2 = new Monster("Alien", "placeholder", 50, planet2, false, 0.0f, true, "This alien is green.", 20);
    Monster monster3 = new Monster("Alien", "placeholder", 50, planet3, false, 0.0f, true, "This alien is red.", 30);
    Monster monster4 = new Monster("Alien", "placeholder", 50, planet4, false, 0.0f, true, "THESE ARE PLACEHOLDER INFOS", 40);
    Monster monster5 = new Monster("Alien", "placeholder", 50, planet5, false, 0.0f, true, "SOMEONE SHOULD WRITE REAL INFO FOR THESE MONSTERS", 50);
    Monster monster6 = new Monster("Alien", "placeholder", 50, planet6, false, 0.0f, true, "LOL", 60);
    //Monster monster7 = new Monster("Alien", "placeholder", 50, planet7, false, 0.0f, true, "YOLO", 42);
    Monster monster8 = new Monster("Alien", "placeholder", 50, planet8, false, 0.0f, true, "This alien is kill.", 70);
    
    //Add monster to rooms
    //planet1.addMonster(monster1);
    planet2.addMonster(monster2);
    planet3.addMonster(monster3);
    planet4.addMonster(monster4);
    planet5.addMonster(monster5);
    planet6.addMonster(monster6);
    //planet7.addMonster(monster7);
    planet8.addMonster(monster8);
  }
  
  public static ArrayList<Room> getRooms()
  {
   return rooms; 
  }
  public static void drawMap()
  {
   System.out.println("placeholder"); 
  }
}