package dto;

public class CavinVO {
	private int cavinId;
	private String cavinName;
	private String bedType;
	private String views; // ���׺�, ����ƾ��..
	private int personal; // �� ��?
	private String options;
	private int rate; // �ݾ�
	private int weekendRate; // �ָ���
	
	public int getCavinId() {
		return cavinId;
	}
	public void setCavinId(int cavinId) {
		this.cavinId = cavinId;
	}
	public String getCavinName() {
		return cavinName;
	}
	public void setCavinName(String cavinName) {
		this.cavinName = cavinName;
	}
	public String getBedType() {
		return bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public String getViews() {
		return views;
	}
	public void setViews(String views) {
		this.views = views;
	}
	public int getPersonal() {
		return personal;
	}
	public void setPersonal(int personal) {
		this.personal = personal;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getWeekendRate() {
		return weekendRate;
	}
	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}
	
	
}
