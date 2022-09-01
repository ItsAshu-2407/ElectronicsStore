package Simple.electronicsstore;

public class electronicelements {
	private Integer eId;	
	private String eName;
	private String eCompany;
	private Integer ePrice;
	private Integer eModel;
	public Integer geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public String geteCompany() {
		return eCompany;
	}
	public Integer geteModel() {
		return eModel;
	}
	public void setePrice(Integer ePrice) {
		this.ePrice = ePrice;
	}
	public Integer getePrice() {
		return ePrice;
	}
	
	public electronicelements(Integer eId, String eName, String eCompany, Integer ePrice, Integer eModel) {
		this.eId = eId;
		this.eName = eName;
		this.eCompany = eCompany;
		this.ePrice = ePrice;
		this.eModel = eModel;
	}
	@Override
	public String toString() {
		return "electronicelements according to your search [eId=" + eId + ", eName=" + eName + ", eCompany=" + eCompany + ", ePrice=" + ePrice
				+ ", eModel=" + eModel + "]";
	}

}
