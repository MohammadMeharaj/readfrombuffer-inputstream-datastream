import java.io.*;

public class BufferInputDataStream {
    public static void main(String[] args) {
        try {
            // Read text file with BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("C:\\Mohammad\\Meharaj.text"));
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
            br.close();

            // Read binary file with BufferedInputStream and DataInputStream
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Mohammad\\Meharaj.text"));
            DataInputStream dis = new DataInputStream(bis);
            int data;
            while ((data = dis.read()) != -1) {
                System.out.println(data);
            }
            dis.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
