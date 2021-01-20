package ec.edu.espol.workshops.second;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("***CARLNSURANCE***");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("INGRESE SU NOMBRE: ");
        String name = sc.nextLine();
        
        System.out.print("INGRESE SU ESTADO (married/not married): ");
        String estado = sc.nextLine();
        
        System.out.print("INGRESE SU SEXO (M/F): ");
        char sex = sc.next().charAt(0);
        
        System.out.print("INGRESE SU EDAD: ");
        int age = sc.nextInt();
        
        System.out.print("POSEE LICENCIA DE CONDUCIR (true/false): ");
        boolean license = sc.nextBoolean();
        
        Carlnsurance ensure = new Carlnsurance(name, age, sex, estado, license);
        
        //System.out.println("Su nombre es "+ensure.getName()+" y tiene "+String.valueOf(ensure.getAge())+", usted es "+ String.valueOf(ensure.getSex())+ " y su estado es "+ensure.getStatus());
       // System.out.println("Su seguro inicial es de: "+  String.valueOf(ensure.getPremium()));
        
        
        
       // System.out.println("=====================================");
       // System.out.println("========= Ajustes de ventas =========");
        
        if( ensure.getAge() < 18 || ensure.getLicenseDriver() == false ) {
        	System.out.println("No se le vendera");
        	ensure.setPremium(0);
         	System.out.println("Su seguro ahora tiene un precio de: "+ensure.getPremium());
        }

        else if(ensure.getAge() > 80) {
        	System.out.println("No se le puede vender el seguro por la edad");
        	System.out.println("La compania se somete a las leyes nacionales. ");
        	ensure.setPremium(0);      	        	
        }else {
        	
        	if(ensure.getSex() == 'M' || ensure.getSex() == 'm' && ensure.getLicenseDriver()) {
        		iif (ensure.getStatus().equals("not married")) {
        			if (ensure.getAge() < 25 && ensure.getAge() > 18) {
        				System.out.println("Se le aumentará $1500 más a su seguro");
    	             			ensure.setPremium(ensure.getPremium()+1500);
    	             			System.out.println("Su seguro ahora tiene un precio de: "+ensure.getPremium());
            			}
            			else if (ensure.getAge() < 45 && ensure.getAge() > 25) {
            				System.out.println("Se le restará $100 a su seguro");
                     			ensure.setPremium(ensure.getPremium()-100);
                     			System.out.println("Su seguro ahora tiene un precio de: "+ensure.getPremium());
            			}
        			else if(ensure.getAge() < 65 && ensure.getAge() > 45 && ensure.getLicenseDriver()) {
					System.out.println("Se le restará $100 a su seguro");
					ensure.setPremium(ensure.getPremium()-100);
					System.out.println("Su seguro ahora tiene un precio de: "+ensure.getPremium());
				}
            		}
        	}
		else if ( ((ensure.getSex() == 'F' || ensure.getSex() == 'f') || (ensure.getStatus().toLowerCase() == "married")) && ensure.getLicenseDriver() ) {
        		System.out.println("Se le restará $200 a su seguro");
              	ensure.setPremium(ensure.getPremium()-200);
              	System.out.println("Su seguro ahora tiene un precio de: "+ensure.getPremium());
             }else
            	 if((ensure.getSex() == 'F' || ensure.getSex() == 'f')) {
            		 if(ensure.getStatus().compareTo("not married")==0) {
            			 if(ensure.getLicenseDriver()) {
            				 System.out.println("Se le anadira $200 a su seguro");
                           	ensure.setPremium(ensure.getPremium()+200);
                           	System.out.println("Su seguro ahora tiene un precio de: "+ensure.getPremium());
            			 }
            		 }
            	 }
        }
        
        //System.out.println("=====================================");
        System.out.println("== AHORA SUS DATOS ACTUALIZADO SON ==");
        System.out.println("Su nombre es "+ensure.getName()+" y tiene "+String.valueOf(ensure.getAge())+", usted es "+ String.valueOf(ensure.getSex())+ " y su estado es "+ensure.getStatus());
        System.out.println("Su seguro es de: "+  String.valueOf(ensure.getPremium()));
        
        sc.close();
        
	}

}
