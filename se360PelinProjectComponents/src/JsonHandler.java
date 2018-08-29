
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonHandler {
	final static String dataPath = "/Users/armanyigit/Documents/workspace/se360pelinProjectComponents/bin/data/";
	static Gson gson;
	
	public JsonHandler(){
		gson = new GsonBuilder().create();
	}
	
	public static String getDatapath() {
		return dataPath;
	}
	
	public Object getObjectFromJsonFile(String jsonFileId, Class<?> cls){
		System.out.println("IN GET OBJECT FROM JSON FILE");
		Path pathToGetJsonObjectFrom = getPathFromString(dataPath + jsonFileId + ".json");
		
		String line = null;
		try (BufferedReader reader = Files.newBufferedReader(pathToGetJsonObjectFrom)) {
			line = reader.readLine();
			System.out.println(line);
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		return getObjectByJsonString(line, cls);
	}
	
	public void createJsonFileWithData(String jsonFileId, Object data){
		Path pathToCreateJsonTo = getPathFromString(dataPath + jsonFileId + ".json");
		String convertedJsonObject = getJsonStringByObject(data);
		try (BufferedWriter writer = Files.newBufferedWriter(pathToCreateJsonTo)) {
		    writer.write(convertedJsonObject, 0, convertedJsonObject.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
	
	public static Path getPathFromString(String pathString){
		Path ph = Paths.get(pathString);
		return ph;
	}
	
	public static Object getObjectByJsonString(String line, Class<?> cls){
		System.out.println("IN GET OBJECT BY JSON STRING");
		Object fromJson = gson.fromJson(line, cls);
		return fromJson;
	}
	
	public static String getJsonStringByObject(Object obj){
		System.out.println("IN GET JSON STRING BY OBJECT");
		String jsonOutput = gson.toJson(obj);
		return jsonOutput;
	}
	
}
