import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixNameTypesFood {

public String name;
public String price;
public String type;
public String expiration;

    static String rawData = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##"
            + "naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##"
            + "NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016##"
            + "naMe:MiLK;price:3.23;type:Food^expiration:1/11/2016##"
            + "naMe:Cookies;price:2.25;type:Food%expiration:1/25/2016##"
            + "naMe:CoOkieS;price:2.25;type:Food*expiration:1/25/2016##"
            + "naMe:COokIes;price:2.25;type:Food;expiration:3/22/2016##"
            + "naMe:COOkieS;price:2.25;type:Food;expiration:1/25/2016##"
            + "NAME:MilK;price:3.23;type:Food;expiration:1/17/2016##"
            + "naMe:MilK;price:1.23;type:Food!expiration:4/25/2016##"
            + "naMe:apPles;price:0.25;type:Food;expiration:1/23/2016##"
            + "naMe:apPles;price:0.23;type:Food;expiration:5/02/2016##"
            + "NAMe:BrEAD;price:1.23;type:Food;expiration:1/25/2016##"
            + "naMe:;price:3.23;type:Food;expiration:1/04/2016##"
            + "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##"
            + "naME:BreaD;price:1.23;type:Food@expiration:1/02/2016##"
            + "NAMe:BrEAD;price:1.23;type:Food@expiration:2/25/2016##"
            + "naMe:MiLK;priCe:;type:Food;expiration:1/11/2016##"
            + "naMe:Cookies;price:2.25;type:Food;expiration:1/25/2016##"
            + "naMe:Co0kieS;pRice:2.25;type:Food;expiration:1/25/2016##"
            + "naMe:COokIes;price:2.25;type:Food;expiration:3/22/2016##"
            + "naMe:COOkieS;Price:2.25;type:Food;expiration:1/25/2016##"
            + "NAME:MilK;price:3.23;type:Food;expiration:1/17/2016##"
            + "naMe:MilK;priCe:;type:Food;expiration:4/25/2016##"
            + "naMe:apPles;prIce:0.25;type:Food;expiration:1/23/2016##"
            + "naMe:apPles;pRice:0.23;type:Food;expiration:5/02/2016##"
            + "NAMe:BrEAD;price:1.23;type:Food;expiration:1/25/2016##"
            + "naMe:;price:3.23;type:Food^expiration:1/04/2016##";

//public FixNameTypesFood(String str){
//
//}

public static String fixMilk(String s){
    //Extracting the records
    String[] records = rawData.split("[^;]*");

    //Mapping to store cleaned records
    Map<String,Integer> cleanRecords = new LinkedHashMap<>();

   Pattern namePattern = Pattern.compile("(?i)(milk)");

   for(String record : records){
       Matcher matcher = namePattern.matcher(record);
       int count = 0;
       if(matcher.find()){
           count++;
           String name = rewrite(matcher.group());
           Integer occurence = count;
           cleanRecords.put(name,occurence);
       }
   }

//   Matcher matcher = namePattern.matcher(s);

   return cleanRecords.toString();
}

public static String rewrite(String s){

    return s;
}



}
