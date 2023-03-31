package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader =new BufferedReader(new FileReader("C:/Users/Ashik Mujeeb/Desktop/test.csv"));
            String header = reader.readLine();
            String[] headerArray = header.split(",");
            String line = null;
            List<DspVehicleDetailsDto> DspVehicleDetailsList = new ArrayList<>();
            String[] availableDetailsList = {"DSP Short code","Delivery Station","Owner","VIN"};
            int[] position = IntStream.range(0, availableDetailsList.length).toArray();
            for(int i=0; i<headerArray.length; i++){
                for(int j=0; j<availableDetailsList.length; j++){
                    if(headerArray[i]==availableDetailsList[j]){
                        position[i] = j;
                    }
                }
            }
            List<DspVehicleDetailsDto> dspVehicleDetailsList = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                DspVehicleDetailsDto dspVehicleDetailsDto = new DspVehicleDetailsDto();
                String[] lines = line.split(",");
                for(int i=0; i<position.length; i++){
                    if(position[i]==1){
                        dspVehicleDetailsDto.setDspShortCode(lines[i]);
                    }else if(position[i]==2){
                        dspVehicleDetailsDto.setDeliveryStation(lines[i]);
                    }else if(position[i]==3){
                        dspVehicleDetailsDto.setOwner(lines[i]);
                    }else if(position[i]==4){
                        dspVehicleDetailsDto.setVin(lines[i]);
                    }
                }dspVehicleDetailsList.add(dspVehicleDetailsDto);
            }
            Iterator i = dspVehicleDetailsList.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
        }catch(Exception ex){
            ex.printStackTrace (System.out);
        }
    }
}
