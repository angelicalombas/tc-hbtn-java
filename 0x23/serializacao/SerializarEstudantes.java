import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @SuppressWarnings("unchecked")
    public void serializar(List<Estudante> estudantes) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);

        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel serializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel serializar");
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> estudantes = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            estudantes = (List<Estudante>)ois.readObject();
            return estudantes;
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel desserializar");
                }
            }
        }
        return null;
    }


}
