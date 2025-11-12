public class Customer
{
	private String customerName;
	private String bookedBusNo;
	private int age;
	private int bookedSeatNo;
	private String gender;
	private String phoneNumber;
	private String bookingDate;
	private double fareAmount;
	
	public Customer(String customerName,String bookedBusNo,int age,int bookedSeatNo,String gender,String phoneNumber,double fareAmount,String bookingDate)
	{
		this.customerName=customerName;
		this.bookedBusNo=bookedBusNo;
		this.age=age;
		this.bookedSeatNo=bookedSeatNo;
		this.gender=gender;
		this.phoneNumber=phoneNumber;
		this.fareAmount=fareAmount;
		this.bookingDate=bookingDate;
	}
	
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public void setBookedBusNo(String bookedBusNo)
	{
		this.bookedBusNo=bookedBusNo;
	}
	public void setCustomerAge(int age)
	{
		this.age=age;
	}
	public void setBookedSeatNum(int bookedSeatNo)
	{
		this.bookedSeatNo=bookedSeatNo;
	}
	public void setCustomerGender(String gender)
	{
		this.gender=gender;
	}
	public void setCustomerPhoneNo(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public void setCustomerFare(double fareAmount)
	{
		this.fareAmount=fareAmount;
	}
	public void setCustomerBookingDate(String bookingDate)
	{
		this.bookingDate=bookingDate;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	public String getBookedBusNo()
	{
		return bookedBusNo;
	}
	public int getCustomerAge()
	{
		return age;
	}
	public int getBookedSeatNum()
	{
		return bookedSeatNo;
	}
	public String getCustomerGender()
	{
		return gender;
	}
	public String getCustomerPhoneNo()
	{
		return phoneNumber;
	}
	public double getCustomerFare()
	{
		return fareAmount;
	}
	public String getCustomerBookingDate()
	{
		return bookingDate;
	}
	
}