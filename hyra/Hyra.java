package com.ipod.hyra;
import com.ipod.hiding.*;
public class Hyra implements hide{
	String CrntSong;
	int volume;
	String battery_life;


	public Hyra(String song,int Volume,String Battery) {
		// TODO Auto-generated constructor stub
		this.CrntSong=song;
		this.volume=Volume;
		this.battery_life=Battery;
	}
	//on or off
	@Override
	public void power(String Switch) {
		if(Switch == "On") {
			System.out.println("turned on");
		}
		else if(Switch == "Off"){
			System.out.println("turned off");
		}
		else 
			System.out.println("invalid");
	}
	//change status
	@Override
	public void change(String Status) {
		if(Status == "Song") {
			System.out.println("song");
		}
		else if (Status == "Channel"){
			System.out.println("Channel");
		}
	}
	//change volume
	@Override
	public void change(int Volume) {
		System.out.println(Volume);
	}
	//choose random song
	@Override
	public void Random() {
		System.out.println("");
		System.out.println(CrntSong);
		System.out.println(volume);
		System.out.println(battery_life);
	}
	
}
