package huwande_senior_week1.domain;

public class Tb_Goods {
    private Integer t_id;

    private String t_name;

    private String t_english;

    private Integer t_bid;

    private Integer t_gid;

    private Integer t_size;

    private Double t_price;

    private String t_number;

    private String t_shop;

    private Tb_Brand tb_Brand;
    
    private Tb_goodskind tb_goodskind;

	public Integer getT_id() {
		return t_id;
	}

	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_english() {
		return t_english;
	}

	public void setT_english(String t_english) {
		this.t_english = t_english;
	}

	public Integer getT_bid() {
		return t_bid;
	}

	public void setT_bid(Integer t_bid) {
		this.t_bid = t_bid;
	}

	public Integer getT_gid() {
		return t_gid;
	}

	public void setT_gid(Integer t_gid) {
		this.t_gid = t_gid;
	}

	public Integer getT_size() {
		return t_size;
	}

	public void setT_size(Integer t_size) {
		this.t_size = t_size;
	}

	public Double getT_price() {
		return t_price;
	}

	public void setT_price(Double t_price) {
		this.t_price = t_price;
	}

	public String getT_number() {
		return t_number;
	}

	public void setT_number(String t_number) {
		this.t_number = t_number;
	}

	public String getT_shop() {
		return t_shop;
	}

	public void setT_shop(String t_shop) {
		this.t_shop = t_shop;
	}

	public Tb_Brand getTb_Brand() {
		return tb_Brand;
	}

	public void setTb_Brand(Tb_Brand tb_Brand) {
		this.tb_Brand = tb_Brand;
	}

	public Tb_goodskind getTb_goodskind() {
		return tb_goodskind;
	}

	public void setTb_goodskind(Tb_goodskind tb_goodskind) {
		this.tb_goodskind = tb_goodskind;
	}

	@Override
	public String toString() {
		return "Tb_Goods [t_id=" + t_id + ", t_name=" + t_name + ", t_english=" + t_english + ", t_bid=" + t_bid
				+ ", t_gid=" + t_gid + ", t_size=" + t_size + ", t_price=" + t_price + ", t_number=" + t_number
				+ ", t_shop=" + t_shop + ", tb_Brand=" + tb_Brand + ", tb_goodskind=" + tb_goodskind + "]";
	}

	public Tb_Goods(Integer t_id, String t_name, String t_english, Integer t_bid, Integer t_gid, Integer t_size,
			Double t_price, String t_number, String t_shop, Tb_Brand tb_Brand, Tb_goodskind tb_goodskind) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_english = t_english;
		this.t_bid = t_bid;
		this.t_gid = t_gid;
		this.t_size = t_size;
		this.t_price = t_price;
		this.t_number = t_number;
		this.t_shop = t_shop;
		this.tb_Brand = tb_Brand;
		this.tb_goodskind = tb_goodskind;
	}

	public Tb_Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
