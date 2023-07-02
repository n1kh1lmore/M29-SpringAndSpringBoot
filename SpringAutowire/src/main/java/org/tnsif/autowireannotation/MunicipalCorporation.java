package org.tnsif.autowireannotation;
public class MunicipalCorporation {
	
	private String area;
	private String mayorName;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMayorName() {
		return mayorName;
	}
	public void setMayorName(String mayorName) {
		this.mayorName = mayorName;
	}
	
	public void corporate()
	{
		System.out.println("Municipal Corporation");
	}
	

}
