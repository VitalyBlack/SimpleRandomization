
public class Execution {

    public static Data setAndReturnData() {
        Address address = new Address("SPb");
        Job job = new Job("job", "somewhere");
        Person person = new Person("guy", "some");

        Data result = new Data(address, person, job);
        return result;
    }
}
