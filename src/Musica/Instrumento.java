package Musica;

public abstract class Instrumento {
    private String nombre;
    private String descripcion;

    public Instrumento(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    @Override
    public String toString(){
        return this.getNombre() + " - " + this.getDescripcion();
    }

    public abstract void tocar();

}
