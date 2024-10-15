public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "(10, 20)", 5);
        formaManager.addForma("Verde", "(30, 40)", 10);
        formaManager.addForma("Azul", "(50, 60)", 15);
        formaManager.addForma("Vermelho", "(70, 80)", 20);
        formaManager.addForma("Verde", "(90, 100)", 25);

        formaManager.apresentar();
    }
}
