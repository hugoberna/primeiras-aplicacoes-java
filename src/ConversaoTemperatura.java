public class ConversaoTemperatura {
    public static void main (String[] args){

        double temperaturaCelsius = 85.9;
        double temperaturaFareheit;

        temperaturaFareheit = (temperaturaCelsius * 1.8) + 32;
        String conversao = String.format("%.2f graus Celsius é igual a %.2f Farenheit.", temperaturaCelsius, temperaturaFareheit);
        System.out.println(conversao);

        int farenheitInteiro = (int) temperaturaFareheit;
        System.out.println("E o valor inteiro é: "+farenheitInteiro);
    }
}
