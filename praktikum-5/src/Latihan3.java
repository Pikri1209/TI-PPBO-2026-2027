public class Latihan3 {
    static double konversiSuhu(double celcius){
        return (celcius * 9 /5 ) + 32;
    }
    static double konversiSuhu(double celcius, String skalaTujuan){

        if(skalaTujuan.equals("kelvin")){
            return celcius + 273.15;
        }
        if(skalaTujuan.equals("fahrenhet")){
            return (celcius * 9 / 5) + 32;
        }
        return celcius;
    }
    public static  void main(String[]args){

        double suhu = 30;

        System.out.println("Suhu: " + suhu);

        System.out.println("kelvin = " + konversiSuhu(suhu, "kelvin"));

        System.out.println("fahrenhit = " + konversiSuhu(suhu, "fahrenhit"));

    }
}
