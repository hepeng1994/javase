package sql.mysql;

public class Products {
	String id;
	String name;
	String price;
	String caegory;
	String pnum;
	String description;
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price
				+ ", caegory=" + caegory + ", pnum=" + pnum + ", description="
				+ description + "]";
	}
	public Products(String id, String name, String price, String caegory,
			String pnum, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.caegory = caegory;
		this.pnum = pnum;
		this.description = description;
	}
	public Products() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCaegory() {
		return caegory;
	}
	public void setCaegory(String caegory) {
		this.caegory = caegory;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	 

}
