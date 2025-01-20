package com.ipod.hyra;

public class ipod_2 extends Hyra{
	String CrntSong="Letting_you";
	int volume = 9;
	String battery_life="3.41";
	public ipod_2(String Song,int Volume,String Battery) {
		super(Song,Volume,Battery);
		this.CrntSong=Song;
		this.volume=Volume;
		this.battery_life=Battery;
	}
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
	 @Override
		//change volume
		public void change(int Volume) {
			System.out.println(Volume);
		}
	 @Override
		//choose random song
		public void Random() {
		 super.Random();
		}

}
