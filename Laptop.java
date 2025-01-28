
public class Laptop {

	private int price;
	private  String company;
	private String Name;
	private String warrenty;
	public Laptop(int price, String company, String name, String warrenty) {
		super();
		this.price = price;
		this.company = company;
		Name = name;
		this.warrenty = warrenty;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
		
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", company=" + company + ", Name=" + Name + ", warrenty=" + warrenty + "]";
	}
	
}
