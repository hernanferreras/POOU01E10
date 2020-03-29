
package poou1e10;

public class Empleado {
    
    //Atributos 
    
    String Nombre;
    String Cedula;
    int Edad;
    boolean Casado;
    double Salario;

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario){
        this.Nombre=nombre;
        this.Cedula=cedula;
        this.Edad=edad;
        this.Casado=casado;
        this.Salario=salario;
    }
//metodos de la clase Empleado
    
    public void clasificacion(String nombre, int edad){
        String puesto;
        if(edad<21&&edad>18){
            puesto = "Junior";
        }else if(edad<45&&edad>=35){
            puesto = "Senior";
        }else 
            puesto = "Intermedio";
        System.out.println("El empleado: " + nombre + " tiene el puesto: "+ puesto);
    }
    public void imprimeEmpleado(String nombre, String cedula, int edad, boolean casado, double salario){
        System.out.print("\nNombre: "+nombre+"\nCedula: "+cedula+"\nEdad: "+edad+"\nCasado: "+casado+"\nSalario: "+salario+"\n");      
    }
}
