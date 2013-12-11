/*
  Evgeny Nam 2013
  Simple direction detection
 */

int first;
float start;
float current;
// the setup routine runs once when you press reset:
void setup() {
  first = 0;
  // initialize serial communication at 9600 bits per second:
  Serial.begin(9600);
}

// the loop routine runs over and over again forever:
void loop() {  
  // read the input on analog pin 0:
  int sensorValueLeft = analogRead(A5);
  int sensorValueRight = analogRead(A4);
  // print out the value you read:
  
  
  if(sensorValueLeft>630) {   
    if (first==0) {
      Serial.println("Left");
      first = 1;
      start = millis();
    }
    else {
      if (first == 2) {
        current = millis();
        Serial.println(current - start);
        first = 0;
        delay(3000);
      }
    }
    
  }
  if(sensorValueRight>630) {    
   if (first==0) {
     Serial.println("Right");
      first = 2;
      start = millis();
    }
    else {
      if (first == 1) {
        current = millis();
        Serial.println(current - start); 
        first = 0;
        delay(3000);
      }
    }
  }
  
  
  //delay(1);        // delay in between reads for stability
}
