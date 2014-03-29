public class Main {
    public static void main(String[] args) throws Exception {
        new FileEncryptorAndDecryptor("DES/ECB/PKCS5Padding","sample.txt").encrypt();
        new FileEncryptorAndDecryptor("DES/ECB/PKCS5Padding","sample.txt.enc").decrypt();
    }
}
