public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("hernan", 28, 4775602);
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());

        Persona persona2 = new Persona();
        persona2.setNombre("alan");
        persona2.setEdad(32);
        persona2.setTelefono(4823767);
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getEdad());
        System.out.println(persona2.getTelefono());

    }

    public static class Persona {
        private String nombre;
        private int edad;
        private int telefono;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }
        public int getEdad(){
            return edad;
        }
        public int getTelefono(){
            return telefono;
        }
        public Persona(){};

        public Persona(String nombre, int edad, int telefono) {
            this.nombre = nombre;
            this.edad = edad;
            this.telefono = telefono;
        }

    }
}