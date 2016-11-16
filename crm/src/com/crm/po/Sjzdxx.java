package com.crm.po;



/**
 * Sjzdxx entity. @author MyEclipse Persistence Tools
 */

public class Sjzdxx  implements java.io.Serializable {


    // Fields    

     private Integer sjzzId;
     private Sjzdfl sjzdfl;
     private String sjzzxxmc;


    // Constructors

    /** default constructor */
    public Sjzdxx() {
    }

    
    /** full constructor */
    public Sjzdxx(Sjzdfl sjzdfl, String sjzzxxmc) {
        this.sjzdfl = sjzdfl;
        this.sjzzxxmc = sjzzxxmc;
    }

   
    // Property accessors

    public Integer getSjzzId() {
        return this.sjzzId;
    }
    
    public void setSjzzId(Integer sjzzId) {
        this.sjzzId = sjzzId;
    }

    public Sjzdfl getSjzdfl() {
        return this.sjzdfl;
    }
    
    public void setSjzdfl(Sjzdfl sjzdfl) {
        this.sjzdfl = sjzdfl;
    }

    public String getSjzzxxmc() {
        return this.sjzzxxmc;
    }
    
    public void setSjzzxxmc(String sjzzxxmc) {
        this.sjzzxxmc = sjzzxxmc;
    }
   








}