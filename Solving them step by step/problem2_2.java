import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class problem2_2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("강한친구 대한육군");
        bw.newLine();
        bw.write("강한친구 대한육군");

        bw.flush();
        bw.close();
    }
}
