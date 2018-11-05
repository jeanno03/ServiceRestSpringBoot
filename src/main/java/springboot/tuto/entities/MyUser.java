package springboot.tuto.entities;

import java.util.Set;

public class MyUser {
	
	private String login;
	private String name;
	private int age;
	private Set<MyAnimal> myAnimals;
	
	public MyUser() {
		super();
	}

	public MyUser(String login, String name, int age) {
		super();
		this.login = login;
		this.name = name;
		this.age = age;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<MyAnimal> getMyAnimals() {
		return myAnimals;
	}

	public void setMyAnimals(Set<MyAnimal> myAnimals) {
		this.myAnimals = myAnimals;
	}

	@Override
	public String toString() {
		return "MyUser [login=" + login + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
