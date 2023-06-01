public class Main {
    public static void main(String[] args)
    {
        Persona persona = new Persona();
        persona.setEdad(18);
        int edadPersona = persona.getEdad();
        System.out.println("Tengo: " + edadPersona);
        persona.setNombre("Mi nombre es:" + "Daniel");
        String nombrePersona = persona.getNombre();
        System.out.println(nombrePersona);
        persona.setTelefono("Mi celular es: " + "3134335113");
        String telPersona = persona.getTelefono();
        System.out.println(telPersona);
        }

    }
    class Persona {
        private int edad;
        private String nombre;
        private String telefono;


        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public String getNombre() {
            return nombre;
        }


        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }


        public String getTelefono() {
            return telefono;
        }
    }
