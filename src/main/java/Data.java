import org.jeasy.random.EasyRandom;

public class Data {
    private final Address address;
    private final Person person;
    private final Job job;

    public Data (Address address, Person person, Job job) {
        this.address = address;
        this.person = person;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Data{" +
                "address=" + address +
                ", person=" + person +
                ", job=" + job +
                '}';
    }
}
