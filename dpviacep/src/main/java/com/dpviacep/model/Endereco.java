package com.dpviacep.model;

import com.dpviacep.controller.dto.EnderecoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {

    @Id 
    public String cep;
    public String logradouro;
    public String complemento;
    public String unidade;
    public String bairro;
    public String localidade;
    public String uf;
    public String estado;
    public String regiao;
    public String ibge;
    public String gia;
    public String ddd;
    public String siafi;


    
    public Endereco() {
    }
    public Endereco(String cep, String logradouro, String complemento, String unidade, String bairro, String localidade,
            String uf, String estado, String regiao, String ibge, String gia, String ddd, String siafi) {
        
    }
    public static Endereco toEntity(EnderecoDTO dto) {
        Endereco end = new Endereco();
        end.setCep(dto.cep());
        end.setLogradouro(dto.logradouro());
        end.setComplemento(dto.complemento());
        end.setUnidade(dto.unidade());
        end.setBairro(dto.bairro());
        end.setLocalidade(dto.localidade());
        end.setUf(dto.uf());
        end.setEstado(dto.estado());
        end.setRegiao(dto.regiao());
        end.setIbge(dto.ibge());
        end.setGia(dto.gia());
        end.setDdd(dto.ddd());
        end.setSiafi(dto.siafi());
        return end;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    public String getIbge() {
        return ibge;
    }
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }
    public String getGia() {
        return gia;
    }
    public void setGia(String gia) {
        this.gia = gia;
    }
    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public String getSiafi() {
        return siafi;
    }
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    
}
