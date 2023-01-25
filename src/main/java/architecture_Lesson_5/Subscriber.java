package architecture_Lesson_5;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {
    private String name;
    //private Data data = new Data();

    public Subscriber(String name){
        this.name = name;
    }
    public void setNews( Data data) {
        System.out.println(name + data);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((Data) evt.getNewValue() );


    }
}
