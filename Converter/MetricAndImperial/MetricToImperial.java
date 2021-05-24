package Converter.MetricAndImperial;

import Converter.IConverter;
import Converter.MetricAndImperial.Area.AreaMeterToImperial;
import Converter.MetricAndImperial.Length.LengthMeterToImperial;
import Converter.MetricAndImperial.Mass.MassMeterToImperial;
import Converter.MetricAndImperial.Temperature.TempMeterToImperial;
import Converter.MetricAndImperial.Volume.VolumeMetricToImperial;

import java.util.Scanner;

public class MetricToImperial implements IConverter {
    private IConverter lengthMeterToImperial = new LengthMeterToImperial();
    private IConverter areaMeterToImperial = new AreaMeterToImperial();
    private IConverter volumeMetricToImperial = new VolumeMetricToImperial();
    private IConverter massMeterToImperial = new MassMeterToImperial();
    private IConverter tempMeterToImperial = new TempMeterToImperial();

    private double selection;
    @Override
    public void getResult(){
        Scanner scanner = new Scanner(System.in);

        //Multiple selection for the user from which he can select.
        System.out.println("Please select from which you need to convert: ");
        System.out.println("1. Length Conversion");
        System.out.println("2. Area Conversion");
        System.out.println("3. Volume Conversion");
        System.out.println("4. Mass Conversion");
        System.out.println("5. Temperature Conversion");
        selection = scanner.nextInt();

        if (selection == 1){
            lengthMeterToImperial.getResult();
        }else if (selection == 2){
            areaMeterToImperial.getResult();
        }else if (selection == 3){
            volumeMetricToImperial.getResult();
        }else if (selection == 4){
            massMeterToImperial.getResult();
        }else if (selection == 5){
            tempMeterToImperial.getResult();
        }



    }

}
