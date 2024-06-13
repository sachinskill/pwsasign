import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class read2 {
    public static void main(String[] args) throws Exception {
        File dir=new File("PW");
        File file1=new File(dir,"pw.txt");
        FileReader fr=new FileReader(file1);
        char ch[]=new char[(int)file1.length()];
        fr.read(ch);
        for(char data:ch)
        {
            System.out.print(data);

        }

        
    }
}
