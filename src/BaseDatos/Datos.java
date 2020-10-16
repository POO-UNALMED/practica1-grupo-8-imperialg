package BaseDatos;

import gestorAplicacion.producto.Consola;
import gestorAplicacion.producto.Juego;
import gestorAplicacion.producto.Periferico;
import gestorAplicacion.transacciones.Cliente;
import gestorAplicacion.transacciones.Factura;

import java.io.*;
import java.util.ArrayList;

public class Datos{
    private ArrayList<Consola> listaConsolas = new ArrayList<Consola>();
    private ArrayList<Juego> listaJuegos = new ArrayList<Juego>();
    private ArrayList<Periferico> listaPerifericos = new ArrayList<Periferico>();
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Factura> listaFacturas = new ArrayList<Factura>();

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
    public Juego juegoMasVendido() {
        Juego masvendido = listaJuegos.get(0);
        for (Juego juego : listaJuegos) {
            if (juego.getUnidadesVendidas() > masvendido.getUnidadesVendidas()) {
                masvendido = juego;
            }
        }
        return masvendido;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
}