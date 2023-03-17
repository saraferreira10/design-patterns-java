
package adapter;

public class TemperatureObjectAdapter {
    
    TemperatureFahrenheit temp;

    public TemperatureObjectAdapter(TemperatureFahrenheit temp) {
        this.temp = temp;
    }

    public void setValue(double value) {
        temp.setValue(value * 9 / 5 + 32); 
    }

    public double getValue() {
        return (temp.getValue() - 32) * 5 / 9;
    }
    
    public double getValueInFahrenheit() {
        return temp.getValue();
    }
    
}
