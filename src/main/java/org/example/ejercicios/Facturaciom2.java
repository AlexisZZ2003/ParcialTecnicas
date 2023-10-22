package org.example.ejercicios;

import java.util.List;

public class Facturacion {
	record Factura(String cliente, String fechaFactura, List<Double> precioProducto) {
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sannabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));

		double totalValorFactura1 = calcularTotal(factura1);
                imprimirFactura("Factura 1", factura1, totalValorFactura1);
		
                double totalValorFactura2 = calcularTotal(factura2);
                imprimirFactura("Factura 2", factura2, totalValorFactura2);
	}

	private static double calcularTotal(Factura factura) {
            double total = factura.preciosProducto().stream().mapToDouble(Double::doubleValue).sum();
            return total;		
	}

	private static void imprimirFactura(String titulo, Factura factura, double total) {
            System.out.println(titulo);
            System.out.println("Cliente: " + factura.cliente());
            System.out.println("Total: " + total);
        }
}
