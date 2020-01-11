package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proftab")
public class Profile {
     @Id
     @Column(name="pid")
     private int profId;
     @Column(name="exp")
     private double expTot;
     @Column(name="plt")
     private String pltfm;
     @Column(name="addr")
     private String addr;
	public Profile() {
		super();
	}
	public int getProfId() {
		return profId;
	}
	public void setProfId(int profId) {
		this.profId = profId;
	}
	public double getExpTot() {
		return expTot;
	}
	public void setExpTot(double expTot) {
		this.expTot = expTot;
	}
	public String getPltfm() {
		return pltfm;
	}
	public void setPltfm(String pltfm) {
		this.pltfm = pltfm;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Profile [profId=" + profId + ", expTot=" + expTot + ", pltfm=" + pltfm + ", addr=" + addr + "]";
	}
     
}
