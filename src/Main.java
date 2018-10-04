public class Main extends  ImplementacionInterface{
    public static void main(String args[]){

        //System.out.println("Inicio");
        ImplementacionInterface implementar = new ImplementacionInterface();

        System.out.println(implementar.convertir("Hola mundo"));
        System.out.println(implementar.convertir("Como diciendo que no funciono"));
        System.out.println(implementar.convertir("1o2o3o4o5o6o7o9o"));
        System.out.println(implementar.convertir("1o2o"));
        System.out.println(implementar.convertir("1o2o3o"));
    }
}
