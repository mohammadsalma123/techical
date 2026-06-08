import java.io.*;

    class FileOperations{
        public static void main(String[] args) {
            File file=new File("demo.txt");
            try{ 
            if(file.createNewFile()){
                System.out.println("file"+file.getName()+" created successfully");
            }
            
            else{
                System.out.println("file already exist"+file.getName());
            }
         }
            catch(IOException e){
                System.out.println("issue while creating file");
            }
        
            /*finally{
                file.close();
            }*/
        }
    }
    

