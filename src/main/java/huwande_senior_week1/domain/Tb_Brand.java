package huwande_senior_week1.domain;

public class Tb_Brand {
	private Integer t_bid;
	private String t_bname;
	public Integer getT_bid() {
		return t_bid;
	}
	public void setT_bid(Integer t_bid) {
		this.t_bid = t_bid;
	}
	public String getT_bname() {
		return t_bname;
	}
	public void setT_bname(String t_bname) {
		this.t_bname = t_bname;
	}
	@Override
	public String toString() {
		return "Tb_Brand [t_bid=" + t_bid + ", t_bname=" + t_bname + "]";
	}
	
}
