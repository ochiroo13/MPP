package prob2C;

import java.util.List;

public class Student {

	private String name;

	private List<Section> listSection; // can be null

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Section> getListSection() {
		return listSection;
	}

	public void setListSection(List<Section> listSection) {
		this.listSection = listSection;
	}

}
