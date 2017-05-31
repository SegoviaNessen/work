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

public class drawingNumbers extends PApplet {

int[] bananas = {40,20,12,5,14,74,20,36,54,87,14,52,65,14,3,22,52,10};

public void setup( ) {
  size(700,200);

  noLoop();
}

public void draw( ) {
  background(255);
  fill(0);
  stroke(255);
  printArray(bananas);

  for(int i = 0; i<bananas.length; i++){
    int multiplier = 1;
    float rectWidth = width/ (bananas.length) ;
    float ypos = height -(bananas[i]*multiplier);
    rect((rectWidth*i),ypos,rectWidth,ypos);
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "drawingNumbers" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
