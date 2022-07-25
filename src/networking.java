import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class networking {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.google.com";
        InetAddress inetAddress = Inet4Address.getByName(url);
        System.out.println("Address :"+ Arrays.toString(inetAddress.getAddress()));
        System.out.println("Address :"+ inetAddress.getHostAddress());

    }
}
