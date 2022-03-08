package com.lab.domain;

import java.sql.Date;

public class Colaboradores {
	private int cod_colab;
	private String nom_colab;
	private Date dat_nasc;
	private Date dat_admissao;
	public int getCod_colab() {
		return cod_colab;
	}
	public void setCod_colab(int cod_colab) {
		this.cod_colab = cod_colab;
	}
	public String getNom_colab() {
		return nom_colab;
	}
	public void setNom_colab(String nom_colab) {
		this.nom_colab = nom_colab;
	}
	public Date getDat_nasc() {
		return dat_nasc;
	}
	public void setDat_nasc(Date dat_nasc) {
		this.dat_nasc = dat_nasc;
	}
	public Date getDat_admissao() {
		return dat_admissao;
	}
	public void setDat_admissao(Date dat_admissao) {
		this.dat_admissao = dat_admissao;
	}
	@Override
	public String toString() {
		return "Colaboradores [cod_colab=" + cod_colab + ", nom_colab=" + nom_colab + ", dat_nasc=" + dat_nasc
				+ ", dat_admissao=" + dat_admissao + "]";
	}
	
}
