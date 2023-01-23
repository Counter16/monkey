/*
 * Arrays of objects
 */

import core.data.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      WeatherStation temp = allstns.get(0);
      for(int i = 1; i < allstns.size(); i++){
         WeatherStation currentStation = allstns.get(i);
         if(currentStation.getLat() < temp.getLat()){
            temp = currentStation;
         }
      }
      System.out.println(temp);

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
         
      WeatherStation temp1 = allstns.get(0);
      for(int j = 1; j < allstns.size(); j++){
         WeatherStation currentStation = allstns.get(j);
         if (currentStation.isLocatedInState(state)) {
            if(currentStation.getLat() < temp1.getLat()){
               temp1 = currentStation;
            }
         }
         
      }
      System.out.println(temp1);
   }
}