package Musica;

public class InstrumentoVientoMetal extends InstrumentoViento{
    public InstrumentoVientoMetal(String nombre, String descripcion){
        super(nombre, descripcion);
    }

    public void tocar(){
        System.out.println("Tocando Instrumento de Viento de Metal: " + super.getNombre());
    }

    public void afinacionManual(){
        System.out.println("Afinando manualmente...");
    }

    public void afinacionAutomatica(){
        System.out.println("Afinando automáticamente...");
    }

    public void lustrarInstrumento(){
        System.out.println("Lustrar Instrumento...");
    }
}
