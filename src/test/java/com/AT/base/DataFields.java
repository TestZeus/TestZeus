package com.AT.base;

import java.util.HashMap;
import java.util.Map;

public class DataFields 
{
	public static final String PHONE = "uiInputPhone";	//phone
	public static final String EMAIL = "uiInputEmail";	//email
	public static final String URL = "uiInputURL";		//url
	public static final String NUMBER = "uiInputNumber"; //_int , _double
	public static final String TEXT = "uiInputText";	//string
	public static final String CURRENCY = "uiInput";	//currency
	public static final String SELECT = "uiInput--select";	//picklist
	public static final String TEXTAREA = "uiInput--textarea"; //textarea
	public static final String SEARCHINPUT = "forceSearchInputLookupDesktop";
	public static final String DATE = "uiInput--datetime";
	public static final String CHECKBOX = "uiInput--checkbox";
	
	//To add
	public static final String COMBOBOX = "forceTextEnumLookup";
	public static final String DATETIME = "";

	public static Map<String,String> fields()
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("phone",PHONE);
		map.put("email",EMAIL);
		map.put("url",URL);
		map.put("_int",NUMBER);
		map.put("int",NUMBER);
		map.put("string",TEXT);
		map.put("currency",CURRENCY);
		map.put("picklist",SELECT);
		map.put("textarea",TEXTAREA);
		map.put("_double", NUMBER);
		map.put("double", NUMBER);
		map.put("reference", SEARCHINPUT);
		map.put("combobox",COMBOBOX);
		map.put("date",DATE);
		map.put("boolean", CHECKBOX);
		map.put("datetime", DATETIME);
		return map;
	}
}
