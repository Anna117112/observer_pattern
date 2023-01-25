package architecture_Lesson_5;

public class Data {
    public double getDayTemperature() {
        return dayTemperature;
    }

    public double getNightTemperature() {
        return nightTemperature;
    }

    private double dayTemperature; // температура днем
    private double nightTemperature; // температура ночью


    public Data(double dayTemperature, double nightTemperature ){
        this.dayTemperature = dayTemperature;
        this.nightTemperature = nightTemperature;
    }
    public Data(){

    }

    @Override
    public String toString (){
        return (" температура днем " + dayTemperature + " температура ночью " + nightTemperature);
    }
}
