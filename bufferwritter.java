import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class bufferwritter{
    public static void main(String[] args) throws Exception {
        File dir=new File("PW");
        File file1=new File(dir,"pw.txt");
        FileWriter fr=new FileWriter(file1);
        BufferedWriter bw=new BufferedWriter(fr);
        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[]={'p','w','s','j'};
        bw.newLine();
        bw.close();
        

    }
}