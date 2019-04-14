package com.project;

public class Patient {
	
	//attributes 
	private String temp;
	private String Aches;
	private String soret;
	private String tons;
	private String resultt;
	private String results;
	private String resulta;
	private String resultto;
	
	
	 Patient(String temp,String Aches, String soret, String tons)
	 {
		 this.temp = temp;
		 this.Aches = Aches;
		 this.soret = soret;
		 this.tons = tons;
		 
		 
		
	 }
		
	 public String checkp()
	 {
		 
		 if(Aches.equals("Yes") && tons.equals("Yes")) 
		 {
			resulta = "aches";
		 }
		 if(this.soret == "Yes" && tons.equals("Yes")) 
		 {
			 results = "sort";
		 }
		 if(temp.equalsIgnoreCase("cool") && tons.equals("Yes")) 
		 {
			 resultt = "tempc";
		 }
		 if(temp.equalsIgnoreCase("hot") && tons.equals("Yes")) 
		 {
			 resultt = "temph";
		 }
		 if(temp.equalsIgnoreCase("normal") && tons.equals("Yes")) 
		 {
			 resultto = "tempn";
		 }
		 return resultt;
	 }

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getAches() {
		return Aches;
	}

	public void setAches(String aches) {
		Aches = aches;
	}

	public String getSoret() {
		return soret;
	}

	public void setSoret(String soret) {
		this.soret = soret;
	}

	public String getTons() {
		return tons;
	}

	public void setTons(String tons) {
		this.tons = tons;
	}

	public String getResult() {
		return resultt;
	}

	public void setResult(String result) {
		this.resultt = result;
	}
	

}
