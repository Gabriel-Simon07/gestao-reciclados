package gestao_reciclados;

import java.time.LocalDate;

public class ContagemLatas {
    private String descricao;
    private LocalDate data;
    private double horasTrabalhadas;
    private int qtdLatas;
    private Lata lata;

    public ContagemLatas(String descricao, LocalDate data, double horasTrabalhadas, int qtdLatas, Lata lata) {
        this.descricao = descricao;
        this.data = data;
        this.horasTrabalhadas = horasTrabalhadas;
        this.qtdLatas = qtdLatas;
        this.lata = lata;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getQtdLatas() {
        return qtdLatas;
    }
    public void setQtdLatas(int qtdLatas) {
        this.qtdLatas = qtdLatas;
    }
    public Lata getLata() {
        return lata;
    }
    public void setLata(Lata lata) {
        this.lata = lata;
    }
}
