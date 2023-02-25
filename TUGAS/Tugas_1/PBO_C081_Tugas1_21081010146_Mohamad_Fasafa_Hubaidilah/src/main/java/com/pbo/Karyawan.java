package com.pbo;

public class Karyawan {
    
    // Private Attributes Encapsulasi
    private String nama, alamat, departemen, pengalaman, skill;
    private Long gaji;

    // Setter
    public void setNama(String name){ this.nama = name; }
    public void setAlamat(String alamat){ this.alamat = alamat; }
    public void setGaji(long gaji){ this.gaji = gaji; }
    public void setDepartemen(String departemen){ this.departemen = departemen; }
    public void setPengalaman(String pengalaman){ this.pengalaman = pengalaman; }
    public void setSkill(String skill){ this.skill = skill; }

    // Getter
    public String getNama() { return this.nama; }
    public String getAlamat(){ return this.alamat; }
    public Long getGaji(){ return this.gaji; }
    public String getDepartemen(){ return this.departemen; }
    public String getPengalaman(){ return this.pengalaman; }
    public String getSkill(){ return this.skill; }

    
}
