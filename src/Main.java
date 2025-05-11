public class Main {
    public static void main(String[] args) {
        Balance weight = new Balance();
        Bell bell = new Bell();
        Payer payer = new Payer("Kris", "Markiz", "Moscow","4656" );
        Payer payer_2 = new Payer();
        Dog dog = new Dog("Space", 1);

        System.out.println(weight.getSituation());
        bell.sound();
        System.out.println(payer);
        System.out.println(payer_2);
        }
}