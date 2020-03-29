
package poou1e10;


public class POOU1E10 {

  
    public static void main(String[] args) {
        
       Empleado emp1 = new Empleado("Juan Lopez", "1", 20, false, 10000);
       Empleado emp2 = new Empleado("Alberto Castaño", "2", 32, true, 20000);
       Empleado emp3 = new Empleado("Ernesto Paparulo", "3", 41, true, 30000);
       
       //emp1.obtener();
       //emp2.obtener();
       //emp3.obtener();
       
       emp1.clasificacion(emp1.Nombre, emp1.Edad);
       emp2.clasificacion(emp2.Nombre, emp2.Edad);
       emp3.clasificacion(emp3.Nombre, emp3.Edad);
       
       emp1.imprimeEmpleado(emp1.Nombre, emp1.Cedula, emp1.Edad, emp1.Casado, emp1.Salario);
       emp2.imprimeEmpleado(emp2.Nombre, emp2.Cedula, emp2.Edad, emp2.Casado, emp2.Salario);
       emp3.imprimeEmpleado(emp3.Nombre, emp3.Cedula, emp3.Edad, emp3.Casado, emp3.Salario);
    
       emp1.aumentaSueldo(emp1.Nombre, 1.3, 0);
    }
    
    
}
