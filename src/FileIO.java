import java.io.*;

public class FileIO {
    private File file;
    private FileWriter fw;
    private FileReader fr;
    private BufferedReader br;




    public FileIO() {

        file = new File("transaction.txt");
        try {
            file.createNewFile();
        }
        catch (IOException e) {
            System.out.println("cant create file " + e);
        }
    }

    public void WriteInFile(String str) {
        try {
            fw = new FileWriter(file, true);
            fw.write(str + "\n");
        }
        catch (IOException e){
            System.out.println("cant write from file " + e);
        }
        finally {
            try {
                fw.close();
            }
            catch (IOException ex) {
                System.out.println("cant close file " + ex);
            }
        }

    }


    public void readFromFile() {
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";

            while ((line = br.readLine()) !=null);
            System.out.println(line);

        }
        catch (IOException ex) {
            System.out.println("cant read from file " + ex);
        }
        finally {
            try {
                br.close();
            }
            catch (IOException ex) {
                System.out.println("cant close the file");
            }
        }

    }
}
