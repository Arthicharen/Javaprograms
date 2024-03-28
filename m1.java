package programs2;
import java.util.Map;
public class m1{
public static void main(String[] args) {
    String filePath = "D:\\file.csv";
    Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
    char startsWith = 'S'; // no country name start with s
    String outputFile = "D:\\filtered_countries.txt"; 
    CountryMap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
    System.out.println("Filtered countries have been written to the file.");
}
}