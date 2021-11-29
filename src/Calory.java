public class Calory {
    public double calcWoman(double weight, double height, int age){
        return 9.247*weight+3.098*height-4.330*age+447.593;
    }

    public double calcMan(double weight, double height, int age){
        return 13.397*weight+4.799*height-5.667*age+88.362;
    }
}
