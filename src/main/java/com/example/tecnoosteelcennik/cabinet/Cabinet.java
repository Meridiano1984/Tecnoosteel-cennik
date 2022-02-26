package com.example.tecnoosteelcennik.cabinet;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cabinet {

    private OpenFrame openFrame;
    private Back backSide;
    private Left leftSide;
    private Right rightSide;
    private Front frontSide;
    private BigDecimal price;

    public Cabinet(OpenFrame openFrame, Back backSide, Left leftSide, Right rightSide, Front frontSide) {
        this.openFrame = openFrame;
        this.backSide = backSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.frontSide = frontSide;
        this.price = setPrice();
    }

    /**
     *
     * @param openFrame
     * @param sides Array with 4 Side elements
     *              [0] -> front
     *              [1] -> right
     *              [2] -> back
     *              [3] -> left
     */
    public Cabinet(OpenFrame openFrame, Side[] sides){
        this.openFrame = openFrame;
        try{
            this.frontSide = (Front) sides[0];
            this.rightSide = (Right) sides[1];
            this.backSide = (Back) sides[2];
            this.leftSide = (Left) sides[3];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cabinet object can not be complited");
            e.printStackTrace();
        }
        this.price = setPrice();
    }

    public OpenFrame getOpenFrame() {
        return openFrame;
    }

    public void setOpenFrame(OpenFrame openFrame) {
        this.openFrame = openFrame;
    }

    public Back getBackSide() {
        return backSide;
    }

    public void setBackSide(Back backSide) {
        this.backSide = backSide;
    }

    public Left getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(Left leftSide) {
        this.leftSide = leftSide;
    }

    public Right getRightSide() {
        return rightSide;
    }

    public void setRightSide(Right rightSide) {
        this.rightSide = rightSide;
    }

    public Front getFrontSide() {
        return frontSide;
    }

    public void setFrontSide(Front frontSide) {
        this.frontSide = frontSide;
    }

    public BigDecimal setPrice() {
        BigDecimal sumPrice;
        sumPrice = openFrame.getPrice().add(backSide.getPart().getPrice());
        sumPrice = sumPrice.add(frontSide.getPart().getPrice());
        sumPrice = sumPrice.add(leftSide.getPart().getPrice());
        sumPrice = sumPrice.add(rightSide.getPart().getPrice());
        sumPrice = sumPrice.setScale(2, RoundingMode.HALF_UP);
        return sumPrice;
    }

    @Override
    public String toString() {
        return openFrame.getName() + price.toPlainString();
    }
}
