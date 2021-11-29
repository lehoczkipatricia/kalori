// Név: Lehoczki Patrícia
// Dátum: 2021.11.29
// Osztály: Szoft II/N


public class Calory {
    
    public double calcWoman(double weight, double height, int age){
        
     if (weight < 0 ) {
            throw new IllegalArgumentException("Csak pozitív érték lehet!"); 
     } if (height < 0) {
            throw new IllegalArgumentException("Csak pozitív érték lehet!");
     } if (age < 0){
            throw new IllegalArgumentException("Csak pozitív érték lehet!");
     } else {
          return 9.247*weight+3.098*height-4.330*age+447.593;
          } 
    }

    public double calcMan(double weight, double height, int age){
     if (weight < 0 ) {
          throw new IllegalArgumentException("Csak pozitív érték lehet!"); 
   } if (height < 0) {
          throw new IllegalArgumentException("Csak pozitív érték lehet!");
   } if (age < 0){
          throw new IllegalArgumentException("Csak pozitív érték lehet!");
   } else {
     return 13.397*weight+4.799*height-5.667*age+88.362;
        } 
  }
        
}
