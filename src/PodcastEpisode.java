public class PodcastEpisode extends ContentItem {
    private String hostName;

    public  PodcastEpisode(String title, int year, int durationMinutes, int currentYear, String hostName){
        super(title, year, durationMinutes, currentYear);
        this.hostName = hostName;
    }

    @Override
    public double getLicenseCost(int currentYear){
        int age = getAge(currentYear);
        double ageFactor;
        if(age <= 2){
            ageFactor = 3;
        }
        else{
            ageFactor = 1;
        }
        return 0.03 * getDurationMinutes() + ageFactor;
    }

    @Override
    public void download(){
        System.out.println("Downloading podcast hosted by " + hostName);
    }

    @Override
    public int getMaxDownloadsPerDay(){
        int maxDownloads = 10;
        System.out.printf("%d downloads/day", maxDownloads);
        return 0;
    }

    @Override
    public String toString() {
        return "PodcastEpisode{" + super.toString() +
                "hostName='" + hostName +'\'' +
                '}';
    }
}
