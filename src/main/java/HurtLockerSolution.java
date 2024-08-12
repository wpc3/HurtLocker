import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HurtLockerSolution {
    static String originalText = "RawData.txt";
    static String regexText = "NewData.txt";
    public String rawData;
    public HurtLockerSolution() {
        this.rawData = loadFile();
    }

    private String loadFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("RawData.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getRawData() {


        return rawData;
    }

    public String nameAndFoodRegex() {
        String replacedTexts = rawData;


        Pattern patternName = Pattern.compile("(?i)(name)");
        Matcher matcherName = patternName.matcher(replacedTexts);
        replacedTexts = matcherName.replaceAll("name");



        Pattern patternBread = Pattern.compile("(?i)(bread)");
        Matcher matcherBread = patternBread.matcher(replacedTexts);
        replacedTexts = matcherBread.replaceAll("Bread");

        Pattern patternCookie = Pattern.compile("(?i)(cookies)");
        Matcher matcherCookie = patternCookie.matcher(replacedTexts);
        replacedTexts = matcherCookie.replaceAll("Cookies");

        Pattern patternMilk = Pattern.compile("(?i)(milk)");
        Matcher matcherMilk = patternMilk.matcher(replacedTexts);
        replacedTexts = matcherMilk.replaceAll("Milk");

        Pattern patternApple = Pattern.compile("(?i)(apples)");
        Matcher matcherApple = patternApple.matcher(replacedTexts);
        replacedTexts = matcherApple.replaceAll("Apples");



        return replacedTexts;
    }

    public void saveToAFile(String output) {
        try (FileWriter fileWriter = new FileWriter(output)) {
            fileWriter.write(nameAndFoodRegex());
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
    }

    public static void main(String[] args) {
    HurtLockerSolution hurtLockerSolution = new HurtLockerSolution();
    hurtLockerSolution.saveToAFile(regexText);
    }

}
