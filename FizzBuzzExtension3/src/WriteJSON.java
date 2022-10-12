import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {


    public static void main(String[] args) {
        JSONObject fizzBuzzExt = new JSONObject();
        fizzBuzzExt.put("Fizz: ", fizz);
        fizzBuzzExt.put("Buzz: ", buzz);
        fizzBuzzExt.put("FizzBuzz: ", fizzBuzz);
        JSONObject fizzBuzzExtObject = new JSONObject();
        fizzBuzzExtObject.put("solution", fizzBuzzExt);

        JSONArray fizzBuzzAnswers = new JSONArray();
        fizzBuzzAnswers.add(fizzBuzzExtObject);

        try (FileWriter file = new FileWriter("solution.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(fizzBuzzAnswers.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
