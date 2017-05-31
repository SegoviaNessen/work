int[] bananas = {40,20,12,5,14,74,20,36,54,87,14,52,65,14,3,22,52,10};

void setup( ) {
  size(700,200);

  noLoop();
}

void draw( ) {
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
