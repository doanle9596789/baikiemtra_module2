public class hinhthang {
    double canhdaynho;
    double canhdaylon;
    double chieucao;
    double canhben1;
    double canhben2;
    public hinhthang(double canhdaylon,double canhdaynho,double chieucao, double canhben1,double canhben2){
        this.canhdaylon=canhdaylon;
        this.canhdaynho=canhdaynho;
        this.chieucao=chieucao;
        this.canhben1=canhben1;
        this.canhben2=canhben2;
    }

    public double getCanhdaylon() {
        return canhdaylon;
    }
    public double getCanhdaynho() {
        return canhdaynho;
    }
    public double getChieucao() {
        return chieucao;
    }
    public double getCanhben1() {
        return canhben1;
    }
    public void setCanhben2(double canhben2) {
        this.canhben2 = canhben2;
    }
    double tinhdientich(){
        return (canhdaylon +canhdaynho)*chieucao*1/2;
    }
    double tinhchuvi(){
        return ( canhdaylon+canhdaynho+canhben1+canhben2);
    }

}
