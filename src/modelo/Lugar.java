package modelo;

public class Lugar {

    public String nombre;
    public String ubicacion;
    public String pais;
    public String direccion;
    public String tel;
    public String informacion;
    public String imagen;

    // Constructor
    public Lugar(String nombre, String ubicacion, String pais, String direccion, String tel, String informacion, String imagen) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.pais = pais;
        this.direccion = direccion;
        this.tel = tel;
        this.informacion = informacion;
        this.imagen = imagen;
    }
}

