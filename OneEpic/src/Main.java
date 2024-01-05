import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        StringBuilder text = new StringBuilder();
        try(FileReader fileReader = new FileReader(file)){
            char charC;
            while (reader.ready()){
                charC = (char)reader.read();
                text.append(charC);
            }
        }
        String replaceString = text.toString().replaceAll("\\{P}", " ").replaceAll("\\s", " ");

        for (String x: replaceString.split(" ")) {
            if(x.equals("world")){
                sum++;
            }
        }
        System.out.println(sum);
    }
}