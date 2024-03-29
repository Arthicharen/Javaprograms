package programs2;
import java.util.Map;
public class m2 {
	  public static void main(String[] args) {
	       String filePath = "D:\\file.csv";
	       Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
	       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	           System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
	       }
	   }}

