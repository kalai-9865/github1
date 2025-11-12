public class TicketBooking
{
	private String bookingId;
	private String userId;
	private String busId;
	private String busName;
	private String busFrom;
	private String busTo;
	private String bookingDate;
	private String travelDate;
	private int seatCount;
	private double totalAmount;
	
	public TicketBooking(String bookingId,String userId,String busId,String busName,String busFrom,String busTo,String bookingDate,String travelDate,int seatCount,double totalAmount)
	{
		this.bookingId=bookingId;
		this.userId=userId;
		this.busId=busId;
		this.busName=busName;
		this.busFrom=busFrom;
		this.busTo=busTo;
		this.bookingDate=bookingDate;
		this.travelDate=travelDate;
		this.seatCount=seatCount;
		this.totalAmount=totalAmount;
	}
	
	public void setBookingId(String bookingId)
	{
		this.bookingId=bookingId;
	}
	public void setUserId(String userId)
	{
		this.userId=userId;
	}
	public void setBusId(String busId)
	{
		this.busId=busId;
	}
	public void setBusName(String busName)
	{
		this.busName=busName;
	}
	public void setFromBus(String busFrom)
	{
		this.busFrom=busFrom;
	}
	public void setToBus(String busTo)
	{
		this.busTo=busTo;
	}
	public void setBookingDate(String bookingDate)
	{
		this.bookingDate=bookingDate;
	}
	public void setTravelDate(String travelDate)
	{
		this.travelDate=travelDate;
	}
	public void setSeatCount(int seatCount)
	{
		this.seatCount=seatCount;
	}
	public void setTotalAmount(double totalAmount)
	{
		this.totalAmount=totalAmount;
	}
	
	
	public String getBookingId()
	{
		return bookingId;
	}
	public String getUserId()
	{
		return userId;
	}
	public String getBusId()
	{
		return busId;
	}
	public String getBusName()
	{
		return busName;
	}
	public String getFromBus()
	{
		return busFrom;
	}
	public String getToBus()
	{
		return busTo;
	}
	public String getBookingDate()
	{
		return bookingDate;
	}
	public String getTravelDate()
	{
		return travelDate;
	}
	public int getSeatCount()
	{
		return seatCount;
	}
	public double getTotalAmount()
	{
		return totalAmount;
	}
	
}