
package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;
    
    public void establecerNotas(ArrayList<Nota> ns){
        notas = ns;
    }
    
    public void establecerMejorNota(){
        double n = 0;
        for(int i = 0; i < obtenerNotas().size(); i++){
            if(obtenerNotas().get(i).obtenerValor() > n){
                n = obtenerNotas().get(i).obtenerValor();
            }
        }
        mejorNota = n;
    }
    
    public void establecerPeorNota(){
        double n = 10;
        for(int i = 0; i < obtenerNotas().size(); i++){
            if(obtenerNotas().get(i).obtenerValor() < n){
                n = obtenerNotas().get(i).obtenerValor();
            }
        }
        peorNota = n;
    }
    
    public void establecerPromedio(){
        double suma = 0;
        for(int i = 0; i < obtenerNotas().size(); i++){
            suma = suma + obtenerNotas().get(i).obtenerValor();
        }
        promedio = suma / obtenerNotas().size();
    }
    
    public ArrayList<Nota> obtenerNotas(){
        return notas;
    }
    
    public double obtenerMejorNota(){
        return mejorNota;
    }
    
    public double obtenerPeorNota(){
        return peorNota;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sNotas: \n", super.toString());
        for(int i = 0; i < obtenerNotas().size(); i++){
            cadena = String.format("%s%.1f",cadena, obtenerNotas().get(i).
                    obtenerValor());
        }
        cadena = String.format("%sProemdio: %.1fMejor Nota: %.1f"
                + "Peor Nota: %.1f", cadena,
                obtenerPromedio(), obtenerMejorNota(), obtenerPeorNota());
        return cadena;
    }
}
