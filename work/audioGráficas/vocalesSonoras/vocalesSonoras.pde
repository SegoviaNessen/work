//skecth en proceso


String letras = "a,e,i,o,u";

String [] vocales;

void setup( ) {
  vocales = split(letras,",");

  frameRate(12);


}

void draw( ) {
  for(int i = 0;i < vocales.length; i++){
    if(vocales[i]=="a"){
      background(255,0,0);
    } else if(vocales [i]=="o"){
      background(0,255,0);
    }
  }
}
