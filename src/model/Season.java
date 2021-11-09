package model;

public class Season{
	
	
	private String name;
	private int numberEpisodesScheduled;
	private int numberEpisodesPublished;
	private String trailer;
	private int numberSeason;
	private Date myDate;
	
	/**
     * Numero de temporadas por defecto
     */
    private final static int NUM_TEMPORADAS=1;
	/*
	 * ============================== Metodo Constructor
	 */
	 
	 
	public Season(String name,int numberEpisodesScheduled,int numberEpisodesPublished,Date myDate,String trailer) {
		
		
		this.name=name;
		this.numberEpisodesScheduled=numberEpisodesScheduled;
		this.numberEpisodesPublished=numberEpisodesPublished;
		this.myDate = myDate;
		this.trailer=trailer;
		
				
	}
	
	/*
	 * ============================== Getters & Setters
	 */
	 
	/**
     * Devuelve la numeroTemporadas de la serie
     * @return numeroTemporadas de la serie
     */
	public int getNumberSeason() {
        return numberSeason;
    }
  
    /**
     * Modifica la numeroTemporadas de la serie
     * @param numeroTemporadas a cambiar
     */
    public void setNumberSeason(int numberSeason) {
        this.numberSeason = numberSeason;
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
	 * Metodo para dar la informacion del numero de episodios programados
	 * @return numberEpisodesScheduled de tipo int
	 */
	public int getNumberEpisodesScheduled() {
		return numberEpisodesScheduled;
	}

	/**
	 * Metodo para modificar la informacion del numero de episodios programados
	 * 
	 */
	public void setNumberEpisodesScheduled(int numberEpisodesScheduled) {
		this.numberEpisodesScheduled = numberEpisodesScheduled;
	}
	/**
	 * Metodo para dar la informacion del numero de episodios publicados
	 * @return numberEpisodesPublished de tipo int
	 */
	public int getNumberEpisodesPublished() {
		return numberEpisodesPublished;
	}

	/**
	 * Metodo para modificar la informacion del numero de episodios publicados
	 * 
	 */
	public void setNumberEpisodesPublished(int numberEpisodesPublished) {
		this.numberEpisodesPublished = numberEpisodesPublished;
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
	/*
	 * ============================== toString
	 */
	/**
	*Metodo para imprimir los datos de la temporada
	*@return out, de tipo String
	*/
	public String toString(){
		String out="";
		super.toString();
		out+="***** Datos de la temporada *****"+"\n"+
		"Name: "+name+"\n"+
		"Number Episodes Scheduled: "+numberEpisodesScheduled +"\n"+
		"Number Episodes Published: "+numberEpisodesPublished +"\n"+
		"Trailer: "+trailer+"\n";
		
		return out;
	}
}