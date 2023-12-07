package fatura;

import java.time.LocalDate;

public class Fatura {
    private LocalDate data;
    private int ultimaLeitura;
    private int penultimaLeitura;
    private float valor;
    private boolean quitado;

    public Fatura(int ultimaLeitura, int penultimaLeitura) {
        this.data = LocalDate.now();
        this.ultimaLeitura = ultimaLeitura;
        this.penultimaLeitura = penultimaLeitura;
        this.valor = calculaValor(); 
        this.quitado = false;
    }

    public float calculaValor() {
        float custoPorKWh = 10.0f; 
        int consumo = ultimaLeitura - penultimaLeitura;
        return consumo * custoPorKWh;
    }

    // Getters e setters

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getUltimaLeitura() {
        return ultimaLeitura;
    }

    public void setUltimaLeitura(int ultimaLeitura) {
        this.ultimaLeitura = ultimaLeitura;
    }

    public int getPenultimaLeitura() {
        return penultimaLeitura;
    }

    public void setPenultimaLeitura(int penultimaLeitura) {
        this.penultimaLeitura = penultimaLeitura;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isQuitado() {
        return quitado;
    }

    public void setQuitado(boolean quitado) {
        this.quitado = quitado;
    }
}

