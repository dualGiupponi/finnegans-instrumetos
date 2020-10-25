package Musica;

public abstract class InstrumentoViento extends Instrumento implements Afinacion, Lustrable {
    public InstrumentoViento(String nombre, String descripcion){
        super(nombre, descripcion);
    }
}
