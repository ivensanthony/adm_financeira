public class CalculosFinanceiros {
    public static double calcularValorFuturo(double vp, double i, int n) {
        return vp * Math.pow((1 + i), n);
    }

    public static double calcularValorPresente(double vf, double i, int n) {
        return vf / Math.pow((1 + i), n);
    }

    public static void main(String[] args) {
        // Cálculo para Joana
        double vfJoanaFulano = calcularValorFuturo(1200, 0.09, 10);
        System.out.printf("Valor Futuro (Joana Fulano): $%.2f%n", vfJoanaFulano);

        double vfJoanaCiclano = calcularValorFuturo(2000, 0.10, 8);
        System.out.printf("Valor Futuro (Joana Ciclano): $%.2f%n", vfJoanaCiclano);

        // Calcular qual o mais rentável para Joana
        double rentabilidadeJoanaFulano = vfJoanaFulano - 1200;
        double rentabilidadeJoanaCiclano = vfJoanaCiclano - 2000;

        if (rentabilidadeJoanaFulano > rentabilidadeJoanaCiclano) {
            System.out.println("Joana Fulano tem a maior rentabilidade.");
        } else {
            System.out.println("Joana Ciclano tem a maior rentabilidade.");
        }

        // Cálculo para João
        double vpJoaoFulano = calcularValorPresente(12000, 0.10, 10);
        System.out.printf("Valor Presente (João Fulano): $%.2f%n", vpJoaoFulano);

        double vpJoaoCiclano = calcularValorPresente(14000, 0.12, 12);
        System.out.printf("Valor Presente (João Ciclano): $%.2f%n", vpJoaoCiclano);

        // Calcular qual o mais rentável para João
        double vpReferenciaFulano = 2840.83; // Valor base para João Fulano
        double vpReferenciaCiclano = 4287.18; // Valor base para João Ciclano

        double rentabilidadeJoaoFulano = vpJoaoFulano - vpReferenciaFulano;
        double rentabilidadeJoaoCiclano = vpJoaoCiclano - vpReferenciaCiclano;

        if (rentabilidadeJoaoFulano > rentabilidadeJoaoCiclano) {
            System.out.println("João Fulano tem a maior rentabilidade.");
        } else {
            System.out.println("João Ciclano tem a maior rentabilidade.");
        }
    }

    @Override
    public String toString() {
        return "CalculosFinanceiros []";
    }
}
