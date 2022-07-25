import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String regexStr = ".*[a-z][0-9].";
        Pattern pattern = Pattern.compile(regexStr);

        Matcher matcher = pattern.matcher("1234574abcddh1234");
        boolean matchfound = matcher.find();
        if(matchfound){
            System.out.println("Match Found");
        }
        else {
            System.out.println("Match not found");
        }
    }
}
