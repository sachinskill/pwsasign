import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class buffereader {
    public static void main(String[] args)throws Exception {
        File dir =new File("PW");
        File file1=new File(dir, "pw.txt");
        FileReader fr=new FileReader(file1);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null)//cannot use -1 bcause its return string
        {
            System.out.println(line);
            line=br.readLine();
            br.newLine();
        }
        br.close();

    }
}
