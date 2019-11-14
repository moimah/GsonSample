package dad.maven.gson.GsonSample;
import com.google.gson.*;

public class Main {

	public static void main(String[] args) {
		
				
		Persona p = new Persona();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
				
		
	}

}



