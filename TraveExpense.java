/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveexpense;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 *
 * @author Shommow
 */
public class TraveExpense extends Application {
   
    private static   TextField txtdaysTrip;
    private static   TextField txtAirFare ;
    private static   TextField txtCarRental ;
    private static   TextField txtMilesDriven ;
    private static   TextField txtParkingFees;
    private static   TextField txtTaxifees;
    private static   TextField txtRegFees;
    private static  TextField txtNightlodFees;
    
   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      Label  label1 = new Label("Days on the trip: ");
      Label  label2 = new Label("Airfare: "); 
      Label  label3 = new Label("Car Rental: ");
      Label  label4 = new Label("Miles driven: ");
      Label  label5 = new Label("Parking fees: ");
      Label  label6 = new Label("Taxi fees: ");
      Label  label7 = new Label("Registration fees: ");
      Label  label8= new Label("Nightly lodging fees: ");
       Label totalexpense = new Label("Total Expenses: ");
       Label allowexpense = new Label("Allowable Expenses: ");
       Label Exexpenses = new Label("Excess Expenses: ");
       Label savedexpense = new Label("Saved Expenses: ");
       label1.setMinWidth(140);
       label2.setMinWidth(140);
       label3.setMinWidth(140);
       label4.setMinWidth(140);
       label5.setMinWidth(140);
       label6.setMinWidth(140);
       label7.setMinWidth(140);
       label8.setMinWidth(140);
       totalexpense.setMinWidth(140);
       allowexpense.setMinWidth(140);
       Exexpenses.setMinWidth(140);
       savedexpense.setMinWidth(140);
     txtdaysTrip= new TextField();
    txtAirFare = new TextField();
     txtCarRental = new TextField();
    txtMilesDriven = new TextField();
    txtParkingFees = new TextField();
    txtTaxifees = new TextField();
    txtRegFees = new TextField();
    txtNightlodFees = new TextField();
       
       
       RadioButton radio1= new RadioButton("Car Rental");
       RadioButton radio2= new RadioButton("Taxi Using");
       Button button1= new Button("Reset");
       Button button2= new Button("Calculate Expense");
       button1.setOnAction(new ResetButtonHandler());
       button2.setOnAction(new CalculateButtonHandler());
       HBox hbox1 = new HBox(10,label1,txtdaysTrip);
       HBox hbox2 = new HBox(10,label2 ,txtAirFare);
       HBox hbox3 = new HBox(10,label3,txtCarRental);
       HBox hbox4 = new HBox(10,label4,txtMilesDriven);
       HBox hbox5 = new HBox(10,label5,txtParkingFees);
       HBox hbox6 = new HBox(10,label6,txtTaxifees);
       HBox hbox7 = new HBox(10,label7,txtRegFees);
       HBox hbox8 = new HBox(10,label8,txtNightlodFees);
       HBox hbox9 = new HBox(20,radio1,radio2);
       HBox hbox14= new HBox(20,button1,button2);
       hbox9.setAlignment(Pos.CENTER);
       hbox14.setAlignment(Pos.CENTER);
       VBox vbox = new VBox();
       vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox4,hbox5,hbox6,hbox7,
                                 hbox8,totalexpense,allowexpense,Exexpenses,savedexpense,hbox9,hbox14);
       vbox.setSpacing(10);
       vbox.setMinWidth(300);
       vbox.setMinHeight(500);
       Scene scene = new Scene(vbox);
       primaryStage.setScene(scene);
       primaryStage.show();
        
    }

    private static class CalculateButtonHandler implements EventHandler<ActionEvent> {

        public CalculateButtonHandler() {
        }

        @Override
        public void handle(ActionEvent event) {
        final double DAILY_MEAL_RATE = 47.0,
            MAX_PARKING_FEES = 20.0,
            MAX_TAXI = 40.0,
            MAX_LODGING_PER_NIGHT = 195.0,
            MILEAGE_RATE = 0.42;
        
           
            
        }
    }

    private static class ResetButtonHandler implements EventHandler<ActionEvent> {

        public ResetButtonHandler() {
        }

        @Override
        public void handle(ActionEvent event) {
          
            txtdaysTrip.setText("0.00");
            txtAirFare.setText("0.00");
            txtCarRental.setText("0.00"); ;
            txtMilesDriven.setText("0.00"); ;
            txtParkingFees.setText("0.00");
            txtTaxifees.setText("0.00");
            txtRegFees.setText("0.00");
           txtNightlodFees.setText("0.00");
           txtdaysTrip.setText("Trying");
        }
    }
    
}
