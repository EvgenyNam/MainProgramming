int sensorPin = A0;

void setup() {
  Serial.begin(9600); 
  
}


void loop() {
  
  
  float sensorValue = analogRead(sensorPin);
  float voltage = sensorValue*5;
  voltage/=1024.0;
  
  float temperatureC = (voltage-0.5)*100;
  
  Serial.println(temperatureC);
  delay(2000);
  
}
