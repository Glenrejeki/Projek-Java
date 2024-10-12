package hitung;
package.swing.*;
import java.awt.event.*;

import javax.swing.JFrame;

JFrame frame ; // tempat utama utuk menyimpan tombol, panel, dan bidak teks yang akan ditambahkan
JTextField texfield;// tempat untuk menampilkan angka atau hasil operasi akan ditambahkan 
JButton [] numberButtons = new JButton[10]; // membuat tombol dari angka 0-9
JButton[] fuctionButtons = new JButton[8]; //membuat tombol operasi matematika
JButton addButton, subButton, mulButton, divButton;
JButton decButton, eqButton, delButton, clrButton;
JPanel panel;

Font myFont = new Font ("Ink Free", Font.Bold, 25);

double num1=0, num2=0, result = 0; // variabel pertama dan kedua untuk menyimpan angka pertama dan kedua yang akan dioperasikan
char operator ; // untuk menyimpan operator matematika yang dipilih pengguna

public class Calculator implements ActionListener { // suoaya muncul tombol
  Calculator (){
    frame = new JFrame("Calculator"); // Judul jendela kalkulatornya
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,550 ); // ukuran kalkulator lebar dan tinggi
    frame.setLayout(null); 
  }
 public static void main(String[] args) {

  Calculator calc = new Calculator() ;

 }

 @Override // impelementasi dari ActionListener 
 public void actionPerformed(ActionEvent e){ // meyimpan info apa yang telah di klik

 }


}
