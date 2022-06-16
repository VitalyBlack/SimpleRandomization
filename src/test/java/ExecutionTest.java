import org.junit.jupiter.api.RepeatedTest;

class ExecutionTest {

    @RepeatedTest(10)
    void setAndReturnData() {

        Data res = Execution.setAndReturnData();
        System.out.println(res.toString());
    }
}