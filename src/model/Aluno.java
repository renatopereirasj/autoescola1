/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Renato
 */

    @Entity
    @Table(name="Aluno",schema="autoescola")
    
    
public class Aluno implements Serializable {
    

    public Aluno() {
    }

    public static Aluno Cria(String Nome, String Telefone, String Email, String Rua, String Numero, String Rg, String Cpf, Date DatadeNascimento, String Cep,int AulaDirecao ){
    
    
    Aluno aluno = new Aluno(Nome, Telefone, Email, Rua, Numero, Rg, Cpf, DatadeNascimento, Cep, AulaDirecao);
    
    return (aluno);
    
      
    }

  
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID_Aluno")
    private int id;
    
    
    
    //Relacionamento Banco
    
    
    
    
    
    
    
    
    @Column
    private String Nome;
    @Column
    private String Telefone;
    @Column
    private String Email;
    @Column
    private String Rua;
    @Column
    private String Numero;
    @Column
    private String Rg;
    @Column
    private String Cpf;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DatadeNascimento;
    @Column
    private String Cep;
    @Column
    private int AulaDirecao; // obs -> saber se é data de admissão 
   
    
    
    public Aluno(String Nome, String Telefone, String Email, String Rua, String Numero, String Rg, String Cpf, Date DatadeNascimento, String Cep,int AulaDirecao){
    
    this.Nome = Nome;
    this.Telefone = Telefone;
    this.Email = Email;
    this.Rua = Rua;
    this.Numero = Numero;
    this.Rg = Rg;
    this.Cpf = Cpf;
    this.DatadeNascimento = DatadeNascimento;
    this.Cep = Cep;
    this.AulaDirecao = AulaDirecao;  
    
    }
    
    public Aluno(int id){
    this.id = id;
    }
    
    
    @Override
  public String toString(){
  return (getNome());
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public Date getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(Date DatadeNascimento) {
        this.DatadeNascimento = DatadeNascimento;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public int getAulaDirecao() {
        return AulaDirecao;
    }

    public void setAulaDirecao(int AulaDirecao) {
        this.AulaDirecao = AulaDirecao;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
