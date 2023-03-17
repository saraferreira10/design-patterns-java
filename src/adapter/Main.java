
package adapter;

public class Main {
    
    public static void main(String[] args) {
        
        TemperatureClassAdapter adapter = new TemperatureClassAdapter();
        adapter.setValue(30);
        System.out.println(adapter.getValue());
        System.out.println(adapter.getValueInFahrenheit());
        

        TemperatureObjectAdapter objectAdapter = new TemperatureObjectAdapter(new TemperatureFahrenheit());
        objectAdapter.setValue(30);
        System.out.println(objectAdapter.getValue());
        System.out.println(objectAdapter.getValueInFahrenheit());
    }
    
}
