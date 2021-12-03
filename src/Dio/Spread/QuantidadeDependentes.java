package Dio.Spread;

public class QuantidadeDependentes {
    public static void main(String[] args) {

        double salarioMensal = 1200.00d;
        double mediaSalario = 1500.00d;

        int quantidadeDependentes = 5;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
    // Neste exemplo, temos as variáveis que exibem (false = Não tem direito, poucos dependentes)
    // e true = tem direito, muitos dependente)
    }

}
