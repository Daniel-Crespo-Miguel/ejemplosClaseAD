package leeyescribe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class tmp {    
	

	public static void main(String[] args) {      
		
		int contador=0;
		int datosEntrada[] = null;
		try{
			File mifichero = new File("info.jpg");
			FileInputStream ficheroL = new FileInputStream(mifichero);        
			// .......... �qu� contiene size?
			long size = mifichero.length();
			
			// .............explica aqu� el porqu� de la variable datosEntrada
			datosEntrada = new int[(int)size];        // ........explica lo que hay entre los corchetes

			// ...........uso de finalArchivo
			boolean finalArchivo = false;            
			
			while(!finalArchivo){     
				int byteEntrada = ficheroL.read(); 
				// .............explica aqu� el uso de byteEntrada
				if (byteEntrada!=-1){
					//...........explica esta asignaci�n
					datosEntrada[contador] = byteEntrada;                                                    
				}else{
					finalArchivo = true; 
				}
				//..............�qu� se muestra por pantalla?
				System.out.println(datosEntrada[contador]); 
				contador++;                 
			}          
			ficheroL.close();            
		}catch(IOException e){
			System.out.println("Mensaje: " + e.getMessage());
		} 

		//............que he conseguido cuando he llegado hasta aqu�?		
		try{
			FileOutputStream ficheroNuevo = new FileOutputStream("salida.jpg"); 
			if (datosEntrada != null) {
				//.............�qu� hago en este for?
				for (int i = 0; i <datosEntrada.length; i++) {
					ficheroNuevo.write(datosEntrada[i]);
				}
			}
			ficheroNuevo.close();
			
		}catch(IOException e){            
			System.out.println("Mensaje: " + e.getMessage());
		}finally{
			System.out.println("Fichero creado con �xito");
		}
	}
}
