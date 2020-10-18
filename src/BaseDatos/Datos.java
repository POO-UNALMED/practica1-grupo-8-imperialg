package BaseDatos;

import gestorAplicacion.producto.Consola;
import gestorAplicacion.producto.Juego;
import gestorAplicacion.producto.Periferico;
import gestorAplicacion.producto.Producto;
import gestorAplicacion.transacciones.Cliente;
import gestorAplicacion.transacciones.Factura;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Datos{
    private ArrayList<Consola> listaConsolas = new ArrayList<Consola>();
    private ArrayList<Juego> listaJuegos = new ArrayList<Juego>();
    private ArrayList<Periferico> listaPerifericos = new ArrayList<Periferico>();
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Factura> listaFacturas = new ArrayList<Factura>();
    Scanner entrada = new Scanner(System.in);

    //Agregar productos:

    public  void agregarConsola(Consola consola) {
        listaConsolas.add(consola);
    }
    public void agregarJuego(Juego juego) {
        listaJuegos.add(juego);
    }

    public void agregarPeriferico(Periferico periferico) {
        listaPerifericos.add(periferico);
    }

    public void agregarClientes(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void agregarFactura(Factura factura){
        listaFacturas.add(factura);
    }

    public void venderJuego(){}

    // Seleccionar elementos de listas:
    public ArrayList<Producto> juegoPorIndice(int[] ints){
        ArrayList<Producto> nuevaLista = new ArrayList<Producto>();
        for (int i: ints){
            nuevaLista.add(this.listaJuegos.get(i-1));
        }
        return nuevaLista;
    }
    public ArrayList<Producto> consolaPorIndice(int[] ints){
        ArrayList<Producto> nuevaLista = new ArrayList<Producto>();
        for (int i: ints){
            nuevaLista.add(this.listaConsolas.get(i-1));
        }
        return nuevaLista;
    }
    public ArrayList<Producto> perifericoPorIndice(int[] ints){
        ArrayList<Producto> nuevaLista = new ArrayList<Producto>();
        for (int i: ints){
            nuevaLista.add(this.listaPerifericos.get(i-1));
        }
        return nuevaLista;
    }
    //Guardar datos de productos
    public void guardarDatos() {
        try {
            FileOutputStream c = new FileOutputStream(new File("src/BaseDatos/temp/Consolas.txt"));
            FileOutputStream d = new FileOutputStream(new File("src/BaseDatos/temp/Juegos.txt"));
            FileOutputStream e = new FileOutputStream(new File("src/BaseDatos/temp/Perifericos.txt"));
            ObjectOutputStream o = new ObjectOutputStream(c);
            ObjectOutputStream p = new ObjectOutputStream(d);
            ObjectOutputStream q = new ObjectOutputStream(e);
            o.writeObject(listaConsolas);
            p.writeObject(listaJuegos);
            q.writeObject(listaPerifericos);
            o.close();
            p.close();
            q.close();
            c.close();
            d.close();
            e.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error Flujo de inicialización");
        }
    }

    public Cliente seleccionarCliente(int i){
        Cliente cliente = listaClientes.get(i);
        return cliente;
    }
    public void leerDatos() {
        try {
            FileInputStream ci = new FileInputStream("src/BaseDatos/temp/Consolas.txt");
            FileInputStream di = new FileInputStream("src/BaseDatos/temp/Juegos.txt");
            FileInputStream ei = new FileInputStream("src/BaseDatos/temp/Perifericos.txt");
            ObjectInputStream oi = new ObjectInputStream(ci);
            ObjectInputStream pi = new ObjectInputStream(di);
            ObjectInputStream qi = new ObjectInputStream(ei);
            listaConsolas = (ArrayList<Consola>) oi.readObject();
            listaJuegos = (ArrayList<Juego>) oi.readObject();
            listaPerifericos = (ArrayList<Periferico>) oi.readObject();
            oi.close();
            pi.close();
            qi.close();
            ci.close();
            di.close();
            ei.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error Flujo de inicialización");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    //Guardar datos de transacciones
    public void guardarDatos1() {
        try {
            FileOutputStream c = new FileOutputStream(new File("src/BaseDatos/temp/Clientes.txt"));
            FileOutputStream d = new FileOutputStream(new File("src/BaseDatos/temp/Facturas.txt"));
            ObjectOutputStream o = new ObjectOutputStream(c);
            ObjectOutputStream p = new ObjectOutputStream(d);
            o.writeObject(listaClientes);
            p.writeObject(listaFacturas);
            o.close();
            p.close();
            c.close();
            d.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error Flujo de inicialización");
        }
    }

    public void leerDatos1() {
        try {
            FileInputStream ci = new FileInputStream("src/BaseDatos/temp/Clientes.txt");
            FileInputStream di = new FileInputStream("src/BaseDatos/temp/Facturas.txt");
            ObjectInputStream oi = new ObjectInputStream(ci);
            ObjectInputStream pi = new ObjectInputStream(di);
            listaClientes = (ArrayList<Cliente>) oi.readObject();
            listaFacturas = (ArrayList<Factura>) oi.readObject();
            oi.close();
            pi.close();
            ci.close();
            di.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error Flujo de inicialización");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   /* public Juego juegoMasVendido() {
        Juego masvendido = listaJuegos.get(0);
        for (Juego juego : listaJuegos) {
            if (juego.getUnidadesVendidas() > masvendido.getUnidadesVendidas()) {
                masvendido = juego;
            }
        }
        return masvendido;
    }*/

    public void ingresarConsola() {
        System.out.println("Ingrese nombre de consola: ");
        String nombre = entrada.next();
        System.out.println("Ingrese uso(true or false): ");
        Boolean uso = entrada.nextBoolean();
        System.out.println("Ingrese precio ");
        float precio = entrada.nextFloat();
        System.out.println("Ingrese color: ");
        String color = entrada.next();
        System.out.println("Ingrese nombre de la version: ");
        String version = entrada.next();
        System.out.println("Ingrese cantidad almacenamiento: ");
        int almacenamiento = entrada.nextInt();
        Consola consola = new Consola(nombre, uso, precio, color, version, almacenamiento);
        this.agregarConsola(consola);
    }
    public void ingresarJuego() {
        System.out.println("Ingrese nombre de consola: ");
        String nombre = entrada.next();
        System.out.println("Ingrese uso(true or false): ");
        Boolean uso = entrada.nextBoolean();
        System.out.println("Ingrese precio ");
        float precio = entrada.nextFloat();
        System.out.println("Ingrese pegi: ");
        int pegi = entrada.nextInt();
        System.out.println("Ingrese nombre plataforma: ");
        String plataforma = entrada.next();
        System.out.println("Ingrese genero: ");
        String genero = entrada.next();
        Juego juego = new Juego(nombre, uso, precio, pegi, plataforma, genero);
        this.agregarJuego(juego);
    }

    public void ingresarPeriferico() {
        System.out.println("Ingrese nombre de consola: ");
        String nombre = entrada.next();
        System.out.println("Ingrese uso(true or false): ");
        Boolean uso = entrada.nextBoolean();
        System.out.println("Ingrese precio ");
        float precio = entrada.nextFloat();
        System.out.println("Ingrese nombre plataforma: ");
        String plataforma = entrada.next();
        Periferico periferico = new Periferico(nombre, uso, precio, plataforma);
        this.agregarPeriferico(periferico);
    }

    public void ingresarCliente() {
        System.out.println("Ingrese nombre de Cliente: ");
        String nombre = entrada.next();
        System.out.println("Ingrese cedula: ");
        int cc = entrada.nextInt();
        System.out.println("Ingrese celular: ");
        long celular = entrada.nextLong();
        System.out.println("Ingrese email: ");
        String email = entrada.next();
        Cliente cliente = new Cliente(nombre, cc, celular, email);
        this.agregarClientes(cliente);
    }
// Obtener accesoa a listas:
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public ArrayList<Consola> getListaConsolas() {
        return listaConsolas;
    }

    public ArrayList<Juego> getListaJuegos() {
        return listaJuegos;
    }

    public ArrayList<Periferico> getListaPerifericos() {
        return listaPerifericos;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }
}