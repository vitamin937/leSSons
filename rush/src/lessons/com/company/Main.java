package lessons.com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws Exception {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
	while (true) {
        String s = reader.readLine();
        if (s.equals("exit"))
            break;
        sum += parseInt(reader.readLine());
        System.out.println(sum);


    }


    }
}
