package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    ArrayList<Dice> diceList = new ArrayList<>();
    ArrayList<ImageView> diceViews= new ArrayList<>();
    int score=0;
    int currentScore=0;
    int numRemaining=3;

    Image dice1= new Image("sample/DiceImages/Dice1.png");
    Image dice2= new Image("sample/DiceImages/Dice2.png");
    Image dice3= new Image("sample/DiceImages/Dice3.png");
    Image dice4= new Image("sample/DiceImages/Dice4.png");
    Image dice5= new Image("sample/DiceImages/Dice5.png");
    Image dice6= new Image("sample/DiceImages/Dice6.png");

    Image dice1held= new Image("sample/DiceImages/Dice1Held.png");
    Image dice2held= new Image("sample/DiceImages/Dice2Held.png");
    Image dice3held= new Image("sample/DiceImages/Dice3Held.png");
    Image dice4held= new Image("sample/DiceImages/Dice4Held.png");
    Image dice5held= new Image("sample/DiceImages/Dice5Held.png");
    Image dice6held= new Image("sample/DiceImages/Dice6Held.png");



    @Override
    public void start(Stage primaryStage) throws Exception{

        //initialize the initial dice views that will be displayed
        for (int i=0;i<5;i++){
            diceList.add(new Dice());
            diceViews.add( new ImageView());
            int num=diceList.get(i).getDiceNum();
            if(num==1)
                diceViews.get(i).setImage(dice1);
            else if (num==2)
                diceViews.get(i).setImage(dice2);
            else if (num==3)
                diceViews.get(i).setImage(dice3);
            else if (num==4)
                diceViews.get(i).setImage(dice4);
            else if (num==5)
                diceViews.get(i).setImage(dice5);
            else if (num==6)
                diceViews.get(i).setImage(dice6);
        }

        //Set the click events of each image. to change to either hold or discard
        diceViews.get(0).setOnMouseClicked(event -> {
            boolean diceIsClicked=diceList.get(0).isClicked();
            int num= diceList.get(0).getDiceNum();
            if(diceIsClicked)
            {
                if(num==1){
                    diceViews.get(0).setImage(dice1);
                }
                else if(num==2){
                    diceViews.get(0).setImage(dice2);
                }else if(num==3){
                    diceViews.get(0).setImage(dice3);
                }else if(num==4){
                    diceViews.get(0).setImage(dice4);
                }else if(num==5){
                    diceViews.get(0).setImage(dice5);
                }else if(num==6){
                    diceViews.get(0).setImage(dice6);
                }
            }
            else{
                if(num==1){
                    diceViews.get(0).setImage(dice1held);
                }
                else if(num==2){
                    diceViews.get(0).setImage(dice2held);
                }else if(num==3){
                    diceViews.get(0).setImage(dice3held);
                }else if(num==4){
                    diceViews.get(0).setImage(dice4held);
                }else if(num==5){
                    diceViews.get(0).setImage(dice5held);
                }else if(num==6){
                    diceViews.get(0).setImage(dice6held);
                }
            }
            System.out.println("dice 1  has been clicked");
            diceList.get(0).diceClicked();
        });
        diceViews.get(1).setOnMouseClicked(event -> {
            boolean diceIsClicked=diceList.get(1).isClicked();
            int num= diceList.get(1).getDiceNum();
            if(diceIsClicked)
            {
                if(num==1){
                    diceViews.get(1).setImage(dice1);
                }
                else if(num==2){
                    diceViews.get(1).setImage(dice2);
                }else if(num==3){
                    diceViews.get(1).setImage(dice3);
                }else if(num==4){
                    diceViews.get(1).setImage(dice4);
                }else if(num==5){
                    diceViews.get(1).setImage(dice5);
                }else if(num==6){
                    diceViews.get(1).setImage(dice6);
                }
            }
            else{
                if(num==1){
                    diceViews.get(1).setImage(dice1held);
                }
                else if(num==2){
                    diceViews.get(1).setImage(dice2held);
                }else if(num==3){
                    diceViews.get(1).setImage(dice3held);
                }else if(num==4){
                    diceViews.get(1).setImage(dice4held);
                }else if(num==5){
                    diceViews.get(1).setImage(dice5held);
                }else if(num==6){
                    diceViews.get(1).setImage(dice6held);
                }
            }
            System.out.println("dice 2  has been clicked");
            diceList.get(1).diceClicked();
        });
        diceViews.get(2).setOnMouseClicked(event -> {
            boolean diceIsClicked=diceList.get(2).isClicked();
            int num= diceList.get(2).getDiceNum();
            if(diceIsClicked)
            {
                if(num==1){
                    diceViews.get(2).setImage(dice1);
                }
                else if(num==2){
                    diceViews.get(2).setImage(dice2);
                }else if(num==3){
                    diceViews.get(2).setImage(dice3);
                }else if(num==4){
                    diceViews.get(2).setImage(dice4);
                }else if(num==5){
                    diceViews.get(2).setImage(dice5);
                }else if(num==6){
                    diceViews.get(2).setImage(dice6);
                }
            }
            else{
                if(num==1){
                    diceViews.get(2).setImage(dice1held);
                }
                else if(num==2){
                    diceViews.get(2).setImage(dice2held);
                }else if(num==3){
                    diceViews.get(2).setImage(dice3held);
                }else if(num==4){
                    diceViews.get(2).setImage(dice4held);
                }else if(num==5){
                    diceViews.get(2).setImage(dice5held);
                }else if(num==6){
                    diceViews.get(2).setImage(dice6held);
                }
            }
            System.out.println("dice 3  has been clicked");
            diceList.get(2).diceClicked();
        });
        diceViews.get(3).setOnMouseClicked(event -> {
            boolean diceIsClicked=diceList.get(3).isClicked();
            int num= diceList.get(3).getDiceNum();
            if(diceIsClicked)
            {
                if(num==1){
                    diceViews.get(3).setImage(dice1);
                }
                else if(num==2){
                    diceViews.get(3).setImage(dice2);
                }else if(num==3){
                    diceViews.get(3).setImage(dice3);
                }else if(num==4){
                    diceViews.get(3).setImage(dice4);
                }else if(num==5){
                    diceViews.get(3).setImage(dice5);
                }else if(num==6){
                    diceViews.get(3).setImage(dice6);
                }
            }
            else{
                if(num==1){
                    diceViews.get(3).setImage(dice1held);
                }
                else if(num==2){
                    diceViews.get(3).setImage(dice2held);
                }else if(num==3){
                    diceViews.get(3).setImage(dice3held);
                }else if(num==4){
                    diceViews.get(3).setImage(dice4held);
                }else if(num==5){
                    diceViews.get(3).setImage(dice5held);
                }else if(num==6){
                    diceViews.get(3).setImage(dice6held);
                }
            }
            System.out.println("dice 4  has been clicked");
            diceList.get(3).diceClicked();
        });
        diceViews.get(4).setOnMouseClicked(event -> {
            boolean diceIsClicked=diceList.get(4).isClicked();
            int num= diceList.get(4).getDiceNum();
            if(diceIsClicked)
            {
                if(num==1){
                    diceViews.get(4).setImage(dice1);
                }
                else if(num==2){
                    diceViews.get(4).setImage(dice2);
                }else if(num==3){
                    diceViews.get(4).setImage(dice3);
                }else if(num==4){
                    diceViews.get(4).setImage(dice4);
                }else if(num==5){
                    diceViews.get(4).setImage(dice5);
                }else if(num==6){
                    diceViews.get(4).setImage(dice6);
                }
            }
            else{
                if(num==1){
                    diceViews.get(4).setImage(dice1held);
                }
                else if(num==2){
                    diceViews.get(4).setImage(dice2held);
                }else if(num==3){
                    diceViews.get(4).setImage(dice3held);
                }else if(num==4){
                    diceViews.get(4).setImage(dice4held);
                }else if(num==5){
                    diceViews.get(4).setImage(dice5held);
                }else if(num==6){
                    diceViews.get(4).setImage(dice6held);
                }
            }
            System.out.println("dice 5  has been clicked");
            diceList.get(4).diceClicked();
        });

        //setting th etitle of the game
        primaryStage.setTitle("Dice Game");

        //setting the initial labels
        Label overall = new Label("Overall Score: " +score);
        Label current = new Label("Current Score: "+ currentScore );
        Label remaining = new Label("Remaining Rolls: "+ numRemaining);

        Button rollDiceButton = new Button("Roll Dice");

        //setting all the dice to specific image
        HBox die= new HBox(10,diceViews.get(0),diceViews.get(1),diceViews.get(2),diceViews.get(3),diceViews.get(4));
        die.setAlignment(Pos.CENTER);


        VBox game = new VBox(30,overall,die,rollDiceButton, current,remaining);
        game.setAlignment(Pos.CENTER);


        //roll dice button logic, test to see if at the end of the round or a simple roll
        rollDiceButton.setOnAction(event -> {
            //checking to see if the button is play again
            if(rollDiceButton.getText().equalsIgnoreCase("Play Again")){
                rollDiceButton.setText("Roll Dice");
                numRemaining=3;
                remaining.setText("Remaining Rolls: " + numRemaining);
                diceList.clear();
                //resetting the dice to a random value
                //reupdating all values
                for (int i=0;i<5;i++){
                    diceList.add(new Dice());
                    int num=diceList.get(i).getDiceNum();
                    if(num==1)
                        diceViews.get(i).setImage(dice1);
                    else if (num==2)
                        diceViews.get(i).setImage(dice2);
                    else if (num==3)
                        diceViews.get(i).setImage(dice3);
                    else if (num==4)
                        diceViews.get(i).setImage(dice4);
                    else if (num==5)
                        diceViews.get(i).setImage(dice5);
                    else if (num==6)
                        diceViews.get(i).setImage(dice6);
                }
            }
            //checking all dice to randomize them
            else {
                System.out.println("button clicked");
                for (int i = 0; i < diceList.size(); i++) {
                    Dice currentDice = diceList.get(i);
                    if (!currentDice.isClicked()) {
                        int num = currentDice.rollDice();
                        if (num == 1)
                            diceViews.get(i).setImage(dice1);
                        else if (num == 2)
                            diceViews.get(i).setImage(dice2);
                        else if (num == 3)
                            diceViews.get(i).setImage(dice3);
                        else if (num == 4)
                            diceViews.get(i).setImage(dice4);
                        else if (num == 5)
                            diceViews.get(i).setImage(dice5);
                        else if (num == 6)
                            diceViews.get(i).setImage(dice6);
                    }

                }
                numRemaining--;
                remaining.setText("Remaining Rolls: " + numRemaining);
                //at the end of the game we calculate the score and display what the user got
                if (numRemaining == 0) {
                    currentScore = calcScore();
                    score+=currentScore;
                    overall.setText("Overall Score: " +score);
                    current.setText("Current Score: " + currentScore);
                    rollDiceButton.setText("Play Again");
                    if (currentScore==10){
                        remaining.setText("Five of a Kind");
                    }
                    else if(currentScore==8){
                        remaining.setText("Straight");
                    }
                    else if(currentScore==7){
                        remaining.setText("Four of a Kind");
                    }
                    else if(currentScore==6){
                        remaining.setText("Full House");
                    }
                    else if(currentScore==5){
                        remaining.setText("Three of a kind");
                    }
                    else if(currentScore==4){
                        remaining.setText("Two Pair");
                    }
                    else if(currentScore==1){
                        remaining.setText("Two of a Kind");
                    }
                    else{
                        remaining.setText("No Valid Hand");
                    }

                }
            }
        });


        Scene gameScene= new Scene(game, 1200,500);
        gameScene.getStylesheets().add("/sample/style.css");
        primaryStage.setScene(gameScene);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }

    //calculating the score by counting frequency and then displaying the score
    public  int calcScore(){

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        for(int i=0; i<diceList.size();i++){
            int num=diceList.get(i).getDiceNum();
            if (num== 1){
                one++;
            }
            else if(num==2){
                two++;
            }
            else if(num==3){
                three++;
            }
            else if(num==4){
                four++;
            }
            else if(num==5){
                five++;
            }
            else{
                six++;
            }
        }

        if(one==5||two==5||three==5||four==5||five==5||six==5){
            System.out.println("five of a kind");
            return 10;
        }
        else if((one==1&&two==1&&three==1&&four==1&&five==1)||(two==1&&three==1&&four==1&&five==1&&six==1)){
            System.out.println("Straight");
            return 8;
        }
        else if(one==4||two==4||three==4||four==4||five==4||six==4){
            System.out.println("four of a kind");
            return 7;
        }
        else if((one==3||two==3||three==3||four==3||five==3||six==3)&&(one==2||two==2||three==2||four==2||five==2||six==2)){
            System.out.println("full house");
            return 6;
        }
        else if(one==3||two==3||three==3||four==3||five==3||six==3){
            System.out.println("three of a kind");
            return 5;
        }
        else if((one==2&&two==2)||(one==2&&three==2)||(one==2&&four==2)||(one==2&&five==2)||(one==2&&six==2)||(two==2&&three==2)||(two==2&&four==2)
            ||(two==2&&five==2)||(two==2&&six==2)||(three==2&&four==2)||(three==2&&five==2)||(three==2&&six==2)||(four==2&&five==2)||(four==2&&six==2)||(five==2&& six==2)){
            System.out.println("two pair");
            return 4;
        }
        else if(one==2||two==2||three==2||four==2||five==2||six==2){
            System.out.println("pair");
            return 1;
        }

        return 0;
    }





}