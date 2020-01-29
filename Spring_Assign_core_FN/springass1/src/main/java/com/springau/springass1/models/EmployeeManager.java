package com.springau.springass1.models;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeManager {
		
		private Map<Integer, Employee> map;

		EmployeeManager(HashMap<Integer,Employee> map){
			this.map=map;
		}
		
		public void show() {
			for(Entry<Integer,Employee> entry : map.entrySet() ) {
				System.out.println(entry);
				//System.out.println(entry.getKey()+"-->"+ entry.getValue());
			}
		}	
}
