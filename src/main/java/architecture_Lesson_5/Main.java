package architecture_Lesson_5;

public class Main {
    public static void main(String[] args) {
        WeatherNews weatherNews = new WeatherNews();
        Data data = new Data(29.5, 25.5);

        weatherNews.addPropertyChangeListener(new Subscriber("Мартин Лютер"));


        weatherNews.setNews(data);

    }
}
