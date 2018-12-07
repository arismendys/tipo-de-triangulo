
//Saber si los puntos forman un triangulo y luego que tipo de triangulo es
public class Triangulo {
    private float a,b,c,d,e;
    public void set (float a, float b,float c){
    this.a= a; this.b=b; this.c=c;
    }
    
//Getter and Setter
    public float getA() {return a;}
    public void setA(float a) {this.a = a;}
    public float getB() {return b;}
    public void setB(float b) {this.b = b;}
    public float getC() {return c;}
    public void setC(float c) {this.c = c;}
    
    public String ftriangulo(Triangulo r){
    String x="",y="";
    if (r.a==0 || r.b==0 || r.c==0){
    System.out.println("Error ninguno de los valores puede ser igual a 0");
    }
    else{
    if((Math.abs(r.a - r.c) < r.b) && (r.b < (r.a + r.c))) {
        x="Si forman un triangulo: ";
     if((r.a==r.b) && (r.a==r.c)) {
         y="Equilatero";
     }
     else{
         if(r.a==r.b || r.b==r.c || r.a==r.c){
             y="Isósceles";
         }else{
             y="Escaleno";
         }
     }
    //Fin Prueba 2
    }
    else{x="No forman un triangulo.";}
    }
    return x+y;
    }

    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangulo (float d, float e){
        this.d = d;
        this.e = e;
    }
    public float distancia(Triangulo p){
         float r=0;
         r=(float)Math.pow((d-p.d),2)+(float)Math.pow((e-p.e),2);
         return (float)Math.round(Math.sqrt(r));
    }
    
}
