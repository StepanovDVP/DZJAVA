import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class homework2 {
    public static void main(String[] args){
        System.out.println(buildString(5,'a','b'));
        Path path = Path.of("homework2.txt");
        try {
            if (!Files.exists(path)){
                creatfile(path);
                writefile(path);
                readfile(path);
            } else{
                writefile(path);
                readfile(path);
            }
        }
        catch (IOException e){
        }
    }

    // задача 1
    static String buildString (int n, char c1, char c2){
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arr[i] = String.valueOf(c1);
            else arr[i] = String.valueOf(c2);
        }
        return String.join("", arr);
    }
    // задача 2
    private static Path creatfile(Path path) throws IOException{
        return Files.createFile(path);
    }
    static  void writefile(Path path) throws IOException{
        String text = "TEXT";
        Files.writeString(path, text.repeat(100));
    }
    static void readfile(Path path) throws IOException{
        String content = Files.readString(path);
        System.out.println(content);
    }
}
