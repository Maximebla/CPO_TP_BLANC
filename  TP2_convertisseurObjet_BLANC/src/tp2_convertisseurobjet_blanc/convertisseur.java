package tp2_convertisseurobjet_blanc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class convertisseur {
    
    public convertisseur () {
        nbConversions = 0 ;
    }
    int nbConversions;
    // intisialisation variale competeur conversion
    
    public double CelciusVersKelvin(double celcius){
        
        double Kelvin = celcius + 273.15;
        nbConversions=nbConversions+1;
        return Kelvin;
        // modifie la température de Kelvin en Celcius
        
    }
    
    
    public double KelvinVersCelcius(double kelvin){

        double celcius = kelvin - 273.15;
        nbConversions=nbConversions+1;
        return celcius;
        // modifie la température de Kelvin en Celcius
        
    }
    
    
    public double FarenheitVersCelcius(double farenheit){

        double celcius = (farenheit - 32) / 1.8;
        nbConversions=nbConversions+1;
        return celcius;
        // modifie la température de Celcius en Kelvin

    }


    public double CelciusVersFarenheit(double celcius){

        double farenheit = (celcius * 1.8) + 32;
        nbConversions=nbConversions+1;
        return farenheit;
        // modifie la température de Celcius en farenheit 
        
    }
    
    
    public double KelvinVersFarenheit(double kelvin){

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));
        nbConversions=nbConversions+1;
        return farenheit;
        // modifie la température Kelvin en farenheit en passant par Celcius grace au méthode faite précédament
        
    }
    
    
    public  double FarenheitVersKelvin(double farenheit){

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        nbConversions=nbConversions+1;
        return kelvin;
        // modifie la température farenheit en Kelvin en passant par Celcius grace au méthode faite précédament
        
    }
    
    public String toString () {
        return "nb de conversions "+ nbConversions;
        // affiche le nombre de convertion faite pour arriver a la bonne mesure de température voulu
    }
    
}

