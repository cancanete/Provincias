package  dominio;
import java.until.*;
public class  Municipio{
        private String nombre;
        private ArrayList <Localidad> localidades;
        public Municipio (Sting nombre_){
                 nombre = nombre_;
                 localidades = new ArrayList <Localidad>();
        }
        public 	Municipio addLocalidad (localidad l){
            localidad.add (l);
            return this;
        }
        public String toString(){
            Sting cad ="Localidad: _"+nombre +" _municipio: \n";
            for ( Localidad l : localidades )
                 cad+= (l + "\n");
        return cad;
        }
        public int getPoblacion(){
        int total = 0;
        for (Localidad l : localidades){
             total += l.getPoblaciones();
             return total;
             }
        }

       }
