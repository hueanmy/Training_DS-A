public class NghiemNguyenDuong {
    int x[];
    int n;
    int m;
    int t;
    public NghiemNguyenDuong(){
    }

    boolean check(int v, int k){
        if(k==n){
            return t+v == m;
        }
        return true;
    }

    public void solution(){
        for(int i =1; i<=n;i++){
            System.out.printf(x[i]+ "");
        }
        System.out.println();
    }

    public void TRY(int k){
        for(int v=1; v<=m-n-t+k;v++){
            if(check(v,k)){
                x[k]=v;
                t = t+x[k]; //cap nhat gia tang
                if(k==n) solution();
                else{
                    TRY(k+1);
                }
                t=t-x[k]; //khoi phuc trang thai khi quay lui
            }
        }
    }

    public void solve(int n, int m) {
        this.n = n;
        this.m = m;
        x = new int[n+1];
        TRY(1);
    }
}
