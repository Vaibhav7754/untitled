import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Nio {
    public static void main(String[] args) throws IOException {
        //Read
//        FileInputStream fin = new FileInputStream("C:\\Users\\vaibhavmp\\Desktop\\GitPractice\\Source.txt");
//        FileChannel readchannel = fin.getChannel();
//        ByteBuffer readbuffer = ByteBuffer.allocate(1024);
//        int result = readchannel.read(readbuffer);
//        System.out.println("File read: "+ result);
        //Write
        FileOutputStream fout = new FileOutputStream("C:\\Users\\vaibhavmp\\Desktop\\GitPractice\\Write.txt");
        FileChannel writechannel = fout.getChannel();
        ByteBuffer writebuffer = ByteBuffer.allocate(1024);

        String message = "This is text sTRING";
        writebuffer.put(message.getBytes());
        writebuffer.flip();
        writechannel.write(writebuffer);
        System.out.println("File written Successfully");

    }
}

