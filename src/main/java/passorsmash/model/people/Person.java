package passorsmash.model.people;

public class Person {
	private String name;
	private String photoPath;
	
	public Person(String name, String photoPath) {
		this.name = name;
		this.photoPath = photoPath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
}