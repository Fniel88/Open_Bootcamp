public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Daniel");
        String a = cliente.getNombre();
        cliente.setEdad(18);
        int b = cliente.getEdad();
        cliente.setTelefono("3134335113");
        String c = cliente.getTelefono();
        cliente.setCredito("2.000.000");
        String d = cliente.getCredito();

        System.out.println("El nombre es :"+ a);
        System.out.println("Edad :"+ b);
        System.out.println("Telefono :"+ c);
        System.out.println("Credito :"+ d);

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario("1.500.000");
        String h = trabajador.getSalario();
        
        System.out.println("Salario :"+ h);

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona{
    String credito;

    public void setCredito(String credito){
        this.credito = credito;
    }

    public String getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    String salario;

    public void setSalario(String salario){
        this.salario = salario;
    }

    public String getSalario(){
        return salario;
    }
}
