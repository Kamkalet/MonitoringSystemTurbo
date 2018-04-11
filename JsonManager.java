package json.json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.type.TypeReference;

public class JsonManager {
	private static ObjectMapper mapper = new ObjectMapper();
	
	private JsonManager() {};
	
	public static void save(List<Program> list) throws JsonGenerationException, JsonMappingException, IOException {
		
		mapper.writeValue(new File("config.json"), list);		
	}
	
	public static List<Program> load() throws JsonParseException, JsonMappingException, IOException {
		List<Program> list = mapper.readValue(new File("config.json"), new TypeReference<List<Program>>() { });
		return list;
	}
	

}
