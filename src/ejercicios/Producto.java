package ejercicios;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); 
        setStock(stock);   
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

 
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo");
        }
    }


    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0");
        } else if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada. Stock restante: " + stock);
        } else {
            System.out.println("Error: No hay suficiente stock");
        }
    }
}