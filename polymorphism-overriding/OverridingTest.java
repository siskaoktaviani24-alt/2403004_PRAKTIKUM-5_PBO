public class OverridingTest {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("Kitty");
        Hewan hewan2 = new Anjing("Dogy");

        hewan1.suara();
        hewan2.suara();

        ((Kucing) hewan1).bermain();
        ((Anjing) hewan2).jagaRumah();
    }
}