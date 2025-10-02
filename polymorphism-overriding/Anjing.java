class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void suara(){
        System.out.println(nama + " si anjing: Guk guk...");
    }

    public void jagaRumah(){
        System.out.println(nama + " sedang menjaga rumah");
    }
}
