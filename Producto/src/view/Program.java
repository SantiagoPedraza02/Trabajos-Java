package view;

import controller.Controlador;
import model.Categoria;
import model.Producto;

import java.util.List;
import java.util.Scanner;

public class Program {
    private Scanner scanner = new Scanner(System.in);
    private Controlador controlador;

    public Program(Controlador controlador) {
        this.controlador = controlador;
    }

    public static void main(String[] args) {
        Program program = new Program(null);
        Controlador controlador = new Controlador(program);
        program.controlador = controlador;
        program.iniciar();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    controlador.crearProducto();
                    break;
                case 2:
                    controlador.leerProductos();
                    break;
                case 3:
                    controlador.actualizarProducto();
                    break;
                case 4:
                    controlador.eliminarProducto();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    mostrarMensaje("Opción no válida.");
            }
        }
    }

    public int mostrarMenu() {
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Crear producto");
        System.out.println("2. Leer productos");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        return scanner.nextInt();
    }

    public int obtenerID() {
        System.out.print("Ingrese el ID: ");
        return scanner.nextInt();
    }

    public String obtenerNombre() {
        System.out.print("Ingrese el nombre: ");
        scanner.nextLine();  // Limpiar el buffer
        return scanner.nextLine();
    }

    public double obtenerPrecio() {
        System.out.print("Ingrese el precio: ");
        return scanner.nextDouble();
    }

    public Categoria obtenerCategoria(List<Categoria> categorias) {
        System.out.println("Seleccione una categoría: ");
        for (Categoria categoria : categorias) {
            System.out.println(categoria.getId() + ". " + categoria.getNombre());
        }
        int id = scanner.nextInt();
        for (Categoria categoria : categorias) {
            if (categoria.getId() == id) {
                return categoria;
            }
        }
        return null;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarProducto(Producto producto) {
        System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecioProducto() + ", Categoría: " + producto.getCategoria().getNombre());
    }

    public void mostrarProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            mostrarProducto(producto);
        }
    }
}