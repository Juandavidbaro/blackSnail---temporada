package model;


public class BlackSnail {

	private String nit;
	private String direction;
	private String website;
	private final  int subscribersAmount=50;
	private final  int productsAmount=85;
	
	/**
	* Metodo para crear un arreglo de suscriptores
	*/
	private Subscriber[]subscribers;
	/**
	* Metodo para crear un arreglo de productos
	*/
	private Product[]products;
	
	
	/**
	 * Metodo que permite agregar los suscriptores digitados por el usuario.
	 @param document de tipo String
	 @param fullName de tipo String
	 @param age de tipo int
	 @param hoursToConsume de tipo int
	 @param clientType de tipo ClientType
	 */
	public String addSubscriber(String document, String fullName, int age,int hoursToConsume,State state, ClientType clientType){
		String out="";
		boolean allreadyExist=false; 
		boolean continues=false; 
		for(int i=0; i<subscribers.length;i++){
			if(subscribers[i]!=null){
				if(subscribers[i].getDocument().equalsIgnoreCase(document)){
					out="The id you enter allready exist";
					allreadyExist=true; 
				}
			}
		}
		if (allreadyExist==false){
			for(int i=0; i<subscribers.length && !continues;i++){
				if(subscribers[i]==null){
					subscribers[i]=new Subscriber(document,fullName,age,hoursToConsume,state,clientType);
					out="Subscriber succesfully added"; 
					continues=true; 
				}
			}
		}
		if(allreadyExist==false && continues==false){
			out="Subscriber spaces are full";
		}
		return out;
		
	}
	/**
	 * Metodo que permite poner en estado inactivo a un suscriptor, identificado con el documento de identidad
	 *que va a ser digitado por el usuario
	 @param document de tipo String
	 */
	public String desactivateSubscriber(String document){
		String out=""; 
		boolean flag= false; 
		for(int i=0; i<subscribers.length && !flag;i++){
			if(subscribers[i]!=null){
				if(subscribers[i].getDocument().equalsIgnoreCase(document)){
					subscribers[i].setState(State.INACTIVE);
					subscribers[i].setClientType(ClientType.NORMAL);
					out="El suscriptor paso a ser inactivo";
					flag=true; 
				}else {
					out="El documento del suscriptor no existe";
				}
			}
		}
		return out; 	
	}
	public int subscribersList(ClientType clientType){
		int outTotal= 0; 
		for(int i= 0; i<subscribers.length;i++){
			if(subscribers[i]!=null){
				if(subscribers[i].getClientType()==clientType){
					outTotal++;
				}
			}
		}
		
		return outTotal;
		 
	}
	/**
	 * Metodo que recorre todo el arreglo de suscriptores, en donde si es un menor de edad,
	 *se evalua si es el que mas horas esta dispuesto a consumir, y es guardado su indice para obtener la informacion del suscriptor.
	 
	 */
	public Subscriber underageSubscriber(){
		Subscriber sb=null;
		boolean hasMostHours= false;
		for(int i =0; i<subscribersAmount && hasMostHours==false;i++){
			if(subscribers[i]!=null){
				if(subscribers[i].getAge()<18){
					sb=subscribers[i];
					boolean moreHours= true;
					for(int j= i+1; j<subscribers.length-i && moreHours==true;j++){
						if(subscribers[j]!=null){
							
							if(subscribers[i].getHoursToConsume()<subscribers[j].getHoursToConsume()){
								moreHours= false;
							}
						}
					}	
					if(moreHours==true){
						hasMostHours=true;
					}
				}
			}
		}
		return sb;
		
		
	 }
	/**
	 * Metodo que permite agregar los productos film digitados por el usuario.
	 @param name de tipo String
	 @param synopsis de tipo String
	 @param directorName de tipo String
	 @param myDate de tipo Date
	 @param titleName de tipo String
	 @param producer de tipo String
	 @param minimumAge de tipo entero
	 @param trailer de tipo String
	 @param category de tipo Category
	 */
	public String addFilm(String name,String synopsis,String directorName,Date myDate, String titleName, String producer,int minimumAge,String trailer,Category category){
		
		
		
		String out="";
		boolean allreadyExist=false; 
		boolean continues=false; 
		for(int i=0; i<products.length;i++){
			if(products[i]!=null){
				
				if(products[i].getName().equalsIgnoreCase(name)){
					out="The id you enter allready exist";
					allreadyExist=true; 
				}
			}
		}
		if (allreadyExist==false){
			for(int i=0; i<products.length && !continues;i++){
				if(products[i]==null){
					
					products[i]=new Film(name,synopsis,directorName,myDate, titleName, producer,minimumAge,trailer,category);
				
					out="Product succesfully added"; 
					continues=true; 
				}
			}
		}
		if(allreadyExist==false && continues==false){
			out="Product spaces are full";
		}
		return out;
		
	} 
	
	
	/**
	 * Metodo que permite agregar los productos film digitados por el usuario.
	 @param name de tipo String
	 @param synopsis de tipo String
	 @param directorName de tipo String
	 @param myDate de tipo Date
	 @param protagonistName de tipo String
	 @param censorchip de tipo String
	 
	 */
	public String addSerie(String name,String synopsis,String directorName,Date myDate, String protagonistName, String censorchip){
		String out="";		
		boolean continues=false;
		for(int i=0; i<products.length  && !continues;i++){
			if(products[i]==null){
				products[i] = new Serie( name,synopsis,directorName,myDate, protagonistName,  censorchip);
				continues=true;
				out="Product succesfully added"; 
			}else{
				out="Product cannot be added"; 
			}
		}	
		
		return out;
		
	} 
	
	/**
	 * Metodo que permite mostrar una lista de peliculas segun la categoria digitados por el usuario.
	 @param category de tipo Category	 
	 */
	public String filmList(Category category){
		String out=""; 
		for(int i= 0; i<products.length;i++){
			if(products[i]!=null){
				if(products[i] instanceof Film){
					if(products[i].getCategory()==category){
						out+=products[i].toString();
						
					}
				}
				
			}
		}		
		return out;
		
	}
	/**
	 * Metodo que permite mostrar una lista de series.
	*/
	public String serieList(){
		String out=""; 
		for(int i= 0; i<products.length;i++){
			if(products[i]!=null){
				if(products[i] instanceof Serie){
					
					out+=products[i].toString();
					
					
				}
				
			}
		}		
		return out;
		
	}
	/**
	 * Metodo que permitecrear las temporadas.
	*/
	public String addSeason(String name,int numberofepisodesScheduled,int numberofepisodesPublished,Date myDate, String trailer){
		String out="";
		Product serie=ShowProducts(name);
		
		if(serie==null || serie instanceof Film ){
			out="error"	;			
		}else{
			Serie season=(Serie)serie;
			//out =serie.addSeason (name, numberofepisodesScheduled, numberofepisodesPublished,myDate,trailer);
			season.addSeason(name, numberofepisodesScheduled, numberofepisodesPublished,myDate,trailer);
		}
				
		return out;
		
	}
	
	/*
	 * ============================== Metodo Constructor
	 */
	 
	 
	/**
	 * Metodo constructor de la clase BlackSnail
	 *crea los arreglos de subscribers del tamaño de subscribersAmount
	 @param nit de tipo String
	 @param direction de tipo String
	  @param website de tipo String
	 */
	public BlackSnail(String nit,String direction,String website) {
		
		this.nit = nit;
		this.direction = direction;
		this.website = website;
		subscribers=new Subscriber[subscribersAmount];
		products=new Product[productsAmount];
		
		
	}
	
	
	/*
	 * ============================== Getters & Setters
	 */
	 
	 
	/**
	 * Metodo para dar la informacion del arreglo de suscriptores
	 * @return subscribers de tipo Subscriber
	 */
	public Subscriber[] getSubscriber(){
		return subscribers;
	} 
	/**
	 * Metodo para dar la informacion del arreglo de productos
	 * @return products de tipo Product
	 */
	public Product[] getProduct(){
		return products;
	} 
	/**
	 * Metodo para dar la informacion del nit
	 * @return nit de tipo String
	 */
	public String getNit() {
		return nit;
	}
	/**
	 * Metodo para modificar la informacion de la direccion
	 * 
	 */
	public void setNit(String nit){
		this.nit=nit;
	}
	/**
	 * Metodo para dar la informacion de la direccion
	 * @return direction de tipo String
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * Metodo para modificar la informacion de la direccion
	 * 
	 */
	public void setDirection(String direction){
		this.direction=direction;
	}
	/**
	 * Metodo para dar la informacion del website
	 * @return website de tipo String
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * Metodo para modificar la informacion del website
	 * 
	 */
	public void setWebsite(String website){
		this.website=website;
	}
	
	

	
	
	/*
	 * ============================== toString
	 */
	 
	
	/**
	 * permite imprimir los datos del suscriptor y del canal de suscripcion
	 @return retorno de tipo String
	 */
	public String toString(){
		
		String out="";
		out+="***** Datos del subscriptor *****"+"\n"+
		"Documento de identificacion: "+nit +"\n"+
		"Nombre completo: "+direction +"\n"+
		"Edad: "+website +"\n";
		
		for (int i=0;i<subscribers.length;i++){
			if (subscribers[i]!=null){
				out+=subscribers[i].toString();
				
			}
		}
		
		return out;
		
	}
	/**
	 * permite imprimir los datos del producto 
	 @return product de tipo Product
	 */
	public Product ShowProducts(String name){
		boolean found=false;
		Product product=null;
				
		for(int i=0; i<products.length && !found;i++){
			if(products[i] != null){					
				if(products[i].getName().equalsIgnoreCase(name)){
					product=products[i];
					found =true;
				}
			}
		}
		return product;
	}
	
}	