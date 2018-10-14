public class LietKeNhiPhan {
    int x[];
    int n;
    public LietKeNhiPhan(){

    }

    boolean check(int v, int k){
      if(k==1) return true;
      return v+x[k-1]<2;
    }

    public void solution(){
        for(int i =1; i<=n;i++){
            System.out.printf(x[i]+ "");
        }
        System.out.println();
    }

    public void TRY(int k){
        for(int v=0; v<=1;v++){
            if(check(v,k)){
                x[k]=v;
                if(k==n) solution();
                else{
                    TRY(k+1);
                }
            }
        }
    }

    public void solve(int n) {
        this.n = n;
        x = new int[n+1];
        TRY(1);
    }
}
