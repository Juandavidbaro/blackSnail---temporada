package ui;

import java.util.Scanner;
import model.BlackSnail;
//import model.Subscriber;
import model.ClientType;
import model.State;
//import model.Product;
import model.Date;
//import model.Film;
//import model.Serie;
import model.Category;

public class MainBlackSnail {
	/**
	 * mySubscriber es la conexiOn con la clase Subscriber en el paquete model
	 */
	private BlackSnail myBlackSnail;
	/**
	 * sc es el objeto que permite leer informaciOn digitada por el usuario
	 */
	private Scanner sc; 
	
	/**
	 * Constructor de la clase, no recibe prametros.  
	 * El mEtodo inicializa el objeto lector 
	 */
	 
	
	
	
	public MainBlackSnail() {
		sc= new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainBlackSnail pc= new MainBlackSnail();
		
        //PRODUCT(String name,String synopsis,String directorName,Date myDate);
		//FILM (String name,String synopsis,String directorName,Date myDate, String titleName, String producer,int minimumAge,String trailer,Category category)
        //SERIE (String name,String synopsis,String directorName,Date myDate, String protagonistName, String censorchip)
		//Creo que array de productos
        /*Product[] products = new Product[85];
         
        //Creo los elementos
        products[0] = new Film("Venom","Un simbionte ha vuelto mas desatado","Andy Serkis",new Date(15, 10, 2021),"Venom","productor 1",20,"trailer",Category.TERROR);
        products[1] = new Film("Halloween Kills","Muchos cadaveres y un mensaje sobre la histeria de las masas","David Gordon",new Date(22, 10, 2021),"Halloween Kills","productor",15,"trailer",Category.TERROR);
        products[2] = new Serie("Ejercito de los muertos","Un grupo se debe infiltrar en la infestada de zombies ciudad de las vegas","Zack Snyder",new Date(21, 5, 2021),"Dave Bautista","No hay censura");
		products[3]=new Serie("Cherry","Cuenta la historia de un joven que lidia con un trastorno de estres","Los hermanos Russo",new Date(12, 3, 2021),"Nombre del protagonista","censura por motivos de violencia");
		products[4]=new Serie("Otra ronda","Explora una teoria controvertida para explorar el alcoholismo y las consecuencias que provoca a corto y largo plazo","Thomas Vinterberg",new Date(9, 4, 2021),"Mads Mikkelsen","No hay censura");
		
		
		System.out.println("Iniciando la aplicación");
		
		System.out.println(products[0]);
		System.out.println(products[1]);
		System.out.println(products[2]);
		System.out.println(products[3]);
		System.out.println(products[4]);
					
		*/
		pc.createBlackSnail();
				
		int option=0;
		
		do{
			
			option= pc.showMenu();
			pc.executeOperation(option);
			
		}while (option!=0);
		
	}
	/**
	*Despliega un menu principal al usuario
	@return option de tipo int 	
	*/
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para crear un subscriptor \n" +
				"(2) Para desactivar un subscriptor \n" +
				"(3) Para desplegar la cantidad de suscriptores activos \n"+
				"(4) Para desplegar el nombre del suscriptor menor de edad, el de mayor horas dispuesto a consumir\n"+
				"(5) Para crear un producto\n"+
				"(6) Para mostrar los productos\n"+
				"(7) Para crear una temporada\n"+
				"(8) Para mostrar la lista de una categoria\n"+
				"(9) Para mostrar la lista de las series\n"+
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	/**
	*Permite realizar una accion que desea hacer el usuario
	@param operation de tipo int, segun su valor, va a entrar en el switch correspondinete
	*/
	public void executeOperation(int operation) {
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createSubscriber() ;
			break;
		case 2:
			desactivateSubscriber() ;
			break;
		case 3:
			subscribersList();
			break;
	
		case 4:
			underageSubscriber();
			break;
			
		case 5: 
			createProduct();
			break;
			
		case 6: 
			ShowProduct();
			break;
			
		case 7: 
			createSeason();
			break;
			
		case 8:
			filmList();
			break;
			
		case 9:
			serieList();
			break;
		default:
			System.out.println("Error, invalid option");
			break;
		}
	}
	
	
	/**
	*Permite crear el canal se suscripcion con sus datos correspondinetes
	*/
	private void createBlackSnail() { // 
		System.out.println("Enter the data of the subscription channel");
		String nit,direction,website;
		

		System.out.println("NIT number");
		nit= sc.nextLine();

		System.out.println("Direction");		
		direction= sc.nextLine();

		System.out.println("Website");
		website= sc.nextLine();
		
		myBlackSnail=new BlackSnail(nit,direction,website);
		

		System.out.println("The subscription channel was created");
		
	}
	
	
	/**
	*Permite crear un suscriptor con sus datos correspondinetes
	*/
	private void createSubscriber() { // 
		//if(myBlackSnail.hasSubscribers()) {
			System.out.println("Enter the details of a subscriber");
			String document,fullName;
			int age,hoursToConsume,type;
			
			

			System.out.println("Identification document number");
			document= sc.nextLine();

			System.out.println("Full name");		
			fullName= sc.nextLine();
			do{
				System.out.println("Age");
				age= sc.nextInt();
				sc.nextLine();
			}while(age<1);	

			do{
				System.out.println("Hours that you are willing to consume");
				hoursToConsume= sc.nextInt();
				sc.nextLine();
			}while(hoursToConsume<0);
			
			do{
				System.out.println("Your customer types are: \n 1.Normal \n 2.Platinum \n 3.Diamond");	
				System.out.println("Enter the corresponding number");		
				type= sc.nextInt();
			}while(type!=1 && type!=2 && type!=3);
			
			switch(type){
				case 1:
					
					myBlackSnail.addSubscriber(document,fullName,age,hoursToConsume,State.ACTIVE,ClientType.NORMAL);
					break;
				case 2:
				
					myBlackSnail.addSubscriber(document,fullName,age,hoursToConsume,State.ACTIVE,ClientType.PLATINUM);
					break;
				case 3:
					
					myBlackSnail.addSubscriber(document,fullName,age,hoursToConsume,State.ACTIVE,ClientType.DIAMOND);
					break;
				
				default:
					System.out.println("Error, opción no válida");
					break;
			}
			

			

			System.out.println("The subscriber "+ fullName + " was created");
		/*}else{
			//System.out.println("El subscriptor lo ha sido creado correctamente");
		//}	
		*/
	}
	/**
     * El usuario digita el documento de identificacion, y este hace un llamado al metodo que se encarga 
	 *de poner al suscriptor en estado inactivo
     */
	private void desactivateSubscriber(){
		String document;
		System.out.println("Enter the identification document of the one you want to put in inactive status");
		document=sc.nextLine();
		System.out.println(myBlackSnail.desactivateSubscriber(document));
		
	} 
	
	/**
	*Permite mostrar la cantidad de suscriptores que tienen en cada tipo de cliente
	*/
	private void subscribersList(){
		System.out.println("Normal: "+ myBlackSnail.subscribersList(ClientType.NORMAL));
		System.out.println("Platinum: "+ myBlackSnail.subscribersList(ClientType.PLATINUM));
		System.out.println("Diamond: "+ myBlackSnail.subscribersList(ClientType.DIAMOND));
	}
	
	/**
	*Permite mostrar el dato del suscriptor menor de edad, que tiene mayor horas dispuestas a consumir
	*/
	public void underageSubscriber(){
		System.out.println("Name: "+ myBlackSnail.underageSubscriber().toString());
	}
	
	/**
	*Permite crear un producto con sus datos correspondinetes
	*/
	public void createProduct(){
		
		String name,synopsis,directorName,titleName,producer,trailer,protagonistName,optioncensorchip,censorchip;
		int opcion,minimumAge,eleccion,day,month,year;
		Date myDate;
		System.out.println("Enter the number of the product you want to add \n (1) Movie \n (2) Series");
		opcion= sc.nextInt();
		
		
		switch(opcion){
			case 1:
				System.out.println("Enter the name");
				name= sc.next();
					
				System.out.println("Enter the synopsis");
				synopsis= sc.next();
					
				System.out.println("Enter the name of the director");
				directorName= sc.next();
					
				System.out.println("Type the name of the original title");
				titleName= sc.next();
					
				System.out.println("Enter the name of the producer");
				producer= sc.next();
					
				System.out.println("Enter the minimum recommended age");
				minimumAge= sc.nextInt();
					
				System.out.println("Type the trailer");
				trailer= sc.next();
					
				System.out.println("Enter the release date:\nDay:");
				day= sc.nextInt();
				System.out.println("Month:");
				month= sc.nextInt();
				System.out.println("Year:");
				year= sc.nextInt();
					
				
					
				System.out.println("Here are the categories:\n(1) Romantic\n(2) Action \n(3) Suspense \n(4) Horror \n(5) Comedy \nEnter the corresponding number");
				eleccion= sc.nextInt();
					
				switch(eleccion){
					case 1:
					
						myBlackSnail.addFilm(name,synopsis,directorName,new Date(day, month, year), titleName, producer,minimumAge,trailer,Category.ROMANTIC);
						System.out.println("\nThe movie has been created\n");
						break;
					case 2:
				
						myBlackSnail.addFilm(name,synopsis,directorName,new Date(day, month, year), titleName, producer,minimumAge,trailer,Category.ACTION);
						System.out.println("\nThe movie has been created\n");
						break;
					case 3:
					
						myBlackSnail.addFilm(name,synopsis,directorName,new Date(day, month, year), titleName, producer,minimumAge,trailer,Category.SUSPENSE);
						System.out.println("\nThe movie has been created\n");
						break;
							
					case 4:
						myBlackSnail.addFilm(name,synopsis,directorName,new Date(day, month, year), titleName, producer,minimumAge,trailer,Category.TERROR);
						System.out.println("\nThe movie has been created\n");
						break;
							
					case 5:
						myBlackSnail.addFilm(name,synopsis,directorName,new Date(day, month, year), titleName, producer,minimumAge,trailer,Category.COMEDY);
						System.out.println("\nThe movie has been created\n");
						break;
				
					default:
						System.out.println("Error, invalid option");
						break;
				}
				
				
				break;	
				
				
			case 2:
				
				
				System.out.println("Enter the name");
				name= sc.next();
					
				System.out.println("Enter the synopsis");
				synopsis= sc.next();
					
				System.out.println("Enter the name of the director");
				directorName= sc.next();
					
				System.out.println("Enter the name of the protagonists");
				protagonistName= sc.next();				
					
				System.out.println("Enter if the series was censored: (yes or no)");
				optioncensorchip= sc.next();
				
				if(optioncensorchip.equalsIgnoreCase("yes")){
					System.out.println("Digite el motivo de censura");
					censorchip= sc.next();
				}else{
					censorchip="Has no censorship";
				}
				
					
				System.out.println("Enter the release date:\nDay:");
				day= sc.nextInt();
				System.out.println("Month:");
				month= sc.nextInt();
				System.out.println("Year:");
				year= sc.nextInt();
					
				
				
				myBlackSnail.addSerie(name,synopsis,directorName,new Date(day, month, year), protagonistName,censorchip);	
				
				
				System.out.println("\nThe series has been created\n");
				
				break;
				
			default:
				System.out.println("Error, invalid option");	
				break;
			
		}	
	}
	
	/**
	*Permite mostrar los datos de un producto, del que el usuario ingresa su nombre
	*/
	public void ShowProduct(){
		String name;
		System.out.println("Enter the name of your product");
		name= sc.next();
		System.out.println(myBlackSnail.ShowProducts(name));	
	}
	
	/**
	*Permite crear una temporada con sus datos correspondinetes
	*/
	public void createSeason(){
		
		String name,trailer;
		int numberofepisodesPublished,numberofepisodesScheduled,day,month,year;
		Date myDate;
		
		System.out.println("Enter the name of the series");
		name= sc.next();
		
		System.out.println("Enter the number of scheduled episodes");
		numberofepisodesScheduled= sc.nextInt();
		
		System.out.println("Enter the number of episodes published");
		numberofepisodesPublished= sc.nextInt();
		
		System.out.println("Enter the release date:\nDay:");
		day= sc.nextInt();
		System.out.println("Month:");
		month= sc.nextInt();
		System.out.println("Year:");
		year= sc.nextInt();
		
		System.out.println("Type the trailer");
		trailer= sc.next();
		
		myBlackSnail.addSeason(name,numberofepisodesScheduled,numberofepisodesPublished,new Date(day, month, year), trailer);

		System.out.println("\nThe season has been created\n");	
	}
	
	/**
	*Permite mostrar una lista de las peliculas segun la categoria elegida por el usuario
	*/
	public void filmList(){
		int eleccion;
		
		System.out.println("Here are the categories:\n(1) Romantic\n(2) Action \n(3) Suspense \n(4) Horror \n(5) Comedy \nEnter the corresponding number");
		System.out.println("Enter the list of the category you want to see");
		eleccion= sc.nextInt();
		
		
		switch(eleccion){
			case 1:
					
				System.out.println(myBlackSnail.filmList(Category.ROMANTIC));
				break;
			case 2:
						
				System.out.println(myBlackSnail.filmList(Category.ACTION));
				break;
			case 3:
						
				System.out.println(myBlackSnail.filmList(Category.SUSPENSE));
				break;
							
			case 4:
			
				System.out.println(myBlackSnail.filmList(Category.TERROR));
				break;
							
			case 5:
			
				System.out.println(myBlackSnail.filmList(Category.COMEDY));
				break;
				
			default:
				System.out.println("Error, invalid option");
				break;
		}
		
		
	}
	
	/**
	*Permite mostrar la lista de las series
	*/
	public void serieList(){
			
		System.out.println(myBlackSnail.serieList());	
	}
	
}