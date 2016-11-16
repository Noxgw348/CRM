package com.crm.po;

import java.util.HashSet;
import java.util.Set;


/**
 * Sjzdfl entity. @author MyEclipse Persistence Tools
 */

public class Sjzdfl  implements java.io.Serializable {


    // Fields    

     private Integer sjzdflid;
     private String sjzdflmc;
     private String qiyong;
     private Set sjzdxxes = new HashSet(0);


    // Constructors

    /** default constructor */
    public Sjzdfl() {
    }

    
    /** full constructor */
    public Sjzdfl(String sjzdflmc, Set sjzdxxes) {
        this.sjzdflmc = sjzdflmc;
        this.sjzdxxes = sjzdxxes;
    }

   
    // Property accessors
    
    public Integer getSjzdflid() {
        return this.sjzdflid;
    }
    
    public String getQiyong() {
		return qiyong;
	}


	public void setQiyong(String qiyong) {
		this.qiyong = qiyong;
	}


	public void setSjzdflid(Integer sjzdflid) {
        this.sjzdflid = sjzdflid;
    }

    public String getSjzdflmc() {
        return this.sjzdflmc;
    }
    
    public void setSjzdflmc(String sjzdflmc) {
        this.sjzdflmc = sjzdflmc;
    }

    public Set getSjzdxxes() {
        return this.sjzdxxes;
    }
    
    public void setSjzdxxes(Set sjzdxxes) {
        this.sjzdxxes = sjzdxxes;
    }
   








}