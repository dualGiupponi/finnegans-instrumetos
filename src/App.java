import Musica.*;

public class App {
    public static void main(String[] args) throws Exception {
        Instrumento instrumentosMusicales[] = {
            new InstrumentoCuerda("Guitarra", "Guitarra Criolla"),
            new InstrumentoCuerda("Charango", "Charango Salteño"),
            new InstrumentoPercusion("Bombo Criollo","Bombo perteneciente a Mercedes Sosa"),
            new InstrumentoPercusion("Bongó", "Bongó perteneciente a alguien"),
            new InstrumentoVientoMadera("Quena", "Quena perteneciente a Los Chalchaleros"),
            new InstrumentoVientoMadera("Sikus", "Sikus Salteño"),
            new InstrumentoVientoMetal("Flauta Transversa", "Flauta que se toca de costado"),
            new InstrumentoVientoMetal("Corno", "Corno de Válvulas Fosforadas")
        };

        for (Instrumento instrumentoMusical: instrumentosMusicales){
            //Lista de instrumentos
            System.out.println(instrumentoMusical.toString());
        }
    }
}
