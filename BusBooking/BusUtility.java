import java.util.ArrayList;

public class BusUtility 
{

    ArrayList<Bus>buses=new ArrayList<>();

    public void addBus(String busnum,int totalseat,int availableseat,String fromplace,String toplace,String start,String arrival,double busfare)
    {
        System.out.println("bus added successfully ! bus number :"+busnum);
    }

   
    public boolean removeBus(String busNo)
    {
       for (int i=0;i<buses.size();i++)
        {
            if (buses.get(i).getBusNumber().equals(busNo))
            {
                buses.remove(i);
                System.out.println("bus removed successfully! bus num : " + busNo);
                return true;
            }
        }
            System.out.println("bus No not found!");
            return false;
    }
 
    public void viewAllBuses() 
	{
        if (buses.isEmpty())
		    {
               System.out.println("No buses available.");
               return;
            }
           for (Bus b : buses)
		        {
                   System.out.println("");
                   System.out.println("BUS NO          : " + b.getBusNumber());
                   System.out.println("FROM            : " + b.getBusFrom());
                   System.out.println("TO              : " + b.getBusTo());
                   System.out.println("TOTAL SEATS     : " + b.getBusTotalSeat());
                   System.out.println("AVAILABLE SEATS : " + b.getBusAvailableSeat());
                   System.out.println("START TIME      : " + b.getBusStartTime());
                   System.out.println("ARRIVAL TIME    : " + b.getBusArrivalTime());
                   System.out.println("FARE PER SEAT   : " + b.getBusFare());
                   System.out.println("-------------------------------------------");
                }
    }

	  
	public void searchBus(String search)
	{
		boolean found=false;
        for(Bus b:buses)
		{
			if(b.getBusNumber().equals(search))
			{
				System.out.println("bus number : " +b.getBusNumber());
                System.out.println("bus time   : " +b.getBusStartTime());
                System.out.println("bus fare   : " +b.getBusFare());
                found = true;
            }
        }
             if(!found) 
		    {
			    System.out.println("bus not found: " + search);
		    }
    }
	 
    public boolean updateBus(String busNo,int newTotalSeat,int newAvailableSeat,String newStartTime,String newArrivalTime,double newFare) 
    {
      for (Bus b:buses) 
	    {
            if (b.getBusNumber().equals(busNo)) 
		    {
                b.setBusTotalSeat(newTotalSeat);
                b.setBusAvailableSeat(newAvailableSeat);
                b.setBusStartTime(newStartTime);
                b.setBusArrivalTime(newArrivalTime);
                b.setBusFare(newFare);

                System.out.println("bus updated successfully! bus No: " + busNo);
                return true;
            }
        }
                System.out.println("bus not found with number: " + busNo);
                return false;
    }

    public Bus findBusById(String busId) 
    {
        for (Bus b:buses) 
		{
            if (b.getBusNumber().equals(busId))
			{
                return b;
            }
        }
        return null;
    }

    public void reduceSeats(String busId,int count) 
    {
        Bus bus=findBusById(busId);
        if (bus!=null) 
		{
            int available=bus.getBusAvailableSeat();
            if (count<=available) 
			{
                bus.setBusAvailableSeat(available - count);
                System.out.println("seats reduced! remaining: " + bus.getBusAvailableSeat());
            } 
			else
			{
                System.out.println("seats not available!");
            }
        } 
		    else 
		    {
               System.out.println("bus not found!");
            }
    }

    public void increaseSeat(String busId, int count) 
	{
        Bus bus=findBusById(busId);
        if (bus!=null) 
		{
            bus.setBusAvailableSeat(bus.getBusAvailableSeat() + count);
            System.out.println("seats restored successfully! new available: " + bus.getBusAvailableSeat());
        } 
		else 
		{
            System.out.println("bus not found!");
        }
    }

}