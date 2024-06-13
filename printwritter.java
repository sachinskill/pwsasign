import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class printwritter {
    public static void main(String[] args) throws Exception  {
        File dir =new File("PW");
        File file1=new File(dir, "pw2.txt");
        file1.createNewFile();
        FileWriter fr=new FileWriter(file1);
        PrintWriter pr=new PrintWriter(fr);
        pr.write(97);
        pr.write("\n");
        pr.println("65");
        pr.println("JAVA");
        pr.println('a');
        pr.println(true);
        pr.println(92.2);
        pr.close();
    }
}
