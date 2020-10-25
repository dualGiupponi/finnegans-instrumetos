package Musica;



public class InstrumentoCuerda extends Instrumento implements Afinacion {
    public InstrumentoCuerda(String nombre, String descripcion){
        super(nombre, descripcion);
    }

    public void tocar(){
        System.out.println("Tocando Instrumento de Cuerda: "+super.getNombre());
    }

    public void afinacionAutomatica(){
        System.out.println("Afinando automáticamente...");
    }

    public void afinacionManual(){
        System.out.println("Afinando manualmente...");
    }

}
