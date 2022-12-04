
package tpmodul2_david;

public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;

    }

    @Override
    public void informasi(){
        System.out.print("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram +" GB dan processor secepat " + processor + " Ghz" );
        if (fingerprint){
            System.out.print(". Selain itu handphone ini juga memiliki Fingerprint");
        } else {
            System.out.print(". Selain itu handphone ini TIDAK memiliki Fingerprint");
        }
        System.out.println();
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
    }
}
