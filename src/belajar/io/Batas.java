package belajar.io;

import java.math.BigDecimal;

public class Batas {
    private BigDecimal ipkMin;
    private BigDecimal ipkMax;
    private Integer sks;
    
    public BigDecimal getIpkMin(){
        return ipkMin;
    }
    
    public void setIpkMin(BigDecimal ipk){
        this.ipkMin = ipk;
    }
    
    public BigDecimal getIpkMax(){
        return ipkMax;
    }
    
    public void setIpkMax(BigDecimal ipk){
        this.ipkMax = ipk;
    }
    
    public Integer getSks(){
        return sks;
    }
    
    public void setSks(Integer sks){
        this.sks = sks;
    }
}
