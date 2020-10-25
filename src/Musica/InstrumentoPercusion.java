package Musica;

public class InstrumentoPercusion extends Instrumento implements Lustrable{
    public InstrumentoPercusion(String nombre, String descripcion){
        super(nombre, descripcion);
    }

    public void tocar(){
        System.out.println("Tocando Instrumento de Percusión: "+super.getNombre());
    }

    public void lustrarInstrumento(){
        System.out.println("Lustrando instrumento...");
    }
}
