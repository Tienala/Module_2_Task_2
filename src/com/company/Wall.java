/* Module 2. Task 2
 * Classname: Wall
 *
 * Version 1
 *
 * Zviertseva Nataliia, NTU KhPI
 *
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
package com.company;

//Child Class Wall
public class Wall extends Priamougolnik {
    String colorWall;
    String materialWall;
    int pricePlasterPerMeter;
    int priceForColoringPerMeter;
    boolean isBase;
    int windowsAmount;
    int doorAmount;
//Constructor
    public Wall(double sideA, double sideB, String colorWall,
                String materialWall, int pricePlasterPerMeter,
                int priceForColoringPerMeter, boolean isBase,
                int windowsAmount, int doorAmount) {
        super(sideA, sideB);
        this.colorWall = colorWall;
        this.materialWall = materialWall;
        this.pricePlasterPerMeter = pricePlasterPerMeter;
        this.priceForColoringPerMeter = priceForColoringPerMeter;
        this.isBase = isBase;
        this.windowsAmount = windowsAmount;
        this.doorAmount = doorAmount;
    }
//Getters and setters
    public String getColorWall() {
        return colorWall;
    }

    public void setColorWall(String colorWall) {
        this.colorWall = colorWall;
    }

    public String getMaterialWall() {
        return materialWall;
    }

    public void setMaterialWall(String materialWall) {
        this.materialWall = materialWall;
    }

    public int getPricePlasterPerMeter() {
        return pricePlasterPerMeter;
    }

    public void setPricePlasterPerMeter(int pricePlasterPerMeter) {
        this.pricePlasterPerMeter = pricePlasterPerMeter;
    }

    public int getPriceForColoringPerMeter() {
        return priceForColoringPerMeter;
    }

    public void setPriceForColoringPerMeter(int priceForColoringPerMeter) {
        this.priceForColoringPerMeter = priceForColoringPerMeter;
    }

    public boolean isBase() {
        return isBase;
    }

    public void setBase(boolean base) {
        isBase = base;
    }

    public int getWindowsAmount() {
        return windowsAmount;
    }

    public void setWindowsAmount(int windowsAmount) {
        this.windowsAmount = windowsAmount;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }
// Method    getPlasterPrice
    public int getPlasterPrice(){

        return (int) super.getArea() * this.getPricePlasterPerMeter();
    }
//Method    getColorPrice
    public int getColorPrice(){

        return (int) super.getArea() * this.getPriceForColoringPerMeter();
    }
//To String Method
    @Override
    public String toString() {
        return "Wall{" +
                "SideA= " + super.getSideA()+
                "SideB= " + super.getSideB()+
                "Area= " + super.getArea()+

                "color='" + this.getColorWall() + '\'' +
                ", material='" + this.getMaterialWall() + '\'' +
                ", price of plaster =" + this.getPlasterPrice() +
                ", price for coloring=" + this.getColorPrice() +
                ", isBase=" + isBase +
                ", windows amount=" + this.getWindowsAmount() +
                ", doors amount=" + this.getDoorAmount() +
                '}';
    }
}
