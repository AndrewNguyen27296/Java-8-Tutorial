package com.infotech.client;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ClientTest {

	public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		
		try {
//			read file js
			engine.eval(new FileReader("D:\\Documents\\IT Exercise\\Java Exercise\\Java 8 Tutorial\\NashornJava8Demo\\src\\invoke.js"));
			
//			invoke js function fun1
			Invocable invocable = (Invocable)engine;
			
			Object result = invocable.invokeFunction("fun1", "XINKACHU");
			System.out.println(result);
			
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

}
