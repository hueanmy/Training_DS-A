public class Recursion {
    /*n!*/
    public int f(int n){
        if(n==1) return 1;
        return n*f(n-1);
    }
    int m[][]; //m[k][n] luu ket qua C(k,n)
    public Recursion(){
        m = new int[100][100];
    }
    public void init(){
        for(int i=0;i<100;i++)
            for(int j=0;j<100;j++)
                m[i][j]=-1;
    }
    /*Khong dung de quy co nho*/
    public int C1(int k, int n){
        if(k==0 || k==n) return 1;
        return C(k-1,n-1) + C(k,n-1);
    }

    public int C(int k, int n){
        if(k==0 || k==n){  m[k][n]=1; return m[k][n];}
        if(m[k][n]<0){
            m[k][n] =  C(k-1,n-1) + C(k,n-1);
            return m[k][n];
        }else return m[k][n];
    }
}
