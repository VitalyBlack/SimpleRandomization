public class Job {
    private final String jobName;
    private final String jobAddress;

    public Job(String jobName, String jobAddress) {
        this.jobName = jobName;
        this.jobAddress = jobAddress;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobName='" + jobName + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                '}';
    }
}
