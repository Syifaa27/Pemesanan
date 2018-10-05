/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package format.pemesanan.menu1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Button Button1;
    @FXML
    private Button Button2;
    @FXML
    private Button Button3;
    @FXML
    private Button Button4;
    @FXML
    private Button Button5;
    @FXML
    private Button Button6;
    @FXML
    private Button Button7;
    @FXML
    private Button Button8;
    @FXML
    private Button Button9;
    @FXML
    private Button Button10;
    @FXML
    private Button Button11;
    @FXML
    private Button Button12;
    private Object radio1;
    private Object radio2;
    private Object radio3;
    private Object radio4;
    private Object radio5;
    private Object radio6;
   
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Nama(ActionEvent event) {
    }

    @FXML
    private void Meja(ActionEvent event) {
    }

    @FXML
    private void Menu(ActionEvent event) {
    }

    @FXML
    private void Jumlah(ActionEvent event) {
    }

    @FXML
    private void Bayar(ActionEvent event) {
    }

    @FXML
    private void Kembalian(ActionEvent event) {
    }

    @FXML
    private void Nasi(ActionEvent event) {
    }

    @FXML
    private void Mie(ActionEvent event) {
    }

    @FXML
    private void CapJY(ActionEvent event) {
    }

    @FXML
    private void Pizza(ActionEvent event) {
    }

    @FXML
    private void Teh(ActionEvent event) {
    }

    @FXML
    private void Jeruk(ActionEvent event) {
    }
      int jumlah;
int Jumlah, bayar, kembalian, noMeja, harga;
String menu1, menu2, menu3, menu4,menu5,menu6;
String namaPemesan;
    String menu="";
   
    @FXML
    private void CetakPemesan(ActionEvent event) {
       
        namaPemesan = inAn.getText();
        
        namaPemesan.setText("Nama Pemesanan: " + namaPemesan + "\n" + "No Meja : " + noMeja+"\n"+"Pilih menu :" + menu +"\n" +"Jumlah Pesanan :  " + Jumlah + "\n" + "Jumlah Uang yang Dibayar : Rp. "
                + bayar + "\n" + "Uang Kembali : Rp. " + kembalian);
        
    }
    @FXML
    private void Hitung(ActionEvent event) {
        if(radio1.isSelected()){     
            harga = 10000;
            menu += radio1.getText()+", ";
            Jumlah=Integer.parseInt(Button4.getText());
            bayar=harga*Jumlah;
            System.out.println(bayar);
        }
        if(radio2.isSelected()){     
            harga = 12000;
            menu += radio2.getText()+", ";
            Jumlah=Integer.parseInt(Button5.getText());
            bayar=harga*Jumlah;
            System.out.println(bayar);
        }
        if(radio3.isSelected()){     
            harga = 15000;
            menu += radio3.getText()+", ";
            Jumlah=Integer.parseInt(Jumlah.getText());
            bayar=harga*Jumlah;
            System.out.println(Bayar);
        }
        if(radio4.isSelected()){     
            harga = 15000;
            menu += radio4.getText()+", ";
            Jumlah=Integer.parseInt(Jumlah.getText());
            bayar=harga*Jumlah;
            System.out.println(bayar);
        }
        if(radio5.isSelected()){     
            harga = 30000;
            menu += radio5.getText()+", ";
            Jumlah=Integer.parseInt(jumlah5.getText());
            bayar=harga*Jumlah;
            System.out.println(bayar);
        }
        if(radio6.isSelected()){     
            harga = 5000;
            menu += radio6.getText()+", ";
            Jumlah=Integer.parseInt(Jumlah.getText());
            bayar=harga*Jumlah;
            System.out.println(bayar);
        }
    }
    }


   
    
