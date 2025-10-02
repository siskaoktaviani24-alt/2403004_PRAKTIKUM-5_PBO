class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
    }

    public void suara(){
        System.out.println(nama + " si kucing: Meow...");
    }

    public void bermain(){
        System.out.println(nama + " sedang bermain bola benang");
    }
}
