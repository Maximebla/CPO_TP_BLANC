/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class convertisseur {
    public convertisseur() {
        nbConversions=0;
    }
    int nbConversions;
    private static double CelciusVersKelvin(double celcius){
        
        double Kelvin = celcius + 273.15;
        
        return Kelvin;
        
    }
    
    
    private static double KelvinVersCelcius(double kelvin){

        double celcius = kelvin - 273.15;

        return celcius;
        
    }
    
    
    private static double FarenheitVersCelcius(double farenheit){

        double celcius = (farenheit - 32) / 1.8;

        return celcius;

    }


    private static double CelciusVersFarenheit(double celcius){

        double farenheit = (celcius * 1.8) + 32;

        return farenheit;
        
    }
    
    
    private static double KelvinVersFarenheit(double kelvin){

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));

        return farenheit;
        
    }
    
    
    private static double FarenheitVersKelvin(double farenheit){

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));

        return kelvin;
        
    }
    
}

