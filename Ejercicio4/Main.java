package Ejercicio4;

public class Main {

	public static void main(String[] args) {
		double SumaE=0,SumaT=0,SumaL=0;
		Electrodomestico ele[]=new Electrodomestico[10];
		
		
		ele[0]=new Electrodomestico(114, 40, "blanco",'L' );
		ele[1]=new Electrodomestico();
		ele[2]=new Electrodomestico(130,97);
		ele[3]=new Electrodomestico(143, 51, "azul", 'D');
        ele[4]=new Lavadora(230, 45);
        ele[5]=new Lavadora(150, 64, 20, "blanco", 'B');
        ele[6]=new Lavadora(180, 68 , 13, "gris", 'S');
        ele[7]=new Television(170, 18 , 50, "negro", 'U', true);
        ele[8]=new Television(200,24,25,"negro",'E', false);
        ele[9]=new Television();
       
        
        for(int i=0; i<ele.length;i++) {
        	
        	if(ele[i] instanceof Electrodomestico) {
        		SumaE=SumaE+ele[i].precioFinal();
    
        	}
        	if(ele[i] instanceof Television) {
        		SumaT=SumaT+ele[i].precioFinal();
        	}
        	
        	if(ele[i] instanceof Lavadora) {
        		SumaL=SumaL+ele[i].precioFinal();
        	}
        	
        }
        
        
        System.out.println("El precio de todas las Televisiones es: " + SumaT);
        System.out.println("El precio de todas las Lavadoras es: "+ SumaL);
        System.out.println("El precio de todos los Electrodomesticos es: "+ SumaE);
	}

}
