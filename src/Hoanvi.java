public class Hoanvi {

    int x[];
    int n;
    boolean m[];
    boolean check(int v, int k){
        return !m[v];
    }

    public Hoanvi(){}

    public void solution(){
        for(int i =1; i<=n;i++){
            System.out.printf(x[i]+ "");
        }
        System.out.println();
    }

    public void TRY(int k){
        for(int v=1; v<=n;v++){
            if(check(v,k)){
                x[k]=v;
                m[v] = true;
                if(k==n) solution();
                else{
                    TRY(k+1);
                }
                m[v] = false; //khoi phuc khi quay lui
            }
        }
    }

    public void solve(int n) {
        this.n = n;
        x = new int[n+1];
        m = new boolean[n+1];
        for(int i = 1; i<n+1;i++){
            m[i]=false;
        }
        TRY(1);
    }
}
