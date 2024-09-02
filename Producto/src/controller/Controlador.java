package controller;

import model.Categoria;
import model.Producto;
import view.Program;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Producto> productos = new ArrayList<>();
    private List<Categoria> categorias = new ArrayList<>();
    private Program program;

    public Controlador(Program program) {
        this.program = program;
        // Añadir algunas categorías de ejemplo
        categorias.add(new Categoria(1, "Electrónica"));
        categorias.add(new Categoria(2, "Hogar"));
        categorias.add(new Categoria(3, "Ropa"));
    }

    public void crearProducto() {
        int id = program.obtenerID();
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                program.mostrarMensaje("Error: Ya existe un producto con el ID " + id);
                return;
            }
        }
        String nombre = program.obtenerNombre();
        double precio = program.obtenerPrecio();
        Categoria categoria = program.obtenerCategoria(categorias);

        Producto producto = new Producto(nombre, precio, id, categoria);
        productos.add(producto);
        program.mostrarMensaje("Producto creado exitosamente.");
    }

    public void leerProductos() {
        program.mostrarProductos(productos);
    }

    public void actualizarProducto() {
        int id = program.obtenerID();
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                String nombre = program.obtenerNombre();
                double precio = program.obtenerPrecio();
                Categoria categoria = program.obtenerCategoria(categorias);
                producto.setNombre(nombre);
                producto.setPrecioProducto(precio);
                producto.setCategoria(categoria);
                program.mostrarMensaje("Producto actualizado exitosamente.");
                return;
            }
        }
        program.mostrarMensaje("Producto no encontrado.");
    }

    public void eliminarProducto() {
        int id = program.obtenerID();
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                productos.remove(producto);
                program.mostrarMensaje("Producto eliminado exitosamente.");
                return;
            }
        }
        program.mostrarMensaje("Producto no encontrado.");
    }
}

