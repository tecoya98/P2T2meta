package mx.edu.tesoem.isc.meta.p2t2meta;

import java.util.ArrayList;

public class GlobalClass {
    public static ArrayList<String> listColors = new ArrayList<String>();

    public static void addColor(String c){
        listColors.add(c);
    }

    public static ArrayList<String> showColors(){
        return listColors;
    }
}