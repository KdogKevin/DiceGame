package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dice {
    private int diceNum;
    private boolean clicked=false;



    public Dice(){
        rollDice();
    }

    public int rollDice(){
       diceNum=(int)( Math.random()*6)+1;

       return diceNum;
    }

    public boolean isClicked(){
        return clicked;
    }

    public void diceClicked(){
        clicked=!clicked;
    }

    public int getDiceNum(){
        return diceNum;
    }




}
