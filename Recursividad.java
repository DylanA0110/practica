
public class Recursividad 
{
    private int f, n;
    
    public Recursividad(int f){this.f = f;}
    
    public void setF(int f){this.f = f;}
    
    public int getF(){return f;}
    
    public int factorialR(int f)
    {
        if(f ==1)
            return 1;
        
        
        return f * factorialR(f -= 1);
    }
    
    public int fibonacciR(int n)
    {
        if (n<2)
            return n;
        
        else
            return (fibonacciR(n-1) + fibonacciR(n-2));
    }
    
}
