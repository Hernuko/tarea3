public class Main {

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int resultado = sumar(3,5,10);
        System.out.println(resultado);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.getCantPuertas());

    }


}

class Coche {

    private int cantPuertas=0;

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void sumarPuertas(){
        cantPuertas++;
    }

}