/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package minpro;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author MAHESH_07
 */
public class Minpro extends Application {
   static int c=2;
   static int cu1=0;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        StackPane root = new StackPane();
        FileInputStream input = new FileInputStream("C:\\Users\\MAHESH_07\\Pictures\\ima.jpg");
        Image im = new Image(input,600,400,false,true);
        BackgroundImage bImg = new BackgroundImage(im,
                                                   BackgroundRepeat.NO_REPEAT,
                                                   BackgroundRepeat.NO_REPEAT,
                                                   BackgroundPosition.CENTER,
                                                   BackgroundSize.DEFAULT);
        Background bGround = new Background(bImg);
        Label l1 = new Label("JAVAFX");
        l1.setFont(new Font("Times New Roman", 60));
        l1.setTextFill(Color.YELLOW);
        Button b1 = new Button("START");
        b1.setStyle("-fx-border-color: #ff1020; -fx-border-width: 3px;-fx-background-color: #1020ff; -fx-text-fill: #ffffff");

        Label l2 = new Label("ARE YOU");
        Button b2 = new Button("CUSTOMER");       
        Button b3 = new Button("SHOPKEEPER");



        Label l3 = new Label(" ****** MAIMANU ******");
        Button b4 = new Button("ADD THE PRODUCTS");       
        Button b5 = new Button("UPDATE THE PRODUCTS");
        Button b7 = new Button("DISPLAY THE ITEMS WITH QTY AND PRICE");
        Button home=new Button("BACK"); 

        b1.setOnAction((ActionEvent event) -> {          
        l2.setFont(new Font("Times New Roman", 50));
        l2.setTextFill(Color.YELLOW);
        b2.setStyle("-fx-border-color: #ff1020; -fx-border-width: 3px;-fx-background-color: #1020ff; -fx-text-fill: #ffffff");
        b3.setStyle("-fx-border-color: #ff1020; -fx-border-width: 3px;-fx-background-color: #1020ff; -fx-text-fill: #ffffff");
        VBox v1=new VBox(l2,b2,b3);

        v1.setSpacing(10);
        v1.setAlignment(Pos.CENTER);
        StackPane root1 = new StackPane();
        root1.getChildren().add(v1);
        root1.setBackground(bGround);
        Scene scene = new Scene(root1, 600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        });

        b3.setOnAction((ActionEvent event) -> {
            //System.out.println("hello");
        l3.setFont(new Font("Times New Roman", 25));
        l3.setTextFill(Color.WHITE);
        b4.setStyle("-fx-border-color: #ff1020; -fx-border-width: 2px;-fx-background-color: #1020ff; -fx-text-fill: #ffffff");
        b5.setStyle("-fx-border-color: #ff1020; -fx-border-width: 2px;-fx-background-color: #1020ff; -fx-text-fill: #ffffff");

        b7.setStyle("-fx-border-color: #ff1020; -fx-border-width: 2px;-fx-background-color: #1020ff; -fx-text-fill: #ffffff");
        VBox v2=new VBox(l3,b4,b5,b7);
        v2.setSpacing(10);
        v2.setAlignment(Pos.CENTER);
        StackPane root1 = new StackPane();
        root1.getChildren().add(v2);
        root1.setBackground(bGround);
        Scene scene = new Scene(root1, 600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        });

        TableView table = new TableView<Person>();
        TableColumn c1= new TableColumn<Person,Integer>("SINO");
        c1.setCellValueFactory(new PropertyValueFactory<Person,Integer>("sino"));

        TableColumn c2= new TableColumn<Person,String>("PRODUCT_NAME");
        c2.setCellValueFactory(new PropertyValueFactory<Person,String>("productname"));

        TableColumn c3= new TableColumn<Person,Integer>("QTY");
        c3.setCellValueFactory(new PropertyValueFactory<Person,Integer>("qty"));

        TableColumn c4= new TableColumn<Person,Double>("PRICE");
        c4.setCellValueFactory(new PropertyValueFactory<Person,Double>("price"));

        TableColumn c5= new TableColumn<Person,Integer>("AVAILABLE_QTY");
        c5.setCellValueFactory(new PropertyValueFactory<Person,Integer>("availableqty"));
        table.getColumns().add(c1);
        table.getColumns().add(c2);
        table.getColumns().add(c3);
        table.getColumns().add(c4);
        table.getColumns().add(c5);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
  
   String items[]=new String[100];
   items[0]="laptop";
   items[1]="phone";

   int qty[]=new int[100];
   qty[0]=10;
   qty[1]=17;

   double p[]=new double[100];
   p[0]=150000.00;
   p[1]=15000.00;

    String ic[]=new String[100];
    int qc[]=new int[100];
    double pc[]=new double[100];

        int i;
        for(i=0;i<c;i++)
        {
           table.getItems().add(new Person((i+1), items[i],1, (int) p[i],qty[i]));  
        }


            TableView table1 = new TableView<Person1>();
        TableColumn c11= new TableColumn<Person1,Integer>("SINO");
        c11.setCellValueFactory(new PropertyValueFactory<Person1,Integer>("sino"));

        TableColumn c12= new TableColumn<Person1,String>("PRODUCT_NAME");
        c12.setCellValueFactory(new PropertyValueFactory<Person1,String>("productname"));

        TableColumn c13= new TableColumn<Person1,Integer>("QTY");
        c13.setCellValueFactory(new PropertyValueFactory<Person1,Integer>("qty"));

        TableColumn c14= new TableColumn<Person1,Double>("PRICE");
        c14.setCellValueFactory(new PropertyValueFactory<Person1,Double>("price"));       

        table1.getColumns().add(c11);
        table1.getColumns().add(c12);
        table1.getColumns().add(c13);
        table1.getColumns().add(c14);

        table1.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Label cl1 = new Label("ENTER THE SI.NO OF PRODUCT");
            TextField ct1=new TextField(); 
            Label cl2 = new Label("ENTER THE QTY OF THE PRODUCT");
            TextField ct2=new TextField();
            Button cb=new Button("ADD");
            Button cb1=new Button("ORDER");

            b2.setOnAction((ActionEvent event) -> {
            table.getItems().clear();
            int l;
            for(l=0;l<c;l++)
            {
             table.getItems().add(new Person((l+1), items[l],1, (int) p[l],qty[l]));  
            }
             VBox cdv=new VBox(cl1,ct1,cl2,ct2,cb);
             HBox ch=new HBox(table,table1,cdv);
             ch.setSpacing(10);
             ch.setAlignment(Pos.CENTER);
             HBox ch1=new HBox(cb1);
             ch1.setAlignment(Pos.CENTER);
             VBox tov=new VBox(ch,ch1);
            tov.setSpacing(10);
            tov.setAlignment(Pos.CENTER);
            Scene scene = new Scene(tov, 900,900);
            primaryStage.setScene(scene);
            primaryStage.show();
           });

        cb.setOnAction((ActionEvent event) -> {           
            int cq=Integer.parseInt(ct2.getText());
            int cs=Integer.parseInt(ct1.getText());
            int o;
            for(o=0;o<c;o++)
            {
             if(cs-1==o)
             {
              ic[cu1]=items[cs-1];
              pc[cu1]=p[cs-1]*cq;
              qc[cu1]=cq;
              qty[cs-1]=qty[cs-1]-cq;
              cu1++;
             } 
            }
            table.getItems().clear();
            int s;
            for(s=0;s<c;s++)
            {
             table.getItems().add(new Person((s+1), items[s],1, (int) p[s],qty[s]));  
            }
            table1.getItems().clear();
            int t;
            for(t=0;t<cu1;t++)
            {
             table1.getItems().add(new Person1((t+1), ic[t],qc[t], pc[t]));  
            }

        });
            Label customername=new Label("CUSTOMER NAME:");
            TextField cnt=new TextField();
            Label customeradd=new Label("CUSTOMER ADDRESS:");
            TextField cat=new TextField();
            Label customerphone=new Label("CUSTOMER PHONE NO:");
            TextField cpt=new TextField();
            Button co1=new Button("PURCHASE");

            cb1.setOnAction((ActionEvent event) -> {
            VBox cdv=new VBox(customername,cnt,customeradd,cat,customerphone,cpt);
            HBox cdh=new HBox(cdv);
            cdh.setSpacing(10);
            cdh.setAlignment(Pos.CENTER);
            table1.getItems().clear();
            int t;
            for(t=0;t<cu1;t++)
            {
             table1.getItems().add(new Person1((t+1), ic[t],qc[t], pc[t]));  
            }
            HBox tv=new HBox(table1);
            HBox och=new HBox(co1);
            tv.setSpacing(10);
            tv.setAlignment(Pos.CENTER);
            och.setAlignment(Pos.CENTER);
            VBox cdvo=new VBox(cdh,tv,och);
            Scene scene = new Scene(cdvo, 600,400);
            primaryStage.setScene(scene);
            primaryStage.show(); 
        });

            co1.setOnAction((ActionEvent event) -> {
                Label cndo=new Label(cnt.getText());
                Label cado=new Label(cat.getText());
                Label cpdo=new Label(cpt.getText());
                Label compname =new Label("SRI LAKSHMI STORES");

                Label odna=new Label("OWNER NAME    : MAHESHKUMAR M");
                Label odad=new Label("2/38, SOUTH STREET, PERUMALPATTTI");
                Label odph=new Label("9360295163");

                 Label cudetail=new Label("CUSTOMER DETAILS");
                Label owendetail=new Label("OWER DETAILAS");
                HBox dela=new HBox(cudetail,owendetail);
                dela.setSpacing(500);
                dela.setAlignment(Pos.CENTER);
                Label TOTAL=new Label("TOTAL COST :");
                Label than=new Label("THANK YOU!!!");

                double a=0;
                int t;
                for(t=0;t<cu1;t++)
                {
                  a=a+pc[t];
                }
                Label cost =new Label(Double.toString(a));

                TOTAL.setAlignment(Pos.CENTER);
                 TOTAL.setFont(new Font("Times New Roman", 25));
                 TOTAL.setTextFill(Color.GREEN);

                cost.setAlignment(Pos.CENTER);
                 cost.setFont(new Font("Times New Roman", 25));
                 cost.setTextFill(Color.GREEN);

                than.setAlignment(Pos.CENTER);
                 than.setFont(new Font("Times New Roman", 25));
                 than.setTextFill(Color.GREEN);

                 compname.setAlignment(Pos.CENTER);
                 compname.setFont(new Font("Times New Roman", 30));
                 compname.setTextFill(Color.BLUE);
                 HBox tohi=new HBox(TOTAL,cost);
                 tohi.setAlignment(Pos.CENTER);
                VBox cdod=new VBox(cndo,cado,cpdo);
                VBox cdod1=new VBox(odna,odad,odph);
                HBox cdodh=new HBox(cdod,cdod1);
                cdodh.setSpacing(500);
                cdodh.setAlignment(Pos.CENTER);

                VBox tttoi=new VBox(compname,dela,cdodh,table1,tohi,than,home);
                tttoi.setSpacing(20);
                tttoi.setAlignment(Pos.CENTER);
                cu1=0;

                 Scene scene = new Scene(tttoi, 1500,800);
                 primaryStage.setScene(scene);
                 primaryStage.show();

            });

        Button ab=new Button("ADD");
        Label al1 = new Label("ENTER THE NAME OF PRODUCT");
        TextField at1=new TextField(); 
        Label al2 = new Label("ENTER THE QTY OF THE PRODUCT");
        TextField at2=new TextField();
        Label al3 = new Label("ENTER THE PRICE OF THE PRODUCT");
        TextField at3=new TextField();

        b4.setOnAction((ActionEvent event) -> { 
        VBox tv=new VBox(table);
        VBox dv=new VBox(al1,at1,al2,at2,al3,at3,ab,home);
        HBox ah=new HBox(tv,dv);
        ah.setSpacing(10);
        ah.setAlignment(Pos.CENTER);
        Scene scene = new Scene(ah, 1000,1000);
        primaryStage.setScene(scene);
        primaryStage.show();
        });

        ab.setOnAction((ActionEvent event) -> {
            String pro=at1.getText();
            int ap=Integer.parseInt(at3.getText());
            int aq=Integer.parseInt(at2.getText());

            items[c]=pro;
            qty[c]=aq;
            p[c]=ap;
            table.getItems().add(new Person(c+1, pro,1,ap,aq));
            c=c+1;
        });

        Button ub=new Button("UPDATE");
        Label ul1 = new Label("ENTER THE SI.NO OF PRODUCT");
        TextField ut1=new TextField(); 
        Label ul2 = new Label("ENTER THE QTY OF THE PRODUCT");
        TextField ut2=new TextField();
        Label ul3 = new Label("ENTER THE PRICE OF THE PRODUCT");
        TextField ut3=new TextField();

        b5.setOnAction((ActionEvent event) -> { 
        VBox tv=new VBox(table);
        VBox dv=new VBox(ul1,ut1,ul2,ut2,ul3,ut3,ub,home);
        HBox ah=new HBox(tv,dv);
        ah.setSpacing(10);
        ah.setAlignment(Pos.CENTER);
        Scene scene = new Scene(ah, 1000,1000);
        primaryStage.setScene(scene);
        primaryStage.show();    
        });

        ub.setOnAction((ActionEvent event) -> {
            int up=Integer.parseInt(ut3.getText());
            int uq=Integer.parseInt(ut2.getText());
            int us=Integer.parseInt(ut1.getText());
            int k;
            for(k=0;k<c;k++)
            {
             if(us-1==k)
             {
              qty[us-1]=qty[us-1]+uq;
              p[us-1]=p[us-1]+up;
             }          
            }
            table.getItems().clear();
            int j;
            for(j=0;j<c;j++)
            {
             table.getItems().add(new Person((j+1), items[j],1, (int) p[j],qty[j]));  
            }
        });

        b7.setOnAction((ActionEvent event) -> { 
            table.getItems().clear();
            int l;
            for(l=0;l<c;l++)
            {
             table.getItems().add(new Person((l+1), items[l],1, (int) p[l],qty[l]));  
            }
            VBox tv=new VBox(table,home);
            tv.setSpacing(10);
            tv.setAlignment(Pos.CENTER);
            Scene scene = new Scene(tv, 600,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        }); 

        home.setOnAction((ActionEvent event) -> {
            StackPane root1 = new StackPane();
            //Label l1 = new Label("JAVAFX");
        l1.setFont(new Font("Times New Roman", 60));
        l1.setTextFill(Color.YELLOW);
        //Button b1 = new Button("START");
        b1.setStyle("-fx-border-color: #ff1020; -fx-border-width: 3px;-fx-background-color: #1020ff; -fx-text-fill: #ffffff");
            VBox hv=new VBox(l1,b1);
        hv.setSpacing(10);
        hv.setAlignment(Pos.CENTER);

        table1.getItems().clear();
        root1.getChildren().add(hv);
        root1.setBackground(bGround);
        Scene scene = new Scene(root1, 600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        });

        VBox v=new VBox(l1,b1);
        v.setSpacing(10);
        v.setAlignment(Pos.CENTER);
        root.getChildren().add(v);
        root.setBackground(bGround);
        Scene scene = new Scene(root, 600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
