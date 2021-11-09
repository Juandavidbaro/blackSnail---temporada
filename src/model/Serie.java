package model;

public class Serie extends Product {
	
	private String protagonistName;
	private String censorchip;
		
	private Date myDate;
	private Season mySeason;
	private final  int seasonsAmount=20;
	/**
	* Metodo para crear un arreglo de productos
	*/
	private Season[]seasons;
	


	public String addSeason(String name,int numberofepisodesScheduled,int numberofepisodesPublished,Date myDate, String trailer){
		String out="";		
		
		for(int i=0; i<seasons.length;i++){
			if(seasons[i]==null){
				seasons[i] = new Season( name, numberofepisodesScheduled, numberofepisodesPublished, myDate, trailer);
				out="Product succesfully added"; 
			}else{
				out="Product cannot be added"; 
			}
		}	
		
		return out;
		
	} 
	/*
	 * ============================== Metodo Constructor
	 */
	 
	 
	public Serie(String name,String synopsis,String directorName,Date myDate, String protagonistName, String censorchip) {
		
		super(name,synopsis,directorName,myDate);
		this.protagonistName=protagonistName;
		this.censorchip=censorchip;
		seasons=new Season[seasonsAmount];
		
	}
	
	public String exampleClase(int par){
		String out="Esta es una serie"+(par+10);
		return out;
		
	}
	/*
	 * ============================== Getters & Setters
	 */
	
	/**
	 * Metodo para dar la informacion del nombre de los protagonistas
	 * @return protagonistName de tipo String
	 */
	public String getProtagonistname() {
		return protagonistName;
	}

	/**
	 * Metodo para modificar la informacion del nombre de los protagonistas
	 * 
	 */
	public void setProtagonistname(String protagonistName) {
		this.protagonistName = protagonistName;
	}
		
	/**
	 * Metodo para dar la informacion del motivo de censura
	 * @return censorchip de tipo String
	 */
	public String getCensorchip() {
		return censorchip;
	}

	/**
	 * Metodo para modificar la informacion del motivo de censura
	 * 
	 */
	public void setCensorchip(String censorchip) {
		this.censorchip = censorchip;
	}
	
	/*
	 * ============================== toString
	 */
	 
	 
	/**
	*Metodo para imprimir los datos de la pelicula
	*@return out, de tipo String
	*/
	public String toString(){
		String out="";
		//super.toString();
		out+="***** Datos de la serie *****"+"\n"+
		"Nombre: "+name+"\n"+
		"Sinopsis: "+synopsis +"\n"+
		"Nombre del director: "+directorName +"\n"+
		"Fecha: "+myDate+"\n"+
		"Nombre de los protagonistas: "+protagonistName +"\n"+
		"Motivo de censura: "+censorchip +"\n";
		
		
		return out;
	}
}	