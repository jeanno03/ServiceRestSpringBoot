package springboot.tuto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MyAnimal {
	
	private Long id;
	private String race;
	private String name;
	private MyUser myUser;
	
	public MyAnimal() {
		super();
	}

	public MyAnimal(Long id, String race, String name) {
		super();
		this.id = id;
		this.race = race;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyUser getMyUser() {
		return myUser;
	}

	@JsonIgnore
	public void setMyUser(MyUser myUser) {
		this.myUser = myUser;
	}

	@Override
	public String toString() {
		return "MyAnimal [id=" + id + ", race=" + race + ", name=" + name + "]";
	}
	
	

}
