import java.util.ArrayList;

public class ContentDemo {
        public static void main(String[] args){
            int currentYear = 2025;

            ArrayList<ContentItem> items = new ArrayList<>();

            items.add(new VideoLecture("Minecraft letsplay", 2025, 43, currentYear,"HD"));
            items.add(new VideoLecture("World War 2 documentay", 2017, 120, currentYear,"720p"));

            items.add(new PodcastEpisode("DOPE SOZ", 2023,59, currentYear,  "Arsen"));
            items.add(new PodcastEpisode("ZAMANDAS", 2024,135, currentYear,  "Kana Beisekeyev"));

            for (int i = 0; i < items.size(); i++){
                ContentItem item = items.get(i);
                System.out.println(item);
                System.out.println("License cost: " + item.getLicenseCost(currentYear));
                if( item instanceof Downloadable){
                    item.download();
                    item.getMaxDownloadsPerDay();
                }
            }
        }
}
