package com.ipod.implementation;
import com.ipod.hyra.*;
import com.ipod.hiding.*;
public class ObjectCreation {
	public Hyra Create(String ipod,int Volume,String Battery) {
		
		if (ipod=="Miles")
			return new ipod_1(ipod,Volume,Battery);
		else if (ipod=="Letting_you")
			return new ipod_2(ipod,Volume,Battery);
		else if (ipod=="Disipline")
			return new ipod_3(ipod,Volume,Battery);
		else
			return null;
	}
}
