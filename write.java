
import java.io.*;
public class write
{
    public static void main(String[] args) throws IOException {
        File dir=new File("PW");
        System.out.println(dir.exists());
        dir.mkdir();
        File file1=new File(dir,"pw.txt");
        System.out.println(file1.exists());
        file1.createNewFile();
        FileWriter fw=new FileWriter(file1,true);
        fw.write("\n");
        fw.write("PWSkills");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write('A');
        fw.write("\n");
        char ch[]={'j','a','v','a',};
        fw.write(ch);
        fw.close();
        System.out.println("Open pw.txt to see result or output");



    }
}