public class Ana {
    public static void main(String[] args) {

        double peso = 115;
        double altura = 1.70;
        double imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc<18.5){
            System.out.println("Você está abaixo do peso");
        }
        else if (imc==18.5 || imc<25) {
            System.out.println("Você está no peso normal");
        }
        else if (imc==25 ||imc<30) {
            System.out.println("Você está sobrepeso");
        }
        else if (imc==30 || imc<35) {
            System.out.println("Você está na obesidade grau 1");
        }
        else if (imc==35 || imc<40) {
            System.out.println("Você está na obesidade grau 2");
        }
        else {
            System.out.println("Você está na obesidade grau 3");
        }
    }
}
