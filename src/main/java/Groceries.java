import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groceries {
    Map<String,List> hash = new HashMap<>();
    List<Double> price = new ArrayList<>();
    StringBuilder sb =new StringBuilder();

    public Groceries() {
        this.hash = new HashMap<>();
        this.price = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        String [] objectSplit = splitData();
        for(String s : objectSplit){
            System.out.println(s);
        }
    }
    public static String[] splitData() throws Exception {
        String output = (new Main()).readRawDataToString();
        String [] oS = output.split("[##]");
        return oS;
//        String [] sO = oS.toString().split("[\:\;]");
    };
}
