import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
        String nombre, cargo;
        double salario, total=0,mayorSalario,menorSalario;
        int posicion=0;
        // Definición de las estructuras de almacenamiento
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();
        ArrayList<String> cargos = new ArrayList<String>();
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
        for(int emp=1;emp<=cantidad;emp++){
            // Lestura de los datos de cada empleado
            nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado "+emp);
            salario=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado "+emp));
            cargo=JOptionPane.showInputDialog("Ingrese el cargo del empleado "+emp);
            // Almacenamiento de los datos
            nombres.add(nombre);
            salarios.add(salario);
            cargos.add(cargo);
        }
        // número de empledos
        System.out.println("El numero total de empleados es: "+cantidad);
        // nombre y salario de cada empleado
        System.out.println("Los nombres y salarios de los empleados son:");
        for(int emp=0;emp<cantidad;emp++){
            System.out.println("Nombre: "+nombres.get(emp)+" Salario: "+salarios.get(emp));
        }
        // total de dinero pagado por los salarios de todos los empleados
        for(int emp=0;emp<cantidad;emp++) {
            total=total+salarios.get(emp);
        }
        System.out.println("Total de dinero pagado a todos los empleados: "+total);
        // nombre, cargo y salario del empleado que mas dinero gana
        System.out.println("El empleado que mas dinero gana es: ");
        mayorSalario=salarios.get(0);
        for(int emp=1;emp<cantidad;emp++) {
            if(salarios.get(emp)>mayorSalario) {
                mayorSalario=salarios.get(emp);
                posicion=emp;
            }
        }
        System.out.println("Nombre: "+nombres.get(posicion)+" Cargo: "+cargos.get(posicion)+" Salario: "+salarios.get(posicion));
        // nombre, cargo y salario del empleado que menos dinero gana
        System.out.println("El empleado que menos dinero gana es: ");
        menorSalario=salarios.get(0);
        for(int emp=1;emp<cantidad;emp++) {
            if(salarios.get(emp)<menorSalario) {
                menorSalario=salarios.get(emp);
                posicion=emp;
            }
        }
        System.out.println("Nombre: "+nombres.get(posicion)+" Cargo: "+cargos.get(posicion)+" Salario: "+salarios.get(posicion));
    }
} 