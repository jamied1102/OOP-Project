package com.project;

import java.util.ArrayList;
import java.util.Arrays;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputcounter = 0;
		int pos = 0;
		
		
		
		
		Data d1 = new Data();
		pos = d1.readfile(pos);
		ArrayList<Patient> Patients =  d1.getPatients();
	//	System.out.println(Patients);
		Calculations c1 = new Calculations(d1.getAcounter(), d1.getScounter(), d1.getThcounter(), d1.getTccounter(), d1.getTnounter(), d1.getFileLength());
		GUI gui = new GUI("gui", c1.aProb(), c1.sProb(), c1.hProb(), c1.nProb(), c1.cProb());
	}

}
