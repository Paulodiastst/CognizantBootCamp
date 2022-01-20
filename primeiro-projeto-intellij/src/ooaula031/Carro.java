package ooaula031;

/**
 * * Classe de exemplo para o exercício da Aula 3 de Orientação a Objetos.
 */

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // Sobre carga do construtor aqui

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro() {

    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //método do total para encher o tanque (Entra aqui a lógica)

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}
