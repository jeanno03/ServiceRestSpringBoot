package springboot.tuto.entities;

import java.util.Arrays;

public class result {
	
	private String parent;
	private String [] description;
	private String u_end_date;
	
	public result() {
		super();
	}

	public result(String parent, String[] description, String u_end_date) {
		super();
		this.parent = parent;
		this.description = description;
		this.u_end_date = u_end_date;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String[] getDescription() {
		return description;
	}

	public void setDescription(String[] description) {
		this.description = description;
	}

	public String getU_end_date() {
		return u_end_date;
	}

	public void setU_end_date(String u_end_date) {
		this.u_end_date = u_end_date;
	}

	@Override
	public String toString() {
		return "result [parent=" + parent + ", description=" + Arrays.toString(description) + ", u_end_date="
				+ u_end_date + "]";
	}
	

}
