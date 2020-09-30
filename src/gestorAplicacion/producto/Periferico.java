package gestorAplicacion.producto;

import java.util.ArrayList;

public class Periferico extends Producto {
    private boolean estado;
    private String plataforma;
    private static ArrayList<Periferico> lista = new ArrayList<Periferico>();

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Periferico(String nombre, boolean uso, boolean estado, String plataforma) {
        super(nombre, uso);
        this.estado = estado;
        this.plataforma = plataforma;
        lista.add(this);
    }
}
