package encryptions;

public interface IEncryption<T> {

    T encrypt(T objectToEncrypt);

    T decrypt(T objectToDecrypt);
}
