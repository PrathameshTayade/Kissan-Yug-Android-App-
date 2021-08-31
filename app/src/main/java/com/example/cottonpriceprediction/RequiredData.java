
package com.example.cottonpriceprediction;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class RequiredData {
    private final HashMap<Integer, List<String>> varieties = new HashMap<>();
    private final ArrayList<String> states = new ArrayList<>();
    private final ArrayList<String> months = new ArrayList<>();
    private final HashMap<String , Integer> varietyRank = new HashMap<>();
    private  int year;



    public RequiredData(){

        // StateWise Variety
        varieties.put(0 , new ArrayList<String>(Arrays.asList("Desi", "Other", "Cotton (Unginned)", "170-CO2 (Unginned)",
                "American", "Bunny", "MCU 5", "MCU-5 (A) 31mm FIne", "MCU-7", "cotton (Ginned)")));
        varieties.put(1 , new ArrayList<String>(Arrays.asList("Cotton (Unginned)", "DCH-32  (Ginned)", "cotton (Ginned)", "H4",
                "CO-2 (Unginned)", "H 420", "Farm (Unginned)", "H.B  (Ginned)",
                "H.B (Unginned)", "H.Y.4 (Unginned)", "Hampi(Unginned)",
                "Kapas (Adoni)", "CO2  (Ginned)", "Other", "MCU 5",
                "MCU-5 (A) 31mm FIne", "Desi", "Varalaxmi", "MCU",
                "Mungari (Unginned)", "N-44", "170-C2  (Ginned)",
                "170-CO2 (Unginned)", "Bengal Deshi (A) FIne", "L 147", "MCU-7",
                "American", "Cotton (Ginned)", "Mungari  (Ginned)",
                "A.K. 235 (Unginned)", "LD-327", "PCO2", "DCH-32(Unginned)",
                "Farm PCG", "G-6", "Aka-1 (Unginned)", "lra (Unginned)",
                "Farm  (Ginned)", "F-1054", "Bunny", "CJ 73 22mm FIne", "Laxmi",
                "Bramha", "HB6", "Jarilla  (Ginned)", "Jayadhar",
                "Jayadhar (Ginned)", "Jayadhar(Unginned)", "Krishna", "RCH-2",
                "320F", "A.K. 235  (Ginned)", "DIGVIJAY 24mm, Superfine", "F-505",
                "F-846", "GCH", "Jaydhar", "Savita", "H-4(A) 27mm FIne", "JKH 25")));
        varieties.put(2 , new ArrayList<String>(Arrays.asList("Other", "LRA", "RCH-2", "Cotton (Unginned)", "MCU 5",
                "MCU-5 (A) 31mm FIne", "lra (Unginned)", "DCH-32(Unginned)",
                "DCH-32  (Ginned)", "MCU", "Varalaxmi", "Bengal Deshi (A) FIne",
                "Cotton (Ginned)", "MCU-7", "170-CO2 (Unginned)",
                "170-C2  (Ginned)", "LRA  (Ginned)", "Surabi", "cotton (Ginned)",
                "GCH", "PCO2", "R-51  (Ginned)", "Jayadhar(Unginned)", "Local",
                "Suvin 40mm(F)", "Kapas (Adoni)", "Narma BT Cotton",
                "A-51-9 24mm. FIne", "CO-2 (Unginned)", "Bunny",
                "Laxmi (Unginned)")));

        varieties.put(3 , new ArrayList<String>(Arrays.asList("Desi", "Kapas (Adoni)", "Other", "DCH-32  (Ginned)", "H4",
                "Local", "Y-1", "H-4(A) 27mm FIne", "DCH-32(Unginned)", "LRA",
                "Cotton (Ginned)", "A.C. 122- H4", "Cotton (Unginned)",
                "R-51  (Ginned)", "MECH-1", "RCH-2", "170-C2  (Ginned)",
                "170-CO2 (Unginned)", "Cotton US", "LRA  (Ginned)", "American")));

        varieties.put(4 , new ArrayList<String>(Arrays.asList("Jayadhar", "Jaydhar", "Laxmi", "LD-327", "H-4(A) 27mm FIne",
                "R-51  (Ginned)", "Hampi  (Ginned)", "F-1054", "LH-1556",
                "Varalakshmi  (Ginned)", "Laxmi  (Ginned)", "Suyodhar  (Ginned)",
                "Krishna", "GCH", "Other", "N-44", "J3H", "MCU 5",
                "Cotton (Ginned)", "Aka-1 (Unginned)", "Jayadhar 23mm-FIne",
                "Kapas (Adoni)", "Varalaxmi", "H.B  (Ginned)")));

        varieties.put(5 , new ArrayList<String>(Arrays.asList("Assam Comilla", "Other", "Shanker 4 31mm FIne",
                "Shanker 6 (B) 30mm FIne", "V-797 22mm FIne", "Local",
                "Narma BT Cotton", "Desi", "RCH-2", "G-6", "Cotton (Unginned)",
                "H.B  (Ginned)", "American", "Cotton (Ginned)", "H-6", "Bunny",
                "cotton (Ginned)", "Y-1", "170-C2  (Ginned)", "320F",
                "A.C. 122- H4", "H.Y.4 (Unginned)", "Mahico", "H.B (Unginned)",
                "Suvin 40mm(F)", "CO-2 (Unginned)", "Farm (Unginned)", "H4", "L-K",
                "HB6", "CJ 73 22mm FIne", "DIGVIJAY 24mm, Superfine", "GCH")));

        varieties.put(6 , new ArrayList<String>(Arrays.asList("CO2  (Ginned)", "Cotton (Unginned)", "170-CO2 (Unginned)",
                "A.K. 235 (Unginned)", "CO-2 (Unginned)", "Cotton (Ginned)", "H4",
                "Bramha", "HB6", "Hy-4  (Ginned)", "RCH-2", "DCH-32  (Ginned)",
                "320F", "H.Y.4 (Unginned)", "CJ 73 22mm FIne", "170-C2  (Ginned)",
                "MECH-1", "DCH-32(Unginned)", "lra (Unginned)", "H 420",
                "H.B (Unginned)", "Savita", "Desi", "Other", "G-6",
                "R-51 (Unginned)", "JKH 25", "L 147", "F-1054", "Farm (Unginned)",
                "A-51-9 24mm. FIne", "Mungari (Unginned)", "Hampi(Unginned)",
                "Laxmi", "Mungari  (Ginned)", "DIGVIJAY 24mm, Superfine", "Bunny",
                "Laxmi (Unginned)", "MCU", "Varalaxmi", "Farm  (Ginned)",
                "Kapas (Adoni)", "LD-327", "Bengal Deshi (A) FIne", "LD-491",
                "Local")));

        varieties.put(7 , new ArrayList<String>(Arrays.asList("Other", "American", "Desi", "Cotton (Unginned)",
                "R.G.J-34 24mm-Fine", "RCH-2", "Narma BT Cotton", "Kapas (Adoni)",
                "LD-327", "J-34", "H.B  (Ginned)")));

        varieties.put(8, new ArrayList<String>(Arrays.asList("Other", "N-44", "Desi", "H-4(A) 27mm FIne", "LRA",
                "DCH-32(Unginned)", "A.K. 235 (Unginned)", "Varalaxmi", "H4",
                "LRA  (Ginned)", "MCU")));

        varieties.put(9, new ArrayList<String>(Arrays.asList("American", "Desi", "Kapas (Adoni)", "Other", "RCH-2",
                "Bengal Deshi (A) FIne", "Narma BT Cotton", "Cotton (Ginned)")));

        varieties.put(10, new ArrayList<String>(Arrays.asList("Other", "170-CO2 (Unginned)", "A.K. 235 (Unginned)", "American",
                "Desi", "Kapas (Adoni)", "LH-1556", "Bengal Deshi (A) FIne",
                "A-51-9 24mm. FIne", "J-34", "320F", "Shanker 6 (B) 30mm FIne",
                "RCH-2")));

        // State Rank
        states.add(0,"Orissa");
        states.add(1,"Andhra Pradesh");
        states.add(2,"Tamil Nadu");
        states.add(3,"Madhya Pradesh");
        states.add(4,"Karnataka" );
        states.add(5,"Gujarat");
        states.add(6,"Telangana");
        states.add(7,"Punjab");
        states.add(8,"Maharashtra");
        states.add(9,"Haryana");
        states.add(10,"Rajasthan");


        months.add(0,"January");
        months.add(1,"February");
        months.add(2,"March");
        months.add(3,"April");
        months.add(4,"May");
        months.add(5,"June");
        months.add(6,"July");
        months.add(7,"August");
        months.add(8,"September");
        months.add(9,"October");
        months.add(10,"November");
        months.add(11,"December");

        // Variety Rank


        varietyRank.put("J3H", 0);
        varietyRank.put("Jayadhar(Unginned)", 1);
        varietyRank.put("Jarilla  (Ginned)", 2);
        varietyRank.put("Jayadhar (Ginned)", 3);
        varietyRank.put("V-797 22mm FIne", 4);
        varietyRank.put("CJ 73 22mm FIne", 5);
        varietyRank.put("A.K. 235  (Ginned)", 6);
        varietyRank.put( "Assam Comilla", 7);
        varietyRank.put( "Jayadhar 23mm-FIne", 8);
        varietyRank.put("Kapas (Adoni)", 9);
        varietyRank.put("Laxmi (Unginned)", 10);
        varietyRank.put("DIGVIJAY 24mm, Superfine", 11);
        varietyRank.put("Suvin 40mm(F)", 12);
        varietyRank.put("F-846", 13);
        varietyRank.put("Jayadhar", 14);
        varietyRank.put("MCU-5 (A) 31mm FIne", 15);
        varietyRank.put("HB6", 16);
        varietyRank.put("F-505", 17);
        varietyRank.put("H.B  (Ginned)", 18);
        varietyRank.put("Mungari (Unginned)", 19);
        varietyRank.put("H 420", 20);
        varietyRank.put("Farm  (Ginned)", 21);
        varietyRank.put("lra (Unginned)", 22);
        varietyRank.put("320F", 23);
        varietyRank.put("Bengal Deshi (A) FIne", 24);
        varietyRank.put("Laxmi", 25);
        varietyRank.put("R.G.J-34 24mm-Fine", 26);
        varietyRank.put("Farm (Unginned)", 27);
        varietyRank.put("A.C. 122- H4", 28);
        varietyRank.put("MCU 5", 29);
        varietyRank.put("Farm PCG", 30);
        varietyRank.put("Jaydhar", 31);
        varietyRank.put("Savita", 32);
        varietyRank.put("JKH 25", 33);
        varietyRank.put("cotton (Ginned)", 34);
        varietyRank.put("Mungari  (Ginned)", 35);
        varietyRank.put("R-51  (Ginned)", 36);
        varietyRank.put("R-51 (Unginned)", 37);
        varietyRank.put("Hampi(Unginned)", 38);
        varietyRank.put("LRA", 39);
        varietyRank.put("LD-491", 40);
        varietyRank.put("Hy-4  (Ginned)", 41);
        varietyRank.put("Cotton (Ginned)", 42);
        varietyRank.put("Hampi  (Ginned)", 43);
        varietyRank.put("N-44", 44);
        varietyRank.put("MCU", 45);
        varietyRank.put("LD-327", 46);
        varietyRank.put("Laxmi  (Ginned)", 47);
        varietyRank.put("G-6", 48);
        varietyRank.put("Shanker 4 31mm FIne", 49);
        varietyRank.put("H4", 50);
        varietyRank.put("F-1054", 51);
        varietyRank.put("Krishna", 52);
        varietyRank.put("CO-2 (Unginned)", 53);
        varietyRank.put("CO2  (Ginned)", 54);
        varietyRank.put("Varalaxmi", 55);
        varietyRank.put("Cotton (Unginned)", 56);
        varietyRank.put("Other", 57);
        varietyRank.put("GCH", 58);
        varietyRank.put("H.Y.4 (Unginned)", 59);
        varietyRank.put("LRA  (Ginned)", 60);
        varietyRank.put("Y-1", 61);
        varietyRank.put("L-K", 62);
        varietyRank.put("170-CO2 (Unginned)", 63);
        varietyRank.put("Shanker 6 (B) 30mm FIne", 64);
        varietyRank.put("Desi", 65);
        varietyRank.put("LH-1556", 66);
        varietyRank.put("H-4(A) 27mm FIne", 67);
        varietyRank.put("MCU-7", 68);
        varietyRank.put("170-C2  (Ginned)", 69);
        varietyRank.put("American", 70);
        varietyRank.put("A.K. 235 (Unginned)", 71);
        varietyRank.put("Suyodhar  (Ginned)", 72);
        varietyRank.put("Bunny", 73);
        varietyRank.put("Varalakshmi  (Ginned)", 74);
        varietyRank.put("DCH-32  (Ginned)", 75);
        varietyRank.put("H.B (Unginned)", 76);
        varietyRank.put("Cotton US", 77);
        varietyRank.put("Local", 78);
        varietyRank.put("L 147", 79);
        varietyRank.put("PCO2", 80);
        varietyRank.put("RCH-2", 81);
        varietyRank.put("A-51-9 24mm. FIne", 82);
        varietyRank.put("MECH-1", 83);
        varietyRank.put("Narma BT Cotton", 84);
        varietyRank.put("Mahico", 85);
        varietyRank.put("DCH-32(Unginned)", 86);
        varietyRank.put("J-34", 87);
        varietyRank.put("H-6", 88);
        varietyRank.put("Bramha", 89);
        varietyRank.put("Aka-1 (Unginned)", 90);
        varietyRank.put("Surabi", 91);

        // set Year
        int y = Calendar.getInstance().get(Calendar.YEAR);
        year = y+1;






    }


    public int getVarietyRank(String variety) {
        return varietyRank.get(variety);
    }

    public int getYear() {
        return year;
    }



    public HashMap<Integer, List<String>> getVarieties() {
        return varieties;
    }

    public ArrayList<String> getStates() {
        return states;
    }

    public ArrayList<String> getMonths() {
        return months;
    }
    public int getStateSize(){
        return  states.size();
    }
    public String getMonth(int rank){
        return  months.get(rank);
    }
}


