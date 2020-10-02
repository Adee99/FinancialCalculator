package PP2_CW1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import static javafx.scene.paint.Color.*;

public class Main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Financial Calculator");
        primaryStage.setResizable(false);

        // setting up background images

        Image img = new Image("file:img1.jpg");
        ImageView imgview = new ImageView();
        imgview.setImage(img);

        Image img1 = new Image("file:img2.jpg");
        ImageView imgview1 = new ImageView();
        imgview1.setImage(img1);

        Label wlc = new Label("FINANCIAL CALCULATOR");

        //initializing buttons for new Windows

        Button MC = new Button("Mortgage Calculator");
        Button FC = new Button("Finance Calculator");
        Button ALC = new Button("Auto Loan Calculator");
        Button SV = new Button("Savings Calculator");

        //initializing buttons for keyboard

        Button ky1 = new Button("1");
        Button ky2 = new Button("2");
        Button ky3 = new Button("3");
        Button ky4 = new Button("4");
        Button ky5 = new Button("5");
        Button ky6 = new Button("6");
        Button ky7 = new Button("7");
        Button ky8 = new Button("8");
        Button ky9 = new Button("9");
        Button ky0 = new Button("0");
        Button kydec = new Button(".");
        Button kydel = new Button("del");

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        Button help = new Button("Help");
        Button calcFC = new Button("Calculate");
        Button calcMC = new Button("Calculate");
        Button calcALC = new Button("Calculate");
        Button calcSV = new Button("Calculate");


        Pane stg1 = new Pane();

// setting background image
        stg1.getChildren().add(imgview);

        // Help Button
        stg1.getChildren().add(help);
        help.setLayoutX(50);
        help.setLayoutY(480);
        help.setTextFill(BLACK);
        help.getStylesheets().add("style01.css");


        // adding functions to help button

        help.setOnAction(event -> {
            Stage mWindow = (Stage) help.getScene().getWindow();
            mWindow.close();

            Pane helpstg = new Pane();

//creating help view window
            Stage helpStage = new Stage();
            helpStage.setTitle("Help");
            helpStage.setResizable(false);

            //Store background image

            helpstg.getChildren().add(imgview1);

            //help view window

            Label lbhlp1 = new Label("Mortgage Calculator ");
            Label lbhlp2 = new Label("Mortgage Calculator helps you to estimate your monthly\nmortgage payment. You can simply enter property" +
                    " value, \nDown payment, Loan term(in years) and calculate the \nmonthly pay." );

            Label lbhlp3 = new Label("AutoLoan Calculator ");
            Label lbhlp4 = new Label("AutoLoan Calculator helps you to estimate your monthly\npayment. You can simply enter "+
                    "Auto Price, Loan \nTerms, Interest rate and calculate the \nmonthly pay.");

            Label lbhlp5 = new Label("Finance Calculator");
            Label lbhlp6 = new Label("Finance Calculator helps you to estimate your future\nvalue. You have to enter Start Principal, Interest rate" +
                    "\nTime in Years to calculate the future value. ");

            Label lbhlp7 = new Label("Savings Calculator");
            Label lbhlp8 = new Label("Savings Calculator helps you to find future value.\nYou have to enter time in years, interest rate and\n" +
                    "annuity pay.");



            helpstg.getChildren().add(lbhlp1);
            lbhlp1.setLayoutX(12);
            lbhlp1.setLayoutY(16);
            lbhlp1.setFont(Font.font(24));
            lbhlp1.setTextFill(BLACK);


            helpstg.getChildren().add(lbhlp2);
            lbhlp2.setLayoutX(16);
            lbhlp2.setLayoutY(50);

            helpstg.getChildren().add(lbhlp3);
            lbhlp3.setLayoutX(16);
            lbhlp3.setLayoutY(144);
            lbhlp3.setFont(Font.font(24));
            lbhlp3.setTextFill(BLACK);

            helpstg.getChildren().add(lbhlp4);
            lbhlp4.setLayoutX(16);
            lbhlp4.setLayoutY(180);

            helpstg.getChildren().add(lbhlp5);
            lbhlp5.setLayoutX(12);
            lbhlp5.setLayoutY(270);
            lbhlp5.setFont(Font.font(24));
            lbhlp5.setTextFill(BLACK);

            helpstg.getChildren().add(lbhlp6);
            lbhlp6.setLayoutX(16);
            lbhlp6.setLayoutY(310);

            helpstg.getChildren().add(lbhlp7);
            lbhlp7.setLayoutX(12);
            lbhlp7.setLayoutY(390);
            lbhlp7.setFont(Font.font(24));
            lbhlp7.setTextFill(BLACK);

            helpstg.getChildren().add(lbhlp8);
            lbhlp8.setLayoutX(16);
            lbhlp8.setLayoutY(430);



            helpstg.getChildren().add(back);
            back.setLayoutX(300);
            back.setLayoutY(560);
            back.getStylesheets().add("style01.css");


            helpStage.setScene(new Scene(helpstg, 400, 600));
            helpStage.show();


        });

        //exit Button
        stg1.getChildren().add(exit);
        exit.setLayoutX(300);
        exit.setLayoutY(480);
        exit.setTextFill(BLACK);
        exit.getStylesheets().add("style01.css");

        //adding functions to exit button
        exit.setOnAction(event -> {
            Stage mWindow = (Stage) exit.getScene().getWindow();
            mWindow.close();

        });

        // App Title

        stg1.getChildren().add(wlc);
        wlc.setLayoutX(24);
        wlc.setLayoutY(50);
        wlc.setTextFill(web("#C5F4CA"));
        wlc.setFont(Font.font("Verdana", FontWeight.valueOf("BOLD"),26));


        primaryStage.setScene(new Scene(stg1, 400, 600));
        primaryStage.show();

        // Mortgage Calculator

        stg1.getChildren().add(MC);
        MC.setLayoutX(120);
        MC.setLayoutY(310);
        MC.setTextFill(BLACK);
        MC.getStylesheets().add("style01.css");
        MC.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Stage mWindow = (Stage) MC.getScene().getWindow();
                mWindow.close();

                Stage mortgageStage = new Stage();
                mortgageStage.setTitle("Mortgage Calculator");
                mortgageStage.setResizable(false);

                Pane MCstg = new Pane();

//initializing keyboard functions to text field VALUE

                Label lbMC1 = new Label("Property Value ");
                TextField tfValueMC = new TextField();
                tfValueMC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                    ky1.setOnAction(event110 -> {
                        String n = tfValueMC.getText();
                        n = n + "1";
                        tfValueMC.setText(n);
                    });
                    ky2.setOnAction(event110 -> {
                        String n = tfValueMC.getText();
                        n = n + "2";
                        tfValueMC.setText(n);
                    });

                    ky3.setOnAction(event110 -> {
                        String n = tfValueMC.getText();
                        n = n + "3";
                        tfValueMC.setText(n);
                    });

                    ky4.setOnAction(event110 -> {
                        String num = tfValueMC.getText();
                        num = num + "4";
                        tfValueMC.setText(num);
                    });

                    ky5.setOnAction(event110 -> {
                        String num1 = tfValueMC.getText();
                        num1 = num1 + "5";
                        tfValueMC.setText(num1);
                    });

                    ky6.setOnAction(event110 -> {
                        String num = tfValueMC.getText();
                        num = num + "6";
                        tfValueMC.setText(num);
                    });

                    ky7.setOnAction(event110 -> {
                        String num = tfValueMC.getText();
                        num = num + "7";
                        tfValueMC.setText(num);
                    });

                    ky8.setOnAction(event110 -> {
                        String num = tfValueMC.getText();
                        num = num + "8";
                        tfValueMC.setText(num);
                    });

                    ky9.setOnAction(event110 -> {
                        String num = tfValueMC.getText();
                        num = num + "9";
                        tfValueMC.setText(num);
                    });                                                            

                    kydec.setOnAction(event110 -> {
                        String num = tfValueMC.getText();
                        num = num + ".";
                        tfValueMC.setText(num);
                    });

                    kydel.setOnAction(event110 -> {
                        String delt= "";
                        tfValueMC.setText(delt);
                    });

                    ky0.setOnAction(event110 -> {
                        String num = tfValueMC.getText();
                        num = num + "0";
                        tfValueMC.setText(num);
                    });

                });

                //initializing keyboard functions to text field DOWN PAYMENT

                Label lbMC2 = new Label("Down Payment ");
                TextField tfDownPayMC = new TextField();
                tfDownPayMC.focusedProperty().addListener((observable, oldValue, newValue) -> {

                    ky1.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "1";
                        tfDownPayMC.setText(num);
                    });
                    ky2.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "2";
                        tfDownPayMC.setText(num);
                    });

                    ky3.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "3";
                        tfDownPayMC.setText(num);
                    });

                    ky4.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "4";
                        tfDownPayMC.setText(num);
                    });

                    ky5.setOnAction(event111 -> {
                        String num1 = tfDownPayMC.getText();
                        num1 = num1 + "5";
                        tfDownPayMC.setText(num1);
                    });

                    ky6.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "6";
                        tfDownPayMC.setText(num);
                    });

                    ky7.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "7";
                        tfDownPayMC.setText(num);
                    });

                    ky8.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "8";
                        tfDownPayMC.setText(num);
                    });

                    ky9.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "9";
                        tfDownPayMC.setText(num);
                    });

                    kydec.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + ".";
                        tfDownPayMC.setText(num);
                    });

                    ky0.setOnAction(event111 -> {
                        String num = tfDownPayMC.getText();
                        num = num + "0";
                        tfDownPayMC.setText(num);

                            });
                    //adding functions to delete button in keyboard

                    kydel.setOnAction(event111 -> {
                        String delt = "";
                        tfDownPayMC.setText(delt);

                    });
                });

                //initializing keyboard functions to text field LOAN TERM

                Label lbMC3 = new Label("Loan Term\n(In years)");
                TextField tfTermLoanMC = new TextField();
                tfTermLoanMC.focusedProperty().addListener((observable, oldValue, newValue) -> {

                    ky1.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "1";
                        tfTermLoanMC.setText(num);
                    });
                    ky2.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "2";
                        tfTermLoanMC.setText(num);
                    });

                    ky3.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "3";
                        tfTermLoanMC.setText(num);
                    });

                    ky4.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "4";
                        tfTermLoanMC.setText(num);
                    });

                    ky5.setOnAction(event112 -> {
                        String num1 = tfTermLoanMC.getText();
                        num1 = num1 + "5";
                        tfTermLoanMC.setText(num1);
                    });

                    ky6.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "6";
                        tfTermLoanMC.setText(num);
                    });

                    ky7.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "7";
                        tfTermLoanMC.setText(num);
                    });

                    ky8.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "8";
                        tfTermLoanMC.setText(num);
                    });

                    ky9.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "9";
                        tfTermLoanMC.setText(num);
                    });

                    kydec.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + ".";
                        tfTermLoanMC.setText(num);
                    });

                    ky0.setOnAction(event112 -> {
                        String num = tfTermLoanMC.getText();
                        num = num + "0";
                        tfTermLoanMC.setText(num);

                    });
                    //adding functions to delete button in keyboard

                    kydel.setOnAction(event112 -> {
                        String delt = "";
                        tfTermLoanMC.setText(delt);

                    });
                });

                //initializing keyboard functions to text field INTEREST RATE

                Label lbMC4 = new Label("Interest Rate");
                TextField tfIntRateMC = new TextField();
                tfIntRateMC.focusedProperty().addListener((observable, oldValue, newValue) -> {

                    ky1.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "1";
                        tfIntRateMC.setText(num);
                    });
                    ky2.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "2";
                        tfIntRateMC.setText(num);
                    });

                    ky3.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "3";
                        tfIntRateMC.setText(num);
                    });

                    ky4.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "4";
                        tfIntRateMC.setText(num);
                    });

                    ky5.setOnAction(event113 -> {
                        String num1 = tfIntRateMC.getText();
                        num1 = num1 + "5";
                        tfIntRateMC.setText(num1);
                    });

                    ky6.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "6";
                        tfIntRateMC.setText(num);
                    });

                    ky7.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "7";
                        tfIntRateMC.setText(num);
                    });

                    ky8.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "8";
                        tfIntRateMC.setText(num);
                    });

                    ky9.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "9";
                        tfIntRateMC.setText(num);
                    });

                    kydec.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + ".";
                        tfIntRateMC.setText(num);
                    });

                    ky0.setOnAction(event113 -> {
                        String num = tfIntRateMC.getText();
                        num = num + "0";
                        tfIntRateMC.setText(num);

                    });
                    //adding functions to delete button in keyboard

                    kydel.setOnAction(event113 -> {
                        String delt = "";
                        tfIntRateMC.setText(delt);

                    });
                });

                //initializing keyboard functions to text field MONTHLY PAY

                Label lbMC5 = new Label("Monthly Pay");
                TextField tfMonthPayMC = new TextField();


                //Store background image

                MCstg.getChildren().add(imgview1);

                //Textfields and Labels

                MCstg.getChildren().add(lbMC1);
                lbMC1.setLayoutX(12);
                lbMC1.setLayoutY(52);
                lbMC1.setTextFill(BLACK);

                MCstg.getChildren().add(lbMC2);
                lbMC2.setLayoutX(12);
                lbMC2.setLayoutY(102);
                lbMC2.setTextFill(BLACK);

                MCstg.getChildren().add(lbMC3);
                lbMC3.setLayoutX(12);
                lbMC3.setLayoutY(146);
                lbMC3.setTextFill(BLACK);

                MCstg.getChildren().add(lbMC4);
                lbMC4.setLayoutX(12);
                lbMC4.setLayoutY(204);
                lbMC4.setTextFill(BLACK);

                MCstg.getChildren().add(lbMC5);
                lbMC5.setLayoutX(12);
                lbMC5.setLayoutY(302);
                lbMC5.setTextFill(BLACK);


                MCstg.getChildren().add(tfValueMC);
                tfValueMC.setLayoutX(118);
                tfValueMC.setLayoutY(50);

                MCstg.getChildren().add(tfDownPayMC);
                tfDownPayMC.setLayoutX(118);
                tfDownPayMC.setLayoutY(100);
                

                MCstg.getChildren().add(tfTermLoanMC);
                tfTermLoanMC.setLayoutX(118);
                tfTermLoanMC.setLayoutY(150);
                

                MCstg.getChildren().add(tfIntRateMC);
                tfIntRateMC.setLayoutX(118);
                tfIntRateMC.setLayoutY(200);
               

                MCstg.getChildren().add(tfMonthPayMC);
                tfMonthPayMC.setLayoutX(118);
                tfMonthPayMC.setLayoutY(300);

                
                // Keyboard for mortgage calculator

                MCstg.getChildren().add(ky1);
                ky1.setLayoutX(120);
                ky1.setLayoutY(360);

                MCstg.getChildren().add(ky2);
                ky2.setLayoutX(170);
                ky2.setLayoutY(360);

                MCstg.getChildren().add(ky3);
                ky3.setLayoutX(220);
                ky3.setLayoutY(360);

                MCstg.getChildren().add(ky4);
                ky4.setLayoutX(270);
                ky4.setLayoutY(360);

                MCstg.getChildren().add(ky5);
                ky5.setLayoutX(120);
                ky5.setLayoutY(410);

                MCstg.getChildren().add(ky6);
                ky6.setLayoutX(170);
                ky6.setLayoutY(410);

                MCstg.getChildren().add(ky7);
                ky7.setLayoutX(220);
                ky7.setLayoutY(410);

                MCstg.getChildren().add(ky8);
                ky8.setLayoutX(270);
                ky8.setLayoutY(410);

                MCstg.getChildren().add(ky9);
                ky9.setLayoutX(120);
                ky9.setLayoutY(460);

                MCstg.getChildren().add(ky0);
                ky0.setLayoutX(170);
                ky0.setLayoutY(460);

                MCstg.getChildren().add(kydec);
                kydec.setLayoutX(220);
                kydec.setLayoutY(460);

                MCstg.getChildren().add(kydel);
                kydel.setLayoutX(270);
                kydel.setLayoutY(460);


                // Back button

                MCstg.getChildren().add(back);
                back.setLayoutX(320);
                back.setLayoutY(540);
                back.getStylesheets().add("style01.css");

                MCstg.getChildren().add(calcMC);
                calcMC.setLayoutX(100);
                calcMC.setLayoutY(250);
                calcMC.getStylesheets().add("style01.css");

                //calculations for mortgage calculator

                calcMC.setOnAction(event114 -> {
                    try {
                        double proprtyValue = Double.parseDouble(tfValueMC.getText());
                        double downPayment = Double.parseDouble(tfDownPayMC.getText());
                        double loanterm = Double.parseDouble(tfTermLoanMC.getText());
                        double intRate = Double.parseDouble(tfIntRateMC.getText());

                        double valueNxtDown = proprtyValue - downPayment;

                        double t = 12 * loanterm;
                        double d = intRate / 12.0 / 100.0;
                        double monthlyPay = valueNxtDown * d * Math.pow(1 + d, t) / (Math.pow(1 + d, t) - 1);
                        tfMonthPayMC.setText( "$" + Math.round(monthlyPay * 100.0) / 100.0 );
                    } catch (Exception error){
                        System.out.println("");

                        kydel.setOnAction(event1141 -> {
                            String delt = "";
                            tfMonthPayMC.setText(delt);

                        });
                    }
                });


                mortgageStage.setScene(new Scene(MCstg, 400, 600));
                mortgageStage.show();
            }
                    } );


        // Savings Calculator

        stg1.getChildren().add(SV);
        SV.setLayoutX(120);
        SV.setLayoutY(230);
        SV.setTextFill(BLACK);
        SV.getStylesheets().add("style01.css");
        SV.setOnAction(event -> {
            Stage mWindow = (Stage) SV.getScene().getWindow();
            mWindow.close();

            Stage savingsStage = new Stage();
            savingsStage.setTitle("Savings Calculator");
            savingsStage.setResizable(false);

            Pane SVstg = new Pane();

            Label lbSV1 = new Label("Time in Years ");
            TextField tfNumPeriodSV = new TextField();

            //initializing keyboard functions to text field for  "No. of periods"

            tfNumPeriodSV.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event130 -> {
                    String n = tfNumPeriodSV.getText();
                    n = n + "1";
                    tfNumPeriodSV.setText(n);
                });
                ky2.setOnAction(event130 -> {
                    String n = tfNumPeriodSV.getText();
                    n = n + "2";
                    tfNumPeriodSV.setText(n);
                });

                ky3.setOnAction(event130 -> {
                    String n = tfNumPeriodSV.getText();
                    n = n + "3";
                    tfNumPeriodSV.setText(n);
                });

                ky4.setOnAction(event130 -> {
                    String num = tfNumPeriodSV.getText();
                    num = num + "4";
                    tfNumPeriodSV.setText(num);
                });

                ky5.setOnAction(event130 -> {
                    String num1 = tfNumPeriodSV.getText();
                    num1 = num1 + "5";
                    tfNumPeriodSV.setText(num1);
                });

                ky6.setOnAction(event130 -> {
                    String num = tfNumPeriodSV.getText();
                    num = num + "6";
                    tfNumPeriodSV.setText(num);
                });

                ky7.setOnAction(event130 -> {
                    String num = tfNumPeriodSV.getText();
                    num = num + "7";
                    tfNumPeriodSV.setText(num);
                });

                ky8.setOnAction(event130 -> {
                    String num = tfNumPeriodSV.getText();
                    num = num + "8";
                    tfNumPeriodSV.setText(num);
                });

                ky9.setOnAction(event130 -> {
                    String num = tfNumPeriodSV.getText();
                    num = num + "9";
                    tfNumPeriodSV.setText(num);
                });

                kydec.setOnAction(event130 -> {
                    String num = tfNumPeriodSV.getText();
                    num = num + ".";
                    tfNumPeriodSV.setText(num);
                });

                kydel.setOnAction(event130 -> {
                    String delt= "";
                    tfNumPeriodSV.setText(delt);
                });

                ky0.setOnAction(event130 -> {
                    String num = tfNumPeriodSV.getText();
                    num = num + "0";
                    tfNumPeriodSV.setText(num);
                });

            });


            Label lbSV3 = new Label("Interest Rate");
            TextField tfIntRateSV = new TextField();


            //initializing keyboard functions to text field INTEREST RATE

            tfIntRateSV.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event132 -> {
                    String n = tfIntRateSV.getText();
                    n = n + "1";
                    tfIntRateSV.setText(n);
                });
                ky2.setOnAction(event132 -> {
                    String n = tfIntRateSV.getText();
                    n = n + "2";
                    tfIntRateSV.setText(n);
                });

                ky3.setOnAction(event132 -> {
                    String n = tfIntRateSV.getText();
                    n = n + "3";
                    tfIntRateSV.setText(n);
                });

                ky4.setOnAction(event132 -> {
                    String num = tfIntRateSV.getText();
                    num = num + "4";
                    tfIntRateSV.setText(num);
                });

                ky5.setOnAction(event132 -> {
                    String num1 = tfIntRateSV.getText();
                    num1 = num1 + "5";
                    tfIntRateSV.setText(num1);
                });

                ky6.setOnAction(event132 -> {
                    String num = tfIntRateSV.getText();
                    num = num + "6";
                    tfIntRateSV.setText(num);
                });

                ky7.setOnAction(event132 -> {
                    String num = tfIntRateSV.getText();
                    num = num + "7";
                    tfIntRateSV.setText(num);
                });

                ky8.setOnAction(event132 -> {
                    String num = tfIntRateSV.getText();
                    num = num + "8";
                    tfIntRateSV.setText(num);
                });

                ky9.setOnAction(event132 -> {
                    String num = tfIntRateSV.getText();
                    num = num + "9";
                    tfIntRateSV.setText(num);
                });

                kydec.setOnAction(event132 -> {
                    String num = tfIntRateSV.getText();
                    num = num + ".";
                    tfIntRateSV.setText(num);
                });

                kydel.setOnAction(event132 -> {
                    String delt= "";
                    tfIntRateSV.setText(delt);
                });

                ky0.setOnAction(event132 -> {
                    String num = tfIntRateSV.getText();
                    num = num + "0";
                    tfIntRateSV.setText(num);
                });

            });

            Label lbSV4 = new Label("Annuity\npayment");
            TextField tfAnnuPaySV = new TextField();

            //initializing keyboard functions to text field for ANNUITY PAYMENT

            tfAnnuPaySV.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event133 -> {
                    String n = tfAnnuPaySV.getText();
                    n = n + "1";
                    tfAnnuPaySV.setText(n);
                });
                ky2.setOnAction(event133 -> {
                    String n = tfAnnuPaySV.getText();
                    n = n + "2";
                    tfAnnuPaySV.setText(n);
                });

                ky3.setOnAction(event133 -> {
                    String n = tfAnnuPaySV.getText();
                    n = n + "3";
                    tfAnnuPaySV.setText(n);
                });

                ky4.setOnAction(event133 -> {
                    String num = tfAnnuPaySV.getText();
                    num = num + "4";
                    tfAnnuPaySV.setText(num);
                });

                ky5.setOnAction(event133 -> {
                    String num1 = tfAnnuPaySV.getText();
                    num1 = num1 + "5";
                    tfAnnuPaySV.setText(num1);
                });

                ky6.setOnAction(event133 -> {
                    String num = tfAnnuPaySV.getText();
                    num = num + "6";
                    tfAnnuPaySV.setText(num);
                });

                ky7.setOnAction(event133 -> {
                    String num = tfAnnuPaySV.getText();
                    num = num + "7";
                    tfAnnuPaySV.setText(num);
                });

                ky8.setOnAction(event133 -> {
                    String num = tfAnnuPaySV.getText();
                    num = num + "8";
                    tfAnnuPaySV.setText(num);
                });

                ky9.setOnAction(event133 -> {
                    String num = tfAnnuPaySV.getText();
                    num = num + "9";
                    tfAnnuPaySV.setText(num);
                });

                kydec.setOnAction(event133 -> {
                    String num = tfAnnuPaySV.getText();
                    num = num + ".";
                    tfAnnuPaySV.setText(num);
                });

                kydel.setOnAction(event133 -> {
                    String delt= "";
                    tfAnnuPaySV.setText(delt);
                });

                ky0.setOnAction(event133 -> {
                    String num = tfAnnuPaySV.getText();
                    num = num + "0";
                    tfAnnuPaySV.setText(num);
                });


            });



            Label lbSV5 = new Label("Future Value");
            TextField tfValueFutureSV = new TextField();

            //initializing keyboard functions to text field for Future Value

            tfValueFutureSV.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event134 -> {
                    String n = tfValueFutureSV.getText();
                    n = n + "1";
                    tfValueFutureSV.setText(n);
                });
                ky2.setOnAction(event134 -> {
                    String n = tfValueFutureSV.getText();
                    n = n + "2";
                    tfValueFutureSV.setText(n);
                });

                ky3.setOnAction(event134 -> {
                    String n = tfValueFutureSV.getText();
                    n = n + "3";
                    tfValueFutureSV.setText(n);
                });

                ky4.setOnAction(event134 -> {
                    String num = tfValueFutureSV.getText();
                    num = num + "4";
                    tfValueFutureSV.setText(num);
                });

                ky5.setOnAction(event134 -> {
                    String num1 = tfValueFutureSV.getText();
                    num1 = num1 + "5";
                    tfValueFutureSV.setText(num1);
                });

                ky6.setOnAction(event134 -> {
                    String num = tfValueFutureSV.getText();
                    num = num + "6";
                    tfValueFutureSV.setText(num);
                });

                ky7.setOnAction(event134 -> {
                    String num = tfValueFutureSV.getText();
                    num = num + "7";
                    tfValueFutureSV.setText(num);
                });

                ky8.setOnAction(event134 -> {
                    String num = tfValueFutureSV.getText();
                    num = num + "8";
                    tfValueFutureSV.setText(num);
                });

                ky9.setOnAction(event134 -> {
                    String num = tfValueFutureSV.getText();
                    num = num + "9";
                    tfValueFutureSV.setText(num);
                });

                kydec.setOnAction(event134 -> {
                    String num = tfValueFutureSV.getText();
                    num = num + ".";
                    tfValueFutureSV.setText(num);
                });

                kydel.setOnAction(event134 -> {
                    String delt= "";
                    tfValueFutureSV.setText(delt);
                });

                ky0.setOnAction(event134 -> {
                    String num = tfValueFutureSV.getText();
                    num = num + "0";
                    tfValueFutureSV.setText(num);
                });

            });

            //Store background image

            SVstg.getChildren().add(imgview1);

            //Textfields and Labels

            SVstg.getChildren().add(lbSV1);
            lbSV1.setLayoutX(12);
            lbSV1.setLayoutY(54);


            SVstg.getChildren().add(lbSV3);
            lbSV3.setLayoutX(12);
            lbSV3.setLayoutY(102);

            SVstg.getChildren().add(lbSV4);
            lbSV4.setLayoutX(12);
            lbSV4.setLayoutY(148);

            SVstg.getChildren().add(lbSV5);
            lbSV5.setLayoutX(12);
            lbSV5.setLayoutY(204);




            SVstg.getChildren().add(tfNumPeriodSV);
            tfNumPeriodSV.setLayoutX(135);
            tfNumPeriodSV.setLayoutY(55);

            SVstg.getChildren().add(tfIntRateSV);
            tfIntRateSV.setLayoutX(135);
            tfIntRateSV.setLayoutY(100);

            SVstg.getChildren().add(tfAnnuPaySV);
            tfAnnuPaySV.setLayoutX(135);
            tfAnnuPaySV.setLayoutY(150);

            SVstg.getChildren().add(tfValueFutureSV);
            tfValueFutureSV.setLayoutX(135);
            tfValueFutureSV.setLayoutY(200);



            // Keyboard for savings calculator

            SVstg.getChildren().add(ky1);
            ky1.setLayoutX(120);
            ky1.setLayoutY(260);

            SVstg.getChildren().add(ky2);
            ky2.setLayoutX(170);
            ky2.setLayoutY(260);

            SVstg.getChildren().add(ky3);
            ky3.setLayoutX(220);
            ky3.setLayoutY(260);

            SVstg.getChildren().add(ky4);
            ky4.setLayoutX(270);
            ky4.setLayoutY(260);

            SVstg.getChildren().add(ky5);
            ky5.setLayoutX(120);
            ky5.setLayoutY(310);

            SVstg.getChildren().add(ky6);
            ky6.setLayoutX(170);
            ky6.setLayoutY(310);

            SVstg.getChildren().add(ky7);
            ky7.setLayoutX(220);
            ky7.setLayoutY(310);

            SVstg.getChildren().add(ky8);
            ky8.setLayoutX(270);
            ky8.setLayoutY(310);

            SVstg.getChildren().add(ky9);
            ky9.setLayoutX(120);
            ky9.setLayoutY(360);

            SVstg.getChildren().add(ky0);
            ky0.setLayoutX(170);
            ky0.setLayoutY(360);

            SVstg.getChildren().add(kydec);
            kydec.setLayoutX(220);
            kydec.setLayoutY(360);

            SVstg.getChildren().add(kydel);
            kydel.setLayoutX(270);
            kydel.setLayoutY(360);


            // Back button

            SVstg.getChildren().add(back);
            back.setLayoutX(250);
            back.setLayoutY(460);
            back.getStylesheets().add("style01.css");

            SVstg.getChildren().add(calcSV);
            calcSV.setLayoutX(135);
            calcSV.setLayoutY(460);
            calcSV.getStylesheets().add("style01.css");

            //calculations for savings calculator

            calcSV.setOnAction(event136 -> {
                try{
              double intRate = Double.parseDouble(tfIntRateSV.getText());
              double annutPay = Double.parseDouble(tfAnnuPaySV.getText());
              double numYrs = Double.parseDouble(tfNumPeriodSV.getText());

              double part1 = Math.pow((1+(intRate/100)/12),12*numYrs)-1;
              double part2 = ((intRate/100)/12);

              double futureVal = Math.round(annutPay*(part1/part2)*100.0)/100.0;
              tfValueFutureSV.setText("$"+Math.round(futureVal*100.0)/100.0);

            }catch (Exception error){
                    System.out.println("");

                }
            });

            savingsStage.setScene(new Scene(SVstg, 400, 600));
            savingsStage.show();
        });


        // Finance Calculator

        stg1.getChildren().add(FC);
        FC.setLayoutX(120);
        FC.setLayoutY(150);
        FC.setTextFill(BLACK);
        FC.getStylesheets().add("style01.css");
        FC.setOnAction(event -> {
            Stage mWindow = (Stage) FC.getScene().getWindow();
            mWindow.close();

            Stage financeStage = new Stage();
            financeStage.setTitle("Finance Calculator");
            financeStage.setResizable(false);

            Pane FCstg = new Pane();

            Label lbFC1 = new Label("Start Principal");
            TextField tfStartValueFC = new TextField();

            //initializing keyboard functions to text field for Start Principal

            tfStartValueFC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event137 -> {
                    String n = tfStartValueFC.getText();
                    n = n + "1";
                    tfStartValueFC.setText(n);
                });
                ky2.setOnAction(event137 -> {
                    String n = tfStartValueFC.getText();
                    n = n + "2";
                    tfStartValueFC.setText(n);
                });

                ky3.setOnAction(event137 -> {
                    String n = tfStartValueFC.getText();
                    n = n + "3";
                    tfStartValueFC.setText(n);
                });

                ky4.setOnAction(event137 -> {
                    String num = tfStartValueFC.getText();
                    num = num + "4";
                    tfStartValueFC.setText(num);
                });

                ky5.setOnAction(event137 -> {
                    String num1 = tfStartValueFC.getText();
                    num1 = num1 + "5";
                    tfStartValueFC.setText(num1);
                });

                ky6.setOnAction(event137 -> {
                    String num = tfStartValueFC.getText();
                    num = num + "6";
                    tfStartValueFC.setText(num);
                });

                ky7.setOnAction(event137 -> {
                    String num = tfStartValueFC.getText();
                    num = num + "7";
                    tfStartValueFC.setText(num);
                });

                ky8.setOnAction(event137 -> {
                    String num = tfStartValueFC.getText();
                    num = num + "8";
                    tfStartValueFC.setText(num);
                });

                ky9.setOnAction(event137 -> {
                    String num = tfStartValueFC.getText();
                    num = num + "9";
                    tfStartValueFC.setText(num);
                });

                kydec.setOnAction(event137 -> {
                    String num = tfStartValueFC.getText();
                    num = num + ".";
                    tfStartValueFC.setText(num);
                });

                kydel.setOnAction(event137 -> {
                    String delt= "";
                    tfStartValueFC.setText(delt);
                });

                ky0.setOnAction(event137 -> {
                    String num = tfStartValueFC.getText();
                    num = num + "0";
                    tfStartValueFC.setText(num);
                });

            });


            Label lbFC2 = new Label("Interest Rate");
            TextField tfIntRateFC = new TextField();

            //initializing keyboard functions to text field for Interest Rate

            tfIntRateFC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event19 -> {
                    String n = tfIntRateFC.getText();
                    n = n + "1";
                    tfIntRateFC.setText(n);
                });
                ky2.setOnAction(event18 -> {
                    String n = tfIntRateFC.getText();
                    n = n + "2";
                    tfIntRateFC.setText(n);
                });

                ky3.setOnAction(event17 -> {
                    String n = tfIntRateFC.getText();
                    n = n + "3";
                    tfIntRateFC.setText(n);
                });

                ky4.setOnAction(event16 -> {
                    String num = tfIntRateFC.getText();
                    num = num + "4";
                    tfIntRateFC.setText(num);
                });

                ky5.setOnAction(event15 -> {
                    String num1 = tfIntRateFC.getText();
                    num1 = num1 + "5";
                    tfIntRateFC.setText(num1);
                });

                ky6.setOnAction(event14 -> {
                    String num = tfIntRateFC.getText();
                    num = num + "6";
                    tfIntRateFC.setText(num);
                });

                ky7.setOnAction(event13 -> {
                    String num = tfIntRateFC.getText();
                    num = num + "7";
                    tfIntRateFC.setText(num);
                });

                ky8.setOnAction(event1 -> {
                    String num = tfIntRateFC.getText();
                    num = num + "8";
                    tfIntRateFC.setText(num);
                });

                ky9.setOnAction(event12 -> {
                    String num = tfIntRateFC.getText();
                    num = num + "9";
                    tfIntRateFC.setText(num);
                });

                kydec.setOnAction(event138 -> {
                    String num = tfIntRateFC.getText();
                    num = num + ".";
                    tfIntRateFC.setText(num);
                });

                kydel.setOnAction(event138 -> {
                    String delt= "";
                    tfIntRateFC.setText(delt);
                });

                ky0.setOnAction(event138 -> {
                    String num = tfIntRateFC.getText();
                    num = num + "0";
                    tfIntRateFC.setText(num);
                });

            });


            Label lbFC3 = new Label("Time(In years)");
            TextField tfNumPeriodsFC = new TextField();

            //initializing keyboard functions to text field for Time

            tfNumPeriodsFC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event139 -> {
                    String n = tfNumPeriodsFC.getText();
                    n = n + "1";
                    tfNumPeriodsFC.setText(n);
                });
                ky2.setOnAction(event139 -> {
                    String n = tfNumPeriodsFC.getText();
                    n = n + "2";
                    tfNumPeriodsFC.setText(n);
                });

                ky3.setOnAction(event139 -> {
                    String n = tfNumPeriodsFC.getText();
                    n = n + "3";
                    tfNumPeriodsFC.setText(n);
                });

                ky4.setOnAction(event139 -> {
                    String num = tfNumPeriodsFC.getText();
                    num = num + "4";
                    tfNumPeriodsFC.setText(num);
                });

                ky5.setOnAction(event139 -> {
                    String num1 = tfNumPeriodsFC.getText();
                    num1 = num1 + "5";
                    tfNumPeriodsFC.setText(num1);
                });

                ky6.setOnAction(event139 -> {
                    String num = tfNumPeriodsFC.getText();
                    num = num + "6";
                    tfNumPeriodsFC.setText(num);
                });

                ky7.setOnAction(event139 -> {
                    String num = tfNumPeriodsFC.getText();
                    num = num + "7";
                    tfNumPeriodsFC.setText(num);
                });

                ky8.setOnAction(event139 -> {
                    String num = tfNumPeriodsFC.getText();
                    num = num + "8";
                    tfNumPeriodsFC.setText(num);
                });

                ky9.setOnAction(event139 -> {
                    String num = tfNumPeriodsFC.getText();
                    num = num + "9";
                    tfNumPeriodsFC.setText(num);
                });

                kydec.setOnAction(event139 -> {
                    String num = tfNumPeriodsFC.getText();
                    num = num + ".";
                    tfNumPeriodsFC.setText(num);
                });

                kydel.setOnAction(event139 -> {
                    String delt= "";
                    tfNumPeriodsFC.setText(delt);
                });

                ky0.setOnAction(event139 -> {
                    String num = tfNumPeriodsFC.getText();
                    num = num + "0";
                    tfNumPeriodsFC.setText(num);
                });

            });


            Label lbFC6 = new Label("Future Value");
            TextField tfValueFutureFC = new TextField();

            //initializing keyboard functions to text field for FUTURE VALUE

            tfValueFutureFC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event140 -> {
                    String n = tfValueFutureFC.getText();
                    n = n + "1";
                    tfValueFutureFC.setText(n);
                });
                ky2.setOnAction(event140 -> {
                    String n = tfValueFutureFC.getText();
                    n = n + "2";
                    tfValueFutureFC.setText(n);
                });

                ky3.setOnAction(event140 -> {
                    String n = tfValueFutureFC.getText();
                    n = n + "3";
                    tfValueFutureFC.setText(n);
                });

                ky4.setOnAction(event140 -> {
                    String num = tfValueFutureFC.getText();
                    num = num + "4";
                    tfValueFutureFC.setText(num);
                });

                ky5.setOnAction(event140 -> {
                    String num1 = tfValueFutureFC.getText();
                    num1 = num1 + "5";
                    tfValueFutureFC.setText(num1);
                });

                ky6.setOnAction(event140 -> {
                    String num = tfValueFutureFC.getText();
                    num = num + "6";
                    tfValueFutureFC.setText(num);
                });

                ky7.setOnAction(event140 -> {
                    String num = tfValueFutureFC.getText();
                    num = num + "7";
                    tfValueFutureFC.setText(num);
                });

                ky8.setOnAction(event140 -> {
                    String num = tfValueFutureFC.getText();
                    num = num + "8";
                    tfValueFutureFC.setText(num);
                });

                ky9.setOnAction(event140 -> {
                    String num = tfValueFutureFC.getText();
                    num = num + "9";
                    tfValueFutureFC.setText(num);
                });

                kydec.setOnAction(event140 -> {
                    String num = tfValueFutureFC.getText();
                    num = num + ".";
                    tfValueFutureFC.setText(num);
                });

                kydel.setOnAction(event140 -> {
                    String delt= "";
                    tfValueFutureFC.setText(delt);
                });

                ky0.setOnAction(event140 -> {
                    String num = tfValueFutureFC.getText();
                    num = num + "0";
                    tfValueFutureFC.setText(num);
                });

            });

            //calculations for FINANCE Calculator

            calcFC.setOnAction(event141 -> {
                try {

                    double startPrincipal = Double.parseDouble(tfStartValueFC.getText());
                    double interestRate = Double.parseDouble(tfIntRateFC.getText());
                    double numYears = Double.parseDouble(tfNumPeriodsFC.getText());

                    double comInterest = startPrincipal * Math.pow((1 + interestRate / 100), numYears);
                    tfValueFutureFC.setText("$ " +String.valueOf(Math.round(comInterest * 100.0) / 100.0));
                }catch(Exception error){
                    System.out.println("");
                }
            });

            //Store background image

            FCstg.getChildren().add(imgview1);

            //Textfields and Labels

            FCstg.getChildren().add(lbFC1);
            lbFC1.setLayoutX(12);
            lbFC1.setLayoutY(52);

            FCstg.getChildren().add(lbFC2);
            lbFC2.setLayoutX(12);
            lbFC2.setLayoutY(102);

            FCstg.getChildren().add(lbFC3);
            lbFC3.setLayoutX(12);
            lbFC3.setLayoutY(154);


            FCstg.getChildren().add(lbFC6);
            lbFC6.setLayoutX(12);
            lbFC6.setLayoutY(248);

            FCstg.getChildren().add(tfStartValueFC);
            tfStartValueFC.setLayoutX(118);
            tfStartValueFC.setLayoutY(50);

            FCstg.getChildren().add(tfIntRateFC);
            tfIntRateFC.setLayoutX(118);
            tfIntRateFC.setLayoutY(100);


            FCstg.getChildren().add(tfNumPeriodsFC);
            tfNumPeriodsFC.setLayoutX(118);
            tfNumPeriodsFC.setLayoutY(150);

            FCstg.getChildren().add(tfValueFutureFC);
            tfValueFutureFC.setLayoutX(118);
            tfValueFutureFC.setLayoutY(250);

            // Keyboard for Finance Calculator

            FCstg.getChildren().add(ky1);
            ky1.setLayoutX(120);
            ky1.setLayoutY(360);

            FCstg.getChildren().add(ky2);
            ky2.setLayoutX(170);
            ky2.setLayoutY(360);

            FCstg.getChildren().add(ky3);
            ky3.setLayoutX(220);
            ky3.setLayoutY(360);

            FCstg.getChildren().add(ky4);
            ky4.setLayoutX(270);
            ky4.setLayoutY(360);

            FCstg.getChildren().add(ky5);
            ky5.setLayoutX(120);
            ky5.setLayoutY(410);

            FCstg.getChildren().add(ky6);
            ky6.setLayoutX(170);
            ky6.setLayoutY(410);

            FCstg.getChildren().add(ky7);
            ky7.setLayoutX(220);
            ky7.setLayoutY(410);

            FCstg.getChildren().add(ky8);
            ky8.setLayoutX(270);
            ky8.setLayoutY(410);

            FCstg.getChildren().add(ky9);
            ky9.setLayoutX(120);
            ky9.setLayoutY(460);

            FCstg.getChildren().add(ky0);
            ky0.setLayoutX(170);
            ky0.setLayoutY(460);

            FCstg.getChildren().add(kydec);
            kydec.setLayoutX(220);
            kydec.setLayoutY(460);

            FCstg.getChildren().add(kydel);
            kydel.setLayoutX(270);
            kydel.setLayoutY(460);



            // Back button

            FCstg.getChildren().add(back);
            back.setLayoutX(320);
            back.setLayoutY(540);
            back.getStylesheets().add("style01.css");

            FCstg.getChildren().add(calcFC);
            calcFC.setLayoutX(100);
            calcFC.setLayoutY(200);
            calcFC.getStylesheets().add("style01.css");


            financeStage.setScene(new Scene(FCstg, 400, 600));
            financeStage.show();
        });


        //    Auto loan Calculator

        stg1.getChildren().add(ALC);
        ALC.setLayoutX(120);
        ALC.setLayoutY(390);
        ALC.setTextFill(BLACK);
        ALC.getStylesheets().add("style01.css");
        ALC.setOnAction(event -> {
            Stage mWindow = (Stage) ALC.getScene().getWindow();
            mWindow.close();

            Stage autoloanStage = new Stage();
            autoloanStage.setTitle("Auto Loan Calculator");
            autoloanStage.setResizable(false);

            Pane ALCstg = new Pane();

            Label lbALC1 = new Label("Auto Price ");
            TextField tfPriceALC = new TextField();

            //initializing keyboard functions to text field FOR AUTO PRICE

            tfPriceALC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event115 -> {
                    String n = tfPriceALC.getText();
                    n = n + "1";
                    tfPriceALC.setText(n);
                });
                ky2.setOnAction(event115 -> {
                    String n = tfPriceALC.getText();
                    n = n + "2";
                    tfPriceALC.setText(n);
                });

                ky3.setOnAction(event115 -> {
                    String n = tfPriceALC.getText();
                    n = n + "3";
                    tfPriceALC.setText(n);
                });

                ky4.setOnAction(event115 -> {
                    String num = tfPriceALC.getText();
                    num = num + "4";
                    tfPriceALC.setText(num);
                });

                ky5.setOnAction(event115 -> {
                    String num1 = tfPriceALC.getText();
                    num1 = num1 + "5";
                    tfPriceALC.setText(num1);
                });

                ky6.setOnAction(event115 -> {
                    String num = tfPriceALC.getText();
                    num = num + "6";
                    tfPriceALC.setText(num);
                });

                ky7.setOnAction(event115 -> {
                    String num = tfPriceALC.getText();
                    num = num + "7";
                    tfPriceALC.setText(num);
                });

                ky8.setOnAction(event115 -> {
                    String num = tfPriceALC.getText();
                    num = num + "8";
                    tfPriceALC.setText(num);
                });

                ky9.setOnAction(event115 -> {
                    String num = tfPriceALC.getText();
                    num = num + "9";
                    tfPriceALC.setText(num);
                });

                kydec.setOnAction(event115 -> {
                    String num = tfPriceALC.getText();
                    num = num + ".";
                    tfPriceALC.setText(num);
                });

                kydel.setOnAction(event115 -> {
                    String delt= "";
                    tfPriceALC.setText(delt);
                });

                ky0.setOnAction(event115 -> {
                    String num = tfPriceALC.getText();
                    num = num + "0";
                    tfPriceALC.setText(num);
                });

            });

            Label lbALC2 = new Label("Loan Term\n(In Years)");
            TextField tfLoanTermALC = new TextField();

            //initializing keyboard functions to text field for LOAN TERM

            tfLoanTermALC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event116 -> {
                    String n = tfLoanTermALC.getText();
                    n = n + "1";
                    tfLoanTermALC.setText(n);
                });
                ky2.setOnAction(event116 -> {
                    String n = tfLoanTermALC.getText();
                    n = n + "2";
                    tfLoanTermALC.setText(n);
                });

                ky3.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + "3";
                    tfLoanTermALC.setText(num);
                });

                ky4.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + "4";
                    tfLoanTermALC.setText(num);
                });

                ky5.setOnAction(event116 -> {
                    String num1 = tfLoanTermALC.getText();
                    num1 = num1 + "5";
                    tfLoanTermALC.setText(num1);
                });

                ky6.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + "6";
                    tfLoanTermALC.setText(num);
                });

                ky7.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + "7";
                    tfLoanTermALC.setText(num);
                });

                ky8.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + "8";
                    tfLoanTermALC.setText(num);
                });

                ky9.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + "9";
                    tfLoanTermALC.setText(num);
                });

                kydec.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + ".";
                    tfLoanTermALC.setText(num);
                });

                kydel.setOnAction(event116 -> {
                    String delt= "";
                    tfLoanTermALC.setText(delt);
                });

                ky0.setOnAction(event116 -> {
                    String num = tfLoanTermALC.getText();
                    num = num + "0";
                    tfLoanTermALC.setText(num);
                });

            });

            Label lbALC3 = new Label("Interest Rate");
            TextField tfIntRateALC = new TextField();

            //initializing keyboard functions to text field for INTEREST RATE

            tfIntRateALC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "1";
                    tfIntRateALC.setText(num);
                });
                ky2.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "2";
                    tfIntRateALC.setText(num);
                });

                ky3.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "3";
                    tfIntRateALC.setText(num);
                });

                ky4.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "4";
                    tfIntRateALC.setText(num);
                });

                ky5.setOnAction(event117 -> {
                    String num1 = tfIntRateALC.getText();
                    num1 = num1 + "5";
                    tfIntRateALC.setText(num1);
                });

                ky6.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "6";
                    tfIntRateALC.setText(num);
                });

                ky7.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "7";
                    tfIntRateALC.setText(num);
                });

                ky8.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "8";
                    tfIntRateALC.setText(num);
                });

                ky9.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "9";
                    tfIntRateALC.setText(num);
                });

                kydec.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + ".";
                    tfIntRateALC.setText(num);
                });

                kydel.setOnAction(event117 -> {
                    String delt= "";
                    tfIntRateALC.setText(delt);
                });

                ky0.setOnAction(event117 -> {
                    String num = tfIntRateALC.getText();
                    num = num + "0";
                    tfIntRateALC.setText(num);
                });

            });

            Label lbALC4 = new Label("Down Payment");
            TextField tfDownPayALC = new TextField();


            //initializing keyboard functions to text field for DOWN PAYMENT

            tfDownPayALC.focusedProperty().addListener((observable, oldValue, newValue) -> {


                ky1.setOnAction(event142 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "1";
                    tfDownPayALC.setText(num);
                });
                ky2.setOnAction(event118 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "2";
                    tfDownPayALC.setText(num);
                });

                ky3.setOnAction(event119 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "3";
                    tfDownPayALC.setText(num);
                });

                ky4.setOnAction(event120 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "4";
                    tfDownPayALC.setText(num);
                });

                ky5.setOnAction(event121 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "5";
                    tfDownPayALC.setText(num);
                });

                ky6.setOnAction(event122 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "6";
                    tfDownPayALC.setText(num);
                });

                ky7.setOnAction(event123 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "7";
                    tfDownPayALC.setText(num);
                });

                ky8.setOnAction(event124 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "8";
                    tfDownPayALC.setText(num);
                });

                ky9.setOnAction(event125 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "9";
                    tfDownPayALC.setText(num);
                });

                kydec.setOnAction(event126 -> {
                    String num = tfDownPayALC.getText();
                    num = num + ".";
                    tfDownPayALC.setText(num);
                });

                kydel.setOnAction(event127 -> {
                    String delt= "";
                    tfDownPayALC.setText(delt);
                });

                ky0.setOnAction(event128 -> {
                    String num = tfDownPayALC.getText();
                    num = num + "0";
                    tfDownPayALC.setText(num);
                });

            });

            Label lbALC5 = new Label("Monthly Pay");
            TextField tfMonthlyPayALC = new TextField();

            //Store background image

            ALCstg.getChildren().add(imgview1);

            //Textfields and Labels

            ALCstg.getChildren().add(lbALC1);
            lbALC1.setLayoutX(12);
            lbALC1.setLayoutY(52);
            lbALC1.setTextFill(BLACK);


            ALCstg.getChildren().add(lbALC2);
            lbALC2.setLayoutX(12);
            lbALC2.setLayoutY(102);
            lbALC2.setTextFill(BLACK);

            ALCstg.getChildren().add(lbALC3);
            lbALC3.setLayoutX(12);
            lbALC3.setLayoutY(156);
            lbALC3.setTextFill(BLACK);

            ALCstg.getChildren().add(lbALC4);
            lbALC4.setLayoutX(12);
            lbALC4.setLayoutY(204);
            lbALC4.setTextFill(BLACK);

            ALCstg.getChildren().add(lbALC5);
            lbALC5.setLayoutX(12);
            lbALC5.setLayoutY(302);
            lbALC5.setTextFill(BLACK);

            ALCstg.getChildren().add(tfPriceALC);
            tfPriceALC.setLayoutX(118);
            tfPriceALC.setLayoutY(50);


            ALCstg.getChildren().add(tfLoanTermALC);
            tfLoanTermALC.setLayoutX(118);
            tfLoanTermALC.setLayoutY(100);

            ALCstg.getChildren().add(tfIntRateALC);
            tfIntRateALC.setLayoutX(118);
            tfIntRateALC.setLayoutY(150);

            ALCstg.getChildren().add(tfDownPayALC);
            tfDownPayALC.setLayoutX(118);
            tfDownPayALC.setLayoutY(200);

            ALCstg.getChildren().add(tfMonthlyPayALC);
            tfMonthlyPayALC.setLayoutX(118);
            tfMonthlyPayALC.setLayoutY(300);


            // Keyboard for Auto loan calculator

            ALCstg.getChildren().add(ky1);
            ky1.setLayoutX(120);
            ky1.setLayoutY(360);

            ALCstg.getChildren().add(ky2);
            ky2.setLayoutX(170);
            ky2.setLayoutY(360);

            ALCstg.getChildren().add(ky3);
            ky3.setLayoutX(220);
            ky3.setLayoutY(360);

            ALCstg.getChildren().add(ky4);
            ky4.setLayoutX(270);
            ky4.setLayoutY(360);

            ALCstg.getChildren().add(ky5);
            ky5.setLayoutX(120);
            ky5.setLayoutY(410);

            ALCstg.getChildren().add(ky6);
            ky6.setLayoutX(170);
            ky6.setLayoutY(410);

            ALCstg.getChildren().add(ky7);
            ky7.setLayoutX(220);
            ky7.setLayoutY(410);

            ALCstg.getChildren().add(ky8);
            ky8.setLayoutX(270);
            ky8.setLayoutY(410);

            ALCstg.getChildren().add(ky9);
            ky9.setLayoutX(120);
            ky9.setLayoutY(460);

            ALCstg.getChildren().add(ky0);
            ky0.setLayoutX(170);
            ky0.setLayoutY(460);

            ALCstg.getChildren().add(kydec);
            kydec.setLayoutX(220);
            kydec.setLayoutY(460);

            ALCstg.getChildren().add(kydel);
            kydel.setLayoutX(270);
            kydel.setLayoutY(460);



            // Back & calculate buttons

            ALCstg.getChildren().add(back);
            back.setLayoutX(320);
            back.setLayoutY(540);
            back.getStylesheets().add("style01.css");

            ALCstg.getChildren().add(calcALC);
            calcALC.setLayoutX(100);
            calcALC.setLayoutY(250);
            calcALC.getStylesheets().add("style01.css");

            //calculations for auto loan calculator

            calcALC.setOnAction(event129 -> {
                try {
                    double autoValue = Double.parseDouble(tfPriceALC.getText());
                    double downPayment = Double.parseDouble(tfDownPayALC.getText());
                    double loanterm = Double.parseDouble(tfLoanTermALC.getText());
                    double intRate = Double.parseDouble(tfIntRateALC.getText());
                    double valueNxtDown = autoValue - downPayment;

                    double t = (loanterm * 12.0);
                    double d = intRate / 12.0 / 100.0;
                    double monthlyPay = valueNxtDown * d * Math.pow(1 + d, t) / (Math.pow(1 + d, t) - 1);
                    tfMonthlyPayALC.setText(Math.round(monthlyPay * 100.0) / 100.0 + "$");

                } catch (Exception error) {
                    System.out.println("");

                    kydel.setOnAction(event1291 -> {
                        String delt = "";
                        tfMonthlyPayALC.setText(delt);
                    });
                }
            });


            autoloanStage.setScene(new Scene(ALCstg, 400, 600));
            autoloanStage.show();
        });

        // Back button
        back.setOnAction(event -> {
            Stage sWindow = (Stage)back.getScene().getWindow();
            primaryStage.show();
            sWindow.close();
        });

    }
}

