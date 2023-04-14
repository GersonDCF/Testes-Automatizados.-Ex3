package func;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    public double calcularPagamento() {
        double pagamento = valorHora * horasTrabalhadas;
        if (pagamento < 1320.00) {
            pagamento = 1320.00;
        }
        return pagamento;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 40) {
            this.horasTrabalhadas = 40;
        } else if (horasTrabalhadas < 0) {
            this.horasTrabalhadas = 0;
        } else {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        double salarioMinimo = 1320.00;
        double valorMinimo = salarioMinimo * 0.04;
        double valorMaximo = salarioMinimo * 0.10;
        if (valorHora < valorMinimo) {
            this.valorHora = valorMinimo;
        } else if (valorHora > valorMaximo) {
            this.valorHora = valorMaximo;
        } else {
            this.valorHora = valorHora;
        }
    }
}

