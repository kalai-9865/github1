public class Admins
{
	private String adminId;
	private String adminName;
	private String adminPassword;
	private String adminphoneNumber;
	
	public Admins(int adminId,String adminName,String adminPassword,String adminphoneNumber)
	{
		this.adminId=adminId;
		this.adminName=adminName;
		this.adminPassword=adminPassword;
		this.adminphoneNumber=adminphoneNumber;
	}
	
	public void setAdminId(String adminId)
	{
		this.adminId=adminId;
	}
	public void setAdminName(String adminName)
	{
		this.adminName=adminName;
	}
	public void setAdminPassword(String adminPassword)
	{
		this.adminPassword=adminPassword;
	}
	public void setAdminPhoneNum(String adminphoneNumber)
	{
		this.adminphoneNumber=adminphoneNumber;
	}
	
	public String getAdminId()
	{
		return adminId;
	}
	public String getAdminName()
	{
		return adminName;
	}
	public String getAdminPassword()
	{
		return adminPassword;
	}
	public String getAdminPhoneNum()
	{
		return adminphoneNumber;
	}
	
}
