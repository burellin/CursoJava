package es.cursojava.inicio.condicionales.ejercicios;

public class EjercicioCondicionalesIf {

	public static void main(String[] args) {
		String mes = "Octubree";
				
				if (mes=="Enero" || mes=="Febrero" || mes=="Marzo")
					System.out.println("Invierno");
				
				else if (mes=="Abril" || mes=="Mayo" || mes=="Junio")
					System.out.println("Primavera");
				
				else if (mes=="Julio" || mes=="Agosto" || mes=="Septiembre")
					System.out.println("Verano");
				
				else if (mes=="Octubre" || mes=="Noviembre" || mes=="Diciembre")
					System.out.println("Otoño");
				
				else { 
					System.out.println("Mes Incorrecto");
				}

	}

}
