import java.io.FileInputStream;
import java.io.FileOutputStream;

public class iinputOP {
    public static void main(String[] args) throws Exception {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try{
            inStream = new FileInputStream("C:\\Users\\vaibhavmp\\Desktop\\GitPractice\\Source.txt");
            outStream = new FileOutputStream("C:\\Users\\vaibhavmp\\Desktop\\GitPractice\\Written.txt");
            int content;
            while ((content = inStream.read())!= -1){
                outStream.write((byte) content);
            }
        }
        finally {
            if (inStream != null){
                inStream.close();
            }
            if (outStream != null){
                outStream.close();
            }
        }

    }
}
