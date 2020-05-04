package Ejercicio2;

public class Main {

	public static void main(String[] args) {
	
		Libro li1=new Libro("Stephenie Meyer",45,2012,true);
		Revistas rev1=new Revistas(5678,13,2016,true);
		Libro li2=new Libro("J.K. Rowling",12,1990,false);
		Revistas rev2=new Revistas(1222,43,2000,true);
		Libro li3=new Libro("Paulo Coelho",453,1978,true);
		Revistas rev3=new Revistas(1247,789,2015,false);
		Libro li4=new Libro("Dan Brown",564,1567,false);
		Revistas rev4=new Revistas(2355,23,2012,true);

		Publicacion[] pub = new Publicacion[8];

		pub[0]=li1;
		pub[1]=rev1;
		pub[2]=li2;
		pub[3]=rev2;
		pub[4]=li3;
		pub[5]=rev3;
		pub[6]=li4;
		pub[7]=rev4;
		
		for(int i = 0;i < pub.length;i++) {
			System.out.println(pub[i].toString());
			}
		
	}

}
