/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author galle
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.setNombre("LUIS");
        perso1.setApe("PEREZ");
        try{
        perso1.setEdad(-10);
        }catch(DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());
        }
    }
    
}

class Persona{
    private String nombre;
    private String ape;
    private int edad;
    
    public Persona() {
        this.nombre = "";
        this.ape = "";
        this.edad = 0;
    }
    
    public Persona(String nombre, String ape, int edad) throws DatoEntradaCheckedEx {
        this.nombre = nombre;
        this.ape = ape;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedEx {
        if (edad<0)
            /*throw new DatoEntradaException();*/
            throw new DatoEntradaCheckedEx();
        this.edad = edad;
    }
}

class DatoEntradaException extends RuntimeException {

    public DatoEntradaException() {
        super ("Dato de entrada incorrecto. El valor debe ser positivo");
    }
    
}

class DatoEntradaCheckedEx extends Exception {

    public DatoEntradaCheckedEx() {
        super ("Dato de entrada incorrecto. El valor debe ser positivo");
    }
    
    
}