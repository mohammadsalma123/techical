import java.io.*;
public class DataWriteInFile {
    public static void main(String[] args) {
        try{ 
        File file=new File("demo.txt");
        FileWriter writer=new FileWriter(file,true);
        writer.write("\n new data added");
        writer.write("\n 23C31A05C1");
       // writer.write("hello good afternoon\n");
        //writer.write(" good afternoon");
        writer.close();
        System.out.println("data written succcessfully");
        }
        catch(IOException e){
            System.out.println("issue while writing data");
        }
    }
}
