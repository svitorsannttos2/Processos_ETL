package com.lab.domain;

import java.sql.Date;

public class Lancamentos {

	private int ano;
	private int mes;
	private String tpo_folha;
	private int cod_rubrica;
	private int cod_colab;
	private Date dat_lanc;
	private int val_lanc;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getTpo_folha() {
		return tpo_folha;
	}
	public void setTpo_folha(String tpo_folha) {
		this.tpo_folha = tpo_folha;
	}
	public int getCod_rubrica() {
		return cod_rubrica;
	}
	public void setCod_rubrica(int cod_rubrica) {
		this.cod_rubrica = cod_rubrica;
	}
	public int getCod_colab() {
		return cod_colab;
	}
	public void setCod_colab(int cod_colab) {
		this.cod_colab = cod_colab;
	}
	public Date getDat_lanc() {
		return dat_lanc;
	}
	public void setDat_lanc(Date dat_lanc) {
		this.dat_lanc = dat_lanc;
	}
	public int getVal_lanc() {
		return val_lanc;
	}
	public void setVal_lanc(int val_lanc) {
		this.val_lanc = val_lanc;
	}
	@Override
	public String toString() {
		return "lancamentosDomain [ano=" + ano + ", mes=" + mes + ", tpo_folha=" + tpo_folha + ", cod_rubrica="
				+ cod_rubrica + ", cod_colab=" + cod_colab + ", dat_lanc=" + dat_lanc + ", val_lanc=" + val_lanc + "]";
	}
	
	
}
