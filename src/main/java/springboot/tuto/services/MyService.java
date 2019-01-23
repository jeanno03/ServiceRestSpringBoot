package springboot.tuto.services;

import org.springframework.stereotype.Service;

import springboot.tuto.entities.Data;
import springboot.tuto.entities.DataParent;
import springboot.tuto.entities.result;

@Service
public class MyService implements MyserviceInterface{
	
	@Override
	public DataParent getDataICATest() {

		String[] description1 = {"description1", "description2", "description1", "description2"};
		
		
		result result1 = new result("parent1", description1, "date de fin");
		result result2 = new result("parent2", description1, "date de fin");
		result result3 = new result("parent3", description1, "date de fin");
		
		result[] results = {result1, result2, result3};
		Data data = new Data ();
		data.setResult(results);
		DataParent dataParent = new DataParent(data);
		return dataParent;
	}

}
