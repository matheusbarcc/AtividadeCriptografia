public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Criptografia Assimetrica (RSA):");
        AssymetricRSA.execute("Wallace", "Bom dia Arthur, tudo certo?");
        AssymetricRSA.execute("Arthur", "Fala Wallace!");

        System.out.println("");

        System.out.println("Criptografia Simetrica (AES):");
        SymmetricAES.execute("Wallace", "Bom dia Arthur, tudo certo?");
        SymmetricAES.execute("Arthur", "Fala Wallace!");
    }
}
