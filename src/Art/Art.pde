void setup(){
fullScreen();
noStroke();
  
}
void draw(){
  if(mousePressed){
    fill(random(255),random(255),random(255));
  
}
ellipse(mouseX,mouseY,100,100);
ellipse(width-mouseX,mouseY,100,100);
ellipse(mouseX,height-mouseY,100,100);
ellipse(mouseX,mouseY,100,100);
}