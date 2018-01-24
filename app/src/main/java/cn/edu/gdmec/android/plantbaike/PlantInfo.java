package cn.edu.gdmec.android.plantbaike;

/**
 * Created by Jack on 2018/1/24.
 */

public class PlantInfo {
    private String plantName;
    private String plantContent;

    public String getPlantName(){
        return plantName;
    }

    public void getPlantName(String plantName){
        this.plantName = plantName;
    }

    public String getPlantContent(){
        return plantContent;
    }

    public void setPlantContent(String plantContent){
        this.plantContent = plantContent;
    }
}
