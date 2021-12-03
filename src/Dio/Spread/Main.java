package Dio.Spread;

public class Main {

    public static void main(String[] args) {

        double mediaSalario= 1700.00d;
        double salarioMensal= 1500.00d;

        int quantidadeDependentes = 5;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        //System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

        }

    }
