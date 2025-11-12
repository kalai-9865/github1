public class Bus
{
	private String busNo;
	private int totalSeat;
	private int availableSeat;
	private String from;
	private String to;
	private String startTime;
	private String arrivalTime;
	private double farePerSeat;
	
	public Bus(String busNo,int totalSeat,int availableSeat,String from,String to,String startTime,String arrivalTime,double farePerSeat)
	{
		this.busNo=busNo;
		this.totalSeat=totalSeat;
		this.availableSeat=availableSeat;
		this.from=from;
		this.to=to;
		this.startTime=startTime;
		this.arrivalTime=arrivalTime;
		this.farePerSeat=farePerSeat;
	}
	
	public void setBusNumber(String busNo)
	{
		this.busNo=busNo;
	}
	public void setBusTotalSeat(int totalSeat)
	{
		this.totalSeat=totalSeat;
	}
	public void setBusAvailableSeat(int availableSeat)
	{
		this.availableSeat=availableSeat;
	}
	public void setBusFrom(String from)
	{
		this.from=from;
	}
	public void setBusTo(String to)
	{
		this.to=to;
	}
	public void setBusStartTime(String startTime)
	{
		this.startTime=startTime;
	}
	public void setBusArrivalTime(String arrivalTime)
	{
		this.arrivalTime=arrivalTime;
	}
	public void setBusFare(double farePerSeat)
	{
		this.farePerSeat=farePerSeat;
	}
	
	public String getBusNumber()
	{
		return busNo;
	}
	public int getBusTotalSeat()
	{
		return totalSeat;
	}
	public int getBusAvailableSeat()
	{
		return availableSeat;
	}
	public String getBusFrom()
	{
		return from;
	}
	public String getBusTo()
	{
		return to;
	}
	public String getBusStartTime()
	{
		return startTime;
	}
	public String getBusArrivalTime()
	{
		return arrivalTime;
	}
	public double getBusFare()
	{
		return farePerSeat;
	}

}





