/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 20181bsi0172
 */
public class Servico 
{
    private int idServico;
    private String status;
    private Endereco EnderecoDestino;
    private Endereco idEnderecoOrigem;
    private float valorContrato;
    private String dataInicio;
    private String dataFim;
    private int idCliente;
    private int idFuncionario;
    private int idVeiculo;
    //atributos relacionados a carga.
    private String tipo;
    private double peso;
    private String volume;
    private int quantidade;
    private String distancia;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }
    

    public int getIdServico() {
        return this.idServico;
    }


    public String getStatus() {
        return this.status;
    }


    public Endereco idEnderecoDestino() {
        return this.EnderecoDestino;
    }


    public Endereco getEnderecoOrigem() {
        return this.idEnderecoOrigem;
    }

    public float getValorContrato() {
        return this.valorContrato;
    }

    public String getDataInicio() {
        return this.dataInicio;
    }

    public String getDataFim() {
        return this.dataFim;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public int getIdFuncionario() {
        return this.idFuncionario;
    }

    public int getIdVeiculo() {
        return this.idVeiculo;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEnderecoDestino(Endereco idDestino) {
        this.EnderecoDestino = idDestino;
    }

    public void setEnderecoOrigem(Endereco idOrigem) {
        this.idEnderecoOrigem = idOrigem;
    }

    public void setValorContrato(float valorContrato) {
        this.valorContrato = valorContrato;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
}
