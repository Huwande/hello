package huwande_senior_week1.domain;

public class Tb_goodskind {
	private Integer t_gid;
	private String t_gname;
	public Integer getT_gid() {
		return t_gid;
	}
	public void setT_gid(Integer t_gid) {
		this.t_gid = t_gid;
	}
	public String getT_gname() {
		return t_gname;
	}
	public void setT_gname(String t_gname) {
		this.t_gname = t_gname;
	}
	@Override
	public String toString() {
		return "Tb_goodskind [t_gid=" + t_gid + ", t_gname=" + t_gname + "]";
	}
	
}
