package ejercicios;

public class Factura {
	
	
    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    
    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    
    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("El precio unitario debe ser mayor a 0.");
        }
    }

   
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    
    public void mostrarFactura() {
        System.out.println("Código de factura: " + codigoFactura);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: Q" + precioUnitario);
        System.out.println("Total: Q" + calcularTotal());
    }
	

}
