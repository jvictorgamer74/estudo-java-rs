package je26_java_nio;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFileNIO {


    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/arquivos/aula-java-nio.txt");

// Verifica se o diretório existe, caso contrário, cria
        if (!Files.exists(path.getParent())) {
            try {
                Files.createDirectories(path.getParent());
                System.out.println("Diretório criado com sucesso.");
            } catch (IOException e) {
                System.err.println("Erro ao criar o diretório: " + e.getMessage());
            }
        }

        try {

            // Primeiro utilize o Path para localizar o arquivo
            // linux:"/home/arquivos/aula-java-nio.txt"
            Path caminho = Paths.get("C:/arquivos/aula-java-nio.txt");

            // Lendo o path e convertendo todos os caracteres (bytes) de uma só vez
            byte[] bytesArquivo =  Files.readAllBytes(caminho);

            // Como são bytes podemos criar uma String a partir de agora
            String conteudo = new String(bytesArquivo);
            System.out.println(conteudo);

            // Agora veja como também é simples escrever arquivos textos.
            Path pathTo = Paths.get("C:/arquivos/aula-java-nio-copy.txt");
            Files.write(pathTo, bytesArquivo);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }

}
