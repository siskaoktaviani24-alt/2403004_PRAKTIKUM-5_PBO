public class Persegi extends Bentuk {
    public double sisi;

    public Persegi(double sisi){
        super("Persegi");
        this.sisi = sisi;
    }

    public double hitungLuas(){
        return sisi * sisi;
    }
}
