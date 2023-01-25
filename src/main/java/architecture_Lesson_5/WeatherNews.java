package architecture_Lesson_5;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// класс информации о погоде
public class WeatherNews {

    private Data data;
    
    // import java.beans.PropertyChangeSupport; при подключении этого пакета может подключать и отключать подписчиков (слушателей)
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);


    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setNews(Data newData) {
        support.firePropertyChange(" ",this.data, newData );

    }



}
