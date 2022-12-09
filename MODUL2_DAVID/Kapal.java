public class Kapal extends TranportasiAir {
    protected String mesin;
       public Kapal (int jumlahKursi, int biaya, String mesin){
            super(jumlahKursi,biaya,mesin);
            this.mesin = mesin;
       }
       
    @Override
    public void Informasi(){
        System.out.println("Tranportasi air jenis kapal dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengann biaya sebesar Rp.");
        
    }

    @Override
    public void belayar(){
        System.out.println();
        
    }

    @Override
    public void belayar(){
        System.out.println();
        
    }
    
    public void berlabuh(){
        System.out.println("Transportasi air  jenis kapal berlabuh di pantai");
        
    }
}
