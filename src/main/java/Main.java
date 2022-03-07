import com.buildExample.FizzBuzz;
import com.buildExample.FizzBuzz2Inputs;
import com.buildExample.FizzBuzzArguments;
import com.buildExample.FizzBuzzJson;

public class Main {
    public static void main(String[] args) {
        FizzBuzz2Inputs.fizzBuzzInputs();
        FizzBuzz.fizzBuzz(15);
        FizzBuzzArguments.fizzBuzzArguments(30, 100);
        FizzBuzzJson.fizzBuzzJson(200, 10);
    }
}
