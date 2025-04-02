/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.kge.eti.garagem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author sesideva
 */
@Entity
@Table(name = "veiculos") // Define o nome da tabela no banco de dados
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente
    private Long id;
    
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int km;

    @Column(name = "linkimagem") // Define o nome da coluna no banco de dados
    private String linkImagem;

    @Column(name = "descricaocompleta")
    private String descricaoCompleta;
    private String avarias;

    // Construtor vazio (obrigatório para o JPA)
    public Veiculo() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public int getKm() { return km; }
    public void setKm(int km) { this.km = km; }

    public String getLinkImagem() { return linkImagem; }
    public void setLinkImagem(String linkImagem) { this.linkImagem = linkImagem; }

    public String getDescricaoCompleta() { return descricaoCompleta; }
    public void setDescricaoCompleta(String descricao) { this.descricaoCompleta = descricao; }

    public String getAvarias() { return avarias; }
    public void setAvarias(String avarias) { this.avarias = avarias; }
}
    
    

