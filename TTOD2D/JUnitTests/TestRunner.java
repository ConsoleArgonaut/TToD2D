import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by pstieger on 03.02.2017.
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);

        if(result.getFailureCount() > 0){
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
        else {
            System.out.println("Alle Tests erfolgreich abgeschlossen.");
        }

        System.out.println(result.wasSuccessful());
    }
}
