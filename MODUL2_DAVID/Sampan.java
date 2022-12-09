public class Sampan extends TranportasiAir {
    protected int Layar;

    public Sampan (int jumlahKursi, int biaya, int layar){
        super(jumlahKursi,biaya,layar);
        this.layar = layar;
    }
    

    @Override
    public void JumlahKursi(){
        System.out.println();
        System.out.println();
    }

    @Override
    public void Biaya(){
        System.out.println();
        System.out.println();
    }
    @Override 
    public void layar(){
        System.out.println();
        System.out.println();
    }

}
