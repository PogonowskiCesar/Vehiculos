package vehiculos;

import static vehiculos.Coche.*;

public class Ejemplo {

	public static void main(String[] args) {
		
		String colorPorDefecto = "Rojo";
		Vehiculo miCoche = new Coche("Verde");//.modelo("Mercedes Benz");;
		Vehiculo miCoche2 = new Coche("Azul");
//		miCoche.modelo = "Ford Fiesta";
//		miCoche.color = colorPorDefecto;
		
		
//		miCoche.setColor(colorPorDefecto);
		System.out.println(miCoche);
		
//		miCoche2 = Coche.crearConModelo("Seat Ibiza");
		
		miCoche = miCoche2;
//		miCoche2.modelo = "Opel Astra";
//		miCoche2.color = "Azul";
		
//		miCoche2.color = colorPorDefecto;
		
//		System.out.println(miCoche);
//		System.out.println(miCoche2);
		
		Coche coche1 = new Coche("Seat Ibiza", "Rojo");
		coche1.setMatricula("1234 BBB");
		System.out.println(coche1);
		Vehiculo miMoto = new Moto("Suzuki","Negro");
		System.out.println(miMoto);
	}

}
