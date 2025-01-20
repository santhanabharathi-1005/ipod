package com.ipod.Main;
import com.ipod.hyra.*;
import com.ipod.implementation.*;
public class Driver extends ObjectCreation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCreation oc=new ObjectCreation();
		Hyra H=oc.Create("Miles",17,"2.5");
		H.Random();
		Hyra iPod1 = oc.Create("Miles", 17, "2.5 hours");
        if (iPod1 != null) {
           // iPod1.displayDetails();
            iPod1.change(20);
            iPod1.power("On");
        }
		
	}

}
