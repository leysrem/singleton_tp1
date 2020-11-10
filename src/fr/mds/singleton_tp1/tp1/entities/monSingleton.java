package fr.mds.singleton_tp1.tp1.entities;

import java.util.ArrayList;
import java.util.List;


public class monSingleton {
	private List<Entity1> result = new ArrayList<Entity1>();
	
	private monSingleton()
    {
		 for (int i = 0; i < 20; i++) {
		      Entity1 e1 = new Entity1();
		      e1.setId(i % 15);
		      e1.setData("data " + i);
		      result.add(e1);
		    }
    }
	
	public void add(Entity1 entity1) {
		result.add(entity1);
	}
	
	  private static monSingleton INSTANCE = null;
	  
	  public static synchronized monSingleton getInstance()
	  {           
	      if (INSTANCE == null)
	      {   INSTANCE = new monSingleton(); 
	      }
	      return INSTANCE;
	  }

	public List<Entity1> getResult() {
		return result;
	}

	public void setResult(List<Entity1> result) {
		this.result = result;
	}
	  
	 
	  

}
