package model;

public class Film extends Product {
	
	private String titleName;
	private String producer;
	private int minimumAge;
	private String trailer;
	
	
	//relaciones
	private Category category;
	
	/*
	 * ============================== Metodo Constructor
	 */
	 
	 
	public Film(String name,String synopsis,String directorName,Date myDate, String titleName, String producer,int minimumAge,String trailer,Category category) {
		
		super(name,synopsis,directorName,myDate);
		this.titleName = titleName;
		this.producer=producer;
		this.minimumAge=minimumAge;
		this.trailer=trailer;
		this.category=category;
				
	}
	
	//ESTE ES DEL Metodo abstracto, se llena el cuerpo
	public String exampleClase(int par){
		
		String out="Esta es una pelicula" + par;
		return out;
	}
	/*
	 * ============================== Getters & Setters
	 */
	
	/**
	 * Metodo para dar la informacion del titulo
	 * @return titleName de tipo String
	 */
	public String getTitlename() {
		return titleName;
	}

	/**
	 * Metodo para modificar la informacion del nombre
	 * 
	 */
	public void setTitlename(String titleName) {
		this.titleName = titleName;
	}
	/*
	 * ============================== Getters & Setters
	 */
	
	/**
	 * Metodo para dar la informacion del productor
	 * @return producer de tipo String
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * Metodo para modificar la informacion del productor
	 * 
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}
	/*
	 * ============================== Getters & Setters
	 */
	
	/**
	 * Metodo para dar la informacion de la edad minima
	 * @return minimumAge de tipo int
	 */
	public int getMinimumage() {
		return minimumAge;
	}

	/**
	 * Metodo para modificar la informacion de la edad minima
	 * 
	 */
	public void setMinimumage(int minimumAge) {
		this.minimumAge = minimumAge;
	}
	
	
	/**
	 * Metodo para dar la informacion del trailer
	 * @return trailer de tipo String
	 */
	public String getTrailer() {
		return trailer;
	}

	/**
	 * Metodo para modificar la informacion del trailer
	 * 
	 */
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	/**
	 * Metodo para modificar la informacion del tipo de categoria
	 * 
	 */
	public void setCategory(Category category){
        this.category = category;
    }
	/**
	 * Metodo para dar la informacion del tipo de categoria
	 * @return category de tipo Category
	 */
    public Category getCategory(){
    
        return category;
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
		super.toString();
		out+="***** Datos de la pelicula *****"+"\n"+
		"Name: "+name+"\n"+
		"Titulo: "+titleName +"\n"+
		"Sinopsis: "+synopsis +"\n"+
		"Nombre del director: "+directorName +"\n"+		
		"Nombre de la produccion: "+producer +"\n"+
		"Fecha de estreno: "+myDate+"\n"+
		"Categoria: "+category+"\n"+
		"Edad minima: "+ minimumAge+"\n"+
		"Trailer: "+trailer+"\n";
		
		return out;
	}
}	