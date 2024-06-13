import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {
        File dir= new File("PW");
        File file1=new File(dir,"pw.txt");
        FileReader fr=new FileReader(file1);
        int i=fr.read();
        while(i!=-1)
        {
            System.out.print(i+"--->");
            System.out.println((char)i);
            i=fr.read();
        }
    }
}
