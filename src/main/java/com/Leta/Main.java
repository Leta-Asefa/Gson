package com.Leta;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) {
		List<Student> students=Arrays.asList(new Student("Tigist",34,"IT",true),
											new Student("Sol",34,"IT",true),
											new Student("Matiyas",34,"IT",true),
											new Student("Selam",34,"IT",true),
											new Student("Beka",34,"IT",true));		
		

		
		save(students);
		students.clear();
		students=readStudentsFromFile();
		
		
	}
	
	
	
	public static String save(List<Student> students) {
		String path="student.json";
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		try (FileWriter writer=new FileWriter(path)){
			
			gson.toJson(students,writer);
			return "Saved !";
			
		}catch(IOException e) {
			e.printStackTrace();	
			return "Not Saved !";
		}
		
	}
	
	
	  private static List<Student> readStudentsFromFile() {
		  String filePath="student.json";
	        try (FileReader fileReader = new FileReader(filePath)) {
	            Type listType = new TypeToken<ArrayList<Student>>() {}.getType();
	            return new Gson().fromJson(fileReader, listType);
	        } catch (IOException e) {
	            // If the file doesn't exist or an error occurs during reading, return an empty list
	            return new ArrayList<>();
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
