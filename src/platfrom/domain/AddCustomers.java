package platfrom.domain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public class AddCustomers {
	private int customerId;
	private String companyName;
	private String address;
	private String phone;
	private String country;
	
	@Path("totalhello2")
	public class HellowView {
		@Path("hello2")
		@GET
		@Produces("text/plain")
		public String hello() {
			return "Hellow User!";
		}
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
