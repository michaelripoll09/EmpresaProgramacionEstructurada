import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    // cosntructor
    public Empresa() {
        empleados = new ArrayList<Empleado>();
    }
    // metodo que agrega empleados a la empresa
    public void contratarEmpleado(Empleado e){
        empleados.add(e);
    }
    // metodo que obtiene el total de empleados
    public int getTotalEmpleados() {
        return empleados.size();
    }
    // metodo que muestra el nombre y salario de todos los empleados
    public void nombreEmpleados() {
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
        }
    }
    // metodo que retorna el total de dinero pagado a todos los empleados
    public double getTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total = total + e.getSalario
        }
        return total;
    }
    // metodo que muestra el nombre, cargo y salario del empleado que mas dinero gana
    public void empleadoMayorSalario() {
        Empleado empMayorSalario=empleados.get(0);
        double maxSalario=empleados.get(0).getSalario();
        for (Empleado e:empleados) {
            if (e.getSalario()>maxSalario) {
                maxSalario=e.getSalario();
                empMayorSalario=e;
            }
        }
        System.out.println("El empleado que mas dinero gana es: ");
        System.out.println("Nombre: "+ empMayorSalario.getNombre());
        System.out.println("Cargo: "+ empMayorSalario.getCargo());
        System.out.println("Salario: "+ empMayorSalario.getSalario());
    }
    // metodo que muestra el nombre, cargo y salario del empleado que menos dinero gana
    public void empleadoMenorSalario() {
        Empleado empMenorSalario=empleados.get(0);
        double menSalario=empleados.get(0).getSalario();
        for (Empleado e:empleados) {
            if (e.getSalario()<menSalario) {
                menSalario=e.getSalario();
                empMenorSalario=e;
            }
        }
        System.out.println("El empleado que menos dinero gana es: ");
        System.out.println("Nombre: "+ empMenorSalario.getNombre());
        System.out.println("Cargo: "+ empMenorSalario.getCargo());
        System.out.println("Salario: "+ empMenorSalario.getSalario());
    }
}