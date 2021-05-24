package Converter.MetricAndImperial;

import Converter.IConverter;
import Converter.MetricAndImperial.Area.AreaImperialToMeter;
import Converter.MetricAndImperial.Length.LengthImperialToMeter;
import Converter.MetricAndImperial.Mass.MassImperialToMeter;
import Converter.MetricAndImperial.Temperature.TempImperialToMeter;
import Converter.MetricAndImperial.Volume.VolumeImperialToMeter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImperialToMetric implements IConverter {
    private IConverter lengthImperialToMetric = new LengthImperialToMeter();
    private IConverter areaImperialToMetric = new AreaImperialToMeter();
    private IConverter volumeImperialToMetric = new VolumeImperialToMeter();
    private IConverter massImperialToMetric = new MassImperialToMeter();
    private IConverter tempImperialToMetric = new TempImperialToMeter();

    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        //Multiple selection for the user from which he can select.
        System.out.println("Please select from which you need to convert: ");
        System.out.println("1. Length Conversion");
        System.out.println("2. Area Conversion");
        System.out.println("3. Volume Conversion");
        System.out.println("4. Mass Conversion");
        System.out.println("5. Temperature Conversion");
        int metric = scanner.nextInt();

        if (metric == 1){
            lengthImperialToMetric.getResult();
        }else if (metric == 2){
            areaImperialToMetric.getResult();
        }else if (metric == 3){
            volumeImperialToMetric.getResult();
        }else if (metric == 4){
            massImperialToMetric.getResult();
        }else if (metric == 5){
            tempImperialToMetric.getResult();
        }
    }
}
