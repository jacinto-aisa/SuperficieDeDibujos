import Pintables.IPintables;
import Pintables.PintarConAcuarela;
import Pintables.PintarConAerosol;
import Pintables.PintarConTinta;
import SuperficieDeDibujos.ContenedorDeElementos;
import SuperficieDeDibujos.Elemento;
import Recortables.RecortableAluminio;
import Recortables.RecortableMadera;
import Recortables.RecortablePlastico;


import java.util.ArrayList;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PintarConAcuarela miAcuerala = new PintarConAcuarela();
        PintarConAerosol miAerosol = new PintarConAerosol();
        PintarConTinta miTinta = new PintarConTinta();

        RecortableAluminio miAluminio = new RecortableAluminio();
        RecortableMadera miMadera = new RecortableMadera();
        RecortablePlastico miPlastico = new RecortablePlastico();

        Elemento aerosolEnMadera = new Elemento(miAerosol, miMadera);
        Elemento tintaEnPlastico = new Elemento(miTinta,miPlastico);
        Elemento acuarelaEnAlumino = new Elemento(miAcuerala, miAluminio);
        Elemento acuarelaEnPlastico = new Elemento(miAcuerala, miPlastico);

        ContenedorDeElementos MiContenedor = new ContenedorDeElementos();
        MiContenedor.add(aerosolEnMadera);
        MiContenedor.add(tintaEnPlastico);
        MiContenedor.add(acuarelaEnAlumino);
        MiContenedor.add(acuarelaEnPlastico);

        System.out.println("total de pintura "+MiContenedor.getTotalDePintura() );
    }
}