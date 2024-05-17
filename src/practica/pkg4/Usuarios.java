
package practica.pkg4;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Usuarios {
    private String Nombre;
    private String Apellido;
    private int id;

    public Usuarios(String Nombre, String Apellido, int id) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.id = id;
    }

    Usuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void guardar(PrintWriter Escribe) {
        Escribe.println(Nombre);
        Escribe.println(Apellido);
        Escribe.println(id);
    }

    public Usuarios cargar(BufferedReader Almacen) {
        String apell;
        String nom;
        int id;
        try{
            nom = Almacen.readLine();
            apell = Almacen.readLine();
            id = Integer.parseInt(Almacen.readLine());
            return new Usuarios(nom, apell, id);
        }catch(Exception e){
        
        }
        return null;
    }

}
