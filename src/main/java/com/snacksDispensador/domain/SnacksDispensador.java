package com.snacksDispensador.domain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class SnacksDispensador {
    private List<Snack> snacks;

    public SnacksDispensador() {
        this.snacks = new ArrayList<>();
    }

    public void agregarDeCero(String nombre, int cantidad, int codigo, String tipo, int precio) {
        Snack snackAgregar = new Snack(nombre, cantidad, codigo, tipo, precio);
        if (cantidad <= 12) {
            this.snacks.add(snackAgregar);
            System.out.println("Se han agregado " + cantidad + " de " + nombre);
        } else {
            System.out.println("No se pueden agregar tantos snacks");
        }

    }

    public void agregarExistenteNombre(String nombre, int cantidad) {
        Snack snackBuscar = this.snacks.stream().filter(snack -> snack.getNombre() == nombre).findFirst().get();
        snackBuscar.getCantidad();
        if (snackBuscar.getCantidad() + cantidad < 6) {
            int cantidadAgregar = snackBuscar.getCantidad() + cantidad;
            snackBuscar.setCantidad(cantidadAgregar);
            System.out.println("Se agregaron correctamente " + cantidad + " de " + nombre + " ahora quedan " + cantidadAgregar);
        } else {
            System.out.println("No se puede agregar tanta cantidad");
        }
    }

    public void sacarSnackCodigo(int codigo, int cantidad) {
        Snack snackBuscar = this.snacks.stream().filter(snack -> snack.getCodigo() == codigo).findFirst().get();
        snackBuscar.getCantidad();
        snackBuscar.getPrecio();
        if (snackBuscar.getCantidad() >= cantidad) {
            int precioCompra = snackBuscar.getPrecio() * cantidad;
            System.out.println("Se saco correctamente " + cantidad + " de " + snackBuscar.getNombre() + " el precio es " + precioCompra);
            int cantidadActual = snackBuscar.getCantidad() - cantidad;
            snackBuscar.setCantidad(cantidadActual);
            System.out.println("Quedaron dentro del dispensador " + cantidadActual + " de " + snackBuscar.getNombre());
        } else {
            System.out.println("No se puede sacar la cantidad deseada de " + snackBuscar.getNombre());
        }
    }

    public void sacarSnackNombre(String nombre, int cantidad) {
        Snack snackBuscar = this.snacks.stream().filter(snack -> snack.getNombre() == nombre).findFirst().get();
        snackBuscar.getCantidad();
        snackBuscar.getPrecio();
        if (snackBuscar.getCantidad() >= cantidad) {
            int precioCompra = snackBuscar.getPrecio() * cantidad;
            int cantidadActual = snackBuscar.getCantidad() - cantidad;
            System.out.println("Se pudo sacar correctamente " + cantidad + " de " + nombre + " el precio es " + precioCompra);
            System.out.println("Ahora quedan " + cantidadActual + " de " + nombre);
            snackBuscar.setCantidad(cantidadActual);
        } else {
            System.out.println("No se puede sacar la cantidad deseada de " + snackBuscar.getNombre());
        }
    }

    public void agregarExistenteCodigo(int codigo, int cantidad) {
        Snack snackBuscar = this.snacks.stream().filter(snack -> snack.getCodigo() == codigo).findFirst().get();
        snackBuscar.getCodigo();
        snackBuscar.getCantidad();
        if (snackBuscar.getCantidad() + cantidad <= 6) {
            int cantidadTotal = snackBuscar.getCantidad() + cantidad;
            System.out.println("Se pudo agregar correctamente " + cantidad + " de " + snackBuscar.getNombre());
            snackBuscar.setCantidad(cantidadTotal);
            System.out.println("Ahora quedan " + cantidadTotal + " de " + snackBuscar.getNombre());
        } else {
            System.out.println("No se puede ingresar la cantidad deseada");
        }
    }

    public void eliminarSnack(int codigo) {
        Snack snackBuscar = this.snacks.stream().filter(snack -> snack.getCodigo() == codigo).findFirst().get();
        if (snackBuscar != null) {
            this.snacks.remove(snackBuscar);
            System.out.println("Se ha eliminado correctamente el snack " + snackBuscar.getNombre());
        } else {
            System.out.println("El snack no está en la maquina");
        }
    }

    public void mostrarCantidad(int codigo) {
        Snack snackBuscar = this.snacks.stream().filter(snack -> snack.getCodigo() == codigo).findFirst().get();
        if (snackBuscar != null) {
            System.out.println("La cantidad del snack " + snackBuscar.getNombre() + " es " + snackBuscar.getCantidad());
        } else {
            System.out.println("El producto no se encuentra dentro de la maquina");
        }
    }

    public void snacksAgotados() {
        System.out.println("Los productos agotados son: ");
        this.snacks.forEach(snack -> {
            if (snack.getCantidad() == 0){
                System.out.println(snack.getNombre());
            }
        });
        }

    public void imprimirInventario(){
        System.out.println("Los productos dentro de la maquina son: ");
        this.snacks.forEach(c -> System.out.println(c.getNombre() + " " + c.getCantidad()));
    }

    public void ordenarMayorMenor(){
        this.snacks.sort(Comparator.comparing(Snack::getPrecio).reversed());
        System.out.println("Los productos ordenados por precio mayor a menor son: ");
        this.snacks.forEach(c-> System.out.println(c.getNombre() + " " + c.getPrecio()));
    }

    public void ordenarMenorMayor(){
        this.snacks.sort(Comparator.comparing(Snack::getPrecio).thenComparing(Snack::getPrecio));
        System.out.println("Los productos ordenados por precio menor a mayor son: ");
        this.snacks.forEach(c-> System.out.println(c.getNombre() + " " + c.getPrecio()));
    }

    public List<Snack> getSnack(){
        return snacks;
    }

}
