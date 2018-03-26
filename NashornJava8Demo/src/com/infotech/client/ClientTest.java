package com.infotech.client;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ClientTest {

	public static void main(String[] args) throws FileNotFoundException {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		
		try {
//			engine eval('Print HelloWorld!')
			engine.eval(new FileReader("D:\\Documents\\IT Exercise\\Java Exercise\\Java 8 Tutorial\\NashornJava8Demo\\src\\demo.js"));
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

}
