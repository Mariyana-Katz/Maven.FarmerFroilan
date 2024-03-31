package com.zipcodewilmington.froilansfarm.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> {
    List<T> cropRow;
    private boolean isRowWatered = false;
    private boolean isRowFertilized = false;
    private boolean isRowHarvested = false;

    public CropRow(){
        this.cropRow = new ArrayList<>();
    }

    public CropRow( ArrayList<T> newRow){
        this.cropRow = newRow;
    }

    public void addCrop(T crop) {
        this.cropRow.add(crop);

    }

    public int getCropRowSize() {
        return this.cropRow.size();
    }

    public boolean isRowEmpty() {
        return cropRow.isEmpty();
    }

    public boolean hasBeenFertilized() {
        return isRowFertilized;
    }

    public void fertilizeRow() {
        for(T crop: this.cropRow){
            crop.fertilize();
        }
        isRowFertilized =true;
    }

    public boolean hasBeenHarvested() {
        return isRowHarvested;
    }

    public void harvestRow() {
        for(T crop: this.cropRow){
            crop.harvest();
        }
        isRowHarvested =true;
    }

    public boolean hasBeenWatered() {
        return isRowWatered;
    }

    public void waterRow() {
        isRowWatered = true;
    }
}
