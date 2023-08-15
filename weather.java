import java.util.Random;

public class weather {
    public static void main(String[] args) {

        // create possible weather options

        String[] weatherTypeArray = {"Clear", "Drizzle", "Light Rain", "Heavy Rain", "Thunder Storm", "Hurricane"};
        Random random = new Random();
        int weatherTypewich = random.nextInt(weatherTypeArray.length);
        String weatherType = weatherTypeArray[weatherTypewich];
        Number temp = random.nextInt(100 + 1 - 75) + 75;
        System.out.println("Weather: " + weatherType + "\nTemp: " + temp);

    }
}
