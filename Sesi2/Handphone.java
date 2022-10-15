

public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHP(){
        return jenis_hp;
    }
    
     public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setDataHP("Iphone", 2022);
        System.out.println("Jenis HP : " + hp.jenis_hp);
        System.out.println("Tahun Pembuatan : "+ hp.tahun_pembuatan);
    }
    
}
