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

public class colorScreen extends PApplet {

//pantalla de colores para proyecci\u00f3n mapeo ADM multi 3

int tam = 200; //tama\u00f1o de los rectangulos a proyectar sobre superficie
public void setup( ) {
  size(800,600,P3D);
  rectMode(CORNER);
}

public void draw( ) {
  background(0);
}

public void keyPressed( ) {
  if(key == 'a'){
    fill(255,0,0);
    rect(0,0,tam,tam);
  } else if(key == 'b'){
    fill(0,255,0);
    rect(tam,0,tam,tam);
  } else if(key == 'c'){
    fill(0,0,255);
    rect(tam*2,0,tam,tam);
  } else if(key == 'd'){
    fill(255,255,0);
    rect(tam+(tam*2),0,tam,tam);
  } else if(key == 'e'){
    fill(0,255,255);
    rect(0,tam,tam,tam);
  } else if(key == 'f'){
    fill(255,255,255);
    rect(tam,tam,tam,tam);
  } else if(key == 'g'){
    fill(255,125,0);
    rect(tam*2,tam,tam,tam);
  } else if(key == 'h'){
    fill(255,255,125);
    rect(tam+(tam*2),tam,tam,tam);
  } else if(key == 'i'){
    fill(125,255,125);
    rect(0,tam*2,tam,tam);
  } else if(key == 'j'){
    fill(125,125,125);
    rect(tam,tam*2,tam,tam);
  } else if(key == 'k'){
    fill(50,255,100);
    rect(tam*2,tam*2,tam,tam);
  } else if(key == 'l'){
    fill(100,40,255);
    rect(tam+(tam*2),tam*2,tam,tam);
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "colorScreen" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
