import mx.com.sintelti.desafios.oporx.Solucion;
import java.util.ArrayList;
public class ImplementacionInterface implements Solucion {
    String salida;
    String entrada ;
    String temp;
    public ImplementacionInterface(){
        LimpiarValores();
    }
    private void LimpiarValores(){
        this.salida = "";
        this.entrada = "";
    }
    public String convertir(String entrada) {
        LimpiarValores();
        Integer acumulado=0;
        this.temp = entrada;
        ArrayList<String> Lista = new ArrayList<String>();//(Arrays.asList(this.entrada.split("")));
        for (int b =0; b<entrada.length(); b++){
            this.temp = entrada.substring(b);
            this.entrada = temp.substring(0,1);
            Lista.add(this.entrada);
            System.out.println(this.temp   + "      " + this.entrada);
        }
        for (String caracter:  Lista) {
            if(caracter.equals("o")) {
                caracter = "";
                acumulado++;
                for (int contador=1; contador<=acumulado; contador++){
                    caracter += "x";
                }
            }
            this.salida += caracter;
        }
        String s= "oso";
        for (String x=""; s.indexOf('o') > -1; s = s.substring(0,s.indexOf('o')) + (x=x+'x') + s.substring(s.indexOf('o')+1));
        return s;
        //return salida;
    }
}
