package Helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// De hien thi mau chu
public class DataValidator {
    //field la kiem tra +truong duoc truyen vao, sb va errorMassage la thong diep loi duoc truyen vao
    public static  void  ValidateEmpty( JTextField field, StringBuilder sb, String errorMessage){
        if(field.getText().equals("")){ // Kiem tra thong diep vao neu rong thi ....
            sb.append(errorMessage).append("\n"); //bo sung thong diep loi vao sb
            field.setBackground(Color.red);  // Thiet lap mau nen la mau do de cho nguoi dung biet la dang co loi
            field.requestFocus();  // 
        }else{
            field.setBackground(Color.white);  //neu ko co van de gi thi nen mau do
        }
    }
    
    public static  void  ValidateEmpty( JPasswordField field, StringBuilder sb, String errorMessage){
        String password = new String(field.getPassword());
        if(password.equals("")){ 
            sb.append(errorMessage).append("\n"); //bo sung thong diep loi vao sb
            field.setBackground(Color.red);  // Thiet lap mau nen la mau do de cho nguoi dung biet la dang co loi
            field.requestFocus();  // 
        }else{
            field.setBackground(Color.white);  //neu ko co van de gi thi nen mau do
        }
    }
}
