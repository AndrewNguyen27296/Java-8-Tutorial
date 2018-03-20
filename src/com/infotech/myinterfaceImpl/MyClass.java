package com.infotech.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.infotech.myinterface.MyInterface;

//implements interface MyInterface
public class MyClass implements MyInterface {

	//define unimplement method
	@Override
	public Integer getMaxNum(List<Integer> intList) {
		//get maxNum
		Integer maxNum = Collections.max(intList);
 		return maxNum;
	}

}
