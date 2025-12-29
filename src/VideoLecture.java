public class VideoLecture extends ContentItem{
    private String quality;

    public VideoLecture(String title, int year, int durationMinutes, int currentYear, String quality){
        super(title, year, durationMinutes, currentYear);
        this.quality = quality;
    }

    @Override
    public double getLicenseCost(int currentYear){
        int age = getAge(currentYear);
        double ageFactor;
        if(age <= 2){
            ageFactor = 5;
        }
        else{
            ageFactor = 2;
        }
        return 0.05 * getDurationMinutes() + ageFactor;
    }

    @Override
    public void download(){
        System.out.println("Downloading video in " + quality + " quality");
    }

    @Override
    public int getMaxDownloadsPerDay(){
        int maxDownloads = 3;
        System.out.printf("%d downloads/day", maxDownloads);
        return 0;
    }

    @Override
    public String toString() {
        return "VideoLecture{" + super.toString() +
                "quality='" + quality + '\'' +
                '}';
    }
}
