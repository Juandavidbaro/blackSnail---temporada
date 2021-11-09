package model;

public class Subscriber {
	
	private String document;
	private String fullName;
	private int age;
	private int hoursToConsume;
	private ClientType clientType;
	private State state;
	
	
	/*
	 * ============================== Metodo Constructor
	 */
	 
	 
	public Subscriber(String document,String fullName,int age,int hoursToConsume,State state,ClientType clientType) {
		
		this.document = document;
		this.fullName = fullName;
		this.age = age;
		this.hoursToConsume = hoursToConsume;
		this.clientType = clientType;
		this.state=state;
		
	}
	
	
	/*
	 * ============================== Getters & Setters
	 */
	
	/**
	 * Metodo para dar la informacion del documento
	 * @return document de tipo String
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * Metodo para modificar la informacion del documento
	 * 
	 */
	public void setDocument(String document) {
		this.document = document;
	}
	/**
	 * Metodo para dar la informacion del nombre completo
	 * @return fullName de tipo String
	 */
	public String getFullname() {
		return fullName;
	}
	/**
	 * Metodo para modificar la informacion del nombre completo
	 * 
	 */
	public void setFullname(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * Metodo para dar la informacion de la edad
	 * @return age de tipo int
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Metodo para modificar la informacion de la edad
	 * 
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Metodo para dar la informacion de las horas dispuestas a consumir
	 * @return hoursToConsume de tipo int
	 */
	public int getHoursToConsume() {
		return hoursToConsume;
	}
	/**
	 * Metodo para modificar la informacion de las horas dispuestas a consumir
	 * 
	 */
	public void setHoursToConsume(int hoursToConsume) {
		this.hoursToConsume = hoursToConsume;
	}
	/**
	 * Metodo para modificar la informacion del tipo de cliente
	 * 
	 */
	public void setClientType(ClientType clientType){
        this.clientType = clientType;
    }
	/**
	 * Metodo para dar la informacion del tipo de cliente
	 * @return clientType de tipo ClientType
	 */
    public ClientType getClientType(){
    
        return clientType;
    }
	/**
	 * Metodo para modificar la informacion del estado del suscriptor
	 * 
	 */
	public void setState(State state){
        this.state = state;
    }
	/**
	 * Metodo para dar la informacion del estado del suscriptor
	 * @return state de tipo State
	 */
    public State getState(){
    
        return state;
    }
	
	
	
	/*
	 * ============================== toString
	 */
	 
	 
	/**
	*Metodo para imprimir los datos de cada suscriptor
	*@return out, de tipo String
	*/
	public String toString(){
		String out="";
		out+="***** Datos del subscriptor *****"+"\n"+
		"Documento de identificacion: "+document +"\n"+
		"Nombre completo: "+fullName +"\n"+
		"Edad: "+age +"\n"+
		"Horas dispuestas a consumir: "+hoursToConsume +"\n"+
		"Estado: "+state+ "\n"+
		"Tipo de cliente: "+clientType +"\n";
		
		return out;
	}
}