//pantalla de colores para proyección mapeo ADM multi 3

int tam = 200; //tamaño de los rectangulos a proyectar sobre superficie
void setup( ) {
  size(800,600,P3D);
  rectMode(CORNER);
}

void draw( ) {
  background(0);
}

void keyPressed( ) {
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
