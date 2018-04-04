public class RoomExit
{
  private String direction;
  protected Room leadsTo;
  //private Room leadsTo2;
  //private Room leadsBack;
  private int planet;
  
  public RoomExit(String d, int l)
  {
    direction = d;
    leadsTo = World.getRooms().get(l);
  }
  
  public Room getDestination()
  {
   return leadsTo; 
  }
  
  public String getDirection()
  {
   return direction; 
  }
}