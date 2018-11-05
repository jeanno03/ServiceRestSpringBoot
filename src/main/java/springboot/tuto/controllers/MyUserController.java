package springboot.tuto.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.tuto.entities.MyAnimal;
import springboot.tuto.entities.MyUser;

@RestController
public class MyUserController {
	
	@CrossOrigin("*")
	@RequestMapping(value = "/getMyUserExample", method = RequestMethod.GET)
	public MyUser getMyUserExample() {
		MyAnimal animal01 = new MyAnimal (1l,"chien","Médor");
		MyAnimal animal02 = new MyAnimal (2l,"chien","Rantanplan");
		MyAnimal animal03 = new MyAnimal (3l,"chat","Félix");
		
		Set animals = new HashSet<MyAnimal>() {
			{
				add(animal01);
				add(animal02);
				add(animal03);
			}
		};
		
		MyUser myUser = new MyUser("Baltazar","Jean",19);
		myUser.setMyAnimals(animals);
		
		return myUser;
	}

}
