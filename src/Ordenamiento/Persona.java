package Ordenamiento;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override
    public int compareTo(Persona persona) {
        if (this.edad==persona.edad){
            return this.nombre.compareTo(persona.nombre);
        }
        return this.edad-persona.edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
