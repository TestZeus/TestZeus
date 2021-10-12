package com.AT.base;

public class Locator
{
	protected static final String CSS = "css";
	protected static final String XPATH = "xpath";
	protected static final String ID = "id";
    protected static final String CLASS = "class";

    public String type;
	public String value;
	public Locator() {}
	public Locator(Locator loc)
	{
		type = loc.type;
		value = loc.value;
	}
	public Locator(String type, String locator)
	{
		this.type = type.toLowerCase();
		this.value = locator;
	}
}
