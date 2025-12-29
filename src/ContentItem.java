import java.util.Scanner;
public abstract class ContentItem implements Downloadable{
    private int id;
    private static int idGen = 1;
    private String title;
    private int year;
    private int durationMinutes;

    public ContentItem(String title, int year, int durationMinutes, int currentYear){
        this.id = idGen++;
        setTitle(title);
        setYear(year, currentYear);
        setDurationMinutes(durationMinutes);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if(title == null){
            throw new IllegalArgumentException("Title can not be empty");
        }
        this.title = title;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year, int currentYear){
        if(year <= 1990 || year > currentYear){
            throw new IllegalArgumentException("Year must be between 1990 and current year");
        }
        this.year = year;
    }

    public int getDurationMinutes(){
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes){
        if(durationMinutes <= 0){
            throw new IllegalArgumentException("Duration minutes can not less or equal to 0");
        }
        this.durationMinutes = durationMinutes;
    }

    public int getAge(int currentYear){
        return currentYear - year;
    }

    public abstract double getLicenseCost(int currentYear);

    @Override
    public String toString() {
        return "ContentItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", durationMinutes=" + durationMinutes +
                '}';
    }
}