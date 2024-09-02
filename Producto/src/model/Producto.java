package model;

public class Producto {
    private String nombre;
    private double precioProducto;
    private int id;
    private Categoria categoria;

    public Producto(String nombre, double precioProducto, int id, Categoria categoria) {
        this.nombre = nombre;
        this.precioProducto = precioProducto;
        this.id = id;
        this.categoria = categoria;
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecioProducto() { return precioProducto; }
    public void setPrecioProducto(double precioProducto) { this.precioProducto = precioProducto; }
    public int getId() { return id; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
