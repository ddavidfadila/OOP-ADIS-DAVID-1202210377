
package tpmodul2_david;

public class Perangkat {

    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat(String drive, int ram, float processor){

        this.processor = processor;
        this.drive = drive;
        this.ram = ram;
    
    }
    public void informasi(){

        System.out.println("Perangkat tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz");
    
    }
}
