package Dio.Spread;

public class TemDireitoAuxilio {
    public static void main(String[] args) {

//        double mediaSalario = 1500.00d;
//        double salarioMensal = 2000.00d;

//        int quantidadeDependentes = 5;
//        int mediaDependentes = 2;

//        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
//            System.out.println("Funcionário tem direito a receber o auxilio.");
//        } else if ((salarioMensal > mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
//            System.out.println("Funcionário não tem direito.");

        // Neste exemplo acima, os códigos ficam muito longos, mas temos o resultado esperado.
        // porém deve ser evitado.
        //      }
        //  }

        double mediaSalario = 1500.00d;
        double salarioMensal = 1100.00d;

        int quantidadeDependentes = 0;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário recebe Auxilio");
        } else {
            System.out.println("Funcionário não poderá receber o auxilio.");
        }
    }
}