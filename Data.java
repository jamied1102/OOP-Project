package com.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//https://stackoverflow.com/questions/1277880/how-can-i-get-the-count-of-line-in-a-file-in-an-efficient-way/1277904 :source for buffer reader
public class Data {
	private int acounter;
	private int scounter;
	private int thcounter;
	private int tccounter;
	private int tnounter;
	private int fileLength;
	Scanner sc;
	ArrayList<Patient> Patients = new ArrayList<Patient>();
	
	Data()
	{
		
	}

	
	public int readfile(int pos)
	{
		String line;
		String[] var = new String [100];
		int index = 0;
		
		try {
			
			Scanner sc = new Scanner(new File("data"));
			BufferedReader reader = new BufferedReader(new FileReader("data"));
			while(reader.readLine() != null) fileLength++;
			while (pos <= fileLength)
			{
			if(index < 4 )
			{	
				line = sc.next();
				var[index] = line;
		//		System.out.println(var[index]);
				index = index+1;
				
				
			}
			else
			{
				Patient p = new Patient(var[0], var[1], var[2], var[3]);
				Patients.add(p);
		//		System.out.println(Patients);
				index = 0;
				pos = pos+1;
				if(var[1].equalsIgnoreCase("Yes") && var[3].equalsIgnoreCase("Yes"))
				{
					acounter = acounter +1;
				//	System.out.println(acounter + "a");
				}
				if(var[2].equalsIgnoreCase("Yes") && var[3].equalsIgnoreCase("Yes"))
				{
					scounter = scounter +1;
				//	System.out.println(scounter + "s");
				}
				if(var[0].equalsIgnoreCase("cool") && var[3].equalsIgnoreCase("Yes"))
				{
					tccounter = tccounter +1;
				//	System.out.println(tccounter + "c");
				}
				if(var[0].equalsIgnoreCase("normal") && var[3].equalsIgnoreCase("Yes"))
				{
					tnounter = tnounter +1;
			//		System.out.println(tnounter + "n");
				}
				if(var[0].equalsIgnoreCase("hot") && var[3].equalsIgnoreCase("Yes"))
				{
					thcounter = thcounter +1;
				//	System.out.println(thcounter + "h");
				}
			}
			
			
			}
			pos = pos+1;
			System.out.println(pos);
			sc.close();
			reader.close();
		}
		catch(Exception e ) {
			System.out.println("e");
		}
		
		return pos ;
   }


	public ArrayList<Patient> getPatients() {
		return Patients;
	}


	public void setPatients(ArrayList<Patient> patients) {
		Patients = patients;
	}


	public int getAcounter() {
		return acounter;
	}


	public void setAcounter(int acounter) {
		this.acounter = acounter;
	}


	public int getScounter() {
		return scounter;
	}


	public void setScounter(int scounter) {
		this.scounter = scounter;
	}


	public int getThcounter() {
		return thcounter;
	}


	public void setThcounter(int thcounter) {
		this.thcounter = thcounter;
	}


	public int getTccounter() {
		return tccounter;
	}


	public void setTccounter(int tccounter) {
		this.tccounter = tccounter;
	}


	public int getTnounter() {
		return tnounter;
	}


	public void setTnounter(int tnounter) {
		this.tnounter = tnounter;
	}


	public int getFileLength() {
		return fileLength;
	}


	public void setFileLength(int fileLength) {
		this.fileLength = fileLength;
	}
	
}
