import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class vocalesSonoras extends PApplet {

String letras = "a,e,i,o,u";

String [] vocales;

public void setup( ) {
  vocales = split(letras,",");

  frameRate(12);


}

public void draw( ) {
  for(int i = 0;i < vocales.length; i++){
    if(vocales[i]=="a"){
      background(255,0,0);
    } else if(vocales [i]=="o"){
      background(0,255,0);
    }
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "vocalesSonoras" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
