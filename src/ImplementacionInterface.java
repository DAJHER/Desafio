import mx.com.sintelti.desafios.oporx.Solucion;


public class ImplementacionInterface implements Solucion {

    int lentgth;
    String salida;
    char chars;

    public ImplementacionInterface(){
        this.lentgth = 0;
        this.salida = "";
        chars = 'x';
    }
    public String convertir(String entrada) {
        this.lentgth = entrada.length();

        for (char caracter:  entrada.toCharArray()) {
            //System.out.println(caracter);
            //this.salida = entrada
            //
        }
         for (int x =0; x<=lentgth; x++){
           salida = entrada.replace('o',this.chars);
        }
        return salida;
    }
}
