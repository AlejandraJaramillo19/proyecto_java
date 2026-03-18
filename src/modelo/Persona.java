package modelo;

public class Persona {
    private String nombre;
    private long edad; // JSON Simple usa long para números
    private String ciudad;

    public Persona(String nombre, long edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + "]";
    }
}