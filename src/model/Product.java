package model;

public abstract class Product {
	
	protected String name;
	protected String synopsis;
	protected String directorName;
	
	//relaciones
	protected Date myDate;
	protected Category category;
	
	/*
	 * ============================== Metodo Constructor
	 */
	 
	 
	public Product(String name,String synopsis,String directorName,Date myDate) {
		
		this.name = name;
		this.synopsis = synopsis;
		this.directorName = directorName;
		this.myDate = myDate;
		
	}
	
	/*
	* ===============================Metodo abstracto
	*/
	
	public abstract String exampleClase(int par);
	
	/*
	 * ============================== Getters & Setters
	 */
	
	/**
	 * Metodo para dar la informacion del tipo de categoria
	 * @return category de tipo Category
	 */
    public Category getCategory(){
    
        return category;
    }
	/**
	 * Metodo para dar la informacion del nombre
	 * @return name de tipo String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo para modificar la informacion del nombre
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Metodo para dar la informacion de la sinopsis
	 * @return synopsis de tipo String
	 */
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * Metodo para modificar la informacion de la sinopsis
	 * 
	 */
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	/**
	 * Metodo para dar la informacion del nombre del director
	 * @return directorName de tipo String
	 */
	public String getDirectorname() {
		return directorName;
	}

	/**
	 * Metodo para modificar la informacion del nombre del director
	 * 
	 */
	public void setDirectorname(String directorName) {
		this.directorName = directorName;
	}
	
	
	/*
	 * ============================== toString
	 */
	 
	 
	/**
	*Metodo para imprimir los datos de cada producto
	*@return out, de tipo String
	*/
	public String toString(){
		String out="";
		out+="***** Datos del producto *****"+"\n"+
		"Nombre: "+name+"\n"+
		"Sinopsis: "+synopsis +"\n"+
		"Nombre del director: "+directorName +"\n";
		
		return out;
	}
}