package Musica;

public class InstrumentoVientoMadera extends InstrumentoViento {
    public InstrumentoVientoMadera(String nombre, String descripcion){
        super(nombre, descripcion);
    }

    public void tocar(){
        System.out.println("Tocando Instrumento de Viento de Madera: " + super.getNombre());
    }

    public void afinacionManual(){
        System.out.println("Afinando manualmente...");
    }

    public void afinacionAutomatica(){
        System.out.println("Afinando Automáticamente...");
    }

    public void lustrarInstrumento(){
        System.out.println("Lustrar instrumento...");
    }
}
