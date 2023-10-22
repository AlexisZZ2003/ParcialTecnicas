package org.example.ejercicios;

public class CalculaAreaTriangulo {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("rojo", 5.0, 4.0);
		double areaTriangulo = 0D;
		double base = triangulo.base();
		double altura = triangulo.altura();
		areaTriangulo =  0.5 * base * altura;
		System.out.println("Altura del triángulo: " + triangulo.altura());
		System.out.println("Base del triángulo: " + triangulo.base());
		System.out.println("Área del triángulo: " + areaTriangulo);
	}

	record Triangulo(String color, double base, double altura) {}
}
