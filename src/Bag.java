public class Bag extends ItemList
{
  private int maxItems;
  
  public Bag(int max)
  {
    maxItems = max; 
  }
      
  
  public void addToBag(Item i)
  {
    add(i);  
  }  
  
  public String toString()
  {
    String str = "" + Action.getPlayer().getName() + "'s bag:\n";
    for(int i = 0; i < size(); i++)
    {
      str += "\t" + get(i).getName() + ": " + get(i).getInfo() + "\n";
    }
    return str;
  }

}