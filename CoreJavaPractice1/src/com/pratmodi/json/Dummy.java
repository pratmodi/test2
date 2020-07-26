package com.pratmodi.json;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Dummy {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, IOException, ParseException {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("C:\\dummy.json");
		Object obj = jsonParser.parse(reader);
		
		JSONArray rootArray = null;
	//	gson.toJson(rootArray);
		
		System.out.println(rootArray.get(0));
		
	}

}
