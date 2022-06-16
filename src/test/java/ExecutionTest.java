import org.junit.jupiter.api.RepeatedTest;

class ExecutionTest {

    @RepeatedTest(10)
    void setAndReturnData() {
        Address address = new Address("SPb");
        Job job = new Job("job", "somewhere");
        Person person = new Person("guy", "some");

        Data res = Execution.setAndReturnData(address, job, person);
        System.out.println(res.toString());
    }
}